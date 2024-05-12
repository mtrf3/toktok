package X;

import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import defpackage.t1;
import yq4.a;

/* renamed from: X.FuV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40471FuV {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(L73.LJLIL);

    public static boolean LIZ() {
        if (((Number) LIZ.getValue()).intValue() == 1 && LIZIZ() && !a.LJIILL().LJIJ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        boolean z;
        boolean LJI = t1.LJI();
        TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo = ((RBX) HG3.LJIILL()).getCurUser().mallTabUserInfo;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("shouldShowMallTab: ");
        if (LJI && (tTMallTabRelatedUserInfo == null || !tTMallTabRelatedUserInfo.isMallTabDisplay())) {
            z = false;
        } else {
            z = true;
        }
        LIZ2.append(z);
        X1D.LIZIZ(LIZ2);
        if (!LJI) {
            return true;
        }
        if (tTMallTabRelatedUserInfo != null && tTMallTabRelatedUserInfo.isMallTabDisplay()) {
            return true;
        }
        return false;
    }
}
