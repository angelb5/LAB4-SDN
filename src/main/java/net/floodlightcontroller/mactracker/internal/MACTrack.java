package net.floodlightcontroller.mactracker.internal;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = MACTrackSerializer.class)
public class MACTrack {
    protected final String macAddress;
    protected final String attachmentPoint;


    public MACTrack(String macAddress, String attachmentPoint) {
        this.macAddress = macAddress;
        this.attachmentPoint = attachmentPoint;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getAttachmentPoint() {
        return attachmentPoint;
    }
}
