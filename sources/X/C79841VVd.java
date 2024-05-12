package X;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VVd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79841VVd extends HorizontalScrollView {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final Handler LJLJI;

    public final InterfaceC79844VVg getOnScrollListener() {
        return null;
    }

    public final void setOnScrollListener(InterfaceC79844VVg interfaceC79844VVg) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79841VVd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLJI = new Handler(C16880lQ.LLJJJJ(), new C79842VVe(this));
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
