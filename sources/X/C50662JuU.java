package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JuU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50662JuU implements InterfaceC51679KPz {
    public final C50664JuW LJLIL;
    public final C50665JuX LJLILLLLZI = new C50665JuX();

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
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        if (this.LJLIL.getData() == null || C79004UzY.LJJIFFI(this.LJLIL.getData().LIZ)) {
            return true;
        }
        return false;
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

    public C50662JuU(Aweme aweme) {
        this.LJLIL = new C50664JuW(aweme);
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        C50665JuX c50665JuX = this.LJLILLLLZI;
        c50665JuX.LJLILLLLZI = detailFragmentPanel;
        c50665JuX.LJJ(this.LJLIL);
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.LJLILLLLZI.LJIILL(Integer.valueOf(i));
    }
}
