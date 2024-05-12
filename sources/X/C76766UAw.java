package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.UAw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76766UAw {
    public static final C76766UAw LIZJ = UBH.LIZ;
    public final Handler LIZ;
    public final HandlerThread LIZIZ;

    public final Looper LIZIZ() {
        Looper looper = this.LIZIZ.getLooper();
        o.LJIIIIZZ(looper, "mBackGroundThread.looper");
        return looper;
    }

    public C76766UAw() {
        HandlerThread LIZ = C06M.LIZ("Link-Mic-Layer-Thread");
        this.LIZ = new Handler(LIZ.getLooper());
        this.LIZIZ = LIZ;
    }

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z;
        if (this.LIZIZ.getLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && o.LJ(this.LIZIZ.getLooper(), Looper.myLooper())) {
            C0NB.LIZIZ("BackgroundHolderUtil", "runOnFire, run immediately");
            interfaceC65784Pro.invoke();
        } else {
            C0NB.LIZIZ("BackgroundHolderUtil", "runOnFire, post to background thread");
            LIZJ(new ARunnableS46S0100000_10((InterfaceC65784Pro) interfaceC65784Pro, 9));
        }
    }

    public final void LIZJ(Runnable runnable) {
        if (!this.LIZIZ.isAlive()) {
            C0K2.LIZ("thread not alive", new Throwable());
        }
        this.LIZ.post(runnable);
    }
}
