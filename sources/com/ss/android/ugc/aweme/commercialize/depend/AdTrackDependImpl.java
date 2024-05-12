package com.ss.android.ugc.aweme.commercialize.depend;

import X.C2YJ;
import X.C61162NzS;
import X.C63081OpJ;
import X.C64799Pbv;
import X.EFJ;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import defpackage.s1;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdTrackDependImpl implements IAdTrackDepend {
    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final boolean LIZJ() {
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()") && C63081OpJ.LJZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LJ() {
        String adTrackerConfig = C2YJ.LIZIZ.LIZ.getAdTrackerConfig();
        o.LJIIIIZZ(adTrackerConfig, "get().adTrackerConfig");
        return adTrackerConfig;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LJFF() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        return API_URL_PREFIX_SI;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final SharedPreferences LJI() {
        SharedPreferences sharePref = SharePrefCache.inst().getSharePref();
        o.LJIIIIZZ(sharePref, "inst().sharePref");
        return sharePref;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final int LIZ(Exception exc) {
        if (exc instanceof C64799Pbv) {
            return ((C64799Pbv) exc).getStatusCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final void LIZLLL(AqS160S0100000_10 aqS160S0100000_10) {
        SettingsManagerProxy.inst().registerSettingsWatcher(new C61162NzS(aqS160S0100000_10), false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String LIZIZ(String result, String did) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(did, "did");
        if (result.contains("{UID}") || result.contains("__UID__")) {
            result = result.replace("{UID}", did).replace("__UID__", did);
        }
        o.LJIIIIZZ(result, "replaceUid(result, did)");
        return result;
    }
}
