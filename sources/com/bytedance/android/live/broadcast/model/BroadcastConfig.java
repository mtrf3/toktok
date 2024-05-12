package com.bytedance.android.live.broadcast.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes.dex */
public class BroadcastConfig {

    @InterfaceC65349Pkn("enable_live_audio")
    public boolean enableLiveAudio;

    @InterfaceC65349Pkn("enable_live_screenshot")
    public boolean enableLiveScreenshot;

    @InterfaceC65349Pkn("enable_live_third_party")
    public boolean enableLiveThirdParty;

    @InterfaceC65349Pkn("enable_live_voice")
    public boolean enableLiveVoice;

    @InterfaceC65349Pkn("toast")
    public BroadcastGuideConfig mToast;

    /* loaded from: classes.dex */
    public static class BroadcastGuideConfig {

        @InterfaceC65349Pkn("new_anchor")
        public boolean mNewAnchor;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public BroadcastConfig() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BroadcastConfig)) {
            return false;
        }
        BroadcastConfig broadcastConfig = (BroadcastConfig) obj;
        if (this.enableLiveAudio != broadcastConfig.enableLiveAudio || this.enableLiveThirdParty != broadcastConfig.enableLiveThirdParty || this.enableLiveScreenshot != broadcastConfig.enableLiveScreenshot || this.enableLiveVoice != broadcastConfig.enableLiveVoice) {
            return false;
        }
        return true;
    }

    public BroadcastConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableLiveAudio = z;
        this.enableLiveThirdParty = z2;
        this.enableLiveScreenshot = z3;
        this.enableLiveVoice = z4;
    }
}
