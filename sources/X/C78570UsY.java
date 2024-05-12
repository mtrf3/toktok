package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.search.pages.sug.core.ui.SugLiveLottieDrawable;
import kotlin.jvm.internal.o;

/* renamed from: X.UsY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78570UsY implements Drawable.Callback {
    public final /* synthetic */ SugLiveLottieDrawable LJLIL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable who, Runnable what, long j) {
        o.LJIIIZ(who, "who");
        o.LJIIIZ(what, "what");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable who, Runnable what) {
        o.LJIIIZ(who, "who");
        o.LJIIIZ(what, "what");
    }

    public C78570UsY(SugLiveLottieDrawable sugLiveLottieDrawable) {
        this.LJLIL = sugLiveLottieDrawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable who) {
        o.LJIIIZ(who, "who");
        this.LJLIL.LJLIL.invalidate();
    }
}
