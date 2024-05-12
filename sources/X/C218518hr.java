package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218518hr extends FrameLayout {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final float[] LJLJI;

    public final boolean getGroupClickable() {
        return this.LJLIL;
    }

    public final int getHintTextRes() {
        return this.LJLILLLLZI;
    }

    public final float[] getLastTouchDownXY() {
        return this.LJLJI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C218518hr(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        HHD.LJIIL(motionEvent, this);
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LJLJI[0] = motionEvent.getRawX();
            this.LJLJI[1] = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setGroupClickable(boolean z) {
        this.LJLIL = z;
    }

    public final void setHintTextRes(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (HHD.LJFF(i, this)) {
            return;
        }
        super.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218518hr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = true;
        this.LJLILLLLZI = -1;
        this.LJLJI = new float[2];
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS38S0200000_3(this, context, 37)));
    }
}
