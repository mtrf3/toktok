package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.EcUgNewInstallService;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import defpackage.t1;

/* renamed from: X.Kvi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53286Kvi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53113Ksv.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53220Kue.LJLIL);

    public static boolean LIZ() {
        C62822Ol8 c62822Ol8 = LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1 || EcUgNewInstallService.LIZLLL().LIZJ()) {
            return true;
        }
        if ((((Number) c62822Ol8.getValue()).intValue() != 0 && C53765L8f.LIZIZ()) || ECommerceMallService.x3().v1()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (((Number) LIZ.getValue()).intValue() == 2 && !C53765L8f.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        boolean LJI = t1.LJI();
        TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo = ((RBX) HG3.LJIILL()).getCurUser().mallTabUserInfo;
        if (LJI && (tTMallTabRelatedUserInfo == null || !tTMallTabRelatedUserInfo.isMallTabDisplay())) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL() {
        if (!LIZ()) {
            return false;
        }
        return LIZJ();
    }

    public static boolean LJ() {
        if (!LIZIZ()) {
            return false;
        }
        return LIZJ();
    }
}
