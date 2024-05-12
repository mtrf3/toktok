package com.ss.avframework.livestreamv2.core.interact.livertc;

/* loaded from: classes12.dex */
public class LiveRTCExtInfo {
    public byte[] appSignature;
    public String businessId;
    public String channelId;
    public String interactId;
    public int interactIdMode;
    public int mixMaxBitrateKbps;
    public String mixStreamTaskId = "";
    public String token;
    public String userId;
    public int vendor;
    public String vendorName;

    public void reset() {
        this.token = "";
        this.vendor = 0;
        this.appSignature = null;
        this.channelId = "";
        this.userId = "";
        this.interactId = "";
        this.vendorName = "";
        this.mixMaxBitrateKbps = 0;
        this.interactIdMode = 0;
        this.businessId = "";
        this.mixStreamTaskId = "";
    }

    public LiveRTCExtInfo() {
        reset();
    }
}
