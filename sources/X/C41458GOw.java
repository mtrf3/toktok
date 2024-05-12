package X;

import com.ss.android.ugc.aweme.profile.model.BcUsageConfirmThreshold;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;

/* renamed from: X.GOw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41458GOw {
    public static final /* synthetic */ int LIZ = 0;

    public static TcmConfig LIZ() {
        C78934UyQ.LJLIL.getCommerceService().getClass();
        return C41461GOz.LIZ();
    }

    public static boolean LIZIZ() {
        TcmConfig LIZ2 = LIZ();
        if (LIZ2 != null) {
            return LIZ2.isTcmCreator();
        }
        return false;
    }

    public static boolean LIZJ() {
        TcmConfig LIZ2;
        TcmConfig LIZ3 = LIZ();
        if (LIZ3 == null || !LIZ3.getUseBcEntranceInPost() || (LIZ2 = LIZ()) == null || !LIZ2.isTcmCreator()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL() {
        TcmConfig LIZ2;
        TcmConfig LIZ3;
        if (C1DG.LJIIIIZZ() || (LIZ2 = LIZ()) == null || !LIZ2.getUseBcEntranceInPost() || (LIZ3 = LIZ()) == null || LIZ3.isTcmCreator()) {
            return false;
        }
        return true;
    }

    public static boolean LJ() {
        BcUsageConfirmThreshold bcUsageConfirmThreshold;
        TcmConfig LIZ2 = LIZ();
        if (LIZ2 != null && (bcUsageConfirmThreshold = LIZ2.getBcUsageConfirmThreshold()) != null) {
            return bcUsageConfirmThreshold.getApp();
        }
        return false;
    }
}
