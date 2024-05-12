package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class SmartSceneReportConfig {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("ignore_scene")
    public String ignoreScene;

    @InterfaceC65349Pkn("init_rate")
    public float initRate;

    @InterfaceC65349Pkn("run_rate")
    public float runRate;

    public String toString() {
        return super.toString();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getIgnoreScene() {
        return this.ignoreScene;
    }

    public final float getInitRate() {
        return this.initRate;
    }

    public final float getRunRate() {
        return this.runRate;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setIgnoreScene(String str) {
        this.ignoreScene = str;
    }

    public final void setInitRate(float f) {
        this.initRate = f;
    }

    public final void setRunRate(float f) {
        this.runRate = f;
    }
}
