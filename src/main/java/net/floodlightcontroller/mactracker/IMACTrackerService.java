package net.floodlightcontroller.mactracker;

import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.mactracker.internal.MACTrack;

import java.util.List;
import java.util.Set;

public interface IMACTrackerService extends IFloodlightService {
    public List<MACTrack> getMacAddresses();
}
