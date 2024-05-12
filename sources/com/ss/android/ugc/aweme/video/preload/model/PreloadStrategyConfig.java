package com.ss.android.ugc.aweme.video.preload.model;

import X.C78866UxK;
import X.IVR;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class PreloadStrategyConfig {

    @InterfaceC65349Pkn("danger_buffer_threshold")
    public int dangerBufferThreshold;

    @InterfaceC65349Pkn("enable_buffer_threshold")
    public int enableBufferPreload;

    @InterfaceC65349Pkn("network_lower")
    public long networkLower;

    @InterfaceC65349Pkn("network_upper")
    public long networkUpper;

    @InterfaceC65349Pkn("secure_buffer_threshold")
    public int secureBufferThreshold;

    @InterfaceC65349Pkn("tasks")
    public List<PreloadTask> tasks;

    public void clearFlag() {
        List<PreloadTask> list = this.tasks;
        if (list != null) {
            Iterator<PreloadTask> it = list.iterator();
            while (it.hasNext()) {
                it.next().alreadyPreload = false;
            }
        }
    }

    public List<PreloadTask> getTasks() {
        if (this.tasks == null) {
            this.tasks = Collections.emptyList();
        }
        return this.tasks;
    }

    public boolean isEnableBufferPreload() {
        if (this.enableBufferPreload == 1) {
            return true;
        }
        return false;
    }

    public String taskToJson() {
        List<PreloadTask> list = this.tasks;
        if (C78866UxK.LJLILLLLZI == null) {
            C78866UxK.LJLILLLLZI = new Gson();
        }
        return GsonProtectorUtils.toJson(C78866UxK.LJLILLLLZI, list);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadStrategyConfig{tasks=");
        List<PreloadTask> list = this.tasks;
        if (C78866UxK.LJLILLLLZI == null) {
            C78866UxK.LJLILLLLZI = new Gson();
        }
        LIZ.append(GsonProtectorUtils.toJson(C78866UxK.LJLILLLLZI, list));
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public static PreloadStrategyConfig getDefault() {
        return IVR.LIZ;
    }

    public int getDangerBufferThreshold() {
        return this.dangerBufferThreshold;
    }

    public long getNetworkLower() {
        return this.networkLower;
    }

    public long getNetworkUpper() {
        return this.networkUpper;
    }

    public int getSecureBufferThreshold() {
        return this.secureBufferThreshold;
    }

    public static PreloadStrategyConfig convertOldConfig(int i, int i2) {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask(i, i2));
        return preloadStrategyConfig;
    }
}
