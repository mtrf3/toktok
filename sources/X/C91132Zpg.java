package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpg, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91132Zpg extends RelativeLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public InterfaceC92113jT LJLJI;
    public float LJLJJI;
    public Runnable LJLJJL;

    public final float getDisAmount() {
        return this.LJLJJI;
    }

    public final Runnable getFallBackRunnable() {
        return this.LJLJJL;
    }

    public final float getPreviousY() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC92113jT getViewPager() {
        return this.LJLJI;
    }

    public final float getYDown() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        Runnable runnable;
        InterfaceC92113jT interfaceC92113jT;
        InterfaceC92113jT interfaceC92113jT2;
        InterfaceC92113jT interfaceC92113jT3;
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3 && (interfaceC92113jT3 = this.LJLJI) != null && interfaceC92113jT3.LIZ()) {
                            try {
                                InterfaceC92113jT interfaceC92113jT4 = this.LJLJI;
                                if (interfaceC92113jT4 != null) {
                                    interfaceC92113jT4.LIZLLL();
                                }
                            } catch (NullPointerException unused) {
                            }
                        }
                    } else {
                        float y = motionEvent.getY() - this.LJLILLLLZI;
                        this.LJLILLLLZI = motionEvent.getY();
                        if (y < 0.0f || this.LJLJJI < 0.0f) {
                            InterfaceC92113jT interfaceC92113jT5 = this.LJLJI;
                            if (interfaceC92113jT5 != null && !interfaceC92113jT5.LIZ() && (interfaceC92113jT2 = this.LJLJI) != null) {
                                interfaceC92113jT2.LIZJ();
                            }
                            InterfaceC92113jT interfaceC92113jT6 = this.LJLJI;
                            if (interfaceC92113jT6 != null) {
                                interfaceC92113jT6.LJFF(y);
                            }
                            this.LJLJJI += y;
                        }
                    }
                } else {
                    InterfaceC92113jT interfaceC92113jT7 = this.LJLJI;
                    if (interfaceC92113jT7 != null && interfaceC92113jT7.LIZ() && (interfaceC92113jT = this.LJLJI) != null) {
                        interfaceC92113jT.LIZLLL();
                    }
                    this.LJLIL = 0.0f;
                    this.LJLJJI = 0.0f;
                    Object obj = this.LJLJI;
                    if ((obj instanceof C80796VnM) && (viewGroup = (ViewGroup) obj) != null && viewGroup.getChildCount() == 1 && (runnable = this.LJLJJL) != null) {
                        runnable.run();
                    }
                }
            } else {
                float y2 = motionEvent.getY();
                this.LJLIL = y2;
                this.LJLILLLLZI = y2;
            }
        }
        return true;
    }

    public final void setDisAmount(float f) {
        this.LJLJJI = f;
    }

    public final void setFallBackRunnable(Runnable runnable) {
        this.LJLJJL = runnable;
    }

    public final void setPreviousY(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setViewPager(InterfaceC92113jT interfaceC92113jT) {
        this.LJLJI = interfaceC92113jT;
    }

    public final void setYDown(float f) {
        this.LJLIL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91132Zpg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
    }
}
