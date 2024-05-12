package Y;

import X.AbstractC76627U5n;
import X.B83;
import X.C05630Jz;
import X.C0NB;
import X.C1JD;
import X.C28467BFf;
import X.C29374Bfu;
import X.C31012CFc;
import X.C75832TpU;
import X.C76265TwT;
import X.C76272Twa;
import X.CH1;
import X.EnumC76330TxW;
import X.InterfaceC29405BgP;
import X.InterfaceC64592gB;
import X.J7I;
import X.OSZ;
import X.QZP;
import X.U1E;
import X.U7F;
import X.U7W;
import X.UA9;
import X.UC0;
import X.X1D;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS0S0211200_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.battle.BattleAwardItemCardResponse;

/* loaded from: classes14.dex */
public class AfS1S0100200_13 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S0100200_13 afS1S0100200_13, Object obj) {
        AbstractC76627U5n abstractC76627U5n;
        AbstractC76627U5n abstractC76627U5n2;
        Long aLong = (Long) obj;
        if (aLong != null && aLong.longValue() == 0 && (abstractC76627U5n = ((U1E) afS1S0100200_13.l0).LIZIZ) != null) {
            abstractC76627U5n.LIZ(aLong.longValue());
        }
        AbstractC76627U5n abstractC76627U5n3 = ((U1E) afS1S0100200_13.l0).LIZIZ;
        if (abstractC76627U5n3 != null) {
            long j = afS1S0100200_13.j1;
            o.LJIIIIZZ(aLong, "aLong");
            abstractC76627U5n3.LIZJ(j - aLong.longValue());
        }
        long j2 = afS1S0100200_13.j1 - afS1S0100200_13.j2;
        if (aLong == null || aLong.longValue() != j2 || (abstractC76627U5n2 = ((U1E) afS1S0100200_13.l0).LIZIZ) == null) {
            return;
        }
        abstractC76627U5n2.LIZIZ(aLong.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS1S0100200_13 afS1S0100200_13, Object obj) {
        BattleAwardItemCardResponse.ResponseData responseData;
        boolean z;
        String str;
        String str2;
        C28467BFf c28467BFf = (C28467BFf) obj;
        ((MatchItemViewModel) afS1S0100200_13.l0).LJLLILLLL = false;
        if (c28467BFf == null || (responseData = (BattleAwardItemCardResponse.ResponseData) c28467BFf.data) == null) {
            return;
        }
        int i = responseData.cardType;
        QZP.LIZJ("mvp award a match item card type = ", i, "MatchItemViewModel");
        EnumC76330TxW enumC76330TxW = C76265TwT.LJIILJJIL;
        EnumC76330TxW enumC76330TxW2 = EnumC76330TxW.MATCH_TYPE_2V2;
        boolean z2 = true;
        if (enumC76330TxW == enumC76330TxW2) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("unknown cardType = ");
                    LIZ.append(i);
                    C0NB.LJ("MatchItemViewModel", X1D.LIZIZ(LIZ));
                } else {
                    BattleAwardItemCardResponse.ResponseData responseData2 = (BattleAwardItemCardResponse.ResponseData) c28467BFf.data;
                    if (responseData2 != null && responseData2.smokeCard != null) {
                        MatchItemViewModel matchItemViewModel = (MatchItemViewModel) afS1S0100200_13.l0;
                        matchItemViewModel.setState(new AqS0S0211200_13(2, afS1S0100200_13.j1, afS1S0100200_13.j2, matchItemViewModel, c28467BFf, z, 1));
                    }
                }
            } else {
                BattleAwardItemCardResponse.ResponseData responseData3 = (BattleAwardItemCardResponse.ResponseData) c28467BFf.data;
                if (responseData3 != null && responseData3.criticalStrikeCard != null) {
                    MatchItemViewModel matchItemViewModel2 = (MatchItemViewModel) afS1S0100200_13.l0;
                    matchItemViewModel2.setState(new AqS0S0211200_13(1, afS1S0100200_13.j1, afS1S0100200_13.j2, matchItemViewModel2, c28467BFf, z, 0));
                }
            }
            C75832TpU c75832TpU = C75832TpU.LIZ;
            long j = afS1S0100200_13.j1;
            long j2 = afS1S0100200_13.j2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
            C75832TpU.LJIILIIL(linkedHashMap);
            linkedHashMap.put("pk_inviter_id", String.valueOf(C75832TpU.LJIILLIIL()));
            if (C1JD.LJJIJIL()) {
                str = "anchor";
            } else {
                str = "user";
            }
            linkedHashMap.put("user_type", str);
            linkedHashMap.put("match_item_type", C1JD.LJII(i));
            linkedHashMap.put("pk_id", String.valueOf(j));
            linkedHashMap.put("channel_id", String.valueOf(j2));
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ == null || (str2 = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId()).toString()) == null) {
                str2 = "";
            }
            linkedHashMap.put("user_id", str2);
            if (C76265TwT.LJIILJJIL != enumC76330TxW2) {
                z2 = false;
            }
            if (z2) {
                C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_occur", linkedHashMap, "1");
            } else {
                C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_occur", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
            }
            long j3 = afS1S0100200_13.j1;
            long j4 = afS1S0100200_13.j2;
            long j5 = ((MatchItemViewModel) afS1S0100200_13.l0).LJLJJI;
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJFF(jSONObject, "award_battle_id", j3);
            C05630Jz.LJFF(jSONObject, "award_channel_id", j4);
            C05630Jz.LJFF(jSONObject, "award_anchor_id", j5);
            C05630Jz.LJI(jSONObject, "match_item_type", C76272Twa.LJIL(i));
            C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C76272Twa.LIZLLL);
            C76272Twa.LIZ.LJJJLL(0, "award_match_item_succeed", jSONObject);
            return;
        }
        C0NB.LJIIIZ("MatchItemViewModel", "mvp not award any item card");
    }

    public static final void accept$2(AfS1S0100200_13 afS1S0100200_13, Object obj) {
        Throwable th = (Throwable) obj;
        ((MatchItemViewModel) afS1S0100200_13.l0).LJLLILLLL = false;
        C0NB.LJFF("MatchItemViewModel", "request awardCard", th);
        long j = afS1S0100200_13.j1;
        long j2 = afS1S0100200_13.j2;
        long j3 = ((MatchItemViewModel) afS1S0100200_13.l0).LJLJJI;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "award_battle_id", j);
        C05630Jz.LJFF(jSONObject, "award_channel_id", j2);
        C05630Jz.LJFF(jSONObject, "award_anchor_id", j3);
        C76272Twa c76272Twa = C76272Twa.LIZ;
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C76272Twa.LIZLLL);
        c76272Twa.LJJJLL(1, "award_match_item_failed", jSONObject);
    }

    public static final void accept$3(AfS1S0100200_13 afS1S0100200_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7F u7f = (U7F) afS1S0100200_13.l0;
        String valueOf = String.valueOf(afS1S0100200_13.j1);
        String str2 = "";
        OSZ osz = new OSZ(0L, "");
        String str3 = null;
        if (baseResponse != null) {
            str3 = baseResponse.LIZIZ;
        }
        UA9.LJIIJJI(afS1S0100200_13.j2, C31012CFc.LIZIZ(), u7f, valueOf, str3, osz, true);
        U7F u7f2 = (U7F) afS1S0100200_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS1S0100200_13.j2;
        if (baseResponse != null && (str = baseResponse.LIZIZ) != null) {
            str2 = str;
        }
        J7I.LJIIIZ(u7w, u7f2, "cancel_apply", LIZIZ, str2, 0, null, false, null, 224);
    }

    public static final void accept$4(AfS1S0100200_13 afS1S0100200_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7F u7f = (U7F) afS1S0100200_13.l0;
        String valueOf = String.valueOf(afS1S0100200_13.j1);
        OSZ LJIILL = UC0.LJIILL(th);
        if (th instanceof CH1) {
            str = ((CH1) th).getxTtLogId();
        } else {
            str = null;
        }
        UA9.LJIIJJI(afS1S0100200_13.j2, C31012CFc.LIZIZ(), u7f, valueOf, str, LJIILL, false);
        U7F u7f2 = (U7F) afS1S0100200_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS1S0100200_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7f2, "cancel_apply", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public static final void accept$5(AfS1S0100200_13 afS1S0100200_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7F u7f = (U7F) afS1S0100200_13.l0;
        String valueOf = String.valueOf(afS1S0100200_13.j1);
        String str2 = "";
        OSZ osz = new OSZ(0L, "");
        String str3 = null;
        if (baseResponse != null) {
            str3 = baseResponse.LIZIZ;
        }
        UA9.LJIILIIL(afS1S0100200_13.j2, C31012CFc.LIZIZ(), u7f, valueOf, str3, osz, true);
        U7F u7f2 = (U7F) afS1S0100200_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS1S0100200_13.j2;
        if (baseResponse != null && (str = baseResponse.LIZIZ) != null) {
            str2 = str;
        }
        J7I.LJIIIZ(u7w, u7f2, "cancel_invite", LIZIZ, str2, 0, null, false, null, 224);
    }

    public static final void accept$6(AfS1S0100200_13 afS1S0100200_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7F u7f = (U7F) afS1S0100200_13.l0;
        String valueOf = String.valueOf(afS1S0100200_13.j1);
        OSZ LJIILL = UC0.LJIILL(th);
        if (th instanceof CH1) {
            str = ((CH1) th).getxTtLogId();
        } else {
            str = null;
        }
        UA9.LJIILIIL(afS1S0100200_13.j2, C31012CFc.LIZIZ(), u7f, valueOf, str, LJIILL, false);
        U7F u7f2 = (U7F) afS1S0100200_13.l0;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS1S0100200_13.j2;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        J7I.LJIIIZ(u7w, u7f2, "cancel_invite", LIZIZ, LJIJ, UC0.LJIILJJIL(th), null, false, null, 224);
    }

    public AfS1S0100200_13(U1E u1e, long j, int i) {
        this.$t = i;
        this.l0 = u1e;
        this.j1 = j;
        this.j2 = 0L;
    }

    public AfS1S0100200_13(Object obj, long j, long j2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
        this.j2 = j2;
    }
}
