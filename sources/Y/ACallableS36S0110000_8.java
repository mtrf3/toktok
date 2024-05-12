package Y;

import X.AbstractC49793JgT;
import X.C76800UCe;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public class ACallableS36S0110000_8 implements Callable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS36S0110000_8 aCallableS36S0110000_8) {
        String str = ((AbstractC49793JgT) ((TopFeedFragment) aCallableS36S0110000_8.l0).vn().LJLIL).LJLLI;
        TopFeedFragment topFeedFragment = (TopFeedFragment) aCallableS36S0110000_8.l0;
        topFeedFragment.hn(topFeedFragment.LLLIIIIL, str, topFeedFragment.Kl(), ((TopFeedFragment) aCallableS36S0110000_8.l0).LJLLL, aCallableS36S0110000_8.z1);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS36S0110000_8 aCallableS36S0110000_8) {
        String str = ((AbstractC49793JgT) ((TopProxyFragment) aCallableS36S0110000_8.l0).vn().LJLIL).LJLLI;
        TopProxyFragment topProxyFragment = (TopProxyFragment) aCallableS36S0110000_8.l0;
        topProxyFragment.hn(topProxyFragment.LLJZ, str, topProxyFragment.Kl(), ((TopProxyFragment) aCallableS36S0110000_8.l0).LJLLL, aCallableS36S0110000_8.z1);
        return C76800UCe.LIZ;
    }

    public ACallableS36S0110000_8(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
