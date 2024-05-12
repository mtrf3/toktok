package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.detail.core.viewmodel.DetailJediWidget;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchJediViewModel;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T2p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74003T2p implements InterfaceC51679KPz {
    public final SearchJediViewModel LJLIL;
    public DetailJediWidget LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 9;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return this.LJLJI;
    }

    public C74003T2p(SearchJediViewModel searchJediViewModel) {
        this.LJLIL = searchJediViewModel;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA panel) {
        o.LJIIIZ(panel, "panel");
        SearchJediViewModel searchJediViewModel = this.LJLIL;
        o.LJI(searchJediViewModel);
        DetailJediWidget detailJediWidget = this.LJLILLLLZI;
        if (detailJediWidget != null) {
            ListMiddleware.LJIIIIZZ(searchJediViewModel.LJLJLJ, detailJediWidget, new C50418JqY(), true, new C74005T2r(C74006T2s.INSTANCE, KP2.INSTANCE, new AqS174S0200000_12(panel, this, 30)), new C74004T2q(new AqS143S0200000_12((InterfaceC223218pR) panel, (InterfaceC223218pR<Aweme>) this, (C74003T2p) 170), new AqS174S0200000_12(panel, this, 31), new AqS174S0200000_12(panel, this, 32)), null, null, null, 896);
            return;
        }
        o.LJIJI("jediView");
        throw null;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        if (this.LJLIL == null) {
            return false;
        }
        this.LJLILLLLZI = new DetailJediWidget();
        C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
        View view = owner.getView();
        o.LJI(view);
        c72714SgI.getClass();
        C72713SgH LIZ = C72714SgI.LIZ(view, owner);
        DetailJediWidget detailJediWidget = this.LJLILLLLZI;
        if (detailJediWidget != null) {
            LIZ.LJ(detailJediWidget);
            return true;
        }
        o.LJIJI("jediView");
        throw null;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        if (i != 1) {
            if (i != 4) {
                return;
            }
            SearchJediViewModel searchJediViewModel = this.LJLIL;
            o.LJI(searchJediViewModel);
            InterfaceC92693kP interfaceC92693kP = searchJediViewModel.LJLJL;
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
                searchJediViewModel.setState(C73998T2k.LJLIL);
            }
            searchJediViewModel.LJLJLJ.loadMore();
            return;
        }
        SearchJediViewModel searchJediViewModel2 = this.LJLIL;
        o.LJI(searchJediViewModel2);
        InterfaceC92693kP interfaceC92693kP2 = searchJediViewModel2.LJLJJLL;
        if (interfaceC92693kP2 != null) {
            interfaceC92693kP2.dispose();
            searchJediViewModel2.setState(C73999T2l.LJLIL);
        }
        searchJediViewModel2.LJLJLJ.refresh();
    }
}
