package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.Lqd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55519Lqd extends C51031K1b<C56554MHm> {
    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) k;
                List<Aweme> LJIIJ = ((C56554MHm) t).LJIIJ();
                if (!((AbstractC51036K1g) this.LJLIL).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                    z = false;
                }
                interfaceC223218pR.j0(LJIIJ, z);
                return;
            }
            ((InterfaceC223218pR) k).jh(((C56554MHm) t).LJIIJ(), !((AbstractC51036K1g) this.LJLIL).isNewDataEmpty());
            return;
        }
        if (((AbstractC51036K1g) t).isDataEmpty()) {
            ((InterfaceC223218pR) this.LJLILLLLZI).J5(((C56554MHm) this.LJLIL).LJIIJ(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
            ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
        } else {
            ((InterfaceC223218pR) this.LJLILLLLZI).J5(((C56554MHm) this.LJLIL).LJIIJ(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
        }
    }
}
