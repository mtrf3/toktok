package X;

import android.graphics.drawable.Drawable;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;

/* renamed from: X.VOz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79681VOz implements Drawable.Callback {
    public final /* synthetic */ FlattenUIText LJLIL;

    public C79681VOz(FlattenUIText flattenUIText) {
        this.LJLIL = flattenUIText;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (!C79411VEp.LIZ()) {
            return;
        }
        this.LJLIL.invalidate();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C79411VEp.LIZIZ(runnable, drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C79411VEp.LIZLLL(runnable, drawable, j);
    }
}
