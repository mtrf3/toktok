package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.94F, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94F extends FrameLayout {
    public View.OnTouchListener LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public OO3 LJLJJI;
    public boolean LJLJJL;

    public final boolean getCanTouch() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C94F(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJL && this.LJLIL != null) {
            return true;
        }
        C2PI.LIZ("FeedInterceptMultiTouchLayout onInterceptTouchEvent super.onTouchEvent");
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        View view;
        if (this.LJLJJL && (onTouchListener = this.LJLIL) != null) {
            if (onTouchListener.onTouch(this, motionEvent)) {
                View view2 = this.LJLJI;
                if (view2 != null && view2.getVisibility() == 0) {
                    View view3 = this.LJLJI;
                    if (view3 != null) {
                        view3.dispatchTouchEvent(motionEvent);
                    }
                    C2PI.LIZ("gradualFullScreenView?.dispatchTouchEvent");
                    return true;
                }
                View view4 = this.LJLILLLLZI;
                if (view4 != null) {
                    view4.onTouchEvent(motionEvent);
                }
                OO3 oo3 = this.LJLJJI;
                if (oo3 == null || !oo3.LJIIJJI || (view = oo3.LJJIIZ) == null) {
                    return true;
                }
                view.dispatchTouchEvent(motionEvent);
                return true;
            }
            C2PI.LIZ("multiTouchListener?.onTouch = false");
            return true;
        }
        C2PI.LIZ("FeedInterceptMultiTouchLayout super.onTouchEvent");
        return super.onTouchEvent(motionEvent);
    }

    public final void setCanTouch(boolean z) {
        if (!z) {
            C2PI.LIZ("set canTouch false");
        }
        this.LJLJJL = z;
    }

    public final void setGradualFullScreenView(View view) {
        this.LJLJI = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJJL = true;
    }
}
