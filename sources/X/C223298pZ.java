package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8pZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223298pZ extends AbstractC50421Jqb<FollowingFeedListModel, C51031K1b<FollowingFeedListModel>> implements InterfaceC51771KTn {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 9001;
    }

    @Override // X.InterfaceC51771KTn
    public final /* synthetic */ boolean shouldSetRefreshListener() {
        return true;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean isLoading() {
        return super.isLoading();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.8pY, PRESENTER extends X.K1b<MODEL>] */
    public C223298pZ(List<String> list, List<String> list2) {
        this.mModel = new FollowingFeedListModel(list, list2);
        this.mPresenter = new C51031K1b<FollowingFeedListModel>() { // from class: X.8pY
            public final List<Aweme> LJLJJL = new ArrayList();

            @Override // X.C51031K1b, X.C8BR, X.C8BT
            public final void onSuccess() {
                T t = this.LJLIL;
                if (t == 0 || this.LJLILLLLZI == 0) {
                    return;
                }
                AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) t;
                int i = abstractC51036K1g.mListQueryType;
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return;
                        }
                        List<Aweme> items = abstractC51036K1g.getItems();
                        o.LJI(items);
                        int i2 = 0;
                        for (Aweme aweme : items) {
                            List items2 = ((AbstractC51036K1g) this.LJLIL).getItems();
                            o.LJI(items2);
                            Aweme R1 = AwemeService.LIZ().R1(aweme);
                            o.LJI(R1);
                            ListProtector.set(items2, i2, R1);
                            ((ArrayList) this.LJLJJL).add(aweme);
                            i2++;
                        }
                        InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) this.LJLILLLLZI;
                        List<Aweme> list3 = this.LJLJJL;
                        if (!((AbstractC51036K1g) this.LJLIL).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                            z = false;
                        }
                        interfaceC223218pR.j0(list3, z);
                        return;
                    }
                    if (!abstractC51036K1g.isDataEmpty()) {
                        List<Aweme> items3 = ((AbstractC51036K1g) this.LJLIL).getItems();
                        o.LJI(items3);
                        int i3 = 0;
                        for (Aweme aweme2 : items3) {
                            List items4 = ((AbstractC51036K1g) this.LJLIL).getItems();
                            o.LJI(items4);
                            Aweme R12 = AwemeService.LIZ().R1(aweme2);
                            o.LJI(R12);
                            ListProtector.set(items4, i3, R12);
                            ListProtector.add(this.LJLJJL, i3, aweme2);
                            i3++;
                        }
                        InterfaceC223218pR interfaceC223218pR2 = (InterfaceC223218pR) this.LJLILLLLZI;
                        List<Aweme> list4 = this.LJLJJL;
                        FollowingFeedListModel followingFeedListModel = (FollowingFeedListModel) this.LJLIL;
                        if (!followingFeedListModel.hasMoreHeader && followingFeedListModel.isNewDataEmpty()) {
                            z = false;
                        }
                        interfaceC223218pR2.jh(list4, z);
                    }
                    if (((ArrayList) this.LJLJJL).size() != 0) {
                        return;
                    }
                    ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                    return;
                }
                if (!abstractC51036K1g.isDataEmpty()) {
                    ((ArrayList) this.LJLJJL).clear();
                    List<Aweme> items5 = ((AbstractC51036K1g) this.LJLIL).getItems();
                    o.LJI(items5);
                    int i4 = 0;
                    for (Aweme aweme3 : items5) {
                        List items6 = ((AbstractC51036K1g) this.LJLIL).getItems();
                        o.LJI(items6);
                        Aweme R13 = AwemeService.LIZ().R1(aweme3);
                        o.LJI(R13);
                        ListProtector.set(items6, i4, R13);
                        ((ArrayList) this.LJLJJL).add(aweme3);
                        i4++;
                    }
                    InterfaceC223218pR interfaceC223218pR3 = (InterfaceC223218pR) this.LJLILLLLZI;
                    List<Aweme> list5 = this.LJLJJL;
                    if (!((AbstractC51036K1g) this.LJLIL).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                        z = false;
                    }
                    interfaceC223218pR3.J5(list5, z);
                }
                if (((ArrayList) this.LJLJJL).size() != 0) {
                    return;
                }
                ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
            }

            @Override // X.C51031K1b, X.C8BR, X.C8BT
            public final void onFailed(Exception e) {
                K k;
                o.LJIIIZ(e, "e");
                T t = this.LJLIL;
                if (t == 0 || (k = this.LJLILLLLZI) == 0) {
                    return;
                }
                if (((AbstractC51036K1g) t).mListQueryType == 2 && (e instanceof C223308pa)) {
                    ((InterfaceC223218pR) k).jh(this.LJLJJL, false);
                } else {
                    super.onFailed(e);
                }
            }
        };
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.mPresenter.LJIILL(Integer.valueOf(i), feedParam.getSelectedUid());
    }
}
