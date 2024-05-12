package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0sY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C21300sY implements Drawable.Callback {
    public Drawable.Callback LJLIL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.LJLIL;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.LJLIL;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }
}
