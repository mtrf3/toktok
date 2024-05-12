package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes29.dex */
public class OuterHighlightDrawable extends Drawable {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.LIZIZ + 0.0f, this.LIZJ + 0.0f, 0.0f * this.LIZ, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setScale(float f) {
        this.LIZ = f;
        invalidateSelf();
    }

    public void setTranslationX(float f) {
        this.LIZIZ = f;
        invalidateSelf();
    }

    public void setTranslationY(float f) {
        this.LIZJ = f;
        invalidateSelf();
    }
}
