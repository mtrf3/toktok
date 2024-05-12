package X;

import com.bytedance.keva.Keva;

/* renamed from: X.60c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1533460c {
    public boolean LIZ;

    public final void LIZ(InterfaceC153275zv interfaceC153275zv) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        String LJ = KMP.LJ("sparking_effect", 20);
        Keva keva = C1534260k.LIZ;
        int i = keva.getInt(LJ, 0);
        if (i < 1) {
            interfaceC153275zv.bb0(20, "star_lottie.json");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sparking_effect");
            LIZ.append(20);
            keva.storeInt(X1D.LIZIZ(LIZ), i + 1);
        }
    }
}
