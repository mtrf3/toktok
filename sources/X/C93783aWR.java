package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.aWR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93783aWR extends GestureDetector.SimpleOnGestureListener {
    public float LJLIL;
    public float LJLILLLLZI;
    public final /* synthetic */ C93782aWQ LJLJI;

    public C93783aWR(C93782aWQ c93782aWQ) {
        this.LJLJI = c93782aWQ;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLJI.LJLJJI.cancel();
        this.LJLJI.LJLJJI.start();
        InterfaceC93781aWP interfaceC93781aWP = this.LJLJI.LJLJJL;
        if (interfaceC93781aWP != null) {
            interfaceC93781aWP.LIZJ();
        }
        if (motionEvent != null) {
            this.LJLIL = motionEvent.getRawX();
            this.LJLILLLLZI = motionEvent.getRawY();
        }
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        float rawX = e2.getRawX() - this.LJLIL;
        float rawY = e2.getRawY() - this.LJLILLLLZI;
        this.LJLIL = e2.getRawX();
        this.LJLILLLLZI = e2.getRawY();
        InterfaceC93781aWP interfaceC93781aWP = this.LJLJI.LJLJJL;
        if (interfaceC93781aWP != null) {
            interfaceC93781aWP.LIZ(rawX, rawY);
            return true;
        }
        return true;
    }
}
