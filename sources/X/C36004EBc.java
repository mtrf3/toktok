package X;

import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchShopList;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;

/* renamed from: X.EBc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36004EBc implements InterfaceC66632QDc<m> {
    public final /* synthetic */ EcSearchResultShopViewModel LIZ;
    public final /* synthetic */ C34K LIZIZ;
    public final /* synthetic */ SearchResultParam LIZJ;
    public final /* synthetic */ C34K LIZLLL;

    @Override // X.InterfaceC66632QDc
    public final void onComplete() {
        this.LIZ.hv0(2, null);
    }

    @Override // X.InterfaceC66632QDc
    public final void onFailed(Throwable th) {
        this.LIZ.setState(new AqS172S0100000_6(th, 35));
        this.LIZ.hv0(3, null);
    }

    @Override // X.InterfaceC66632QDc
    public final void onNext(m mVar) {
        KFQ kfq;
        int i;
        m mVar2 = mVar;
        if (mVar2 != null) {
            C34K c34k = this.LIZIZ;
            EcSearchResultShopViewModel ecSearchResultShopViewModel = this.LIZ;
            SearchResultParam searchResultParam = this.LIZJ;
            C34K c34k2 = this.LIZLLL;
            try {
                if (mVar2.LJJIJ("status_code").LJIILJJIL() == 0) {
                    if (!c34k.element) {
                        c34k.element = true;
                    }
                    ecSearchResultShopViewModel.setState(new AqS137S0200000_6(mVar2, ecSearchResultShopViewModel, 19));
                    Gson gson = ecSearchResultShopViewModel.LJLJL;
                    SearchShopList searchShopList = (SearchShopList) gson.LJI(gson.LJIILJJIL(mVar2), SearchShopList.class);
                    if (searchShopList != null) {
                        ecSearchResultShopViewModel.LJLJI.LIZ(searchShopList, searchResultParam);
                        if (c34k2.element && (kfq = ecSearchResultShopViewModel.LJLJJI) != null) {
                            List<Object> list = searchShopList.searchEcomList;
                            if (list != null) {
                                i = list.size();
                            } else {
                                i = 0;
                            }
                            KFQ.LIZJ(kfq, false, 1, i, "/aweme/v1/search/single/ecom/", 16);
                        }
                    } else {
                        throw new Exception();
                    }
                } else {
                    ecSearchResultShopViewModel.setState(new AqS172S0100000_6(new Throwable("Server error"), 36));
                }
            } catch (Exception e) {
                ecSearchResultShopViewModel.setState(new AqS172S0100000_6(e, 37));
            }
        }
        this.LIZ.hv0(1, mVar2);
    }

    public C36004EBc(EcSearchResultShopViewModel ecSearchResultShopViewModel, C34K c34k, SearchResultParam searchResultParam, C34K c34k2) {
        this.LIZ = ecSearchResultShopViewModel;
        this.LIZIZ = c34k;
        this.LIZJ = searchResultParam;
        this.LIZLLL = c34k2;
    }
}
