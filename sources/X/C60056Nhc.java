package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Nhc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60056Nhc implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(M89 param, final AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        return new AbstractC50421Jqb<C219778jt, C51031K1b<C219778jt>>(abstractC51036K1g) { // from class: X.8pP
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return i + 22000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.8pO, PRESENTER extends X.K1b<MODEL>] */
            {
                this.mModel = abstractC51036K1g instanceof C219778jt ? abstractC51036K1g : null;
                this.mPresenter = new C51031K1b<C219778jt>() { // from class: X.8pO
                    @Override // X.C51031K1b, X.C8BR, X.C8BT
                    public final void onSuccess() {
                        K k;
                        C219778jt c219778jt = (C219778jt) this.LJLIL;
                        if (c219778jt == null || (k = this.LJLILLLLZI) == 0) {
                            return;
                        }
                        int i = c219778jt.mListQueryType;
                        boolean z = true;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 4 && i != 16) {
                                    return;
                                }
                                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) k;
                                List<Aweme> list = c219778jt.LJLJJL;
                                if (!c219778jt.isHasMore() || c219778jt.isNewDataEmpty()) {
                                    z = false;
                                }
                                interfaceC223218pR.j0(list, z);
                                return;
                            }
                            ((InterfaceC223218pR) k).jh(c219778jt.LJLJJL, !c219778jt.isNewDataEmpty());
                            return;
                        }
                        if (c219778jt.isDataEmpty()) {
                            ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                        } else {
                            ((InterfaceC223218pR) this.LJLILLLLZI).J5(c219778jt.LJLJJL, c219778jt.isHasMore());
                        }
                    }
                };
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final void request(int i, M89 feedParam, int i2, boolean z) {
                o.LJIIIZ(feedParam, "feedParam");
                PRESENTER presenter = this.mPresenter;
                if (presenter != 0) {
                    presenter.LJIILL(Integer.valueOf(i), feedParam.getAddyoursTopicId(), Integer.valueOf(feedParam.getVideoType()), Boolean.valueOf(z), feedParam.getIds(), Boolean.FALSE);
                }
            }
        };
    }
}
