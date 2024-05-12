package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CommonParams {

    @Serialized("rtsHttpPort")
    public int rtsHttpPort;

    @Serialized("sessionId")
    public String sessionId = "";

    @Serialized("enableProtocolDegrade")
    public boolean enableProtocolDegrade = true;

    public final boolean getEnableProtocolDegrade() {
        return this.enableProtocolDegrade;
    }

    public final int getRtsHttpPort() {
        return this.rtsHttpPort;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setEnableProtocolDegrade(boolean z) {
        this.enableProtocolDegrade = z;
    }

    public final void setRtsHttpPort(int i) {
        this.rtsHttpPort = i;
    }

    public final void setSessionId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sessionId = str;
    }
}
