package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.54J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54J extends HorizontalScrollView implements C54O {
    public final RelativeLayout LJLIL;
    public final C54L LJLILLLLZI;
    public C54X LJLJI;
    public C131235Db LJLJJI;
    public int LJLJJL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJLL;
    public final AqS184S0100000_2 LJLJL;
    public boolean LJLJLJ;

    @Override // X.C54O
    public final void LIZ() {
        C54X c54x = this.LJLJI;
        if (c54x != null) {
            c54x.postInvalidate();
        }
    }

    public final long getCurTimePosition() {
        if (this.LJLJI != null) {
            return (float) Math.floor(getScrollX() / r0.getPxPerMs());
        }
        return 0L;
    }

    @Override // X.C54O
    public C54K getFrameData() {
        float f;
        int i;
        C54X c54x = this.LJLJI;
        if (c54x != null) {
            f = c54x.getPxPerMs();
        } else {
            f = 1.0f;
        }
        C54X c54x2 = this.LJLJI;
        if (c54x2 != null) {
            i = c54x2.getFrameWidth();
        } else {
            i = 0;
        }
        return new C54K(f, i);
    }

    public final int getRootLeftPadding() {
        return this.LJLIL.getPaddingLeft();
    }

    public final float getVideoFrameScale() {
        C54X c54x = this.LJLJI;
        if (c54x != null) {
            return c54x.getPxPerMs();
        }
        return 0.0f;
    }

    @Override // X.C54O
    public int getCurScrollX() {
        return getScrollX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LJLJLJ) {
            return super.onTouchEvent(ev);
        }
        return true;
    }

    public final void setEnableScroll(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setPreInitRect(Rect initRect) {
        Rect preInitVisibleRect;
        o.LJIIIZ(initRect, "initRect");
        C54X c54x = this.LJLJI;
        if (c54x != null && (preInitVisibleRect = c54x.getPreInitVisibleRect()) != null) {
            preInitVisibleRect.set(initRect);
        }
    }

    public final void setScrollXListener(InterfaceC88472Yns<? super Integer, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL = listener;
    }

    public final void setVideoFrameScale(float f) {
        C54X c54x = this.LJLJI;
        if (c54x != null) {
            c54x.setPxPerMs(f);
        }
    }

    public final void setVideoFrameWidth(int i) {
        C54X c54x = this.LJLJI;
        if (c54x != null) {
            c54x.setFrameWidth(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.LJLIL = relativeLayout;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        this.LJLILLLLZI = new C54L(context2, this);
        int LIZJ = C134845Qy.LIZJ(C58S.LIZ()) / 2;
        this.LJLJL = new AqS184S0100000_2(this, 59);
        this.LJLJLJ = true;
        setHorizontalScrollBarEnabled(false);
        addView(relativeLayout, 0, new FrameLayout.LayoutParams(-2, -1));
        V2B.LJIILL(relativeLayout, LIZJ, 0, LIZJ, 0);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LJLJI != null) {
            int abs = Math.abs(getScrollX() - this.LJLJJL);
            C54X c54x = this.LJLJI;
            if (c54x != null) {
                i5 = c54x.getFrameWidth();
            } else {
                i5 = 0;
            }
            if (abs >= i5 * 5) {
                C131235Db c131235Db = this.LJLJJI;
                if (c131235Db != null) {
                    c131235Db.LJI(false);
                }
                this.LJLJJL = getScrollX();
            }
        }
        C54X c54x2 = this.LJLJI;
        if (c54x2 != null) {
            c54x2.postInvalidate();
        }
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(getScrollX()));
        }
    }
}
