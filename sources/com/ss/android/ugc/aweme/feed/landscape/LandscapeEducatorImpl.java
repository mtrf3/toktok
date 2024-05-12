package com.ss.android.ugc.aweme.feed.landscape;

import X.ALF;
import X.ALG;
import X.ALH;
import X.ALI;
import X.ALJ;
import X.ActivityC45651qj;
import X.AnonymousClass979;
import X.C235769Nc;
import X.C38281F0r;
import X.C38995FSd;
import X.C58096Mr6;
import X.C58310MuY;
import X.C60827Nu3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C774732h;
import X.C97A;
import X.C97C;
import X.X1D;
import Y.ARunnableS40S0100000_4;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.ILandscapeEducatorService;
import com.ss.android.ugc.aweme.services.video.OneMinuteH5PreloadServiceImpl;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LandscapeEducatorImpl implements ILandscapeEducatorService {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ = "creator_educate_longer_videos";
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final C65776Prg LJII() {
        return C65352Pkq.LIZ(LandscapeEducatorAssem.class);
    }

    public static ILandscapeEducatorService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(ILandscapeEducatorService.class, false);
        if (LIZ != null) {
            return (ILandscapeEducatorService) LIZ;
        }
        if (C58096Mr6.H0 == null) {
            synchronized (ILandscapeEducatorService.class) {
                if (C58096Mr6.H0 == null) {
                    C58096Mr6.H0 = new LandscapeEducatorImpl();
                }
            }
        }
        return C58096Mr6.H0;
    }

    public static boolean LJIIJJI() {
        ALH.LIZ.getClass();
        if (!ALH.LIZIZ) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_landscape_component");
        if (repo.getBoolean("learn_more_entered", false)) {
            return false;
        }
        long currentTimeMillis = (System.currentTimeMillis() - repo.getLong("last_time_x_clicked", 0L)) / 86400000;
        ALI.LIZ.getClass();
        if (currentTimeMillis < ALI.LIZIZ || repo.getInt("x_clicked_count", 0) >= ALF.LIZ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LIZ() {
        if (!this.LIZLLL) {
            ALG.LIZ.getClass();
            if (!ALG.LIZIZ) {
                return;
            }
            this.LIZLLL = true;
            if (!OneMinuteH5PreloadServiceImpl.createIOneMinuteH5PreloadServiceImplbyMonsterPlugin(false).shouldPreloadWebView() && !LJIIJJI()) {
                return;
            }
            C38995FSd.LIZLLL().submit(new ARunnableS40S0100000_4(this, 53));
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LIZJ() {
        if (!this.LIZJ) {
            ALJ.LIZ.getClass();
            if (!ALJ.LIZIZ) {
                return;
            }
            this.LIZJ = true;
            if (!LJIIJJI()) {
                return;
            }
            C38995FSd.LIZJ().submit(new ARunnableS40S0100000_4(this, 51));
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LJFF() {
        if (!this.LIZIZ) {
            ALJ.LIZ.getClass();
            if (!ALJ.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            if (!OneMinuteH5PreloadServiceImpl.createIOneMinuteH5PreloadServiceImplbyMonsterPlugin(false).shouldPreloadWebView()) {
                return;
            }
            C38995FSd.LIZJ().submit(new ARunnableS40S0100000_4(this, 52));
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final boolean LJ() {
        if (!LJIIJJI()) {
            return false;
        }
        LJIIIZ().LIZJ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final boolean LJI() {
        return C97A.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final String LJIIIIZZ() {
        return C774732h.LIZ();
    }

    public static void LJIIJ(String str) {
        C38281F0r c38281F0r = new C38281F0r(C774732h.LIZ());
        c38281F0r.LIZLLL("enter_from", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://webview?url=");
        LIZ.append(URLEncoder.encode(c38281F0r.LJ(), "ISO-8859-1"));
        LIZ.append("&use_spark=1&use_preload=1");
        String schema = X1D.LIZIZ(LIZ);
        o.LJIIIZ(schema, "schema");
        C60827Nu3.LJIIIIZZ(C58310MuY.LIZIZ, schema, "one_minute_spark_biz", null, 12);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LIZIZ(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        PopupManager.LJIIL(new C97C(c235769Nc, viewStub, activity));
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LIZLLL(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        PopupManager.LJIIL(new AnonymousClass979(c235769Nc, viewStub, activity));
    }
}
