package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KQE implements InterfaceC51679KPz {
    public C65582hm LJLIL;
    public final KQF LJLILLLLZI = new KQF();
    public final C224388rK LJLJI = new C8BR<KQF, InterfaceC224378rJ>() { // from class: X.8rK
        @Override // X.C8BR, X.C8BT
        public final void onSuccess() {
            K k = this.LJLILLLLZI;
            if (k != 0 && this.LJLIL != 0) {
                ((InterfaceC224378rJ) k).ZF(new OSZ<>(0, this.LJLIL.getData()));
            }
        }

        @Override // X.C8BR, X.C8BT
        public final void onFailed(Exception exc) {
            K k = this.LJLILLLLZI;
            if (k != 0) {
                ((InterfaceC224378rJ) k).fC(exc);
            }
        }
    };

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
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return LJJIFFI();
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        LIZIZ();
        LJJII();
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.LJLIL = new C65582hm(detailFragmentPanel);
        C224388rK c224388rK = this.LJLJI;
        c224388rK.LJLILLLLZI = detailFragmentPanel;
        c224388rK.LJJ(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String aid) {
        KQA kqa;
        o.LJIIIZ(aid, "aid");
        C65582hm c65582hm = this.LJLIL;
        if (c65582hm != null && (kqa = (KQA) c65582hm.get()) != null) {
            kqa.px();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        LJIILL(feedParam.getAid(), feedParam.getInboxExtra());
    }
}
