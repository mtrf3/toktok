package com.ss.android.ugc.aweme.shortvideo.util;

import X.C10K;
import X.C44065HRd;
import X.C48203Ivv;
import X.EnumC44070HRi;
import X.HRB;
import Y.ACallableS6S1000000_7;
import android.app.Activity;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.tools.IStitchDownloadService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StitchDownloadServiceImpl implements IStitchDownloadService {
    @Override // com.ss.android.ugc.aweme.tools.IStitchDownloadService
    public final void LIZ(Activity context, DuetAndStitchRouterConfig duetAndStitchRouterConfig) {
        o.LJIIIZ(context, "context");
        C44065HRd c44065HRd = new C44065HRd();
        c44065HRd.LJIILLIIL = ujb.o.LJJJJIZL(duetAndStitchRouterConfig.type, "use_stitch", false);
        c44065HRd.LJIIZILJ = ujb.o.LJJJJIZL(duetAndStitchRouterConfig.enterMethod, "duet_and_stitch_jsb", false);
        c44065HRd.LJIILL = duetAndStitchRouterConfig.copy(duetAndStitchRouterConfig.type, duetAndStitchRouterConfig.awemeId, duetAndStitchRouterConfig.anchors, duetAndStitchRouterConfig.enterFrom, "", duetAndStitchRouterConfig.isEcommerce);
        String str = duetAndStitchRouterConfig.awemeId;
        String str2 = duetAndStitchRouterConfig.enterFrom;
        if (str2 == null) {
            str2 = "";
        }
        c44065HRd.LIZ = context;
        c44065HRd.LIZIZ = str2;
        c44065HRd.LIZJ = "";
        if (u.LJIIZILJ(str)) {
            c44065HRd.LJI(R.string.rpm, EnumC44070HRi.AWEME_ID_UNAVAILABLE);
            return;
        }
        if (!C48203Ivv.LJ(context)) {
            c44065HRd.LJI(R.string.imh, EnumC44070HRi.NO_INTERNET);
        } else {
            if (MSAdaptionService.LJIIL().LJI(c44065HRd.LIZ)) {
                c44065HRd.LJI(R.string.f1i, EnumC44070HRi.DUAL_MODE);
                return;
            }
            c44065HRd.LJFF();
            c44065HRd.LJIJI = System.currentTimeMillis();
            C10K.LIZJ(new ACallableS6S1000000_7(str, 4)).LJ(new HRB(c44065HRd, context, str2), C10K.LJIIIIZZ, null);
        }
    }
}
