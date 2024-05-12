package X;

import X.AbstractC51036K1g;
import java.util.List;

/* renamed from: X.K1b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51031K1b<T extends AbstractC51036K1g> extends C8BR<T, InterfaceC223218pR> implements InterfaceC51034K1e {
    public InterfaceC51033K1d LJLJJI;

    public /* synthetic */ boolean onItemInsertedNew(C2KF c2kf) {
        return false;
    }

    @Override // X.C8BR, X.InterfaceC223218pR
    public void LJII() {
        K k;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 19) {
                        if (i != 20) {
                            return;
                        }
                    }
                }
                ((InterfaceC223218pR) k).showLoadMoreLoading();
                return;
            }
            ((InterfaceC223218pR) k).Iw();
            return;
        }
        ((InterfaceC223218pR) k).LJII();
    }

    @Override // X.C8BR, X.C8BT
    public void onSuccess() {
        K k;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 4 && i != 16) {
                    if (i != 19) {
                        if (i != 20) {
                            return;
                        }
                    }
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
        if (((AbstractC51036K1g) t).isDataEmpty()) {
            ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
        } else {
            ((InterfaceC223218pR) this.LJLILLLLZI).J5(((AbstractC51036K1g) this.LJLIL).getItems(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
        }
    }

    @Override // X.C8BR
    public void LIZIZ() {
        super.LIZIZ();
        this.LJLJJI = null;
    }

    public void LJJIII(InterfaceC51033K1d interfaceC51033K1d) {
        this.LJLJJI = interfaceC51033K1d;
    }

    public boolean LJJIIJ(Object obj) {
        T t = this.LJLIL;
        if (t != 0 && ((AbstractC51036K1g) t).deleteItem(obj)) {
            return true;
        }
        return false;
    }

    @Override // X.C8BR, X.C8BT
    public void onFailed(Exception exc) {
        K k;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 19) {
                        if (i != 20) {
                            return;
                        }
                    }
                }
                ((InterfaceC223218pR) k).nc(exc);
                return;
            }
            ((InterfaceC223218pR) k).Qw(exc);
            return;
        }
        ((InterfaceC223218pR) k).cb0(exc);
    }

    public void onItemDeleted(int i) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLJJI;
        if (interfaceC51033K1d != null) {
            interfaceC51033K1d.onItemDeleted(i);
        }
    }

    public boolean LJJIIJZLJL(Object obj, int i) {
        T t = this.LJLIL;
        if (t != 0 && ((AbstractC51036K1g) t).insertItem(obj, i)) {
            return true;
        }
        return false;
    }

    public void onItemInserted(List list, int i) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLJJI;
        if (interfaceC51033K1d != null) {
            interfaceC51033K1d.onItemInserted(list, i);
        }
    }
}
