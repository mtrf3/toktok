package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Jpq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50374Jpq implements InterfaceC51679KPz {
    public final AbstractC51036K1g LJLIL;
    public final C49721JfJ LJLILLLLZI;

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 9;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return this.LJLIL.isDataEmpty();
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return this.LJLILLLLZI.LJJIFFI();
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLILLLLZI.LIZIZ();
        this.LJLILLLLZI.LJJII();
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLIL;
    }

    public C50374Jpq(AbstractC51036K1g abstractC51036K1g) {
        this.LJLIL = abstractC51036K1g == null ? new C49823Jgx() : abstractC51036K1g;
        this.LJLILLLLZI = new C49721JfJ();
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA kqa) {
        this.LJLILLLLZI.LJJI(kqa);
        C49721JfJ c49721JfJ = this.LJLILLLLZI;
        c49721JfJ.LJLJJI = kqa;
        c49721JfJ.LJJ(this.LJLIL);
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String str) {
        Aweme i6 = AwemeService.LIZ().i6(str);
        if (i6 == null && (i6 = AwemeService.LIZ().n6(str)) == null) {
            return false;
        }
        return this.LJLILLLLZI.LJJIIJ(i6);
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        this.LJLILLLLZI.LJIILL(Integer.valueOf(i));
    }
}
