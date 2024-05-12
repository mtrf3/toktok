package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* renamed from: X.F5f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38399F5f {
    public final InterfaceC38409F5p LIZ;
    public PthreadTimer LIZIZ;
    public long LIZJ;
    public long LIZLLL = -1;

    public final void LIZ() {
        PthreadTimer pthreadTimer = this.LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            this.LIZIZ = null;
        }
        this.LIZLLL = -1L;
        this.LIZJ = 0L;
    }

    public C38399F5f(F5Z f5z) {
        this.LIZ = f5z;
    }
}
