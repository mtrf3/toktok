package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.36v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C786536v extends FrameLayout {
    public static final int LJLJLJ = C17N.LJIILL(8.0d);
    public boolean LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public long LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public InterfaceC88471Ynr<? super Float, ? super Float, Boolean> LJLJJLL;
    public boolean LJLJL;

    public final InterfaceC65784Pro<C76800UCe> getCallBack() {
        return this.LJLJJL;
    }

    public final boolean getNeedIntercept() {
        return this.LJLJL;
    }

    public final InterfaceC88471Ynr<Float, Float, Boolean> getScrollPredicate() {
        return this.LJLJJLL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        super.onInterceptTouchEvent(ev);
        this.LJLIL = false;
        int action = ev.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.LJLJL) {
                    float x = ev.getX() - this.LJLILLLLZI;
                    float y = ev.getY() - this.LJLJI;
                    float abs = Math.abs(x);
                    float f = LJLJLJ;
                    if (abs > f || Math.abs(y) > f) {
                        if (this.LJLJJLL.invoke(Float.valueOf(x), Float.valueOf(y)).booleanValue()) {
                            this.LJLJJL.invoke();
                        }
                        this.LJLIL = true;
                    } else if (System.currentTimeMillis() - this.LJLJJI > ViewConfiguration.getDoubleTapTimeout()) {
                        this.LJLJJL.invoke();
                        this.LJLIL = true;
                    }
                }
            } else if (this.LJLJL) {
                float x2 = ev.getX() - this.LJLILLLLZI;
                float y2 = ev.getY() - this.LJLJI;
                float abs2 = Math.abs(x2);
                float f2 = LJLJLJ;
                if (abs2 < f2 && Math.abs(y2) < f2) {
                    this.LJLJJL.invoke();
                    this.LJLIL = true;
                }
            }
        } else {
            this.LJLILLLLZI = ev.getX();
            this.LJLJI = ev.getY();
            this.LJLJJI = System.currentTimeMillis();
        }
        return this.LJLIL;
    }

    public final void setCallBack(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLJJL = interfaceC65784Pro;
    }

    public final void setNeedIntercept(boolean z) {
        this.LJLJL = z;
    }

    public final void setScrollPredicate(InterfaceC88471Ynr<? super Float, ? super Float, Boolean> interfaceC88471Ynr) {
        o.LJIIIZ(interfaceC88471Ynr, "<set-?>");
        this.LJLJJLL = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C786536v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJL = C786736x.LJLIL;
        this.LJLJJLL = C63552eV.LJLIL;
    }
}
