package com.ss.android.ugc.aweme.ml.infra;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class SmartSdkConfig {

    @InterfaceC65349Pkn("mlsdk")
    public MlSdkConfig mlSdkConfig;

    @InterfaceC65349Pkn("pitaya")
    public PitayaConfig pitayaConfig;

    public String toString() {
        return super.toString();
    }

    public final MlSdkConfig getMlSdkConfig() {
        return this.mlSdkConfig;
    }

    public final PitayaConfig getPitayaConfig() {
        return this.pitayaConfig;
    }

    public final void setMlSdkConfig(MlSdkConfig mlSdkConfig) {
        this.mlSdkConfig = mlSdkConfig;
    }

    public final void setPitayaConfig(PitayaConfig pitayaConfig) {
        this.pitayaConfig = pitayaConfig;
    }
}
