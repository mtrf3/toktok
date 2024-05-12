package X;

import android.animation.TypeEvaluator;

/* loaded from: classes12.dex */
public final class QO1 implements TypeEvaluator<int[]> {
    @Override // android.animation.TypeEvaluator
    public final int[] evaluate(float f, int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr5[i] = (int) (((iArr4[i] - r2) * f) + iArr3[i]);
        }
        return iArr5;
    }
}
