package X;

/* renamed from: X.11v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C263911v {
    public static final C263911v LIZIZ = new C263911v();
    public final C0M6<String, C0GY> LIZ;

    public C263911v() {
        if (C03970Dp.LIZ) {
            if (C03970Dp.LJFF && C04010Dt.LIZ) {
                this.LIZ = new C0M6<>(12);
                return;
            } else {
                this.LIZ = new C0M6<>(20);
                return;
            }
        }
        this.LIZ = new C0M6<>(10485760);
    }

    public final C0GY LIZ(String str) {
        if (str == null) {
            return null;
        }
        return this.LIZ.LIZIZ(str);
    }

    public final void LIZIZ(C0GY c0gy, String str) {
        if (str == null) {
            return;
        }
        this.LIZ.LIZJ(str, c0gy);
    }
}
