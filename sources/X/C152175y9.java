package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C152175y9 extends C80766Vms {
    public boolean LLJJJIL;
    public final List<PointF> LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LLJLIL;

    public final boolean getCanClick() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getCanInterceptTouchEvent() {
        return this.LLJJJJLIIL;
    }

    public final boolean getCanScroll() {
        return this.LLJJJJJIL;
    }

    public final InterfaceC88472Yns<MotionEvent, Boolean> getOnViewPagerClickListener() {
        return this.LLJLIL;
    }

    public final long getStartClickTime() {
        return this.LLJL;
    }

    public final boolean LJJIJLIJ(MotionEvent motionEvent) {
        List<PointF> list = this.LLJJJJ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (PointF pointF : list) {
            float f = pointF.x;
            float f2 = pointF.y;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            double d = 2;
            if (Math.sqrt(Math.pow(f2 - y, d) + Math.pow(f - x, d)) > 5.0d) {
                return false;
            }
        }
        return true;
    }

    public final void LJJIL(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2 || !this.LLJJJIL) {
                    return;
                }
                if (LJJIJLIJ(motionEvent)) {
                    ((ArrayList) this.LLJJJJ).add(new PointF(motionEvent.getX(), motionEvent.getY()));
                    return;
                }
                this.LLJJJIL = false;
                return;
            }
            if (!this.LLJJJIL || !this.LLJJLIIIJLLLLLLLZ) {
                return;
            }
            if (LJJIJLIJ(motionEvent) && System.currentTimeMillis() - this.LLJL < 200) {
                this.LLJLIL.invoke(motionEvent);
            }
            this.LLJJJIL = false;
            return;
        }
        this.LLJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = false;
        ((ArrayList) this.LLJJJJ).clear();
        ((ArrayList) this.LLJJJJ).add(new PointF(motionEvent.getX(), motionEvent.getY()));
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 2) {
            return this.LLJJJJJIL;
        }
        if (!this.LLJJJJLIIL) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJJL && motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            this.LLJJJJJIL = false;
        }
        try {
            LJJIL(motionEvent);
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            H7B.LIZLLL(e);
            return false;
        }
    }

    public final void setCanClick(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setCanInterceptTouchEvent(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public final void setCanScroll(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setOnViewPagerClickListener(InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LLJLIL = interfaceC88472Yns;
    }

    public final void setPublishPreview(boolean z) {
        this.LLJJL = z;
    }

    public final void setStartClickTime(long j) {
        this.LLJL = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152175y9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJJJ = new ArrayList();
        this.LLJJJJLIIL = true;
        this.LLJLIL = C152185yA.LJLIL;
    }
}
