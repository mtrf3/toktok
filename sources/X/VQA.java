package X;

import android.graphics.drawable.Drawable;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class VQA implements Drawable.Callback {
    public final /* synthetic */ LynxBaseUI LJLIL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public VQA(LynxBaseUI lynxBaseUI) {
        this.LJLIL = lynxBaseUI;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.LJLIL.invalidate();
    }
}
