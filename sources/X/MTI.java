package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;

/* loaded from: classes10.dex */
public final class MTI implements InterfaceC64672gJ<AbstractC72932td<? extends NoticeCombineResponse>> {
    public final /* synthetic */ CreatorNoticeResultVM LJLIL;
    public final /* synthetic */ CreatorNoticeResponse LJLILLLLZI;
    public final /* synthetic */ NoticeTabModel LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC64672gJ
    public final Object emit(AbstractC72932td<? extends NoticeCombineResponse> abstractC72932td, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        AbstractC72932td<? extends NoticeCombineResponse> abstractC72932td2 = abstractC72932td;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Janus Data flow Collect ");
        LIZ.append(abstractC72932td2);
        C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
        if ((abstractC72932td2 instanceof C72912tb) || (abstractC72932td2 instanceof C3C1)) {
            this.LJLIL.pv0(abstractC72932td2, new C72912tb(this.LJLILLLLZI), MT7.FIRST_REQUEST, this.LJLJI);
            C48841JEv.LIZJ(this.LJLJJI, null);
        }
        return C76800UCe.LIZ;
    }

    public MTI(CreatorNoticeResultVM creatorNoticeResultVM, CreatorNoticeResponse creatorNoticeResponse, NoticeTabModel noticeTabModel, InterfaceC70422pa interfaceC70422pa) {
        this.LJLIL = creatorNoticeResultVM;
        this.LJLILLLLZI = creatorNoticeResponse;
        this.LJLJI = noticeTabModel;
        this.LJLJJI = interfaceC70422pa;
    }
}
