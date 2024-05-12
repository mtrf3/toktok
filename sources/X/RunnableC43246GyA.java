package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.GyA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43246GyA implements Runnable {
    public final /* synthetic */ C43245Gy9 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC42062Gf4 LJLJJI;

    public RunnableC43246GyA(C43245Gy9 c43245Gy9, String str, String str2, C41272GHs c41272GHs) {
        this.LJLIL = c43245Gy9;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = c41272GHs;
    }

    public final void LIZ() {
        CountDownLatch countDownLatch;
        try {
            try {
                if (this.LJLIL.LIZ.get() != null) {
                    C43245Gy9 c43245Gy9 = this.LJLIL;
                    c43245Gy9.LIZLLL = C37279Ek7.LIZ(c43245Gy9.LIZ.get(), this.LJLILLLLZI, this.LJLIL.LIZIZ, this.LJLJI, new C43247GyB(this.LJLJJI));
                } else {
                    C43245Gy9 c43245Gy92 = this.LJLIL;
                    new RuntimeException("Context is null");
                    c43245Gy92.getClass();
                    this.LJLIL.LIZLLL = false;
                }
                countDownLatch = this.LJLIL.LIZJ;
            } catch (Throwable unused) {
                C43245Gy9 c43245Gy93 = this.LJLIL;
                c43245Gy93.getClass();
                c43245Gy93.LIZLLL = false;
                countDownLatch = c43245Gy93.LIZJ;
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            this.LJLIL.LIZJ.countDown();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
