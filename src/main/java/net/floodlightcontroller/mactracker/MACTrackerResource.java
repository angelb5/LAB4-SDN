package net.floodlightcontroller.mactracker;

import net.floodlightcontroller.mactracker.internal.MACTrack;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.util.ArrayList;
import java.util.List;

public class MACTrackerResource extends ServerResource {
    @Get("json")
    public List<MACTrack> retrieve() {
        IMACTrackerService imacTrackerService = (IMACTrackerService) getContext().getAttributes().get(IMACTrackerService.class.getCanonicalName());
        return new ArrayList<MACTrack>(imacTrackerService.getMacAddresses());
    }
}
