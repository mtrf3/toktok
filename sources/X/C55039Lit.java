package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.Lit, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55039Lit extends C51031K1b<AbstractC51036K1g> {
    public Object[] LJLJJL;
    public String LJLJJLL;

    @Override // X.C8BR
    public final void LJJII() {
        C55693LtR c55693LtR;
        C73318Sq2 c73318Sq2;
        T t = this.LJLIL;
        if (t != 0 && (t instanceof C55693LtR) && (c73318Sq2 = (c55693LtR = (C55693LtR) t).LJLLJ) != null) {
            c73318Sq2.LIZLLL();
            c55693LtR.LJLLJ = null;
        }
        super.LJJII();
    }

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
                    if (i != 6 || !(k instanceof YFI)) {
                        return;
                    }
                    ((YFI) k).m0(((AbstractC51036K1g) t).getItems(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
                    return;
                }
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) k;
                List items = ((AbstractC51036K1g) t).getItems();
                if (!((AbstractC51036K1g) this.LJLIL).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                    z = false;
                }
                interfaceC223218pR.j0(items, z);
                return;
            }
            ((InterfaceC223218pR) k).jh(((AbstractC51036K1g) t).getItems(), !((AbstractC51036K1g) this.LJLIL).isNewDataEmpty());
            return;
        }
        if (TextUtils.equals(this.LJLJJLL, ((C55693LtR) t).LJLJI)) {
            K k2 = this.LJLILLLLZI;
            if (k2 instanceof YFI) {
                ((YFI) k2).B7(((AbstractC51036K1g) this.LJLIL).hasLocateItem());
            }
            ((InterfaceC223218pR) this.LJLILLLLZI).J5(((AbstractC51036K1g) this.LJLIL).getItems(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
            return;
        }
        Object[] objArr = this.LJLJJL;
        if (objArr == null || objArr.length <= 2) {
            return;
        }
        Object obj = objArr[2];
        if (!(obj instanceof String) || !TextUtils.equals((String) obj, this.LJLJJLL)) {
            return;
        }
        super.LJIILL(this.LJLJJL);
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        this.LJLJJL = objArr;
        return super.LJIILL(objArr);
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k;
        super.onFailed(exc);
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0 || ((AbstractC51036K1g) t).mListQueryType != 6 || !(k instanceof YFI)) {
            return;
        }
        ((YFI) k).Th(exc);
    }
}
