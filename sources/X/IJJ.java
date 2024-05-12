package X;

/* loaded from: classes9.dex */
public final class IJJ {
    public static final float LIZ = ((Number) IJB.LIZ.getValue()).floatValue();
    public static final int LIZIZ = ((Number) IJK.LIZ.getValue()).intValue();

    public static boolean LIZ() {
        boolean z;
        boolean z2;
        if (IJV.LIZ() >= LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (IJN.LIZ().LIZLLL("publish_type_upload_rate") >= LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
