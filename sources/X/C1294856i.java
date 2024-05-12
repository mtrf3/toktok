package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.56i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1294856i extends AppCompatImageView {
    public float LJLIL;
    public InterfaceC88471Ynr<? super Float, ? super Float, C76800UCe> LJLILLLLZI;
    public InterfaceC88472Yns<? super Float, C76800UCe> LJLJI;
    public InterfaceC88472Yns<? super Float, C76800UCe> LJLJJI;
    public boolean LJLJJL;
    public float LJLJJLL;
    public float LJLJL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
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

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (!this.LJLJJL) {
            return false;
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
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
            } else if (num.intValue() == 1) {
                float rawX = motionEvent.getRawX();
                InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns2 = this.LJLJI;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Float.valueOf(rawX - this.LJLJJLL));
                }
            }
        }
        return true;
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

    public final void setTouchAble(boolean z) {
        this.LJLJJL = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1294856i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1294856i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJJL = true;
    }
}
