package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes14.dex */
public final class V94 extends C80628Vke {
    public final Drawable[] LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public long LJLLILLLL;
    public final int[] LJLLJ;
    public final int[] LJLLL;
    public int LJLLLL;
    public final boolean[] LJLLLLLL;
    public int LJLZ;

    public final void LIZJ() {
        int i;
        this.LJLL = 2;
        for (int i2 = 0; i2 < this.LJLJLLL.length; i2++) {
            int[] iArr = this.LJLLL;
            if (this.LJLLLLLL[i2]) {
                i = 255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.LJLZ == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLLLL;
    }

    public V94(Drawable[] drawableArr) {
        super(drawableArr);
        if (drawableArr.length >= 1) {
            this.LJLJLLL = drawableArr;
            int[] iArr = new int[drawableArr.length];
            this.LJLLJ = iArr;
            int[] iArr2 = new int[drawableArr.length];
            this.LJLLL = iArr2;
            this.LJLLLL = 255;
            boolean[] zArr = new boolean[drawableArr.length];
            this.LJLLLLLL = zArr;
            this.LJLZ = 0;
            this.LJLL = 2;
            Arrays.fill(iArr, 0);
            iArr[0] = 255;
            Arrays.fill(iArr2, 0);
            iArr2[0] = 255;
            Arrays.fill(zArr, false);
            zArr[0] = true;
            return;
        }
        throw new IllegalStateException("At least one layer required!");
    }

    public final void LJ(int i) {
        int intValue = ((Number) DXE.LIZJ.getValue()).intValue();
        if (intValue == 1 || (intValue == 2 && DXE.LIZ)) {
            i = 0;
        }
        this.LJLLI = i;
        if (this.LJLL == 1) {
            this.LJLL = 0;
        }
    }

    public final boolean LJFF(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.LJLJLLL.length; i2++) {
            boolean z2 = this.LJLLLLLL[i2];
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            int[] iArr = this.LJLLL;
            int i3 = (int) ((i * 255 * f) + this.LJLLJ[i2]);
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (z2) {
                if (iArr[i2] < 255) {
                    z = false;
                }
            } else if (iArr[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C80628Vke, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        boolean LJFF;
        boolean z;
        int i = this.LJLL;
        int i2 = 2;
        int i3 = 0;
        if (i != 0) {
            if (i != 1) {
                LJFF = true;
            } else {
                if (this.LJLLI > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C32151Nz.LJIIIZ(z);
                LJFF = LJFF(((float) (SystemClock.uptimeMillis() - this.LJLLILLLL)) / this.LJLLI);
                if (!LJFF) {
                    i2 = 1;
                }
                this.LJLL = i2;
            }
        } else {
            System.arraycopy(this.LJLLL, 0, this.LJLLJ, 0, this.LJLJLLL.length);
            this.LJLLILLLL = SystemClock.uptimeMillis();
            if (this.LJLLI == 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            LJFF = LJFF(f);
            if (!LJFF) {
                i2 = 1;
            }
            this.LJLL = i2;
        }
        while (true) {
            Drawable[] drawableArr = this.LJLJLLL;
            if (i3 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i3];
            int i4 = (this.LJLLL[i3] * this.LJLLLL) / 255;
            if (drawable != null && i4 > 0) {
                this.LJLZ++;
                drawable.mutate().setAlpha(i4);
                this.LJLZ--;
                drawable.draw(canvas);
            }
            i3++;
        }
        if (!LJFF) {
            invalidateSelf();
        }
    }

    @Override // X.C80628Vke, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LJLLLL != i) {
            this.LJLLLL = i;
            invalidateSelf();
        }
    }
}
