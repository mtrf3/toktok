package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UiY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77950UiY extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ GiftListFragment LJLJJL;
    public final /* synthetic */ User LJLJJLL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        RankListViewModel LJII;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL.LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLJJL);
        if (LJIILIIL != null) {
            LJIILIIL.pv0(CloseRankDialogEvent.class);
        }
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this.LJLJJL);
        HashMap hashMap = null;
        if (LJIILIIL2 != null) {
            C32004ChE c32004ChE = new C32004ChE(null);
            User user = this.LJLJJLL;
            GiftListFragment giftListFragment = this.LJLJJL;
            c32004ChE.LIZ = user;
            c32004ChE.LIZIZ = V0N.LJJ(giftListFragment.LJLJJI);
            C31526CYw rankTypeAll = giftListFragment.LJLJJI;
            o.LJIIIZ(rankTypeAll, "rankTypeAll");
            if (rankTypeAll.LIZ == EnumC31514CYk.GAME_RANK && !o.LJ(rankTypeAll.LIZIZ, rankTypeAll.LIZLLL)) {
                hashMap = new HashMap();
                hashMap.put("sub_rank_game_name", rankTypeAll.LIZIZ.rankName);
            }
            c32004ChE.LJ = hashMap;
            LJIILIIL2.qv0(SendGiftEvent.class, c32004ChE);
        }
        RankListController rankListController = this.LJLJJL.LJLJJLL;
        if (rankListController != null && (LJII = rankListController.LJII()) != null && LJII.LJLILLLLZI != null) {
            int i = rankListController.LJII().LJLIL.LIZIZ.type;
            int i2 = rankListController.LJII().LJLIL.LIZIZ.rankPhase;
            EnumC31514CYk groupType = rankListController.LIZ().LJLJJI;
            RankTypeV2 entranceRankType = rankListController.LIZ().LJLJJL;
            List<RankTabInfo> list = rankListController.LIZ().LJLIL;
            o.LJIIIZ(groupType, "groupType");
            o.LJIIIZ(entranceRankType, "entranceRankType");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C05630Jz.LJI(jSONObject, "current_entity_rank_type", BPN.LIZ(i, i2).rankName);
            C05630Jz.LJI(jSONObject, "current_entrance_rank_type", entranceRankType.rankName);
            C05630Jz.LIZ(groupType.getType(), "group_type", jSONObject);
            C31524CYu.LIZ(jSONObject3, i, i2, list);
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_entity_gift_panel_click", jSONObject, jSONObject2, jSONObject4);
        }
    }

    public C77950UiY(GiftListFragment giftListFragment, User user) {
        this.LJLJJL = giftListFragment;
        this.LJLJJLL = user;
    }
}
