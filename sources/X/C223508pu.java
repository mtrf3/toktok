package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.8pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223508pu extends SJC {
    public final InterfaceC2302191t LJLIL;
    public final InterfaceC223528pw LJLILLLLZI;
    public final Runnable LJLJI;
    public final InterfaceC88472Yns<MotionEvent, Boolean> LJLJJI;

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.LJLIL.handleDoubleClick(motionEvent);
        return super.onDoubleTap(motionEvent);
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        InterfaceC88472Yns<MotionEvent, Boolean> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null && interfaceC88472Yns.invoke(motionEvent).booleanValue()) {
            return;
        }
        this.LJLJI.run();
        this.LJLILLLLZI.LIZ(1);
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.LJLILLLLZI.LIZ(3);
        return super.onSingleTapConfirmed(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C223508pu(InterfaceC2302191t handler, InterfaceC223528pw interfaceC223528pw, Runnable runnable, InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        o.LJIIIZ(handler, "handler");
        this.LJLIL = handler;
        this.LJLILLLLZI = interfaceC223528pw;
        this.LJLJI = runnable;
        this.LJLJJI = interfaceC88472Yns;
    }
}
