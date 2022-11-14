package net.floodlightcontroller.mactracker.internal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class MACTrackSerializer extends JsonSerializer<MACTrack> {
    @Override
    public void serialize(MACTrack macTrack, JsonGenerator jGen, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jGen.writeStartObject();
        jGen.writeStringField("mac_address", macTrack.getMacAddress());
        jGen.writeStringField("attachment_point", macTrack.getAttachmentPoint());
        jGen.writeEndObject();
    }
}
