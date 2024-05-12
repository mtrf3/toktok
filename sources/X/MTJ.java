package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MTJ extends AbstractC65781Prl implements InterfaceC88472Yns<MT8, MT8> {
    public final /* synthetic */ NoticeTabModel LJLIL;
    public final /* synthetic */ MT7 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ List<NoticeTabModel> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTJ(NoticeTabModel noticeTabModel, MT7 mt7, int i, List<NoticeTabModel> list) {
        super(1);
        this.LJLIL = noticeTabModel;
        this.LJLILLLLZI = mt7;
        this.LJLJI = i;
        this.LJLJJI = list;
    }

    @Override // X.InterfaceC88472Yns
    public final MT8 invoke(MT8 setState) {
        o.LJIIIZ(setState, "$this$setState");
        NoticeTabModel noticeTabModel = this.LJLIL;
        return new MT8(noticeTabModel, noticeTabModel.index, new C72912tb(new MTK(this.LJLJI, this.LJLILLLLZI, this.LJLJJI)), null, MQ2.SUCCESS);
    }
}
