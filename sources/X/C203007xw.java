package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203007xw extends C80766Vms implements InterfaceC2048082a {
    public float LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // X.InterfaceC2048082a
    public final void LIZJ(SlidesImageLoadParams slidesImageLoadParams) {
    }

    @Override // X.C80769Vmv, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public final float getMStartDragX() {
        return this.LLJJJIL;
    }

    public final boolean getSwipedRightAtFirstPosition() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC2048082a
    public final void LIZ(SlidesImageLoadParams slidesImageLoadParams) {
        if (this.LLJJJJLIIL) {
            this.LLJJJJLIIL = false;
        }
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean z;
        o.LJIIIZ(ev, "ev");
        float x = ev.getX();
        int action = ev.getAction();
        if (action != 0) {
            if (action == 2 && getCurrentItem() == 0) {
                if (this.LLJJJIL < x) {
                    z = true;
                } else {
                    z = false;
                }
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                if (!C26338AVi.LIZJ(context) ? z : !z) {
                    this.LLJJJJJIL = true;
                    return false;
                }
                this.LLJJJJJIL = false;
                return super.onInterceptTouchEvent(ev);
            }
        } else {
            this.LLJJJIL = x;
            this.LLJJJJ = true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void setMStartDragX(float f) {
        this.LLJJJIL = f;
    }

    public final void setSwipedRightAtFirstPosition(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setUnderUserAction(boolean z) {
        this.LLJJJJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203007xw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJJJLIIL = true;
    }
}
