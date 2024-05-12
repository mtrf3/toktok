package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareOptOutNotice;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTruthOrDare;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76280Twi {
    public final String LIZ;
    public final InterfaceC88472Yns<C76280Twi, C76800UCe> LIZIZ;
    public long LIZJ;
    public BattleSetting LIZLLL;
    public boolean LJ;
    public List<BestTeammateRelation> LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public List<Long> LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public GiftModeMeta LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public BattleResult LJIJI;
    public BattleTeamResult LJIJJ;
    public java.util.Map<Long, BattleComboInfo> LJIJJLI;
    public List<? extends TeamUsersInfo> LJIL;
    public long LJJ;
    public long LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public BattleDisplayConfig LJJIJIIJIL;
    public long LJJIJIL;
    public BattleUserInfo LJJIJLIJ;
    public BattleUserInfo LJJIL;
    public long LJJJ;
    public EnumC76319TxL LJJJI;
    public float LJJJJ;
    public float LJJJJI;
    public boolean LJJJJIZL;
    public long LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public String LJJJJZI;
    public BattleTruthOrDareTriggerGuideV2 LJJJLIIL;
    public BattleTruthOrDare LJJJLL;
    public BattleTruthOrDareOptOutNotice LJJJLZIJ;
    public long LJJJZ;
    public boolean LJJL;
    public long LJJLI;
    public final java.util.Map<Long, Long> LJJIJL = new HashMap();
    public EnumC76320TxM LJJIZ = EnumC76320TxM.NONE;
    public int LJJJIL = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76280Twi)) {
            return false;
        }
        C76280Twi c76280Twi = (C76280Twi) obj;
        return o.LJ(this.LIZ, c76280Twi.LIZ) && o.LJ(this.LIZIZ, c76280Twi.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC88472Yns<C76280Twi, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        return hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode());
    }

    public final long LIZIZ() {
        BattleSetting battleSetting = this.LIZLLL;
        if (battleSetting != null) {
            return battleSetting.battleId;
        }
        return this.LIZJ;
    }

    public final long LIZJ() {
        BattleSetting battleSetting = this.LIZLLL;
        if (battleSetting != null) {
            return battleSetting.channelId;
        }
        return B5G.LIZIZ().LJFF;
    }

    public final BattleUserInfo LIZLLL() {
        Room room;
        User owner;
        BattleBaseUserInfo battleBaseUserInfo;
        Long l;
        BattleUserInfo battleUserInfo = this.LJJIJLIJ;
        if ((battleUserInfo == null || (battleBaseUserInfo = battleUserInfo.user) == null || (l = battleBaseUserInfo.userId) == null || l.longValue() <= 0) && (room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class)) != null && (owner = room.getOwner()) != null) {
            this.LJJIJLIJ = new BattleUserInfo(new BattleBaseUserInfo(Long.valueOf(owner.getId()), C05170If.LIZLLL(owner), C05170If.LJ(owner), owner.getAvatarThumb()), null, 2, null);
        }
        return this.LJJIJLIJ;
    }

    public final BattleUserInfo LJFF() {
        BattleBaseUserInfo battleBaseUserInfo;
        Long l;
        BattleUserInfo battleUserInfo = this.LJJIL;
        if (battleUserInfo == null || (battleBaseUserInfo = battleUserInfo.user) == null || (l = battleBaseUserInfo.userId) == null || l.longValue() <= 0) {
            B5G.LIZIZ();
            Object obj = ((ConcurrentHashMap) LinkCrossRoomDataHolder.LJLJI).get("data_guest_user");
            if (obj == null) {
                obj = null;
            }
            User user = (User) obj;
            if (user != null) {
                this.LJJIL = new BattleUserInfo(new BattleBaseUserInfo(Long.valueOf(user.getId()), C05170If.LIZLLL(user), C05170If.LJ(user), user.getAvatarThumb()), null, 2, null);
            }
        }
        return this.LJJIL;
    }

    public final boolean LJII() {
        Long l;
        GiftModeMeta giftModeMeta = this.LJIILLIIL;
        if (giftModeMeta != null) {
            l = Long.valueOf(giftModeMeta.giftId);
        } else {
            l = null;
        }
        if (l == null) {
            return false;
        }
        GiftModeMeta giftModeMeta2 = this.LJIILLIIL;
        if (giftModeMeta2 != null && giftModeMeta2.giftId == 0) {
            return false;
        }
        return true;
    }

    public final EnumC76178Tv4 LJ() {
        EnumC76178Tv4 enumC76178Tv4;
        EnumC76178Tv4 enumC76178Tv42;
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        if (o.LJ("data_battle_state", this.LIZ)) {
            DataChannel dataChannel = LIZIZ.LIZIZ;
            if (dataChannel == null || (enumC76178Tv42 = (EnumC76178Tv4) dataChannel.kv0(BattleStateChannel.class)) == null) {
                return EnumC76178Tv4.NORMAL;
            }
            return enumC76178Tv42;
        }
        DataChannel dataChannel2 = LIZIZ.LIZIZ;
        if (dataChannel2 != null && (enumC76178Tv4 = (EnumC76178Tv4) dataChannel2.kv0(BattleReMatchStateChannel.class)) != null) {
            return enumC76178Tv4;
        }
        return EnumC76178Tv4.NORMAL;
    }

    public final boolean LJI() {
        if (LIZIZ() > 0 || LJ().compareTo(EnumC76178Tv4.NORMAL) > 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        EnumC76178Tv4 LJ = LJ();
        if (LJ.compareTo(EnumC76178Tv4.START) >= 0 && LJ.compareTo(EnumC76178Tv4.END) < 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BattleDataModel(stateKey=");
        LIZ.append(this.LIZ);
        LIZ.append(", reset=");
        return C249109q6.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final boolean LIZ(EnumC76178Tv4 targetState) {
        o.LJIIIZ(targetState, "targetState");
        if (LJ().compareTo(targetState) >= 0) {
            return true;
        }
        return false;
    }

    public final void LJIIJJI(long j) {
        B5G.LIZIZ().LJJJJJL = j;
        this.LIZJ = j;
        this.LJJIJIL = LIZJ();
    }

    public final void LJIIL(GiftModeMeta giftModeMeta) {
        long j;
        this.LJIILLIIL = giftModeMeta;
        if (giftModeMeta != null) {
            j = giftModeMeta.giftId;
        } else {
            j = 0;
        }
        this.LJIILL = j;
    }

    public final void LJIILIIL(BattleSetting battleSetting) {
        long j;
        GiftModeMeta giftModeMeta;
        this.LIZLLL = battleSetting;
        if (battleSetting != null) {
            j = battleSetting.battleId;
        } else {
            j = 0;
        }
        LJIIJJI(j);
        if (battleSetting != null) {
            giftModeMeta = battleSetting.giftModeMeta;
        } else {
            giftModeMeta = null;
        }
        LJIIL(giftModeMeta);
    }

    public final void LJIILJJIL(EnumC76320TxM newStatus) {
        InterfaceC05190Ih interfaceC05190Ih;
        String str;
        String str2;
        long j;
        LiveMode streamType;
        o.LJIIIZ(newStatus, "newStatus");
        this.LJJIZ = newStatus;
        this.LJJJ = System.currentTimeMillis();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (C29306Beo.LJIIJJI(dataChannelGlobal) || newStatus == EnumC76320TxM.NONE) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        String str3 = null;
        if (LIZIZ2 != null) {
            interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ;
        } else {
            interfaceC05190Ih = null;
        }
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (Room.isValid(room)) {
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C05630Jz.LJI(jSONObject, "room_id", str);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str3 = C28509BGv.LIZ(streamType);
        }
        C05630Jz.LJI(jSONObject, "live_type", str3);
        if (!jSONObject.has("channel_id")) {
            C05630Jz.LJFF(jSONObject, "channel_id", LIZIZ.LJFF);
        }
        if (!jSONObject.has("battle_id")) {
            C05630Jz.LJFF(jSONObject, "battle_id", LIZIZ());
        }
        if (room == null || (str2 = room.getIdStr()) == null) {
            str2 = "";
        }
        C05630Jz.LJI(jSONObject, "anchor_id", str2);
        if (interfaceC05190Ih != null) {
            j = interfaceC05190Ih.getId();
        } else {
            j = 0;
        }
        C05630Jz.LJFF(jSONObject, "current_user_id", j);
        C05630Jz.LJI(jSONObject, "event_id", newStatus.getValue());
        C76272Twa.LJIJ(jSONObject);
        C76272Twa.LJIJJ(jSONObject, false);
        C0K2.LJIIIIZZ("ttlive_client_match_identify_event", 0, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C76280Twi(String str, InterfaceC88472Yns<? super C76280Twi, C76800UCe> interfaceC88472Yns) {
        this.LIZ = str;
        this.LIZIZ = interfaceC88472Yns;
    }

    public final void LJIIIZ(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key = ");
        LIZ.append(this.LIZ);
        LIZ.append("  source = ");
        LIZ.append(str);
        C0NB.LJIIIZ("BattleDataModelReset", X1D.LIZIZ(LIZ));
        LJIIJ(str, z);
        LJIILL(EnumC76178Tv4.NORMAL, true);
    }

    public final void LJIIJ(String str, boolean z) {
        long j;
        boolean z2;
        InterfaceC05190Ih interfaceC05190Ih;
        String str2;
        String str3;
        String str4;
        long j2;
        int i;
        LiveMode streamType;
        InterfaceC88472Yns<C76280Twi, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null) {
            long ownerUserId = room.getOwnerUserId();
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null) {
                j = ((C29374Bfu) LIZIZ).getCurrentUserId();
            } else {
                j = 0;
            }
            if (ownerUserId == j) {
                z2 = true;
            } else {
                z2 = false;
            }
            C76272Twa.LIZ.LJJII(str, z2, z);
        }
        if (!C29306Beo.LJIIJJI(dataChannelGlobal) && this.LJJIZ != EnumC76320TxM.NONE && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_match_identify", 0.2d)) {
            JSONObject jSONObject = new JSONObject();
            LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
            InterfaceC29405BgP LIZIZ3 = B83.LIZ().LIZIZ();
            if (LIZIZ3 != null) {
                interfaceC05190Ih = ((C29374Bfu) LIZIZ3).LIZIZ;
            } else {
                interfaceC05190Ih = null;
            }
            Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (Room.isValid(room2)) {
                if (room2 != null) {
                    str2 = room2.getIdStr();
                } else {
                    str2 = null;
                }
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C05630Jz.LJI(jSONObject, "room_id", str2);
            if (room2 != null && (streamType = room2.getStreamType()) != null) {
                str3 = C28509BGv.LIZ(streamType);
            } else {
                str3 = null;
            }
            C05630Jz.LJI(jSONObject, "live_type", str3);
            if (!jSONObject.has("channel_id")) {
                C05630Jz.LJFF(jSONObject, "channel_id", LIZIZ2.LJFF);
            }
            if (!jSONObject.has("battle_id")) {
                C05630Jz.LJFF(jSONObject, "battle_id", LIZIZ());
            }
            if (room2 == null || (str4 = room2.getIdStr()) == null) {
                str4 = "";
            }
            C05630Jz.LJI(jSONObject, "anchor_id", str4);
            if (interfaceC05190Ih != null) {
                j2 = interfaceC05190Ih.getId();
            } else {
                j2 = 0;
            }
            C05630Jz.LJFF(jSONObject, "current_user_id", j2);
            C05630Jz.LJI(jSONObject, "identify_status", this.LJJIZ.getValue());
            C05630Jz.LJFF(jSONObject, "time", System.currentTimeMillis() - this.LJJJ);
            C76272Twa.LJIJ(jSONObject);
            C76272Twa.LJIJJ(jSONObject, false);
            if (this.LJJIZ == EnumC76320TxM.MATCH_SEI) {
                i = 0;
            } else {
                i = 1;
            }
            C0K2.LJIIIIZZ("ttlive_client_match_identify", i, jSONObject);
        }
        this.LJJIZ = EnumC76320TxM.NONE;
        this.LJJJ = 0L;
        this.LIZJ = 0L;
        this.LJJIJIL = 0L;
        this.LJ = false;
        this.LJJIIZ = 0L;
        this.LJJIJIIJI = 0L;
        this.LJJ = 0L;
        this.LJJI = 0L;
        this.LJJIIJZLJL = 0L;
        this.LJIILIIL = false;
        this.LJJJJJ = 0L;
        this.LIZLLL = null;
        this.LJIJI = null;
        this.LJJIFFI = false;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIJLIJ = null;
        this.LJJIL = null;
        this.LJJIJIIJIL = null;
        this.LJJJIL = 1;
        this.LJJJJ = 0.0f;
        this.LJJJJI = 0.0f;
        this.LJJJJIZL = false;
        this.LJIL = null;
        this.LJJJJLI = false;
        this.LJJJJLL = false;
        this.LJJJJZ = false;
        this.LJJJLIIL = null;
        this.LJJJLL = null;
        this.LJJJLZIJ = null;
        this.LJJJI = null;
        this.LJJJZ = 0L;
        this.LJJL = false;
        this.LJIILL = 0L;
        LJIIL(null);
        this.LJIIZILJ = false;
        this.LJIJ = false;
        this.LJJLI = 0L;
    }

    public final boolean LJIILL(EnumC76178Tv4 targetState, boolean z) {
        DataChannel dataChannel;
        o.LJIIIZ(targetState, "targetState");
        EnumC76178Tv4 LJ = LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateState, old State = ");
        LIZ.append(LJ);
        LIZ.append("; targetState = ");
        LIZ.append(targetState);
        C0NB.LJIIIZ("BattleDataTag", X1D.LIZIZ(LIZ));
        boolean z2 = false;
        if (!z && targetState.compareTo(LJ) <= 0) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateState, success targetState = ");
        LIZ2.append(targetState);
        C0NB.LJIIIZ("BattleDataTag", X1D.LIZIZ(LIZ2));
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateState, success stateKey = ");
        JBR.LJIIJ(LIZ3, this.LIZ, LIZ3, "BattleDataTag");
        if (o.LJ("data_battle_state", this.LIZ)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("updateState, success stateKey = ");
            if (LIZIZ.LIZIZ == null) {
                z2 = true;
            }
            FT5.LJ(LIZ4, z2, LIZ4, "BattleDataTag");
            DataChannel dataChannel2 = LIZIZ.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.rv0(BattleStateChannel.class, targetState);
            }
        } else {
            DataChannel dataChannel3 = LIZIZ.LIZIZ;
            if (dataChannel3 != null) {
                dataChannel3.rv0(BattleReMatchStateChannel.class, targetState);
            }
        }
        if (C29306Beo.LJIIL(LIZIZ.LIZIZ) && (dataChannel = LIZIZ.LIZIZ) != null) {
            dataChannel.pv0(LinkConnectionTypeChangedEvent.class);
        }
        return true;
    }
}
