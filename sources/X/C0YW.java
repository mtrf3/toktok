package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0YW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YW {
    public static final C32361Ou LIZ = new C32361Ou();
    public static final C32311Op LIZIZ = new C0YT() { // from class: X.1Op
        @Override // X.C0YT, X.C0YU
        public final float LIZ() {
            return 0;
        }

        public final String toString() {
            return "Arrangement#End";
        }

        @Override // X.C0YT
        public final void LIZIZ(int i, InterfaceC23370vt interfaceC23370vt, EnumC23500w6 layoutDirection, int[] sizes, int[] outPositions) {
            o.LJIIIZ(interfaceC23370vt, "<this>");
            o.LJIIIZ(sizes, "sizes");
            o.LJIIIZ(layoutDirection, "layoutDirection");
            o.LJIIIZ(outPositions, "outPositions");
            if (layoutDirection == EnumC23500w6.Ltr) {
                C0YW.LIZJ(i, sizes, outPositions, false);
            } else {
                C0YW.LIZIZ(true, sizes, outPositions);
            }
        }
    };
    public static final C32371Ov LIZJ = new C32371Ov();
    public static final C32291On LIZLLL = new C0YU() { // from class: X.1On
        @Override // X.C0YU
        public final float LIZ() {
            return 0;
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }

        @Override // X.C0YU
        public final void LIZJ(InterfaceC23370vt interfaceC23370vt, int i, int[] sizes, int[] outPositions) {
            o.LJIIIZ(interfaceC23370vt, "<this>");
            o.LJIIIZ(sizes, "sizes");
            o.LJIIIZ(outPositions, "outPositions");
            C0YW.LIZJ(i, sizes, outPositions, false);
        }
    };
    public static final C32301Oo LJ = new C32301Oo();
    public static final C32331Or LJFF;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Op] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1On] */
    static {
        new C32341Os();
        LJFF = new C32331Or();
        new C32321Oq();
    }

    public static void LIZIZ(boolean z, int[] size, int[] outPosition) {
        o.LJIIIZ(size, "size");
        o.LJIIIZ(outPosition, "outPosition");
        int i = 0;
        if (!z) {
            int length = size.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = size[i];
                outPosition[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i5 = size[length2];
            outPosition[length2] = i;
            i += i5;
        }
    }

    public static void LIZ(int i, int[] size, int[] outPosition, boolean z) {
        o.LJIIIZ(size, "size");
        o.LJIIIZ(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f = (i - i3) / 2;
        if (!z) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                outPosition[i5] = O6R.LJJIIZ(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i7 = size[length2];
            outPosition[length2] = O6R.LJJIIZ(f);
            f += i7;
        }
    }

    public static void LIZJ(int i, int[] size, int[] outPosition, boolean z) {
        o.LJIIIZ(size, "size");
        o.LJIIIZ(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = size.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = size[i2];
                outPosition[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i8 = size[length2];
            outPosition[length2] = i5;
            i5 += i8;
        }
    }

    public static void LIZLLL(int i, int[] size, int[] outPosition, boolean z) {
        float length;
        o.LJIIIZ(size, "size");
        o.LJIIIZ(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        if (size.length == 0) {
            length = 0.0f;
        } else {
            length = (i - i3) / size.length;
        }
        float f = length / 2;
        if (!z) {
            int length2 = size.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = size[i2];
                outPosition[i5] = O6R.LJJIIZ(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length3 = size.length - 1; -1 < length3; length3--) {
            int i7 = size[length3];
            outPosition[length3] = O6R.LJJIIZ(f);
            f += i7 + length;
        }
    }

    public static void LJ(int i, int[] size, int[] outPosition, boolean z) {
        float f;
        o.LJIIIZ(size, "size");
        o.LJIIIZ(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f2 = 0.0f;
        if (size.length > 1) {
            f = (i - i3) / (size.length - 1);
        } else {
            f = 0.0f;
        }
        if (!z) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                outPosition[i5] = O6R.LJJIIZ(f2);
                f2 += i6 + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = size.length - 1; -1 < length2; length2--) {
            int i7 = size[length2];
            outPosition[length2] = O6R.LJJIIZ(f2);
            f2 += i7 + f;
        }
    }

    public static void LJFF(int i, int[] size, int[] outPosition, boolean z) {
        o.LJIIIZ(size, "size");
        o.LJIIIZ(outPosition, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = (i - i3) / (size.length + 1);
        if (!z) {
            int length2 = size.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = size[i2];
                outPosition[i5] = O6R.LJJIIZ(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = size.length - 1; -1 < length3; length3--) {
            int i7 = size[length3];
            outPosition[length3] = O6R.LJJIIZ(f2);
            f2 += i7 + length;
        }
    }
}
