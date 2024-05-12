package X;

import androidx.fragment.app.Fragment;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NhY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60052NhY implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(M89 param, final AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        return new AbstractC50421Jqb<C8B4, C8BD>(abstractC51036K1g) { // from class: X.8BB
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return 35;
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final boolean init(Fragment owner) {
                o.LJIIIZ(owner, "owner");
                return true;
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final Object getViewModel() {
                MODEL model = this.mModel;
                if (model == 0) {
                    return new C8B4();
                }
                return model;
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final boolean isDataEmpty() {
                return this.mModel.isDataEmpty();
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final boolean isLoading() {
                return this.mModel.isLoading();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final void unInit() {
                AnonymousClass837 anonymousClass837;
                List<Aweme> list;
                C8B4 c8b4 = this.mModel;
                List<AnonymousClass837> list2 = c8b4.LJLILLLLZI;
                if (list2 != null && (anonymousClass837 = (AnonymousClass837) ORZ.LJLLLLLL(0, list2)) != null) {
                    ArrayList arrayList = new ArrayList();
                    ExploreAwemeList exploreAwemeList = (ExploreAwemeList) c8b4.mData;
                    if (exploreAwemeList != null && (list = exploreAwemeList.items) != null) {
                        for (Aweme aweme : list) {
                            ExploreClientExtra exploreClientExtra = aweme.getExploreClientExtra();
                            if (exploreClientExtra != null && exploreClientExtra.cacheType == 1) {
                                arrayList.add(aweme);
                            }
                        }
                    }
                    List list3 = (List) C8B8.LIZ().get(anonymousClass837.LIZ);
                    if (list3 == null) {
                        list3 = new ArrayList();
                        C8B8.LIZ().put(anonymousClass837.LIZ, list3);
                    }
                    list3.addAll(arrayList);
                    if (list3.isEmpty()) {
                        C8B8.LIZIZ(C47261Igj.LJJIJ(anonymousClass837));
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.8BD, PRESENTER extends X.K1b<MODEL>] */
            {
                this.mModel = (!(abstractC51036K1g instanceof C8B4) || abstractC51036K1g == null) ? new C8B4() : abstractC51036K1g;
                this.mPresenter = new C51031K1b<C8B4>() { // from class: X.8BD
                };
            }
        };
    }
}
