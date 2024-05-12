package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V28 implements Drawable.Callback {
    public final /* synthetic */ V27 LJLIL;

    public V28(V27 v27) {
        this.LJLIL = v27;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d) {
        o.LJIIIZ(d, "d");
        V27 v27 = this.LJLIL;
        v27.LJLJL.setValue(Integer.valueOf(((Number) v27.LJLJL.getValue()).intValue() + 1));
        V27 v272 = this.LJLIL;
        v272.LJLJLJ.setValue(new C10430b1(V23.LIZ(v272.LJLJJLL)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d, Runnable what) {
        o.LJIIIZ(d, "d");
        o.LJIIIZ(what, "what");
        ((Handler) V23.LIZ.getValue()).removeCallbacks(what);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d, Runnable what, long j) {
        o.LJIIIZ(d, "d");
        o.LJIIIZ(what, "what");
        ((Handler) V23.LIZ.getValue()).postAtTime(what, j);
    }
}
