package X;

import X.I9X;

/* loaded from: classes8.dex */
public final class IAH implements Runnable {
    public final /* synthetic */ I9X.c LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public IAH(I9X.c cVar, long j) {
        this.LJLIL = cVar;
        this.LJLILLLLZI = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            I9X.this.LLLL(this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
