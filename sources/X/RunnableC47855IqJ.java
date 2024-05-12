package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IqJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47855IqJ implements Runnable {
    public final WeakReference<C47856IqK> LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C47856IqK c47856IqK = this.LJLIL.get();
            if (c47856IqK != null) {
                synchronized (C47856IqK.class) {
                    if (!c47856IqK.LJI) {
                        c47856IqK.LJI = true;
                        c47856IqK.LJ(new C47789IpF("kTTVideoErrorDomainLocalDNS", -10000));
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47855IqJ(C47856IqK c47856IqK) {
        this.LJLIL = new WeakReference<>(c47856IqK);
    }
}
