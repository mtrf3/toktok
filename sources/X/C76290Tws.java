package X;

import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tws, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76290Tws {
    public final String LIZ;
    public final InterfaceC88472Yns<C76290Tws, C76800UCe> LIZIZ;
    public long LIZJ;
    public BattleSetting LIZLLL;
    public List<BestTeammateRelation> LJ;
    public List<Long> LJFF;
    public GiftModeMeta LJI;
    public List<? extends TeamUsersInfo> LJII;
    public long LJIIIIZZ;
    public final java.util.Map<Long, Long> LJIIIZ = new HashMap();
    public long LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76290Tws)) {
            return false;
        }
        C76290Tws c76290Tws = (C76290Tws) obj;
        return o.LJ(this.LIZ, c76290Tws.LIZ) && o.LJ(this.LIZIZ, c76290Tws.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC88472Yns<C76290Tws, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        return hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode());
    }

    public final long LIZ() {
        BattleSetting battleSetting = this.LIZLLL;
        if (battleSetting != null) {
            return battleSetting.battleId;
        }
        return this.LIZJ;
    }

    public final EnumC76178Tv4 LIZIZ() {
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

    public final boolean LIZJ() {
        EnumC76178Tv4 LIZIZ = LIZIZ();
        if (LIZIZ.compareTo(EnumC76178Tv4.START) >= 0 && LIZIZ.compareTo(EnumC76178Tv4.END) < 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchFeedDataModel(stateKey=");
        LIZ.append(this.LIZ);
        LIZ.append(", reset=");
        return C249109q6.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final void LJFF(BattleSetting battleSetting) {
        long j;
        GiftModeMeta giftModeMeta;
        this.LIZLLL = battleSetting;
        if (battleSetting != null) {
            j = battleSetting.battleId;
        } else {
            j = 0;
        }
        B5G.LIZIZ().LJJJJJL = j;
        this.LIZJ = j;
        if (this.LIZLLL == null) {
            B5G.LIZIZ();
        }
        if (battleSetting != null) {
            giftModeMeta = battleSetting.giftModeMeta;
        } else {
            giftModeMeta = null;
        }
        this.LJI = giftModeMeta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C76290Tws(String str, InterfaceC88472Yns<? super C76290Tws, C76800UCe> interfaceC88472Yns) {
        this.LIZ = str;
        this.LIZIZ = interfaceC88472Yns;
    }

    public final void LIZLLL(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key = ");
        LIZ.append(this.LIZ);
        LIZ.append("  source = ");
        LIZ.append(str);
        C0NB.LJIIIZ("BattleDataModelReset", X1D.LIZIZ(LIZ));
        LJ(str, z);
        LJI(EnumC76178Tv4.NORMAL, true);
    }

    public final void LJ(String str, boolean z) {
        long j;
        boolean z2;
        InterfaceC88472Yns<C76290Tws, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this);
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
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
        this.LIZJ = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIJ = 0L;
        this.LIZLLL = null;
        this.LJI = null;
    }

    public final boolean LJI(EnumC76178Tv4 targetState, boolean z) {
        DataChannel dataChannel;
        o.LJIIIZ(targetState, "targetState");
        EnumC76178Tv4 LIZIZ = LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateState, old State = ");
        LIZ.append(LIZIZ);
        LIZ.append("; targetState = ");
        LIZ.append(targetState);
        C0NB.LJIIIZ("MatchFeedDataTag", X1D.LIZIZ(LIZ));
        boolean z2 = false;
        if (!z && targetState.compareTo(LIZIZ) <= 0) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateState, success targetState = ");
        LIZ2.append(targetState);
        C0NB.LJIIIZ("MatchFeedDataTag", X1D.LIZIZ(LIZ2));
        LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateState, success stateKey = ");
        JBR.LJIIJ(LIZ3, this.LIZ, LIZ3, "MatchFeedDataTag");
        if (o.LJ("data_battle_state", this.LIZ)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("updateState, success stateKey = ");
            if (LIZIZ2.LIZIZ == null) {
                z2 = true;
            }
            FT5.LJ(LIZ4, z2, LIZ4, "MatchFeedDataTag");
            DataChannel dataChannel2 = LIZIZ2.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.rv0(BattleStateChannel.class, targetState);
            }
        } else {
            DataChannel dataChannel3 = LIZIZ2.LIZIZ;
            if (dataChannel3 != null) {
                dataChannel3.rv0(BattleReMatchStateChannel.class, targetState);
            }
        }
        if (C29306Beo.LJIIL(LIZIZ2.LIZIZ) && (dataChannel = LIZIZ2.LIZIZ) != null) {
            dataChannel.pv0(LinkConnectionTypeChangedEvent.class);
        }
        return true;
    }
}
