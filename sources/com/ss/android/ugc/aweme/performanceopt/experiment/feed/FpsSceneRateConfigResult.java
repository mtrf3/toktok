package com.ss.android.ugc.aweme.performanceopt.experiment.feed;

import X.E0D;
import X.InterfaceC65349Pkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FpsSceneRateConfigResult {

    @InterfaceC65349Pkn("rate")
    public float defaultRate = 0.1f;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("enableAll")
    public boolean enableAll;

    @InterfaceC65349Pkn("fpsSceneRateList")
    public List<FpsSceneRateConfig> sceneList;

    public final float getDefaultRate() {
        return this.defaultRate;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableAll() {
        return this.enableAll;
    }

    public final List<FpsSceneRateConfig> getSceneList() {
        return this.sceneList;
    }

    private final boolean isSceneInSampling(String str) {
        List<FpsSceneRateConfig> list;
        FpsSceneRateConfigResult fpsSceneRateConfigResult = (FpsSceneRateConfigResult) E0D.LIZ.getValue();
        if (fpsSceneRateConfigResult != null && (list = fpsSceneRateConfigResult.sceneList) != null && !list.isEmpty()) {
            Iterator<FpsSceneRateConfig> it = list.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getSceneName(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isCurrentSceneEnable(String str) {
        if (this.enableAll) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return isSceneInSampling(str);
    }

    public final void setDefaultRate(float f) {
        this.defaultRate = f;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setEnableAll(boolean z) {
        this.enableAll = z;
    }

    public final void setSceneList(List<FpsSceneRateConfig> list) {
        this.sceneList = list;
    }
}
