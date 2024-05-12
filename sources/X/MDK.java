package X;

import Y.ARunnableS12S0201000_9;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;

/* loaded from: classes10.dex */
public final class MDK<T> implements InterfaceC64592gB {
    public final /* synthetic */ BaseNotice LJLIL;
    public final /* synthetic */ C56818MRq LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public MDK(int i, MusNotice musNotice, C56818MRq c56818MRq) {
        this.LJLIL = musNotice;
        this.LJLILLLLZI = c56818MRq;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C56760MPk.LIZLLL(this.LJLIL, (BaseResponse) obj, null);
        C56818MRq c56818MRq = this.LJLILLLLZI;
        RecyclerView recyclerView = c56818MRq.LJLJI;
        int i = this.LJLJI;
        BaseNotice baseNotice = this.LJLIL;
        if (recyclerView == null || Boolean.valueOf(recyclerView.post(new ARunnableS12S0201000_9(i, baseNotice, c56818MRq, 7))) == null) {
            this.LJLILLLLZI.LJLLLLLL(this.LJLIL, this.LJLJI);
        }
    }
}
