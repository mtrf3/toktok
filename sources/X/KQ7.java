package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KQ7 implements InterfaceC51679KPz, InterfaceC51771KTn {
    public final MixFlowParam LJLIL;
    public final MixFlowParam LJLILLLLZI;
    public int LJLJI;
    public final InterfaceC51679KPz LJLJJI;
    public final InterfaceC51679KPz LJLJJL;
    public final List<Aweme> LJLJJLL;
    public List<? extends Aweme> LJLJL;
    public List<? extends Aweme> LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        return false;
    }

    @Override // X.InterfaceC51771KTn
    public final /* synthetic */ boolean shouldSetRefreshListener() {
        return true;
    }

    public final List<Aweme> LIZ() {
        List<? extends Aweme> list = this.LJLJL;
        List<? extends Aweme> list2 = this.LJLJLJ;
        if (this.LJLJI < 0 || list2 == null || list2.isEmpty() || this.LJLJI > list2.size()) {
            return this.LJLJL;
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            InterfaceC51679KPz interfaceC51679KPz = this.LJLJJI;
            if ((interfaceC51679KPz instanceof InterfaceC51771KTn) && !interfaceC51679KPz.cannotLoadLatest() && this.LJLL) {
                arrayList.addAll(list);
            } else {
                InterfaceC51679KPz interfaceC51679KPz2 = this.LJLJJI;
                if ((interfaceC51679KPz2 instanceof InterfaceC51771KTn) && !interfaceC51679KPz2.cannotLoadLatest() && !this.LJLL) {
                    arrayList.addAll(list);
                    arrayList.addAll(list2.subList(this.LJLJI + 1, list2.size()));
                } else {
                    InterfaceC51679KPz interfaceC51679KPz3 = this.LJLJJI;
                    if (((interfaceC51679KPz3 instanceof InterfaceC51771KTn) && !interfaceC51679KPz3.cannotLoadLatest()) || !this.LJLL) {
                        arrayList.addAll(list2.subList(0, this.LJLJI));
                        arrayList.addAll(list);
                        arrayList.addAll(list2.subList(this.LJLJI + 1, list2.size()));
                    } else {
                        arrayList.addAll(list2.subList(0, this.LJLJI));
                        arrayList.addAll(list);
                    }
                }
            }
            return arrayList;
        }
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean cannotLoadLatest() {
        return this.LJLJJI.cannotLoadLatest();
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        Object viewModel = this.LJLJJI.getViewModel();
        if (viewModel == null) {
            return new Object();
        }
        return viewModel;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        if (this.LJLJJL.isDataEmpty() && this.LJLJJI.isDataEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        if (this.LJLJJL.isLoading() && this.LJLJJI.isLoading()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLJJL.unInit();
        this.LJLJJI.unInit();
        List<? extends Aweme> list = this.LJLJLJ;
        if (list != null) {
            for (Aweme aweme : list) {
                aweme.mixFlowParam = null;
                aweme.setSearchFeedType(null);
            }
        }
        List<? extends Aweme> list2 = this.LJLJL;
        if (list2 != null) {
            for (Aweme aweme2 : list2) {
                aweme2.mixFlowParam = null;
                aweme2.setSearchFeedType(null);
            }
        }
    }

    public final boolean LIZIZ(int i) {
        int i2;
        int i3;
        List<? extends Aweme> list = this.LJLJLJ;
        int i4 = this.LJLJI;
        if (list != null) {
            HashSet hashSet = new HashSet();
            int min = Math.min(i4, list.size() - 1);
            if (min >= 0) {
                int i5 = 0;
                i3 = 0;
                while (true) {
                    if (!hashSet.contains(((Aweme) ListProtector.get(list, i5)).getAid())) {
                        hashSet.add(((Aweme) ListProtector.get(list, i5)).getAid());
                    } else {
                        i3++;
                    }
                    if (i5 == min) {
                        break;
                    }
                    i5++;
                }
            } else {
                i3 = 0;
            }
            i4 -= i3;
        }
        List<? extends Aweme> list2 = this.LJLJL;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        int i6 = i2 + i4;
        if (i < i4 || i >= i6) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.LJLJJI.bindView(new KQ8(this, detailFragmentPanel));
        this.LJLJJL.bindView(new KQ9(this, detailFragmentPanel));
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return this.LJLJJI.getPageType(i);
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        if (this.LJLJI < 0) {
            this.LJLJI = 0;
        }
        Object viewModel = this.LJLJJL.getViewModel();
        o.LJII(viewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.presenter.IAwemeListProvider");
        List<Aweme> awemeList = ((InterfaceC224118qt) viewModel).getAwemeList();
        this.LJLJLJ = awemeList;
        if (awemeList != null) {
            for (Aweme aweme : awemeList) {
                aweme.mixFlowParam = this.LJLILLLLZI;
                aweme.setSearchFeedType("SearchMixFeed");
            }
        }
        List<Aweme> list = this.LJLJJLL;
        this.LJLJL = list;
        if (list != null) {
            for (Aweme aweme2 : list) {
                aweme2.mixFlowParam = this.LJLIL;
                aweme2.setSearchFeedType("detailFeed");
            }
        }
        if (!this.LJLJJI.init(owner) || !this.LJLJJL.init(owner)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        if (i != 1 && i != 2) {
            if (i != 4) {
                return;
            }
            if (!this.LJLJJI.cannotLoadMore()) {
                this.LJLJJI.request(i, feedParam, i2, z);
                return;
            } else {
                this.LJLJJL.request(i, feedParam, i2, z);
                return;
            }
        }
        this.LJLJJI.request(i, feedParam, i2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KQ7(MixFlowParam ownFlowParam, MixFlowParam mixFlowParam, int i, InterfaceC51679KPz interfaceC51679KPz, InterfaceC51679KPz interfaceC51679KPz2, List<? extends Aweme> list) {
        o.LJIIIZ(ownFlowParam, "ownFlowParam");
        this.LJLIL = ownFlowParam;
        this.LJLILLLLZI = mixFlowParam;
        this.LJLJI = i;
        this.LJLJJI = interfaceC51679KPz;
        this.LJLJJL = interfaceC51679KPz2;
        this.LJLJJLL = list;
        this.LJLJLLL = true;
        this.LJLL = true;
    }
}
