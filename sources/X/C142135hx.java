package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142135hx extends HorizontalScrollView {
    public InterfaceC142155hz LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public final Handler LJLJJI;

    public final InterfaceC142155hz getOnScrollListener() {
        return this.LJLIL;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            this.LJLILLLLZI = true;
            InterfaceC142155hz interfaceC142155hz = this.LJLIL;
            if (interfaceC142155hz != null) {
                interfaceC142155hz.LIZJ();
            }
        }
        int action = ev.getAction();
        if (action == 1 || action == 3) {
            this.LJLILLLLZI = false;
            this.LJLJJI.removeMessages(1);
            this.LJLJJI.sendEmptyMessageDelayed(1, 80L);
            InterfaceC142155hz interfaceC142155hz2 = this.LJLIL;
            if (interfaceC142155hz2 != null) {
                interfaceC142155hz2.LIZJ();
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        int action = ev.getAction();
        if (action == 1 || action == 3) {
            this.LJLILLLLZI = false;
            this.LJLJJI.removeMessages(1);
            this.LJLJJI.sendEmptyMessageDelayed(1, 80L);
            InterfaceC142155hz interfaceC142155hz = this.LJLIL;
            if (interfaceC142155hz != null) {
                interfaceC142155hz.LIZJ();
            }
        }
        return super.onTouchEvent(ev);
    }

    public final void setOnScrollListener(InterfaceC142155hz interfaceC142155hz) {
        this.LJLIL = interfaceC142155hz;
    }

    public final void setScrollState(int i) {
        if (this.LJLJI != i) {
            this.LJLJI = i;
            InterfaceC142155hz interfaceC142155hz = this.LJLIL;
            if (interfaceC142155hz != null) {
                interfaceC142155hz.LIZIZ(this, i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142135hx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLJJI = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.5hy
            public int LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message msg) {
                o.LJIIIZ(msg, "msg");
                if (msg.what != 1) {
                    return false;
                }
                int scrollY = C142135hx.this.getScrollY();
                C142135hx c142135hx = C142135hx.this;
                if (!c142135hx.LJLILLLLZI && this.LJLIL == scrollY) {
                    this.LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
                    c142135hx.setScrollState(0);
                } else {
                    this.LJLIL = scrollY;
                    c142135hx.LJLJJI.removeMessages(1);
                    c142135hx.LJLJJI.sendEmptyMessageDelayed(1, 80L);
                }
                return true;
            }
        });
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI) {
            setScrollState(1);
        } else {
            setScrollState(2);
            this.LJLJJI.removeMessages(1);
            this.LJLJJI.sendEmptyMessageDelayed(1, 80L);
        }
        InterfaceC142155hz interfaceC142155hz = this.LJLIL;
        if (interfaceC142155hz != null) {
            interfaceC142155hz.LIZ(this);
        }
    }
}
