package X;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class F6V implements Runnable {
    public final /* synthetic */ WeakReference<F6T> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;

    public F6V(WeakReference<F6T> weakReference, String str, boolean z, int i) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            F6T f6t = this.LJLIL.get();
            if (f6t != null) {
                f6t.LIZ(this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
