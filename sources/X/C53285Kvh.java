package X;

import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import defpackage.t1;

/* renamed from: X.Kvh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53285Kvh {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52675Klr.LJLIL);

    public static boolean LIZ() {
        if (((Number) LIZ.getValue()).intValue() != 1) {
            return false;
        }
        boolean LJI = t1.LJI();
        TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo = ((RBX) HG3.LJIILL()).getCurUser().mallTabUserInfo;
        if (!LJI) {
            return true;
        }
        if (tTMallTabRelatedUserInfo != null && tTMallTabRelatedUserInfo.isMallTabDisplay()) {
            return true;
        }
        return false;
    }
}
