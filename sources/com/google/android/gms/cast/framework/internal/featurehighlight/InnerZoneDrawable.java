package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes29.dex */
public class InnerZoneDrawable extends Drawable {
    public float LIZ;
    public float LIZIZ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LIZIZ <= 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, this.LIZ * 0.0f, null);
            return;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setPulseAlpha(float f) {
        this.LIZIZ = f;
        invalidateSelf();
    }

    public void setPulseScale(float f) {
        invalidateSelf();
    }

    public void setScale(float f) {
        this.LIZ = f;
        invalidateSelf();
    }
}
