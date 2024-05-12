package X;

import X.AbstractC51037K1h;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.K1a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51030K1a<T extends AbstractC51037K1h, DATA> extends C51031K1b<T> {
    public InterfaceC51032K1c LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC51033K1d LJLJL;

    public abstract String LJJIIZ(DATA data);

    public abstract List<Aweme> LJJIIZI();

    public abstract List<DATA> LJJIJ();

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJL;
        boolean z = true;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(true);
        }
        this.LJLJJLL = false;
        T t = this.LJLIL;
        if (t == 0) {
            return;
        }
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) t;
        int i = abstractC51036K1g.mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4 || (k = this.LJLILLLLZI) == 0) {
                    return;
                }
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) k;
                List<Aweme> LJJIIZI = LJJIIZI();
                if (!((AbstractC51036K1g) this.LJLIL).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                    z = false;
                }
                interfaceC223218pR.j0(LJJIIZI, z);
                return;
            }
            K k2 = this.LJLILLLLZI;
            if (k2 == 0) {
                return;
            }
            ((InterfaceC223218pR) k2).jh(LJJIIZI(), true ^ ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty());
            return;
        }
        if (abstractC51036K1g.isDataEmpty()) {
            K k3 = this.LJLILLLLZI;
            if (k3 == 0) {
                return;
            }
            ((InterfaceC223218pR) k3).Ne();
            return;
        }
        K k4 = this.LJLILLLLZI;
        if (k4 == 0) {
            return;
        }
        ((InterfaceC223218pR) k4).J5(LJJIIZI(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
    }

    @Override // X.C51031K1b, X.C8BR
    public void LIZIZ() {
        super.LIZIZ();
        this.LJLJL = null;
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJL;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(this.LJLJJLL);
        }
        return super.LJIILL(objArr);
    }

    @Override // X.C51031K1b
    public final void LJJIII(InterfaceC51033K1d interfaceC51033K1d) {
        this.LJLJL = interfaceC51033K1d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C51031K1b
    public final boolean LJJIIJ(Object obj) {
        List LJJIJ;
        int i = 0;
        if (obj instanceof Aweme) {
            List<Aweme> LJJIIZI = LJJIIZI();
            if (!C79004UzY.LJJIFFI(LJJIIZI)) {
                int size = LJJIIZI.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Aweme aweme = (Aweme) obj;
                    if (TextUtils.equals(aweme.getAid(), C78996UzQ.LJIIL((Aweme) ListProtector.get(LJJIIZI, i2)))) {
                        String aid = aweme.getAid();
                        if (this.LJLIL != 0 && (LJJIJ = LJJIJ()) != null) {
                            int size2 = LJJIJ.size();
                            while (true) {
                                if (i >= size2) {
                                    break;
                                }
                                Object obj2 = ListProtector.get(LJJIJ, i);
                                String LJJIIZ = LJJIIZ(obj2);
                                if (TextUtils.isEmpty(LJJIIZ) || !TextUtils.equals(aid, LJJIIZ)) {
                                    i++;
                                } else {
                                    this.LJLIL.getClass();
                                    LJJIJ.remove(obj2);
                                    break;
                                }
                            }
                        }
                        onItemDeleted(i2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJL;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(true);
        }
        this.LJLJJLL = false;
        super.onFailed(exc);
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final void onItemDeleted(int i) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLJL;
        if (interfaceC51033K1d != null) {
            interfaceC51033K1d.onItemDeleted(i);
        }
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final boolean onItemInsertedNew(C2KF c2kf) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLJL;
        if (interfaceC51033K1d != null) {
            return interfaceC51033K1d.onItemInsertedNew(c2kf);
        }
        return false;
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final void onItemInserted(List list, int i) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLJL;
        if (interfaceC51033K1d != null) {
            interfaceC51033K1d.onItemInserted(list, i);
        }
    }
}
