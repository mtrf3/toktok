package X;

import Y.ARunnableS19S0000000_13;

/* renamed from: X.Uy1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78909Uy1 {
    public final String[] LIZ;
    public String[] LIZIZ = new String[0];
    public final InterfaceC78910Uy2 LIZJ;
    public final InterfaceC77281UUr LIZLLL;
    public final Runnable LJ;
    public final Runnable LJFF;

    public final void LIZ() {
        this.LIZJ.LIZIZ(this.LIZ);
        C78900Uxs.LIZ.LIZLLL(this.LIZIZ);
    }

    public final void LIZIZ(boolean z) {
        this.LIZJ.LIZLLL(this.LIZ);
        C78908Uy0 c78908Uy0 = C78900Uxs.LIZ;
        c78908Uy0.LJ(this.LIZ);
        if (z) {
            this.LJFF.run();
            c78908Uy0.LIZIZ(this.LIZIZ);
        }
    }

    public C78909Uy1(InterfaceC77281UUr interfaceC77281UUr, InterfaceC77281UUr interfaceC77281UUr2, InterfaceC78910Uy2 interfaceC78910Uy2, ARunnableS19S0000000_13 aRunnableS19S0000000_13, ARunnableS19S0000000_13 aRunnableS19S0000000_132, String[] strArr) {
        this.LIZ = strArr;
        this.LJ = aRunnableS19S0000000_13;
        this.LJFF = aRunnableS19S0000000_132;
        this.LIZJ = interfaceC78910Uy2;
        this.LIZLLL = interfaceC77281UUr2;
    }
}
