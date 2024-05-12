package X;

import defpackage.e1;

/* renamed from: X.Usw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78594Usw {
    public static String LIZJ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "oppocamera" : "xiaomicamera" : "camera2" : "camera1";
    }

    public static String LIZIZ() {
        int recordUseSuccessCameraType = C60903NvH.LJIIJJI().LJJIL().getRecordUseSuccessCameraType(0);
        if (recordUseSuccessCameraType != 0) {
            if (recordUseSuccessCameraType != 1) {
                return "";
            }
            return "camera2";
        }
        return "camera1";
    }

    public static int LIZLLL() {
        return C60903NvH.LJIIJJI().LJJIL().getRecordUseSuccessCameraType(0);
    }

    public static C83817Wuz LIZ(int i) {
        byte b;
        if (e1.LIZ(31744, "enable_exposure_optmize", true, false)) {
            b = EnumC46454ILa.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
        } else {
            EnumC46454ILa.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
            b = 0;
        }
        return new C83817Wuz(b, i, i);
    }
}
