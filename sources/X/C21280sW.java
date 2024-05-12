package X;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X.0sW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C21280sW implements TimeInterpolator {
    public int[] LIZ;
    public int LIZIZ;
    public int LIZJ;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        int i = (int) ((f * this.LIZJ) + 0.5f);
        int i2 = this.LIZIZ;
        int[] iArr = this.LIZ;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        if (i3 < i2) {
            f2 = i / this.LIZJ;
        } else {
            f2 = 0.0f;
        }
        return (i3 / i2) + f2;
    }

    public C21280sW(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.LIZIZ = numberOfFrames;
        int[] iArr = this.LIZ;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.LIZ = new int[numberOfFrames];
        }
        int[] iArr2 = this.LIZ;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.LIZJ = i;
    }
}
