package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: X.Tx1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76299Tx1 implements InterfaceC76348Txo {
    public final InterfaceC76347Txn LIZ;
    public AbstractC76298Tx0 LIZJ;
    public boolean LJ;
    public final C76312TxE LIZIZ = new C76312TxE();
    public final EnumC76178Tv4 LIZLLL = EnumC76178Tv4.NORMAL;

    @Override // X.InterfaceC76348Txo
    public final InterfaceC76347Txn LIZ() {
        return this.LIZ;
    }

    public C76299Tx1(C76337Txd c76337Txd) {
        this.LIZ = c76337Txd;
    }

    @Override // X.InterfaceC76348Txo
    public final void LIZIZ(IMessage iMessage) {
        AbstractC76298Tx0 abstractC76298Tx0 = this.LIZJ;
        if (abstractC76298Tx0 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("message = ");
            LIZ.append(iMessage);
            C0NB.LJIIIZ("MatchFeedViewDelegateAbs", X1D.LIZIZ(LIZ));
            if (iMessage instanceof LinkMicBattleMessage) {
                C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76298Tx0, iMessage, 67));
                return;
            }
            if (iMessage instanceof LinkMicBattleArmiesMessage) {
                C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76298Tx0, iMessage, 68));
                return;
            }
            if (iMessage instanceof LinkMicBattlePunishFinishMessage) {
                C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76298Tx0, iMessage, 69));
            } else if (iMessage instanceof LinkMicBattleItemCard) {
                C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76298Tx0, iMessage, 70));
            } else {
                C0NB.LJ("MatchFeedViewDelegateAbs", "mMessageReceiver-> receive message is not support");
            }
        }
    }

    @Override // X.InterfaceC76348Txo
    public final void p7(LinkMicBattleMessage linkMicBattleMessage) {
        int i;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            i = battleSetting.battleType;
        } else {
            i = 0;
        }
        LIZJ(i, "open_message");
        AbstractC76298Tx0 abstractC76298Tx0 = this.LIZJ;
        if (abstractC76298Tx0 != null) {
            abstractC76298Tx0.LJII(linkMicBattleMessage);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0119, code lost:
    
        if (r9 != 1) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76299Tx1.LIZJ(int, java.lang.String):void");
    }

    @Override // X.InterfaceC76348Txo
    public final boolean b0(BattleInfoResponse battleInfoResponse, int i) {
        int i2;
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i2 = battleSetting.battleType;
        } else {
            i2 = 0;
        }
        LIZJ(i2, "room_enter");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleBattleInfo, matchViewDelegate = ");
        LIZ.append(this.LIZJ);
        C0NB.LIZIZ("MatchFeedWidget", X1D.LIZIZ(LIZ));
        AbstractC76298Tx0 abstractC76298Tx0 = this.LIZJ;
        if (abstractC76298Tx0 == null) {
            return false;
        }
        return abstractC76298Tx0.LJI(battleInfoResponse, i);
    }
}
