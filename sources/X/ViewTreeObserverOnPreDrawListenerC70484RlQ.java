package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.RlQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewTreeObserverOnPreDrawListenerC70484RlQ implements ViewTreeObserver.OnPreDrawListener {
    public final View LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final Rect LJLJJLL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.LJLIL.getLocalVisibleRect(this.LJLJJLL) && this.LJLIL.isShown() && this.LJLILLLLZI && this.LJLJI && this.LJLJJI && !this.LJLJJL) {
            this.LJLJJL = true;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC70484RlQ(C70469RlB view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        this.LJLJI = true;
        this.LJLJJI = true;
        this.LJLJJLL = new Rect();
    }
}
