package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Smv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73125Smv extends RecyclerView {
    public static final int LLLL = ViewConfiguration.getDoubleTapTimeout();
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public int LLLFZ;
    public float LLLI;
    public float LLLII;
    public InterfaceC45995I3j LLLIIII;
    public WXG LLLIIIIL;
    public long LLLIIIL;
    public boolean LLLIIL;
    public long LLLIILIL;
    public float LLLIL;
    public float LLLILZ;
    public boolean LLLILZJ;
    public float LLLILZLLLI;
    public float LLLIZZ;
    public final float LLLJ;
    public boolean LLLJIL;
    public RunnableC73126Smw LLLJL;

    public final void LJLJJLL() {
        this.LLLIIL = false;
        this.LLLILZJ = false;
    }

    public final InterfaceC73127Smx getCallback() {
        return null;
    }

    public final void setCallback(InterfaceC73127Smx interfaceC73127Smx) {
    }

    public final InterfaceC45995I3j getControlProgressApiComponent() {
        return this.LLLIIII;
    }

    public final boolean getDispatchUp() {
        return this.LLLFFI;
    }

    public final float getDownX() {
        return this.LLLI;
    }

    public final float getDownY() {
        return this.LLLII;
    }

    public final boolean getHasEvent() {
        return this.LLLF;
    }

    public final int getSnapPosition() {
        return this.LLLFZ;
    }

    public final boolean getStopMoveTouchEvent() {
        return this.LLLFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r19.getAction() == 3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJL(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73125Smv.LJLJJL(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        LJLJJL(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("rv visibility = ");
        LIZ.append(getVisibility());
        LIZ.append(",receive motionEvent = ");
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        LJLJJL(motionEvent);
        if (this.LLLFF) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            InterfaceC45995I3j interfaceC45995I3j = this.LLLIIII;
            if (interfaceC45995I3j != null) {
                interfaceC45995I3j.z0(obtain, this.LLLI, this.LLLII);
            }
            if (this.LLLFFI) {
                if (motionEvent != null) {
                    motionEvent.setAction(1);
                }
                this.LLLFFI = false;
                super.onTouchEvent(motionEvent);
                LJLIL(this.LLLFZ);
                LJLI(this.LLLFZ);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setControlProgressApiComponent(InterfaceC45995I3j interfaceC45995I3j) {
        this.LLLIIII = interfaceC45995I3j;
    }

    public final void setDispatchUp(boolean z) {
        this.LLLFFI = z;
    }

    public final void setDownX(float f) {
        this.LLLI = f;
    }

    public final void setDownY(float f) {
        this.LLLII = f;
    }

    public final void setHasEvent(boolean z) {
        this.LLLF = z;
    }

    public final void setOnGestureListener(WXG listener) {
        o.LJIIIZ(listener, "listener");
        this.LLLIIIIL = listener;
    }

    public final void setSnapPosition(int i) {
        this.LLLFZ = i;
    }

    public final void setStopMoveTouchEvent(boolean z) {
        this.LLLFF = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73125Smv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLFFI = true;
        float scaledDoubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.LLLJ = scaledDoubleTapSlop * scaledDoubleTapSlop;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
