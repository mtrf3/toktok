package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.54Y, reason: invalid class name */
/* loaded from: classes3.dex */
public class C54Y extends View {
    public float LJLIL;
    public InterfaceC88471Ynr<? super Float, ? super Float, C76800UCe> LJLILLLLZI;
    public InterfaceC88472Yns<? super Float, C76800UCe> LJLJI;
    public InterfaceC88472Yns<? super Float, C76800UCe> LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public final RectF LJLJLJ;
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LJLJLLL;

    public InterfaceC88472Yns<MotionEvent, Boolean> getOnInterceptTouchListener() {
        return this.LJLJLLL;
    }

    public final InterfaceC88472Yns<Float, C76800UCe> getOnMoveDownListener() {
        return this.LJLJJI;
    }

    public final InterfaceC88471Ynr<Float, Float, C76800UCe> getOnMoveListener() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC88472Yns<Float, C76800UCe> getOnMoveUpListener() {
        return this.LJLJI;
    }

    public final float getScale() {
        return this.LJLJJL;
    }

    public final RectF getSelectFrameRect() {
        return this.LJLJLJ;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                InterfaceC88472Yns<MotionEvent, Boolean> onInterceptTouchListener = getOnInterceptTouchListener();
                if (onInterceptTouchListener != null && onInterceptTouchListener.invoke(motionEvent).booleanValue()) {
                    return false;
                }
                this.LJLJJLL = motionEvent.getRawX();
                this.LJLIL = motionEvent.getX();
                this.LJLJL = motionEvent.getRawX();
                InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns = this.LJLJJI;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Float.valueOf(this.LJLIL));
                }
            } else if (num.intValue() == 2) {
                InterfaceC88471Ynr<? super Float, ? super Float, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
                if (interfaceC88471Ynr != null) {
                    interfaceC88471Ynr.invoke(Float.valueOf(motionEvent.getRawX() - this.LJLJL), Float.valueOf(motionEvent.getRawX()));
                }
                this.LJLJL = motionEvent.getRawX();
            } else if (num.intValue() == 1 || num.intValue() == 3) {
                float rawX = motionEvent.getRawX();
                InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns2 = this.LJLJI;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Float.valueOf(rawX - this.LJLJJLL));
                }
            }
        }
        return true;
    }

    public void setOnInterceptTouchListener(InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        this.LJLJLLL = interfaceC88472Yns;
    }

    public final void setOnMoveDownListener(InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        this.LJLJJI = interfaceC88472Yns;
    }

    public final void setOnMoveListener(InterfaceC88471Ynr<? super Float, ? super Float, C76800UCe> interfaceC88471Ynr) {
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    public final void setOnMoveUpListener(InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        this.LJLJI = interfaceC88472Yns;
    }

    public final void setScale(float f) {
        this.LJLJJL = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJLJ = new RectF();
    }
}
