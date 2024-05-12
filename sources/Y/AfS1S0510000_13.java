package Y;

import X.C05630Jz;
import X.C09650Zl;
import X.C0NB;
import X.C32537Cpp;
import X.C75525TkX;
import X.C75575TlL;
import X.C75832TpU;
import X.C76265TwT;
import X.C76272Twa;
import X.C76279Twh;
import X.C76280Twi;
import X.C76324TxQ;
import X.C76800UCe;
import X.EnumC76319TxL;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptAbTest;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AfS1S0510000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Integer, O] */
    public static final void accept$0(AfS1S0510000_13 afS1S0510000_13, Object obj) {
        long j;
        long j2;
        User owner;
        BaseResponse baseResponse = (BaseResponse) obj;
        C76324TxQ.LIZ = 1;
        if (((C76279Twh) afS1S0510000_13.l0).LIZLLL == 0) {
            return;
        }
        BattleInviteResult.ResponseData responseData = (BattleInviteResult.ResponseData) baseResponse.data;
        Long l = responseData.battleId;
        o.LJIIIIZZ(l, "result.battleId");
        C76265TwT.LJIIIIZZ = l.longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite, result = ");
        LIZ.append(responseData);
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
        int i = responseData.inviterGiftPermissionType;
        DataChannel LJI = ((C76279Twh) afS1S0510000_13.l0).LJI();
        if (LJI != null) {
            ((C32537Cpp) LJI.gv0(C75575TlL.class)).LIZ = Integer.valueOf(i);
        }
        if (i <= 1) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS1S0510000_13.l1;
            if (interfaceC88472Yns == null) {
                return;
            }
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        boolean z = c76280Twi.LJIILIIL;
        c76280Twi.LJIILIIL = true;
        C76265TwT.LIZIZ.LJIILIIL = true;
        c76280Twi.LJIILIIL = z;
        C76280Twi c76280Twi2 = (C76280Twi) afS1S0510000_13.l2;
        Long l2 = responseData.battleId;
        o.LJIIIIZZ(l2, "result.battleId");
        c76280Twi2.LJIIJJI(l2.longValue());
        InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) afS1S0510000_13.l1;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(Boolean.TRUE);
        }
        C75832TpU c75832TpU = C75832TpU.LIZ;
        Long l3 = responseData.battleId;
        o.LJIIIIZZ(l3, "result.battleId");
        long longValue = l3.longValue();
        Long l4 = (Long) afS1S0510000_13.l3;
        if (l4 != null) {
            j = l4.longValue();
        } else {
            j = 0;
        }
        Room room = ((C76279Twh) afS1S0510000_13.l0).LJ;
        if (room != null && (owner = room.getOwner()) != null) {
            j2 = owner.getId();
        } else {
            j2 = 0;
        }
        c75832TpU.LJJI(longValue, false, null, null, j, j2, (EnumC76319TxL) afS1S0510000_13.l4, afS1S0510000_13.z5);
        boolean z2 = afS1S0510000_13.z5;
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZJ, responseData);
        o.LJIIIIZZ(json, "getDefault().toJson(result)");
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z2 ? 1 : 0));
        C05630Jz.LJI(jSONObject, "response", json);
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C76272Twa.LJ);
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, z2);
        C76272Twa.LJJJLIIL(c76272Twa, "invite_succeed", jSONObject, z2, null, 56);
        if (!LiveTwoMatchLinkOptAbTest.INSTANCE.getValue()) {
            return;
        }
        ((C76279Twh) afS1S0510000_13.l0).LJJIL("inviter_battle_info", afS1S0510000_13.z5);
    }

    public static final void accept$1(AfS1S0510000_13 afS1S0510000_13, Object obj) {
        if (afS1S0510000_13.z5) {
            ((C75525TkX) afS1S0510000_13.l0).LJ((Room) afS1S0510000_13.l1, (HashMap) afS1S0510000_13.l2, null, (OptPairInfo) afS1S0510000_13.l3);
        } else {
            ((C75525TkX) afS1S0510000_13.l0).LJ((Room) afS1S0510000_13.l1, (HashMap) afS1S0510000_13.l2, (ReserveInfo) afS1S0510000_13.l4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS1S0510000_13(Object obj, C76279Twh c76279Twh, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, C76280Twi c76280Twi, Long l, EnumC76319TxL enumC76319TxL, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = c76279Twh;
        this.l2 = interfaceC88472Yns;
        this.l3 = c76280Twi;
        this.l4 = l;
        this.z5 = enumC76319TxL;
    }
}
