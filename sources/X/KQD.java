package X;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class KQD implements InterfaceC51679KPz {
    public final C3IB LJLIL = new C3IB();
    public WeakReference<KQA> LJLILLLLZI = null;
    public final KQB LJLJI = new KQB();

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
        return 7000;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLILLLLZI = null;
        this.LJLJI.LIZIZ();
        this.LJLJI.LJJII();
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return this.LJLJI.LJJIFFI();
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA kqa) {
        this.LJLILLLLZI = new WeakReference<>(kqa);
        KQB kqb = this.LJLJI;
        kqb.LJLILLLLZI = kqa;
        kqb.LJJ(this.LJLIL);
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String str) {
        WeakReference<KQA> weakReference = this.LJLILLLLZI;
        if (weakReference != null && weakReference.get() != null) {
            this.LJLILLLLZI.get().px();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        this.LJLJI.LJIILL(m89.getAid(), m89.getEventType());
    }
}
