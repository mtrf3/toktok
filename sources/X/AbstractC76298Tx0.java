package X;

import Y.AfS65S0100000_13;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tx0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76298Tx0 implements InterfaceC28344BAm {
    public InterfaceC76348Txo LJLIL;
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public final Handler LJLJI = new Handler(C16880lQ.LLJJJJ());
    public C76802UCg LJLJJI;
    public C76801UCf LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public LinkMicBattleArmiesMessage LJLL;
    public LinkMicBattleArmiesMessage LJLLI;
    public boolean LJLLILLLL;

    public abstract void LIZJ(BattleInfoResponse battleInfoResponse);

    public abstract void LIZLLL(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract boolean LJI(BattleInfoResponse battleInfoResponse, int i);

    public abstract void LJII(LinkMicBattleMessage linkMicBattleMessage);

    public abstract void LJIIJ(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract void LJIIJJI();

    public abstract void LJIIL(LinkMicBattleItemCard linkMicBattleItemCard);

    public abstract void LJIILIIL(LinkMicBattleMessage linkMicBattleMessage);

    public abstract void LJIILJJIL();

    public abstract void LJIILLIIL(LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage);

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
    }

    public static long LJ() {
        long LIZIZ;
        long max;
        BattleSetting battleSetting = C76316TxI.LIZ.LIZLLL;
        if (battleSetting == null) {
            max = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            if (MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled()) {
                LIZIZ = C76273Twb.LIZ();
            } else {
                LIZIZ = C30725C4b.LIZIZ();
            }
            if (LIZIZ <= 0) {
                LIZIZ = System.currentTimeMillis();
            }
            max = battleSetting.duration - (Math.max(0L, LIZIZ - battleSetting.startTimeMs) / 1000);
        }
        C0NB.LJIIIZ("MatchFeedViewDelegateAbs", "getBattleRemainSecond, remainSecond  = " + max);
        return max;
    }

    public final void LIZ() {
        long j;
        long j2;
        InterfaceC76347Txn LIZ;
        InterfaceC75871Tq7 LIZIZ;
        InterfaceC76347Txn LIZ2;
        InterfaceC75871Tq7 LIZIZ2;
        C75989Ts1 LJFF;
        InterfaceC76347Txn LIZ3;
        InterfaceC75871Tq7 LIZIZ3;
        C75989Ts1 LJFF2;
        if (this.LJLIL == null) {
            return;
        }
        C76290Tws c76290Tws = C76316TxI.LIZ;
        long j3 = 0;
        if (c76290Tws.LIZ() <= 0 || this.LJLLILLLL) {
            return;
        }
        this.LJLLILLLL = true;
        this.LJLJLJ--;
        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
        if (interfaceC76348Txo != null && (LIZ3 = interfaceC76348Txo.LIZ()) != null && (LIZIZ3 = LIZ3.LIZIZ()) != null && (LJFF2 = LIZIZ3.LJFF()) != null) {
            j = LJFF2.LIZJ;
        } else {
            j = 0;
        }
        InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
        if (interfaceC76348Txo2 != null && (LIZ2 = interfaceC76348Txo2.LIZ()) != null && (LIZIZ2 = LIZ2.LIZIZ()) != null && (LJFF = LIZIZ2.LJFF()) != null) {
            j2 = LJFF.LIZIZ;
        } else {
            j2 = 0;
        }
        InterfaceC76348Txo interfaceC76348Txo3 = this.LJLIL;
        if (interfaceC76348Txo3 != null && (LIZ = interfaceC76348Txo3.LIZ()) != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            j3 = LIZIZ.LIZ();
        }
        this.LJLILLLLZI.LIZ(C1EW.LIZ(((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).getInfo(j, j3, c76290Tws.LIZ(), j2)).LJJJLIIL(new AfS65S0100000_13(this, 135), new AfS65S0100000_13(this, 136)));
    }

    public final DataChannel LJFF() {
        InterfaceC76347Txn LIZ;
        InterfaceC75871Tq7 LIZIZ;
        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
        if (interfaceC76348Txo != null && (LIZ = interfaceC76348Txo.LIZ()) != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            return LIZIZ.LJIIL();
        }
        return null;
    }

    public final void LJIILL() {
        InterfaceC75871Tq7 interfaceC75871Tq7;
        InterfaceC76347Txn LIZ;
        C76456TzY LIZLLL;
        InterfaceC76347Txn LIZ2;
        U2A LIZJ;
        InterfaceC76347Txn LIZ3;
        C75870Tq6 c75870Tq6 = new C75870Tq6();
        InterfaceC76348Txo interfaceC76348Txo = this.LJLIL;
        if (interfaceC76348Txo != null && (LIZ3 = interfaceC76348Txo.LIZ()) != null) {
            interfaceC75871Tq7 = LIZ3.LIZIZ();
        } else {
            interfaceC75871Tq7 = null;
        }
        c75870Tq6.LJIILL(interfaceC75871Tq7);
        c75870Tq6.LJIILJJIL("match_widget_unload");
        LJIIIIZZ("onDestroy");
        InterfaceC76348Txo interfaceC76348Txo2 = this.LJLIL;
        if (interfaceC76348Txo2 != null && (LIZ2 = interfaceC76348Txo2.LIZ()) != null && (LIZJ = LIZ2.LIZJ()) != null) {
            DataChannel dataChannel = LIZJ.LJLLJ;
            if (dataChannel != null) {
                dataChannel.jv0(LIZJ);
            }
            LIZJ.LJLLJ = null;
            LIZJ.LJII(false);
        }
        InterfaceC76348Txo interfaceC76348Txo3 = this.LJLIL;
        if (interfaceC76348Txo3 != null && (LIZ = interfaceC76348Txo3.LIZ()) != null && (LIZLLL = LIZ.LIZLLL()) != null) {
            LIZLLL.LJFF();
        }
        this.LJLJI.removeCallbacksAndMessages(null);
        this.LJLILLLLZI.LIZLLL();
        this.LJLIL = null;
    }

    public final void LJIIIIZZ(String str) {
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        LJIIJJI();
        C76316TxI.LIZ.getClass();
        C76801UCf c76801UCf = this.LJLJJL;
        if (c76801UCf != null) {
            ((C76802UCg) c76801UCf.LJLIL).LIZ();
        }
        C76802UCg c76802UCg = this.LJLJJI;
        if (c76802UCg != null) {
            c76802UCg.LIZ();
        }
        this.LJLJI.removeCallbacksAndMessages(null);
        this.LJLJI.post(RunnableC76350Txq.LJLIL);
    }

    public final void LJIIIZ(String str) {
        C76290Tws c76290Tws = C76316TxI.LIZ;
        if (!c76290Tws.LJI(EnumC76178Tv4.PUNISH, false)) {
            return;
        }
        System.currentTimeMillis();
        long j = c76290Tws.LJIIIIZZ;
        if (j <= 0) {
            j = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
        }
        C44878HjO.LIZJ("startPunishCountDown, timeSecond = ", j, "MatchFeedViewDelegateAbs");
        if (j <= 0) {
            return;
        }
        LiveInteractBattlePunishDurationSetting liveInteractBattlePunishDurationSetting = LiveInteractBattlePunishDurationSetting.INSTANCE;
        if (j >= liveInteractBattlePunishDurationSetting.getValue()) {
            j = liveInteractBattlePunishDurationSetting.getValue() - 1;
        }
        DataChannel LJFF = LJFF();
        if (LJFF != null) {
            LJFF.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j));
        }
        if (this.LJLJJI == null) {
            this.LJLJJI = new C76802UCg();
        }
        C76802UCg c76802UCg = this.LJLJJI;
        if (c76802UCg == null) {
            return;
        }
        c76802UCg.LIZ = new C76323TxP(this);
        c76802UCg.LIZIZ(j, 1000L);
    }

    public final void LJIIZILJ(long j) {
        C44878HjO.LIZJ("BattleCountDown, timeSecond = ", j, "MatchFeedViewDelegateAbs");
        if (j <= 0) {
            return;
        }
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            if (this.LJLJJL == null) {
                this.LJLJJL = new C76801UCf(0);
            }
            this.LJLL = null;
            C76801UCf c76801UCf = this.LJLJJL;
            if (c76801UCf != null) {
                c76801UCf.LIZJ(j, new C76351Txr(this));
            }
        }
        if (LiveInteractBattleDurationSetting.INSTANCE.getValue() == j) {
            DataChannel LJFF = LJFF();
            if (LJFF != null) {
                LJFF.rv0(BattleTimeLeftChannel.class, Long.valueOf(j - 1));
            }
        } else {
            DataChannel LJFF2 = LJFF();
            if (LJFF2 != null) {
                LJFF2.rv0(BattleTimeLeftChannel.class, Long.valueOf(j));
            }
        }
        if (this.LJLJJI == null) {
            this.LJLJJI = new C76802UCg();
        }
        C76802UCg c76802UCg = this.LJLJJI;
        if (c76802UCg != null) {
            c76802UCg.LIZ = new C76307Tx9(this);
            c76802UCg.LIZIZ(j, 1000L);
        }
    }

    public static boolean LIZIZ(AbstractC76298Tx0 abstractC76298Tx0, long j) {
        boolean z;
        abstractC76298Tx0.getClass();
        if (j == C76316TxI.LIZ.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        C0RN.LIZLLL("checkBattleId, ", z, "MatchFeedViewDelegateAbs");
        return z;
    }
}
