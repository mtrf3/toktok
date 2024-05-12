package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6B9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6B9 extends C81309Vvd {
    public final C6BC LJLJJLL;
    public TextView LJLJL;
    public Float LJLJLJ;
    public C6BH LJLJLLL;

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !C158226Iw.LIZ();
    }

    @Override // X.C81309Vvd, android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        C6BH c6bh;
        o.LJIIIZ(event, "event");
        int i = 0;
        if (getVisibility() != 0) {
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent) {
            int action = event.getAction();
            Float f = null;
            if (action != 0) {
                if (action == 1 || action == 3) {
                    Float f2 = this.LJLJLJ;
                    C6BC c6bc = this.LJLJJLL;
                    C6BD<?> c6bd = c6bc.LIZIZ;
                    if (c6bd != null) {
                        float LIZJ = c6bd.LIZJ();
                        float progress = c6bc.LIZ.getProgress();
                        if (Build.VERSION.SDK_INT >= 26) {
                            i = c6bc.LIZ.getMin();
                        }
                        float f3 = i;
                        float max = c6bc.LIZ.getMax();
                        float f4 = c6bc.LIZJ;
                        float f5 = c6bc.LIZLLL;
                        if (progress > f3) {
                            if (progress >= max) {
                                f4 = f5;
                            } else {
                                f4 = C06420Na.LIZIZ(progress, f3, f5, (max - progress) * f4) / (max - f3);
                            }
                        }
                        if (Float.valueOf(f4 * LIZJ) != null) {
                            f = Float.valueOf(O6R.LJJIIZ(r0.floatValue()));
                        }
                    }
                    if (!o.LIZLLL(f2, f) && (c6bh = this.LJLJLLL) != null) {
                        c6bh.LIZ();
                    }
                }
            } else {
                C6BD<?> c6bd2 = this.LJLJJLL.LIZIZ;
                if (c6bd2 != null) {
                    f = Float.valueOf(c6bd2.LIZLLL());
                }
                this.LJLJLJ = f;
            }
        }
        return onTouchEvent;
    }

    public final void setOnAdjustTextRollbarListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.LJI = listener;
    }

    public final void setOnTextSizeChangedListener(C6BH c6bh) {
        this.LJLJLLL = c6bh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6B9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJJLL = new C6BC(this);
    }

    public final void LIZJ(Integer num, Integer num2, int i) {
        C6BC c6bc = this.LJLJJLL;
        c6bc.getClass();
        if (num != null) {
            c6bc.LIZJ = num.intValue() / i;
        }
        if (num2 != null) {
            c6bc.LIZLLL = num2.intValue() / i;
        }
    }
}
