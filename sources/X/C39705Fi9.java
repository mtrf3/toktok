package X;

import android.view.MotionEvent;
import android.view.Window;

/* renamed from: X.Fi9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39705Fi9 extends WindowCallbackC25670zb {
    public C39705Fi9(Window.Callback callback) {
        super(callback);
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC39711FiF interfaceC39711FiF;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - C39707FiB.LIZ > 3000) {
            C39707FiB.LIZ = currentTimeMillis;
            if (motionEvent.getAction() == 0 && (interfaceC39711FiF = C39707FiB.LJFF) != null) {
                interfaceC39711FiF.getClass();
                if (C35728E0m.LIZIZ) {
                    C35810E3q.LJ(2500L);
                }
                if (C35728E0m.LIZJ) {
                    C35810E3q.LJFF(3500L);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
