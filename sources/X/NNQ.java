package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;

/* loaded from: classes11.dex */
public final class NNQ extends NNJ {
    @Override // X.NNJ
    public final boolean LIZ() {
        BrowserConfig browserConfig;
        if (!C59275NOd.LIZ(LIZLLL().LIZIZ.LIZ)) {
            return false;
        }
        String str = LIZLLL().LIZIZ.LJJIJIIJI;
        if (LIZLLL().LJ.LIZJ != 1 && TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            browserConfig = (BrowserConfig) C75792yF.LIZIZ().LJI(str, BrowserConfig.class);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            browserConfig = null;
        }
        if (LIZLLL().LJ.LIZJ == 1) {
            browserConfig = new BrowserConfig(1, null, null, null, null, 30, null);
        }
        return OpenCCTUtils.LJFF().LIZIZ(LIZLLL().LIZIZ.LIZ, browserConfig, String.valueOf(LIZLLL().LIZ.LIZJ), LIZLLL().LIZ.LIZLLL);
    }

    @Override // X.NNJ
    public final boolean LIZIZ() {
        BrowserConfig browserConfig;
        boolean z;
        String str = LIZLLL().LIZIZ.LJJIJIIJI;
        if (LIZLLL().LJ.LIZJ != 1 && TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            browserConfig = (BrowserConfig) C75792yF.LIZIZ().LJI(str, BrowserConfig.class);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            browserConfig = null;
        }
        if (LIZLLL().LJ.LIZJ == 1) {
            browserConfig = new BrowserConfig(1, null, null, null, null, 30, null);
        }
        if (LIZLLL().LIZIZ.LJIJJLI == 1 || LIZLLL().LIZIZ.LJIJJ != 1) {
            z = true;
        } else {
            z = false;
        }
        return OpenCCTUtils.LJFF().LIZ(LIZJ(), LIZLLL().LIZIZ.LIZ, browserConfig, String.valueOf(LIZLLL().LIZ.LIZJ), LIZLLL().LIZ.LIZLLL, LIZLLL().LJ.LIZIZ, LIZLLL().LIZIZ.LJJIIZI, z);
    }
}
