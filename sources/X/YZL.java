package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public enum YZL {
    AS_CAMERA_LENS_BACK,
    AS_CAMERA_LENS_FRONT,
    AS_CAMERA_LENS_WIDE;

    public static final YZO Companion = new YZO();

    public static YZL valueOf(String str) {
        return (YZL) V0N.LJJJ(YZL.class, str);
    }

    public static final YZL fromOrdinal(int i) {
        Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return AS_CAMERA_LENS_BACK;
                }
                return AS_CAMERA_LENS_WIDE;
            }
            return AS_CAMERA_LENS_FRONT;
        }
        return AS_CAMERA_LENS_BACK;
    }

    public static final int toIntValue(YZL asCameraLensFacing) {
        Companion.getClass();
        o.LJIIIZ(asCameraLensFacing, "asCameraLensFacing");
        int i = YZM.LIZ[asCameraLensFacing.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            throw new C162476Zf();
        }
        return 0;
    }
}
