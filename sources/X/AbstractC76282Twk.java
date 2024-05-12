package X;

import X.InterfaceC76363Ty3;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesLooperSettings;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Twk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76282Twk<P extends InterfaceC76363Ty3> {
    public LinkMicBattleArmiesMessage LIZ;
    public volatile LinkMicBattleArmiesMessage LIZIZ;
    public C76801UCf LIZJ;
    public P LIZLLL;
    public Room LJ;
    public final C76304Tx6 LJFF = new C76304Tx6(this);

    public abstract void LJ(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract void LJIIIZ(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage);

    public abstract void LJIIJ(LinkMicBattleMessage linkMicBattleMessage);

    public abstract void LJIIJJI(LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage);

    public abstract void LJIIL(LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage);

    public static long LJFF() {
        long max;
        BattleSetting battleSetting = C76265TwT.LIZ.LIZLLL;
        if (battleSetting == null) {
            max = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            long LIZ = C76273Twb.LIZ();
            if (LIZ <= 0) {
                LIZ = System.currentTimeMillis();
            }
            max = battleSetting.duration - (Math.max(0L, LIZ - battleSetting.startTimeMs) / 1000);
        }
        C44878HjO.LIZJ("getBattleRemainSecond, remainSecond  = ", max, "IMatchViewPresenter");
        return max;
    }

    public final C73816Sy4 LIZIZ() {
        MatchBaseWidget matchBaseWidget;
        C62705OjF c62705OjF = new C62705OjF();
        P p = this.LIZLLL;
        if (p != null) {
            matchBaseWidget = p.LIZLLL();
        } else {
            matchBaseWidget = null;
        }
        return C73933Szx.LIZ(C73931Szv.LIZIZ(matchBaseWidget, Lifecycle.Event.ON_DESTROY), c62705OjF);
    }

    public final DataChannel LJI() {
        MatchBaseWidget LIZLLL;
        P p = this.LIZLLL;
        if (p != null && (LIZLLL = p.LIZLLL()) != null) {
            return LIZLLL.provideDataChannel();
        }
        return null;
    }

    public final C76244Tw8 LJII() {
        MatchBaseWidget LIZLLL;
        P p = this.LIZLLL;
        if (p != null && (LIZLLL = p.LIZLLL()) != null) {
            return (C76244Tw8) LIZLLL.LJZI(C76244Tw8.class);
        }
        return null;
    }

    public final void LJIIZILJ() {
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        if (LJ.compareTo(EnumC76178Tv4.START) < 0 || LJ.compareTo(EnumC76178Tv4.END) >= 0) {
            return;
        }
        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) Q7L.LIZIZ(RoomSwitchApi.class);
        Room room = this.LJ;
        o.LJI(room);
        ((InterfaceC29856Bng) roomSwitchApi.updateSwitch(room.getId(), 6, true).LIZJ(LIZIZ())).LIZJ(C76357Txx.LJLIL, C76344Txk.LJLIL);
    }

    public void LIZLLL() {
        IMessageManager iMessageManager;
        DataChannel LJI = LJI();
        if (LJI != null && (iMessageManager = (IMessageManager) LJI.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE.getIntType(), this.LJFF);
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LJFF);
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType(), this.LJFF);
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_VICTORY_LAP_MESSAGE.getIntType(), this.LJFF);
        }
    }

    public static void LJIILIIL(boolean z) {
        String str;
        String str2;
        Text text = null;
        if (z) {
            MultiMatchPrepareResponse multiMatchPrepareResponse = C76265TwT.LJIILLIIL;
            if (multiMatchPrepareResponse != null) {
                text = multiMatchPrepareResponse.giftEventDesc;
            }
            LJIILJJIL(text);
        } else {
            PrepareBattleResponse.ResponseData responseData = C76265TwT.LJIILL;
            if (responseData != null) {
                text = responseData.giftEventDesc;
            }
            LJIILJJIL(text);
        }
        List<GiftMode> LIZJ = C76265TwT.LIZJ();
        if (LIZJ != null) {
            for (GiftMode giftMode : LIZJ) {
                ImageModel imageModel = giftMode.giftIconImage;
                String str3 = "";
                if (imageModel != null) {
                    List<String> list = imageModel.mUrls;
                    if (list == null || (str2 = (String) ORZ.LJLLLLLL(0, list)) == null) {
                        str2 = "";
                    }
                    C15490jB.LJIJI(str2);
                }
                ImageModel imageModel2 = giftMode.eventIconImage;
                if (imageModel2 != null) {
                    List<String> list2 = imageModel2.mUrls;
                    if (list2 != null && (str = (String) ORZ.LJLLLLLL(0, list2)) != null) {
                        str3 = str;
                    }
                    C15490jB.LJIJI(str3);
                }
            }
        }
    }

    public static void LJIILJJIL(Text text) {
        List<TextPiece> list;
        List<TextPiece> list2;
        int i;
        String str;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        List<String> list3;
        if (text != null && (list = text.pieces) != null && list.size() > 0 && text != null && (list2 = text.pieces) != null) {
            for (TextPiece textPiece : list2) {
                if (textPiece != null) {
                    i = textPiece.type;
                } else {
                    i = 0;
                }
                if (i == CXI.IMAGE.getPieceType()) {
                    IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class);
                    if (textPiece == null || (textPieceImage = textPiece.imageValue) == null || (imageModel = textPieceImage.imageModel) == null || (list3 = imageModel.mUrls) == null || (str = (String) ORZ.LJLLLLLL(0, list3)) == null) {
                        str = "";
                    }
                    iHostFrescoHelper.W00(str);
                }
            }
        }
    }

    public static void LJIILL(LinkMicBattleMessage message) {
        int i;
        o.LJIIIZ(message, "message");
        BattleSetting battleSetting = message.battleSetting;
        if (battleSetting != null && battleSetting.inviteType == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (message.action == 1) {
            C76324TxQ.LIZJ = i;
        } else {
            C76324TxQ.LIZJ = -1;
        }
    }

    public final void LIZ(P p) {
        Room room;
        IMessageManager iMessageManager;
        this.LIZLLL = p;
        DataChannel LJI = LJI();
        if (LJI != null) {
            room = (Room) LJI.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJ = room;
        DataChannel LJI2 = LJI();
        if (LJI2 != null && (iMessageManager = (IMessageManager) LJI2.kv0(C29927Bop.class)) != null) {
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE.getIntType(), this.LJFF);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LJFF);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType(), this.LJFF);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_VICTORY_LAP_MESSAGE.getIntType(), this.LJFF);
        }
    }

    public final void LJIIIIZZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C0NB.LJIIJ(6, getClass().getName(), throwable.getStackTrace());
    }

    public final void LJIILLIIL(long j) {
        if (LiveMatchArmiesLooperSettings.INSTANCE.getValue()) {
            if (this.LIZJ == null) {
                this.LIZJ = new C76801UCf(0);
            }
            this.LIZIZ = null;
            C76801UCf c76801UCf = this.LIZJ;
            if (c76801UCf != null) {
                c76801UCf.LIZJ(j, new C76331TxX(this));
            }
        }
    }

    public static boolean LIZJ(AbstractC76282Twk abstractC76282Twk, long j, boolean z, int i) {
        C76280Twi c76280Twi;
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC76282Twk.getClass();
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (j != c76280Twi.LIZIZ()) {
            return false;
        }
        return true;
    }
}
