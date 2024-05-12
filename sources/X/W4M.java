package X;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes15.dex */
public final class W4M implements W4N {
    public final Resources LIZ;
    public final W4N LIZIZ;

    @Override // X.W4N
    public final boolean LIZJ(W5A w5a) {
        return true;
    }

    @Override // X.W4N
    public final Drawable LIZIZ(W5A w5a) {
        boolean z;
        try {
            C81939WDv.LIZIZ();
            if (w5a instanceof W5C) {
                W5C w5c = (W5C) w5a;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LIZ, w5c.getUnderlyingBitmap());
                int i = w5c.mRotationAngle;
                boolean z2 = false;
                if (i != 0 && i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i2 = w5c.mExifOrientation;
                    if (i2 != 1 && i2 != 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        return bitmapDrawable;
                    }
                }
                return new V97(bitmapDrawable, w5c.mRotationAngle, w5c.mExifOrientation);
            }
            W4N w4n = this.LIZIZ;
            if (w4n != null && w4n.LIZJ(w5a)) {
                return this.LIZIZ.LIZIZ(w5a);
            }
            C81939WDv.LIZIZ();
            return null;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public W4M(Resources resources, W4N w4n) {
        this.LIZ = resources;
        this.LIZIZ = w4n;
    }

    @Override // X.W4N
    public final Drawable LIZ(W5A w5a, Drawable drawable) {
        try {
            C81939WDv.LIZIZ();
            if (w5a instanceof W5C) {
                return LIZIZ(w5a);
            }
            W4N w4n = this.LIZIZ;
            if (w4n != null && w4n.LIZJ(w5a)) {
                return this.LIZIZ.LIZ(w5a, drawable);
            }
            C81939WDv.LIZIZ();
            return null;
        } finally {
            C81939WDv.LIZIZ();
        }
    }
}
