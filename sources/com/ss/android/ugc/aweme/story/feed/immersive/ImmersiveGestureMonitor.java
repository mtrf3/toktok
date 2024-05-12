package com.ss.android.ugc.aweme.story.feed.immersive;

import X.InterfaceC213868aM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes4.dex */
public final class ImmersiveGestureMonitor extends FrameLayout {
    public InterfaceC213868aM LJLIL;
    public float LJLILLLLZI;

    public final InterfaceC213868aM getEventListener$story_release() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC213868aM interfaceC213868aM;
        InterfaceC213868aM interfaceC213868aM2 = this.LJLIL;
        if (interfaceC213868aM2 != null && interfaceC213868aM2.LLL() && motionEvent != null && (interfaceC213868aM = this.LJLIL) != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    float x = this.LJLILLLLZI - motionEvent.getX();
                    interfaceC213868aM.LLLLIL();
                    if (x > 8.0f) {
                        interfaceC213868aM.Q();
                        return true;
                    }
                    float x2 = motionEvent.getX() - this.LJLILLLLZI;
                    interfaceC213868aM.LLLLIL();
                    if (x2 > 8.0f) {
                        interfaceC213868aM.L0();
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
            } else {
                this.LJLILLLLZI = motionEvent.getX();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setEventListener$story_release(InterfaceC213868aM interfaceC213868aM) {
        this.LJLIL = interfaceC213868aM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmersiveGestureMonitor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
