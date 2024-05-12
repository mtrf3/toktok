package X;

import com.bytedance.ies.powerlist.page.PowerPageLoader;

/* loaded from: classes13.dex */
public final class SZN implements Runnable {
    public final /* synthetic */ PowerPageLoader<T> LJLIL;
    public final /* synthetic */ SZP LJLILLLLZI;
    public final /* synthetic */ A2G<T> LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public SZN(PowerPageLoader<T> powerPageLoader, SZP szp, A2G<T> a2g, boolean z) {
        this.LJLIL = powerPageLoader;
        this.LJLILLLLZI = szp;
        this.LJLJI = a2g;
        this.LJLJJI = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZLLL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
