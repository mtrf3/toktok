package X;

import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class S4C implements Runnable {
    public final /* synthetic */ USAddonOrderVH LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public S4C(USAddonOrderVH uSAddonOrderVH, String str, int i) {
        this.LJLIL = uSAddonOrderVH;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C26045AKb c26045AKb = new C26045AKb(this.LJLIL.LJLIL);
            c26045AKb.LJIIIZ(this.LJLILLLLZI);
            c26045AKb.LJFF(this.LJLJI);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
