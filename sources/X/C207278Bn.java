package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.8Bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207278Bn extends C80766Vms {
    public final long LLJJJIL;
    public final C81C LLJJJJ;
    public int LLJJJJJIL;
    public final CopyOnWriteArrayList<InterfaceC207288Bo> LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final ARunnableS39S0100000_3 LLJLIL;

    @Override // X.C80769Vmv, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJL = true;
        C81C c81c = this.LLJJJJ;
        c81c.LIZIZ = false;
        C216848fA c216848fA = c81c.LIZ;
        c216848fA.LIZLLL = false;
        c216848fA.LIZ = 0;
        removeCallbacks(this.LLJLIL);
        this.LLJJLIIIJLLLLLLLZ = 0;
    }

    public final int getCurrentPosition() {
        return this.LLJJJJJIL;
    }

    @Override // X.C80769Vmv, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!this.LLJJL) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJJL) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (!this.LLJJL) {
            return false;
        }
        return super.onTouchEvent(ev);
    }

    public final void setCurrentPhotoItem(int i) {
        this.LLJJJJJIL = i;
        setCurrentItem(i, false);
    }

    public final void setSupportSlide(boolean z) {
        this.LLJJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207278Bn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJJIL = 2500L;
        C81C c81c = new C81C(context);
        this.LLJJJJ = c81c;
        this.LLJJJJJIL = getCurrentItem();
        this.LLJJJJLIIL = new CopyOnWriteArrayList<>();
        this.LLJLIL = new ARunnableS39S0100000_3(this, 102);
        setScroller(c81c);
    }
}
