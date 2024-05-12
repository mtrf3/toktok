package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32351Ot implements C0YT, C0YU {
    public final float LIZ;
    public final boolean LIZIZ;
    public final InterfaceC88471Ynr<Integer, EnumC23500w6, Integer> LIZJ;
    public final float LIZLLL;

    public C32351Ot() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32351Ot)) {
            return false;
        }
        C32351Ot c32351Ot = (C32351Ot) obj;
        return C23390vv.LIZJ(this.LIZ, c32351Ot.LIZ) && this.LIZIZ == c32351Ot.LIZIZ && o.LJ(this.LIZJ, c32351Ot.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (floatToIntBits + i) * 31;
        InterfaceC88471Ynr<Integer, EnumC23500w6, Integer> interfaceC88471Ynr = this.LIZJ;
        if (interfaceC88471Ynr == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88471Ynr.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        if (this.LIZIZ) {
            str = "";
        } else {
            str = "Absolute";
        }
        LIZ.append(str);
        LIZ.append("Arrangement#spacedAligned(");
        C0SV.LIZ(this.LIZ, LIZ, ", ");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C0YT, X.C0YU
    public final float LIZ() {
        return this.LIZLLL;
    }

    public C32351Ot(float f, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = f;
        this.LIZIZ = true;
        this.LIZJ = interfaceC88471Ynr;
        this.LIZLLL = f;
    }

    @Override // X.C0YU
    public final void LIZJ(InterfaceC23370vt interfaceC23370vt, int i, int[] sizes, int[] outPositions) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        o.LJIIIZ(sizes, "sizes");
        o.LJIIIZ(outPositions, "outPositions");
        LIZIZ(i, interfaceC23370vt, EnumC23500w6.Ltr, sizes, outPositions);
    }

    @Override // X.C0YT
    public final void LIZIZ(int i, InterfaceC23370vt interfaceC23370vt, EnumC23500w6 layoutDirection, int[] sizes, int[] outPositions) {
        boolean z;
        int i2;
        int i3;
        o.LJIIIZ(interfaceC23370vt, "<this>");
        o.LJIIIZ(sizes, "sizes");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(outPositions, "outPositions");
        if (sizes.length == 0) {
            return;
        }
        int LJJIJ = interfaceC23370vt.LJJIJ(this.LIZ);
        if (this.LIZIZ && layoutDirection == EnumC23500w6.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int length = sizes.length;
            int i4 = 0;
            i2 = 0;
            i3 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = sizes[i4];
                int min = Math.min(i2, i - i6);
                outPositions[i5] = min;
                i3 = Math.min(LJJIJ, (i - min) - i6);
                i2 = outPositions[i5] + i6 + i3;
                i4++;
                i5++;
            }
        } else {
            i2 = 0;
            i3 = 0;
            for (int length2 = sizes.length - 1; -1 < length2; length2--) {
                int i7 = sizes[length2];
                int min2 = Math.min(i2, i - i7);
                outPositions[length2] = min2;
                i3 = Math.min(LJJIJ, (i - min2) - i7);
                i2 = outPositions[length2] + i7 + i3;
            }
        }
        int i8 = i2 - i3;
        InterfaceC88471Ynr<Integer, EnumC23500w6, Integer> interfaceC88471Ynr = this.LIZJ;
        if (interfaceC88471Ynr != null && i8 < i) {
            int intValue = interfaceC88471Ynr.invoke(Integer.valueOf(i - i8), layoutDirection).intValue();
            int length3 = outPositions.length;
            for (int i9 = 0; i9 < length3; i9++) {
                outPositions[i9] = outPositions[i9] + intValue;
            }
        }
    }
}
