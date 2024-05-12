package X;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.o;

/* renamed from: X.VVh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79845VVh extends HorizontalScrollView {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final Handler LJLJI;

    public final InterfaceC79848VVk getOnScrollListener() {
        return null;
    }

    public final void setOnScrollListener(InterfaceC79848VVk interfaceC79848VVk) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            this.LJLIL = true;
        }
        int action = ev.getAction();
        if (action == 1 || action == 3) {
            this.LJLIL = false;
            this.LJLJI.removeMessages(1);
            this.LJLJI.sendEmptyMessageDelayed(1, 80L);
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        int action = ev.getAction();
        if (action == 1 || action == 3) {
            this.LJLIL = false;
            this.LJLJI.removeMessages(1);
            this.LJLJI.sendEmptyMessageDelayed(1, 80L);
        }
        return super.onTouchEvent(ev);
    }

    public final void setScrollState(int i) {
        if (this.LJLILLLLZI != i) {
            this.LJLILLLLZI = i;
        }
    }

    public C79845VVh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = new Handler(C16880lQ.LLJJJJ(), new C79846VVi(this));
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LJLIL) {
            setScrollState(1);
            return;
        }
        setScrollState(2);
        this.LJLJI.removeMessages(1);
        this.LJLJI.sendEmptyMessageDelayed(1, 80L);
    }
}
