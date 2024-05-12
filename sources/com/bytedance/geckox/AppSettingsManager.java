package com.bytedance.geckox;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class AppSettingsManager {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public volatile Map<String, String> LIZJ;
    public volatile Map<String, ArrayList<String>> LIZLLL;
    public volatile Map<String, List<String>> LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;

    /* loaded from: classes11.dex */
    public interface IGeckoAppSettings {
        boolean isFileLock();
    }

    public static boolean LIZ() {
        IGeckoAppSettings iGeckoAppSettings = (IGeckoAppSettings) ServiceManager.get().getServiceForReal(IGeckoAppSettings.class);
        if (iGeckoAppSettings != null && iGeckoAppSettings.isFileLock()) {
            return true;
        }
        return false;
    }
}
