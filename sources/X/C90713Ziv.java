package X;

import java.util.Arrays;

/* renamed from: X.Ziv, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90713Ziv extends AbstractC90306ZcM<C90314ZcU, C90314ZcU> {
    @Override // X.AbstractC90306ZcM
    public final /* synthetic */ void LJI() {
    }

    @Override // X.AbstractC90306ZcM
    public final int LIZ(C90314ZcU c90314ZcU) {
        C90314ZcU c90314ZcU2 = c90314ZcU;
        int i = c90314ZcU2.LIZJ;
        if (i == -1) {
            c90314ZcU2.LIZJ = 0;
            return 0;
        }
        return i;
    }

    @Override // X.AbstractC90306ZcM
    public final int LIZIZ(C90314ZcU c90314ZcU) {
        C90314ZcU c90314ZcU2 = c90314ZcU;
        int i = c90314ZcU2.LIZJ;
        if (i == -1) {
            c90314ZcU2.LIZJ = 0;
            return 0;
        }
        return i;
    }

    @Override // X.AbstractC90306ZcM
    public final /* synthetic */ C90314ZcU LIZJ(Object obj) {
        return ((AbstractC90950Zmk) obj).zzc;
    }

    @Override // X.AbstractC90306ZcM
    public final void LJ(Object obj) {
    }

    @Override // X.AbstractC90306ZcM
    public final C90314ZcU LIZLLL(C90314ZcU c90314ZcU, C90314ZcU c90314ZcU2) {
        C90314ZcU c90314ZcU3 = c90314ZcU2;
        if (c90314ZcU3.equals(C90314ZcU.LIZLLL)) {
            return c90314ZcU;
        }
        C90314ZcU c90314ZcU4 = c90314ZcU;
        c90314ZcU4.getClass();
        int[] copyOf = Arrays.copyOf(c90314ZcU4.LIZ, 0);
        System.arraycopy(c90314ZcU3.LIZ, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(c90314ZcU4.LIZIZ, 0);
        System.arraycopy(c90314ZcU3.LIZIZ, 0, copyOf2, 0, 0);
        return new C90314ZcU(copyOf, copyOf2);
    }

    @Override // X.AbstractC90306ZcM
    public final /* synthetic */ void LJFF(Object obj, C90314ZcU c90314ZcU) {
        ((AbstractC90950Zmk) obj).zzc = c90314ZcU;
    }
}
