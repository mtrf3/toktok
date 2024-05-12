package X;

import android.view.MotionEvent;

/* renamed from: X.LPf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54207LPf implements InterfaceC208778Hh {
    public final /* synthetic */ C54206LPe LIZIZ;

    @Override // X.InterfaceC208778Hh
    public final void LIZIZ(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC208778Hh
    public final boolean LIZJ(float f, int i) {
        return true;
    }

    public C54207LPf(C54206LPe c54206LPe) {
        this.LIZIZ = c54206LPe;
    }

    @Override // X.InterfaceC208778Hh
    public final boolean LIZLLL(float f, float f2) {
        if (Math.abs(f) > this.LIZIZ.LLJJJIL && Math.abs(f) > Math.abs(f2)) {
            return true;
        }
        return false;
    }
}
