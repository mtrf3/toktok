package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.X4n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC84245X4n implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ List LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: Finally extract failed */
    public final void LIZ() {
        try {
            if (this.LJLIL) {
                String str = this.LJLILLLLZI;
                List list = this.LJLJI;
                C84243X4l c84243X4l = X5I.LIZ;
                if (!c84243X4l.LIZIZ(str)) {
                    C84242X4k c84242X4k = new C84242X4k(str, list);
                    synchronized (c84243X4l.LIZ) {
                        ((HashMap) c84243X4l.LIZ).put(str, c84242X4k);
                    }
                    try {
                        try {
                            c84242X4k.LIZLLL();
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        try {
                            c84242X4k.cancel();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th) {
                        try {
                            c84242X4k.cancel();
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                }
            }
            if (this.LJLJJL) {
                X4X.LIZ(this.LJLJJLL, this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
                X4X.LIZJ = new RunnableC84253X4v(this.LJLILLLLZI);
                X4X.LIZIZ.postDelayed(X4X.LIZJ, X4X.LIZLLL);
            }
        } catch (Throwable unused3) {
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

    public RunnableC84245X4n(int i, long j, String str, List list, boolean z, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = list;
        this.LJLJJI = j;
        this.LJLJJL = z2;
        this.LJLJJLL = i;
    }
}
