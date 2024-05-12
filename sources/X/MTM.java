package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;

/* loaded from: classes10.dex */
public final class MTM extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CreatorNoticeResultVM LJLIL;
    public final /* synthetic */ AbstractC72932td<NoticeCombineResponse> LJLILLLLZI;
    public final /* synthetic */ AbstractC72932td<CreatorNoticeResponse> LJLJI;
    public final /* synthetic */ MT7 LJLJJI;
    public final /* synthetic */ NoticeTabModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTM(CreatorNoticeResultVM creatorNoticeResultVM, AbstractC72932td<NoticeCombineResponse> abstractC72932td, AbstractC72932td<CreatorNoticeResponse> abstractC72932td2, MT7 mt7, NoticeTabModel noticeTabModel) {
        super(0);
        this.LJLIL = creatorNoticeResultVM;
        this.LJLILLLLZI = abstractC72932td;
        this.LJLJI = abstractC72932td2;
        this.LJLJJI = mt7;
        this.LJLJJL = noticeTabModel;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.pv0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
