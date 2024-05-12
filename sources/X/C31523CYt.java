package X;

import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.CYt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31523CYt extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ RankListV2Response.RankView LJLIL;
    public final /* synthetic */ C31526CYw LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;
    public final /* synthetic */ RankListV2Response.RankView LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31523CYt(RankListV2Response.RankView rankView, C31526CYw c31526CYw, DataChannel dataChannel, RankListV2Response.RankView rankView2, boolean z) {
        super(0);
        this.LJLIL = rankView;
        this.LJLILLLLZI = c31526CYw;
        this.LJLJI = dataChannel;
        this.LJLJJI = rankView2;
        this.LJLJJL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String abstractCollection;
        String str;
        String str2;
        int i;
        ArrayList arrayList = new ArrayList();
        List<RankListV2Response.RankInfo> list = this.LJLIL.ranks;
        if (list != null) {
            Iterator<RankListV2Response.RankInfo> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().roomId > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                arrayList.add(Integer.valueOf(i));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C31522CYs.LIZJ(linkedHashMap, this.LJLILLLLZI, this.LJLJI);
        BZI LIZ = C28787BRn.LIZ("livesdk_rank_list_anchor_status");
        LIZ.LJIILLIIL(this.LJLJI);
        C31522CYs.LIZ(LIZ, this.LJLJI);
        LIZ.LJJIFFI(linkedHashMap);
        Object obj = null;
        if (this.LJLJJI.ranks.size() == 0) {
            abstractCollection = null;
        } else {
            abstractCollection = arrayList.toString();
        }
        LIZ.LJIJJ(abstractCollection, "is_live");
        LIZ.LJIJJ(BPN.LIZ(this.LJLIL.rankType, 0).rankName, "rank_type");
        if (this.LJLIL.LJLIL == -1) {
            str = "last";
        } else {
            str = "this";
        }
        LIZ.LJIJJ(str, "rank_period");
        if (this.LJLJJL) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ.LJIJJ(str2, "user_type");
        LIZ.LJIJJ("full", "list_type");
        V0N.LJJIIZ(LIZ, this.LJLILLLLZI);
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            obj = dataChannel.kv0(LiveExtendedScreenStatus.class);
        }
        if (obj == EnumC31158CKs.SHOW) {
            LIZ.LJIJJ("live_extended_comment_filed", "event_page");
        }
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
