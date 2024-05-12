package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24660xy {
    public int[] LIZ = new int[10];
    public int LIZIZ;

    public final int LIZ() {
        int[] iArr = this.LIZ;
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        return iArr[i];
    }

    public final void LIZIZ(int i) {
        int i2 = this.LIZIZ;
        int[] iArr = this.LIZ;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            o.LJIIIIZZ(copyOf, "copyOf(this, newSize)");
            this.LIZ = copyOf;
        }
        int[] iArr2 = this.LIZ;
        int i3 = this.LIZIZ;
        this.LIZIZ = i3 + 1;
        iArr2[i3] = i;
    }
}
