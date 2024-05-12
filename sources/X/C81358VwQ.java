package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.VwQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81358VwQ implements Drawable.Callback {
    public final /* synthetic */ C81359VwR LJLIL;

    public C81358VwQ(C81359VwR c81359VwR) {
        this.LJLIL = c81359VwR;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.LJLIL.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.LJLIL.unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.LJLIL.scheduleSelf(runnable, j);
    }
}
