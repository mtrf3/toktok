package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.K1p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51045K1p implements InterfaceC51679KPz, InterfaceC224118qt {
    public KQA LJLIL;
    public List<Aweme> LJLILLLLZI;

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
        return 23000;
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

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        List<Aweme> list = this.LJLILLLLZI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        return AVExternalServiceImpl.LIZ().publishService().getAllPublishAwemes();
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.LJLIL = detailFragmentPanel;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.LJLILLLLZI = AVExternalServiceImpl.LIZ().publishService().getAllPublishAwemes();
    }
}
