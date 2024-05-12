package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224358rH implements InterfaceC51679KPz, InterfaceC224118qt {
    public final C224348rG LJLIL;
    public KQA LJLILLLLZI;
    public final C224368rI LJLJI = new C8BR<C224348rG, InterfaceC224378rJ>() { // from class: X.8rI
        @Override // X.C8BR, X.C8BT
        public final void onSuccess() {
            InterfaceC224378rJ interfaceC224378rJ = (InterfaceC224378rJ) this.LJLILLLLZI;
            if (interfaceC224378rJ != null) {
                interfaceC224378rJ.ZF(new OSZ<>(0, ORZ.LJLLLL(((C224348rG) this.LJLIL).LJLJI)));
            }
        }

        @Override // X.C8BR, X.C8BT
        public final void onFailed(Exception exc) {
            InterfaceC224378rJ interfaceC224378rJ = (InterfaceC224378rJ) this.LJLILLLLZI;
            if (interfaceC224378rJ != null) {
                interfaceC224378rJ.fC(exc);
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
    public final boolean deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return null;
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

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        C224348rG c224348rG = this.LJLIL;
        if (c224348rG != null) {
            return c224348rG.LJLJI;
        }
        return new ArrayList();
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        List<Aweme> list;
        C224348rG c224348rG = this.LJLIL;
        if (c224348rG == null || (list = c224348rG.LJLJI) == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        C73318Sq2 c73318Sq2;
        C224348rG c224348rG = this.LJLIL;
        if (c224348rG != null && (c73318Sq2 = c224348rG.LJLJJI) != null) {
            c73318Sq2.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8rI] */
    public C224358rH(C224348rG c224348rG) {
        this.LJLIL = c224348rG;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.LJLILLLLZI = detailFragmentPanel;
        C224368rI c224368rI = this.LJLJI;
        c224368rI.LJLILLLLZI = detailFragmentPanel;
        C224348rG c224348rG = this.LJLIL;
        if (c224348rG != null) {
            c224368rI.LJJ(c224348rG);
        }
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        LJIILL(1);
    }
}
