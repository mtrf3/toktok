package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class SandboxParams {

    @Serialized("enable")
    public int enable = Integer.MAX_VALUE;

    public final int getEnable() {
        return this.enable;
    }

    public final void setEnable(int i) {
        this.enable = i;
    }
}
