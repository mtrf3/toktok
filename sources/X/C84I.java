package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.PagerAdapter;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.84I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84I extends C80766Vms {
    public int LLJJJIL;
    public float LLJJJJ;
    public boolean LLJJJJJIL;
    public InterfaceC208778Hh LLJJJJLIIL;

    public final int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter != null) {
            return adapter.getCount();
        }
        return 0;
    }

    public final InterfaceC208778Hh getChecker() {
        return this.LLJJJJLIIL;
    }

    public final float getInitialXValue() {
        return this.LLJJJJ;
    }

    public final int getMinDistance() {
        return this.LLJJJIL;
    }

    public final boolean LJJIJLIJ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        this.LLJJJJLIIL.LIZIZ(event);
        boolean z = true;
        if ((event.getAction() & 255) == 0) {
            this.LLJJJJ = event.getX();
            return true;
        }
        float x = event.getX() - this.LLJJJJ;
        if (Math.abs(x) < 1.0E-6f) {
            return true;
        }
        if (C90193gN.LIZIZ(getContext())) {
            x = -x;
        }
        if (x <= 0.0f ? getCurrentItem() >= getItemCount() - 1 || !this.LLJJJJLIIL.LIZJ(x, -1) : getCurrentItem() <= 0 || !this.LLJJJJLIIL.LIZJ(x, 1)) {
            z = false;
            if (x > 0.0f) {
                this.LLJJJJ = event.getX();
            }
        }
        return z;
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if ((!this.LLJJJJJIL || !LJJIJLIJ(event)) && event.getAction() != 1 && event.getAction() != 3) {
            return false;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if ((!this.LLJJJJJIL || !LJJIJLIJ(event)) && event.getAction() != 1 && event.getAction() != 3) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    public final void setChecker(InterfaceC208778Hh interfaceC208778Hh) {
        o.LJIIIZ(interfaceC208778Hh, "<set-?>");
        this.LLJJJJLIIL = interfaceC208778Hh;
    }

    public final void setInitialXValue(float f) {
        this.LLJJJJ = f;
    }

    public final void setMinDistance(int i) {
        this.LLJJJIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = new InterfaceC208778Hh() { // from class: X.84J
            @Override // X.InterfaceC208778Hh
            public final void LIZIZ(MotionEvent event) {
                o.LJIIIZ(event, "event");
            }

            @Override // X.InterfaceC208778Hh
            public final boolean LIZJ(float f, int i) {
                return i != -1;
            }

            @Override // X.InterfaceC208778Hh
            public final boolean LIZLLL(float f, float f2) {
                if (Math.abs(f) > C84I.this.getMinDistance() && Math.abs(f) > Math.abs(f2)) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJI = false;
        this.LLJJJIL = C17N.LJIILL(8.0d);
        setDefaultGutterSize(0);
        ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // X.C80769Vmv, android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i, int i2) {
        o.LJIIIZ(views, "views");
        try {
            super.addFocusables(views, i, i2);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
    }

    @Override // X.C80769Vmv
    public final boolean LJII(View v, boolean z, int i, int i2, int i3) {
        o.LJIIIZ(v, "v");
        if (C27740Aue.LJFF(v) && super.LJII(v, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
