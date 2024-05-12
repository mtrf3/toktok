package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRightScoreChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiBattleFinishResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76283Twl<T> implements InterfaceC64592gB {
    public final /* synthetic */ C76278Twg LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ CustomLinkMessage LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    public C76283Twl(C76278Twg c76278Twg, long j, boolean z, int i, int i2, long j2, CustomLinkMessage customLinkMessage, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = c76278Twg;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = j2;
        this.LJLJL = customLinkMessage;
        this.LJLJLJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long l;
        long j;
        BattleTeamResult battleTeamResult;
        BattleTeamResult battleTeamResult2;
        int i;
        ExtraDataWrapper extra;
        LinkMessage linkMessage;
        java.util.Map<Long, BattleTeamResult> map;
        java.util.Map<Long, BattleTeamResult> map2;
        BaseResponse it = (BaseResponse) obj;
        this.LJLIL.LJIIJ = false;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        long j2 = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        int i2 = this.LJLJJI;
        o.LJIIIIZZ(it, "it");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "cut_short", jSONObject);
        C05630Jz.LIZ(i2, "source", jSONObject);
        C05630Jz.LJI(jSONObject, "logid", it.LIZIZ);
        C05630Jz.LJFF(jSONObject, "battle_id", j2);
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "cut_short", jSONObject2);
        C05630Jz.LIZ(i2, "source", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - C76271TwZ.LJIIJ);
        C76271TwZ.LJJZZIII(c76271TwZ, "battle_finish_succeed", jSONObject, jSONObject2, jSONObject3, false, 16);
        MultiBattleFinishResponse multiBattleFinishResponse = (MultiBattleFinishResponse) it.data;
        Long l2 = null;
        if (multiBattleFinishResponse != null && multiBattleFinishResponse.teamBattleResult != null) {
            C05630Jz.LJI(jSONObject, "battle_result", GsonProtectorUtils.toJson(C09650Zl.LIZJ, multiBattleFinishResponse.teamBattleResult));
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long j3 = 0;
        if (Room.isValid(room)) {
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
        } else {
            l = 0L;
        }
        java.util.Map<Long, BattleTeamUserArmies> map3 = ((MultiBattleFinishResponse) it.data).teamArmies;
        if (map3 != null) {
            for (Map.Entry<Long, BattleTeamUserArmies> entry : map3.entrySet()) {
                List<BattleTeamUser> list = entry.getValue().teamUsers;
                if (list != null) {
                    Iterator<BattleTeamUser> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            BattleTeamUser next = it2.next();
                            if (o.LJ(l, next.userId)) {
                                if (next != null) {
                                    j3 = entry.getKey().longValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        long j4 = 2;
        if (j3 == 1) {
            j = 2;
        } else {
            j = 1;
        }
        MultiBattleFinishResponse multiBattleFinishResponse2 = (MultiBattleFinishResponse) it.data;
        if (multiBattleFinishResponse2 != null && (map2 = multiBattleFinishResponse2.teamBattleResult) != null) {
            battleTeamResult = map2.get(Long.valueOf(j3));
        } else {
            battleTeamResult = null;
        }
        MultiBattleFinishResponse multiBattleFinishResponse3 = (MultiBattleFinishResponse) it.data;
        if (multiBattleFinishResponse3 != null && (map = multiBattleFinishResponse3.teamBattleResult) != null) {
            battleTeamResult2 = map.get(Long.valueOf(j));
        } else {
            battleTeamResult2 = null;
        }
        C76271TwZ.LJJIFFI(jSONObject, battleTeamResult, battleTeamResult2);
        C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, "finish_response");
        C76271TwZ.LJJZZIII(c76271TwZ, "update_result", jSONObject, jSONObject2, jSONObject3, false, 16);
        MultiBattleFinishResponse multiBattleFinishResponse4 = (MultiBattleFinishResponse) it.data;
        java.util.Map<Long, BattleTeamResult> map4 = multiBattleFinishResponse4.teamBattleResult;
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJIIJJI = multiBattleFinishResponse4.hasTeamMatchMvpSfx;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("finish, battleResult = ");
        LIZ.append(map4);
        C0NB.LJIIIZ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ));
        C76271TwZ c76271TwZ2 = C76271TwZ.LIZ;
        int i3 = this.LJLJJL;
        long j5 = this.LJLJJLL;
        CustomLinkMessage customLinkMessage = this.LJLJL;
        if (customLinkMessage != null && (extra = customLinkMessage.getExtra()) != null && (linkMessage = extra.getLinkMessage()) != null) {
            l2 = Long.valueOf(linkMessage.getMessageId());
        }
        c76271TwZ2.LJJLIIJ(i3, true, j5, l2);
        if (this.LJLIL.LJIIJJI) {
            C0NB.LJIIIZ("MultiMatchViewAnchorPre", "dealResult, Battle state is End, return");
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        if (c76280Twi.LIZ(EnumC76178Tv4.PUNISH)) {
            C0NB.LJIIIZ("MultiMatchViewAnchorPre", "dealResult, Battle state is punish, return");
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJLJ;
            if (interfaceC65784Pro2 == null) {
                return;
            }
            interfaceC65784Pro2.invoke();
            return;
        }
        boolean z2 = this.LJLJI;
        c76280Twi.LJJIFFI = z2;
        c76280Twi.LJJII = z2;
        if (z2) {
            if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
                this.LJLIL.LJJIJL(this.LJLJJLL);
            }
            this.LJLIL.LJJJI(this.LJLJJLL, Integer.valueOf(this.LJLJJL));
            C76278Twg.LJJIJIIJI(this.LJLIL, "cut_short_request", 6);
        } else {
            ArrayList arrayList = new ArrayList();
            java.util.Map<Long, BattleTeamUserArmies> map5 = ((MultiBattleFinishResponse) it.data).teamArmies;
            if (map5 != null) {
                Iterator<Map.Entry<Long, BattleTeamUserArmies>> it3 = map5.entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().getValue());
                }
            }
            if (!arrayList.isEmpty()) {
                C76278Twg.LJJJJLI(this.LJLIL, arrayList);
            } else {
                C76278Twg c76278Twg = this.LJLIL;
                java.util.Map<Long, BattleTeamResult> map6 = ((MultiBattleFinishResponse) it.data).teamBattleResult;
                c76278Twg.getClass();
                C76280Twi c76280Twi2 = C76265TwT.LIZ;
                long j6 = c76280Twi2.LJJJJJ;
                if (j6 != 1) {
                    j4 = 1;
                }
                if (map6 != null) {
                    BattleTeamResult battleTeamResult3 = map6.get(Long.valueOf(j6));
                    BattleTeamResult battleTeamResult4 = map6.get(Long.valueOf(j4));
                    if (battleTeamResult3 != null) {
                        C76385TyP c76385TyP = new C76385TyP(0L, 0L, (int) battleTeamResult3.totalScore);
                        DataChannel LJI = c76278Twg.LJI();
                        if (LJI != null) {
                            LJI.rv0(BattleLeftScoreChannel.class, c76385TyP);
                        }
                        c76278Twg.LJJJ(battleTeamResult3.teamUsers, true);
                        ((HashMap) c76280Twi2.LJJIJL).put(Long.valueOf(j6), Long.valueOf(battleTeamResult3.totalScore));
                    }
                    if (battleTeamResult4 != null) {
                        DataChannel LJI2 = c76278Twg.LJI();
                        if (LJI2 != null) {
                            LJI2.rv0(BattleRightScoreChannel.class, Integer.valueOf((int) battleTeamResult4.totalScore));
                        }
                        c76278Twg.LJJJ(battleTeamResult4.teamUsers, false);
                        ((HashMap) c76280Twi2.LJJIJL).put(Long.valueOf(j4), Long.valueOf(battleTeamResult4.totalScore));
                    }
                }
            }
            C76278Twg c76278Twg2 = this.LJLIL;
            int i4 = this.LJLJJI;
            long j7 = this.LJLJJLL;
            BattleSetting battleSetting = ((MultiBattleFinishResponse) it.data).battleSettings;
            if (battleSetting != null) {
                i = battleSetting.status;
            } else {
                i = 2;
            }
            c76278Twg2.LJIJJ(i4, i, j7, map4);
        }
        C0NB.LIZIZ("MultiMatchViewAnchorPre", "finish, success, callback");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLJLJ;
        if (interfaceC65784Pro3 == null) {
            return;
        }
        interfaceC65784Pro3.invoke();
    }
}
