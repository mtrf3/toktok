package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;

/* loaded from: classes9.dex */
public class KQC implements InterfaceC51679KPz {
    public C65582hm LJLIL;
    public final C3IB LJLILLLLZI = new C3IB();
    public KQB LJLJI = new KQB();

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
        return i + 3000;
    }

    @Override // X.InterfaceC51679KPz
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return this.LJLJI.LJJIFFI();
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLJI.LIZIZ();
        this.LJLJI.LJJII();
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA kqa) {
        this.LJLIL = new C65582hm(kqa);
        KQB kqb = this.LJLJI;
        kqb.LJLILLLLZI = kqa;
        kqb.LJJ(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String str) {
        C65582hm c65582hm = this.LJLIL;
        if (c65582hm != null && c65582hm.get() != 0) {
            ((KQA) this.LJLIL.get()).px();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        int i3;
        boolean z2;
        if (!C7HP.LIZIZ()) {
            if (TextUtils.isEmpty(m89.getUpvoteId()) && TextUtils.isEmpty(m89.getCid())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ("notification_page".equals(m89.getEventType()) && !z2) {
                i3 = 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = !TextUtils.isEmpty(m89.getUpvoteId()) ? 1 : 0;
        }
        this.LJLJI.LJIILL(m89.getAid(), m89.getEventType(), Integer.valueOf(i3), m89.getTranslatorId());
    }
}
