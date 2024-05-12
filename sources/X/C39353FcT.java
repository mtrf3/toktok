package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p83.a;

/* renamed from: X.FcT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39353FcT extends PthreadThread {
    public final WeakReference<a> LJLIL;
    public final long LJLILLLLZI;
    public final CountDownLatch LJLJI;
    public boolean LJLJJI;

    public C39353FcT(a aVar, long j) {
        super("AdvertisingIdClient$zza");
        this.LJLIL = new WeakReference<>(aVar);
        this.LJLILLLLZI = j;
        this.LJLJI = new CountDownLatch(1);
        this.LJLJJI = false;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        a aVar;
        try {
            try {
                if (!this.LJLJI.await(this.LJLILLLLZI, TimeUnit.MILLISECONDS) && (aVar = this.LJLIL.get()) != null) {
                    aVar.LIZ();
                    this.LJLJJI = true;
                }
            } catch (InterruptedException unused) {
                a aVar2 = this.LJLIL.get();
                if (aVar2 != null) {
                    aVar2.LIZ();
                    this.LJLJJI = true;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
