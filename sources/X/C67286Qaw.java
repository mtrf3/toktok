package X;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qaw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67286Qaw extends C1PE implements InterfaceC67786Qj0 {
    public final Semaphore LJIIJJI;
    public final java.util.Set LJIIL;

    @Override // X.C0ZP
    public final void LJI() {
        this.LJIIJJI.drainPermits();
        LIZLLL();
    }

    @Override // X.C1PE
    public final /* bridge */ /* synthetic */ Object LJIIJ() {
        Iterator it = this.LJIIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((AbstractC67709Qhl) it.next()).LJIIJJI(this)) {
                i++;
            }
        }
        try {
            this.LJIIJJI.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            C16880lQ.LLLLIIIILLL().interrupt();
            return null;
        }
    }

    @Override // X.InterfaceC67786Qj0
    public final void onComplete() {
        this.LJIIJJI.release();
    }

    public C67286Qaw(SignInHubActivity signInHubActivity, java.util.Set set) {
        super(signInHubActivity);
        this.LJIIJJI = new Semaphore(0);
        this.LJIIL = set;
    }
}
