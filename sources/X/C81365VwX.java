package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.VwX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81365VwX implements Drawable.Callback {
    public final /* synthetic */ C81360VwS LJLIL;

    public C81365VwX(C81360VwS c81360VwS) {
        this.LJLIL = c81360VwS;
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
