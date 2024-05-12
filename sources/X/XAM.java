package X;

import Y.AObjectS46S0101000_15;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import defpackage.e1;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public final class XAM implements Callable<VideoCreation> {
    public final Lock LJLIL;
    public final Condition LJLILLLLZI;
    public final AtomicReference<UploadAuthKeyConfig> LJLJI;
    public final AtomicReference<Throwable> LJLJJI;
    public final /* synthetic */ java.util.Map LJLJJL;

    @Override // java.util.concurrent.Callable
    public final VideoCreation call() {
        ((ReentrantLock) this.LJLIL).lock();
        try {
            try {
                C43379H0t.LJ(false, this.LJLJJL, new AObjectS46S0101000_15(2, this, 0), new AObjectS46S0101000_15(1, this, 1));
                if (this.LJLJI.get() == null && this.LJLJJI.get() == null) {
                    this.LJLILLLLZI.await();
                }
            } catch (InterruptedException unused) {
                C78983UzD.LJIILL("AuthKeyCacheHelper InterruptedException");
                C16880lQ.LLLLIIIILLL().interrupt();
            }
            ((ReentrantLock) this.LJLIL).unlock();
            if (this.LJLJJI.get() != null && !e1.LIZ(31744, "studio_authkey_cache_after_request", true, false)) {
                if (this.LJLJJI.get() instanceof Exception) {
                    throw this.LJLJJI.get();
                }
                throw new Exception(this.LJLJJI.get().getMessage(), this.LJLJJI.get());
            }
            if (this.LJLJI.get() == null && e1.LIZ(31744, "studio_authkey_cache_after_request", true, false) && C43379H0t.LIZIZ() != null) {
                this.LJLJI.set(C43379H0t.LIZIZ());
            } else if (this.LJLJI.get() == null) {
                throw new Exception("null result");
            }
            return this.LJLJI.get();
        } catch (Throwable th) {
            ((ReentrantLock) this.LJLIL).unlock();
            throw th;
        }
    }

    public XAM(java.util.Map map) {
        this.LJLJJL = map;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJLIL = reentrantLock;
        this.LJLILLLLZI = reentrantLock.newCondition();
        this.LJLJI = new AtomicReference<>(null);
        this.LJLJJI = new AtomicReference<>(null);
    }
}
