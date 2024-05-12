package X;

import Y.AfS52S0300000_13;
import Y.AfS62S0200000_13;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchInviteFragmentV2;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tvy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76234Tvy extends AbstractC76233Tvx {
    public final C76236Tw0 LJLJJI;
    public final C76244Tw8 LJLJJL;
    public InterfaceC92693kP LJLJJLL;
    public InterfaceC92693kP LJLJL;

    @Override // X.AbstractC76233Tvx
    public final void LIZJ() {
        C75883TqJ c75883TqJ = this.LJLJJL.LJII;
        if (c75883TqJ != null) {
            LJIIIIZZ(c75883TqJ);
        }
    }

    @Override // X.AbstractC76233Tvx
    public final void LJ() {
        if (C76230Tvu.LIZ) {
            InterfaceC92693kP interfaceC92693kP = this.LJLJJLL;
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            InterfaceC92693kP interfaceC92693kP2 = this.LJLJL;
            if (interfaceC92693kP2 != null) {
                interfaceC92693kP2.dispose();
            }
        }
    }

    @Override // X.AbstractC76233Tvx
    public final boolean LJII() {
        return this.LJLJJI.LIZLLL;
    }

    @Override // X.AbstractC76233Tvx
    public final C76236Tw0 LJFF() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC76233Tvx
    public final C76244Tw8 LJI() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC76233Tvx
    public final void LIZLLL(AqS163S0100000_13 aqS163S0100000_13) {
        Room room;
        long j;
        C76280Twi c76280Twi;
        DataChannel dataChannel = this.LJLJJI.LIZ;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Long value = this.LJLJJL.LIZ.getValue();
        if (value == null) {
            value = 0L;
        }
        long longValue = value.longValue();
        if (this.LJLJJI.LIZLLL) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        C75832TpU c75832TpU = C75832TpU.LIZ;
        long LIZIZ = c76280Twi.LIZIZ();
        List<C75883TqJ> value2 = this.LJLJJL.LJ.getValue();
        List<C75883TqJ> value3 = this.LJLJJL.LJFF.getValue();
        C76236Tw0 c76236Tw0 = this.LJLJJI;
        EnumC76319TxL enumC76319TxL = c76236Tw0.LIZJ;
        boolean z = c76236Tw0.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C75832TpU.LJIILJJIL(value2, value3, linkedHashMap);
        C75832TpU.LJIIJJI(linkedHashMap, enumC76319TxL);
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_id", String.valueOf(LIZIZ));
        C75832TpU.LJI(linkedHashMap, z);
        C75832TpU.LJJJIL(c75832TpU, "livesdk_group_pk_invite_withdraw", linkedHashMap, "1");
        C76271TwZ.LIZ.LJJJI(c76280Twi.LIZIZ(), "active", this.LJLJJI.LIZLLL);
        C65814PsI.LIZ().getClass();
        this.LJLJL = ((InterfaceC29856Bng) ((MultiMatchApi) C65814PsI.LIZJ(MultiMatchApi.class)).cancel(j, longValue, C76265TwT.LJIIIIZZ, 0).LIZJ(LIZ())).LIZJ(new AfS62S0200000_13(aqS163S0100000_13, this, 0), new AfS52S0300000_13(aqS163S0100000_13, c76280Twi, this, 0));
    }

    @Override // X.AbstractC76233Tvx
    public final void LJIIIIZZ(C75883TqJ coHostUser) {
        o.LJIIIZ(coHostUser, "coHostUser");
        C76244Tw8 c76244Tw8 = this.LJLJJL;
        if (c76244Tw8 != null) {
            c76244Tw8.LJII = coHostUser;
            List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (C75883TqJ c75883TqJ : LJIILJJIL) {
                int i2 = i + 1;
                if (i >= 0) {
                    C75883TqJ c75883TqJ2 = c75883TqJ;
                    if (c75883TqJ2.LIZ == coHostUser.LIZ || i == 0) {
                        arrayList.add(c75883TqJ2);
                    } else {
                        arrayList2.add(c75883TqJ2);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c76244Tw8.LJ.setValue(arrayList);
            c76244Tw8.LJFF.setValue(arrayList2);
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            boolean z = this.LJLJJI.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJFF(jSONObject, "teammate_id", coHostUser.LIZ);
            C05630Jz.LJI(jSONObject, "other_team_uids", ORZ.LLD(arrayList2, ",", null, null, C76240Tw4.LJLIL, 30));
            JSONObject jSONObject2 = new JSONObject();
            C05630Jz.LJI(jSONObject2, "role_type", "inviter");
            C76271TwZ.LJJ(jSONObject, z);
            C76271TwZ.LJJZZIII(c76271TwZ, "select_teammate_click", jSONObject, jSONObject2, null, false, 8);
        }
    }

    @Override // X.AbstractC76233Tvx
    public final void LJIIIZ(AqS163S0100000_13 aqS163S0100000_13) {
        long j;
        ArrayList arrayList;
        boolean z;
        C76280Twi c76280Twi;
        long j2;
        long j3;
        User owner;
        List<C75883TqJ> value = this.LJLJJL.LJ.getValue();
        List<C75883TqJ> value2 = this.LJLJJL.LJFF.getValue();
        C76236Tw0 c76236Tw0 = this.LJLJJI;
        EnumC76319TxL enumC76319TxL = c76236Tw0.LIZJ;
        boolean z2 = c76236Tw0.LIZLLL;
        for (C75883TqJ c75883TqJ : C8E.LIZLLL().LJIILJJIL()) {
            C75832TpU c75832TpU = C75832TpU.LIZ;
            long LJIILLIIL = C75832TpU.LJIILLIIL();
            long j4 = c75883TqJ.LIZ;
            if (LJIILLIIL != j4) {
                c75832TpU.LJJJ(j4, enumC76319TxL, value, value2, true, z2);
            }
        }
        boolean z3 = this.LJLJJI.LIZLLL;
        C76244Tw8 c76244Tw8 = this.LJLJJL;
        C75883TqJ c75883TqJ2 = c76244Tw8.LJII;
        if (c75883TqJ2 != null) {
            j = c75883TqJ2.LIZ;
        } else {
            j = 0;
        }
        List<C75883TqJ> value3 = c76244Tw8.LJFF.getValue();
        if (value3 != null) {
            arrayList = new ArrayList(C32I.LJJL(value3, 10));
            Iterator<C75883TqJ> it = value3.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().LIZ));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            C0NB.LJ("MultiMatchInvitePresent", "sendInvite rival team null,  multiMatchViewModel.rivalTeamInviting.value");
            aqS163S0100000_13.invoke();
            return;
        }
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        C76271TwZ.LIZJ = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(z3 ? 1 : 0, "invite_type", jSONObject);
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        C76271TwZ.LJJ(jSONObject, z);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "inviter");
        C76271TwZ.LJJZZIII(c76271TwZ, "invite_request", jSONObject, jSONObject2, null, false, 8);
        if (this.LJLJJI.LIZLLL) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76280Twi.LJIILL(EnumC76178Tv4.INVITED, false);
        c76280Twi.LJIILIIL = true;
        c76280Twi.LJ = this.LJLJJI.LIZLLL;
        if (true ^ C8E.LIZLLL().LJIILJJIL().isEmpty()) {
            j2 = ((C75883TqJ) ListProtector.get(C8E.LIZLLL().LJIILJJIL(), 0)).LIZ;
        } else {
            j2 = 0;
        }
        c76280Twi.LJJJI = this.LJLJJI.LIZJ;
        C76244Tw8 c76244Tw82 = this.LJLJJL;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null) {
            j3 = owner.getId();
        } else {
            j3 = 0;
        }
        c76244Tw82.LJIIIIZZ = j3;
        C0NB.LIZIZ("MultiMatchInvitePresent", "inviteActionByUid updated by send invite");
        this.LJLJJL.LJIIJ = System.currentTimeMillis();
        java.util.Map<Long, Boolean> value4 = this.LJLJJL.LJI.getValue();
        if (value4 == null) {
            value4 = new HashMap<>();
        }
        value4.put(Long.valueOf(j2), Boolean.TRUE);
        this.LJLJJL.LJI.setValue(value4);
        C65814PsI.LIZ().getClass();
        MultiMatchApi multiMatchApi = (MultiMatchApi) C65814PsI.LIZIZ(MultiMatchApi.class);
        Long value5 = this.LJLJJL.LIZ.getValue();
        if (value5 == null) {
            value5 = 0L;
        }
        this.LJLJJLL = ((InterfaceC29856Bng) multiMatchApi.multiInvitePb(value5.longValue(), z3 ? 1 : 0, String.valueOf(j), ORZ.LLD(arrayList, ",", null, null, null, 62), c76280Twi.LJIILL).LIZJ(LIZ())).LIZJ(new C76243Tw7(z3 ? 1 : 0, j, aqS163S0100000_13, this, c76280Twi, value4), new C76235Tvz(aqS163S0100000_13, z3 ? 1 : 0, j, c76280Twi, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76234Tvy(MultiMatchInviteFragmentV2 multiMatchInviteFragmentV2, C76236Tw0 params) {
        super(multiMatchInviteFragmentV2);
        o.LJIIIZ(params, "params");
        this.LJLJJI = params;
        this.LJLJJL = (C76244Tw8) params.LIZIZ.LJZI(C76244Tw8.class);
    }
}
