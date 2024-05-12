package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jhm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49874Jhm extends AbstractC50421Jqb<C49825Jgz, C49904JiG> implements InterfaceC50391Jq7, InterfaceC49873Jhl {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 9;
    }

    public C49874Jhm(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C49825Jgz ? abstractC51036K1g : new C49825Jgz();
        this.mPresenter = new C49904JiG();
    }

    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJL = interfaceC51032K1c;
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJLL = true;
    }

    @Override // X.InterfaceC49873Jhl
    public final void ec(C2KC<Aweme> c2kc, List<? extends Aweme> list) {
        T t;
        PRESENTER presenter = this.mPresenter;
        if (presenter != 0 && (t = presenter.LJLIL) != 0) {
            int i = c2kc.LIZIZ;
            List<Aweme> list2 = c2kc.LIZ;
            if (C79004UzY.LJJIFFI(list)) {
                list = new ArrayList<>();
            }
            if (i >= 0 && i <= list.size()) {
                list.addAll(i, list2);
                C2KF c2kf = new C2KF(c2kc, list);
                List<C8BT> list3 = t.mNotifyListeners;
                if (list3 != null && list3.size() != 0) {
                    for (C8BT c8bt : t.mNotifyListeners) {
                        if (c8bt instanceof InterfaceC51034K1e) {
                            InterfaceC51034K1e interfaceC51034K1e = (InterfaceC51034K1e) c8bt;
                            if (!interfaceC51034K1e.onItemInsertedNew(c2kf)) {
                                interfaceC51034K1e.onItemInserted(c2kf.LJ, c2kf.LIZIZ);
                            }
                        }
                    }
                }
                C50440Jqu.LIZJ = true;
                return;
            }
            throw new C49866Jhe(i, list.size());
        }
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        if (i == 1) {
            this.mPresenter.LJIILL(Integer.valueOf(i), feedParam.getSearchKeyword());
        } else {
            this.mPresenter.LJIILL(Integer.valueOf(i));
        }
    }
}
