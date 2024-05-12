package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0D5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0D5 {
    public int LIZ;
    public Object LIZIZ;

    public final int LIZ() {
        int[] iArr = (int[]) this.LIZIZ;
        int i = this.LIZ - 1;
        this.LIZ = i;
        return iArr[i];
    }

    public /* synthetic */ C0D5(int i) {
        this.LIZIZ = new int[i];
    }

    public /* synthetic */ C0D5(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, int i) {
        this.LIZIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LIZ = i;
    }

    public final void LIZLLL(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.LIZIZ;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    LJ(i3, i4);
                }
            }
            int i7 = i3 + 3;
            LJ(i7, i2);
            LIZLLL(i, i7 - 3);
            LIZLLL(i7 + 3, i2);
        }
    }

    public final void LJ(int i, int i2) {
        int[] iArr = (int[]) this.LIZIZ;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public final void LIZIZ(int i, int i2, int i3) {
        int i4 = this.LIZ;
        int i5 = i4 + 3;
        Object obj = this.LIZIZ;
        if (i5 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LIZIZ = copyOf;
        }
        int[] iArr = (int[]) this.LIZIZ;
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.LIZ = i5;
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        int i5 = this.LIZ;
        int i6 = i5 + 4;
        Object obj = this.LIZIZ;
        if (i6 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LIZIZ = copyOf;
        }
        int[] iArr = (int[]) this.LIZIZ;
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.LIZ = i6;
    }
}
