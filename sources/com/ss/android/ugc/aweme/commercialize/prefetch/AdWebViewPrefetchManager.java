package com.ss.android.ugc.aweme.commercialize.prefetch;

import X.C16880lQ;
import X.C221108m2;
import X.C58096Mr6;
import X.C58920NAm;
import X.C59612NaS;
import X.C62822Ol8;
import X.NJA;
import X.NZS;
import X.O3U;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import java.io.File;
import ujb.o;

/* loaded from: classes11.dex */
public final class AdWebViewPrefetchManager implements IAdWebViewPrefetchManager {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58920NAm.LJLIL);

    public static IAdWebViewPrefetchManager LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IAdWebViewPrefetchManager.class, false);
        if (LIZ != null) {
            return (IAdWebViewPrefetchManager) LIZ;
        }
        if (C58096Mr6.LLLLLZ == null) {
            synchronized (IAdWebViewPrefetchManager.class) {
                if (C58096Mr6.LLLLLZ == null) {
                    C58096Mr6.LLLLLZ = new AdWebViewPrefetchManager();
                }
            }
        }
        return C58096Mr6.LLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager
    public final void stopLoading() {
        if ((!NJA.LIZ().enablePrefetchResource) || !NJA.LIZ().enableStopLoading) {
            return;
        }
        C59612NaS c59612NaS = (C59612NaS) this.LIZ.getValue();
        c59612NaS.stopLoading();
        c59612NaS.clearHistory();
        c59612NaS.clearFormData();
    }

    @Override // com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager
    public final void LIZ(long j, String str, String str2, String str3) {
        String LIZJ;
        if (str == null || o.LJJJJJL(str) || str2 == null || o.LJJJJJL(str2) || str3 == null || o.LJJJJJL(str3) || (!NJA.LIZ().enablePrefetchResource) || !NZS.LIZJ(str3, String.valueOf(j)) || AdLandPagePreloadServiceImpl.LJJI() == null || (LIZJ = O3U.LIZJ(str, str2)) == null || o.LJJJJJL(LIZJ)) {
            return;
        }
        File file = new File(LIZJ, "prefetch.html");
        if (!file.exists() || !file.isFile()) {
            return;
        }
        C16880lQ.LLZZ((WebView) this.LIZ.getValue(), file.getAbsolutePath());
    }
}
