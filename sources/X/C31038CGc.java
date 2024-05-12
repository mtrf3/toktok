package X;

import Y.ARunnableS4S0200100_5;
import Y.AfS57S0100000_5;
import android.os.Handler;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor.MultiLiveInviterShareHelper;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveInviteFriendFreqCtrl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.CGc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31038CGc<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ MultiLiveInviterShareHelper LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ User LJLJJI;
    public final /* synthetic */ LinkPlayerInfo LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Long, C76800UCe> LJLJL;

    public C31038CGc(boolean z, MultiLiveInviterShareHelper multiLiveInviterShareHelper, long j, User user, LinkPlayerInfo linkPlayerInfo, int i, AqS144S0200000_13 aqS144S0200000_13) {
        this.LJLIL = z;
        this.LJLILLLLZI = multiLiveInviterShareHelper;
        this.LJLJI = j;
        this.LJLJJI = user;
        this.LJLJJL = linkPlayerInfo;
        this.LJLJJLL = i;
        this.LJLJL = aqS144S0200000_13;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String LLLLLLIL;
        String str;
        if (o.LJ(obj, Boolean.TRUE) && this.LJLIL) {
            MultiLiveInviterShareHelper multiLiveInviterShareHelper = this.LJLILLLLZI;
            List LJJIJ = C47261Igj.LJJIJ(Long.valueOf(this.LJLJI));
            long id = this.LJLILLLLZI.LIZ.getId();
            multiLiveInviterShareHelper.getClass();
            if (!LJJIJ.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C78886Uxe.LJJJLL(C8E.LJ());
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null && (LLLLLLIL = R6.LLLLLLIL()) != null) {
                    linkedHashMap.put("channel_id", LLLLLLIL);
                }
                multiLiveInviterShareHelper.LJFF.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).sendMultiLiveShareInvitation(id, ORZ.LLD(LJJIJ, ",", "[", "]", null, 56), C78886Uxe.LJJJLL(C8E.LJ())).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C31039CGd.LJLIL, new AfS57S0100000_5(multiLiveInviterShareHelper, 347)));
            }
            long id2 = this.LJLJJI.getId();
            List LIZIZ = C74896TaO.LIZIZ(id2);
            List LIZJ = C74896TaO.LIZJ(id2);
            int i = 1;
            if (this.LJLJJL.onlineStatus != 1) {
                i = 0;
            }
            C75147TeR.LIZ(id2, "outside_live_room", i, 4);
            EnumC74778TWk LIZJ2 = C59994Ngc.LIZJ();
            Gson gson = C09650Zl.LIZJ;
            String json = GsonProtectorUtils.toJson(gson, LIZJ);
            String json2 = GsonProtectorUtils.toJson(gson, LIZIZ);
            int size = LIZIZ.size();
            int followStatus = (int) this.LJLJJI.getFollowInfo().getFollowStatus();
            int i2 = this.LJLJJLL;
            MultiLiveInviterShareHelper multiLiveInviterShareHelper2 = this.LJLILLLLZI;
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) multiLiveInviterShareHelper2.LJIIIZ.LIZ(multiLiveInviterShareHelper2, MultiLiveInviterShareHelper.LJIIJJI[0]);
            if (multiGuestDataHolder != null) {
                str = multiGuestDataHolder.LJII();
            } else {
                str = null;
            }
            C75017TcL.LJFF(id2, LIZJ2, "normal_invite", json, json2, size, followStatus, false, i2, str);
        }
        this.LJLILLLLZI.LJII.add(Long.valueOf(this.LJLJI));
        ((Handler) this.LJLILLLLZI.LJI.getValue()).postDelayed(new ARunnableS4S0200100_5(this.LJLILLLLZI, this.LJLJI, this.LJLJL, 1), MultiLiveInviteFriendFreqCtrl.INSTANCE.getValue().singleUserTimeWindow * 1000);
    }
}
