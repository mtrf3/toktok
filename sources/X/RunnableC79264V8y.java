package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.V8y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC79264V8y extends C80627Vkd implements Runnable {
    public final int LJLJJL;
    public final boolean LJLJJLL;
    public float LJLJL;
    public boolean LJLJLJ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJLJ = false;
            this.LJLJL += (int) ((20.0f / this.LJLJJL) * 360.0f);
            invalidateSelf();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.LJLJL;
        if (!this.LJLJJLL) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r1, (i2 / 2) + r3);
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC79264V8y(Drawable drawable, int i) {
        super(drawable);
        drawable.getClass();
        this.LJLJL = 0.0f;
        this.LJLJLJ = false;
        this.LJLJJL = i;
        this.LJLJJLL = true;
    }
}
