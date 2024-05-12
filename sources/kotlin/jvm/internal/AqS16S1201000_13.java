package kotlin.jvm.internal;

import X.ASQ;
import X.ASX;
import X.AbstractC65781Prl;
import X.C0NB;
import X.C16880lQ;
import X.C68322mC;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76279Twh;
import X.C76280Twi;
import X.C76286Two;
import X.C76287Twp;
import X.C76317TxJ;
import X.C76800UCe;
import X.C76802UCg;
import X.EnumC76178Tv4;
import X.InterfaceC65784Pro;
import X.U8K;
import X.UC5;
import X.UC6;
import X.UCC;
import X.UZ1;
import X.UZ6;
import X.UZ8;
import X.X1D;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFinishOptimizeSettings;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public class AqS16S1201000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle IO finished ");
        LIZ.append(this.i3);
        LIZ.append(' ');
        LIZ.append(this.s0);
        LIZ.append(' ');
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZ));
        if (((UCC) this.l1).LIZJ.get(this.s0) == null) {
            String str = this.s0;
            int i = this.i3;
            if (((UCC) this.l1).LIZ == UC5.LOCAL) {
                z = true;
            } else {
                z = false;
            }
            U8K.LJ(str, i, z, LinkMicSdkGeckoDslDownloadSetting.getValue());
        }
        ((UC6) this.l2).LIZ(((UCC) this.l1).LIZJ.get(this.s0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS16S1201000_13 aqS16S1201000_13) {
        boolean z;
        C76279Twh c76279Twh = (C76279Twh) aqS16S1201000_13.l1;
        c76279Twh.LJIIIZ = false;
        BattleResult battleResult = (BattleResult) ((C68322mC) aqS16S1201000_13.l2).element;
        if (battleResult != null && battleResult.result == 2) {
            c76279Twh.LJJIIZI("finish_draw", false);
        } else if (LiveMatchFinishOptimizeSettings.INSTANCE.isEnable() && aqS16S1201000_13.i3 == 2) {
            ((C76279Twh) aqS16S1201000_13.l1).LJJIIZI("finish_cut_short", false);
            C76272Twa.LIZ.LJJJJZ("opposite_leave", true);
        } else {
            DataChannel LJI = ((C76279Twh) aqS16S1201000_13.l1).LJI();
            if (LJI != null) {
                BattleResult battleResult2 = (BattleResult) ((C68322mC) aqS16S1201000_13.l2).element;
                if (battleResult2 != null && battleResult2.result == 0) {
                    z = true;
                } else {
                    z = false;
                }
                LJI.rv0(BattleIsCurrentWinChannel.class, Boolean.valueOf(z));
            }
            C76279Twh c76279Twh2 = (C76279Twh) aqS16S1201000_13.l1;
            String str = aqS16S1201000_13.s0;
            c76279Twh2.getClass();
            C76280Twi c76280Twi = C76265TwT.LIZ;
            if (c76280Twi.LJIILL(EnumC76178Tv4.PUNISH, false)) {
                c76280Twi.LJJIJ = System.currentTimeMillis();
                long j = c76280Twi.LJJIJIIJI;
                if (j <= 0) {
                    j = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                }
                c76280Twi.LJJI = j;
                C76272Twa.LJJJJIZL(j, str, true);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startPunishCountDown, timeSecond = ");
                LIZ.append(j);
                C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
                if (j > 0) {
                    LiveInteractBattlePunishDurationSetting liveInteractBattlePunishDurationSetting = LiveInteractBattlePunishDurationSetting.INSTANCE;
                    if (j >= liveInteractBattlePunishDurationSetting.getValue()) {
                        j = liveInteractBattlePunishDurationSetting.getValue() - 1;
                    }
                    DataChannel LJI2 = c76279Twh2.LJI();
                    if (LJI2 != null) {
                        LJI2.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j));
                    }
                    if (c76279Twh2.LJIIJJI == null) {
                        c76279Twh2.LJIIJJI = new C76802UCg();
                    }
                    C76802UCg c76802UCg = c76279Twh2.LJIIJJI;
                    if (c76802UCg != null) {
                        c76802UCg.LIZ = new C76317TxJ(c76279Twh2);
                        c76802UCg.LIZIZ(j, 1000L);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS16S1201000_13 aqS16S1201000_13) {
        C76286Two c76286Two = (C76286Two) aqS16S1201000_13.l1;
        boolean z = false;
        c76286Two.LJFF = false;
        BattleTeamResult battleTeamResult = (BattleTeamResult) aqS16S1201000_13.l2;
        if (battleTeamResult != null && battleTeamResult.result == 2) {
            c76286Two.LJIIJ("finish_draw", false);
        } else if (LiveMatchFinishOptimizeSettings.INSTANCE.isEnable() && aqS16S1201000_13.i3 == 2) {
            ((C76286Two) aqS16S1201000_13.l1).LJIIJ("finish_cut_short", false);
            C76271TwZ.LIZ.LJJLIIIJJIZ("opposite_leave", false);
        } else {
            DataChannel LJIIIIZZ = ((C76286Two) aqS16S1201000_13.l1).LJIIIIZZ();
            if (LJIIIIZZ != null) {
                BattleTeamResult battleTeamResult2 = (BattleTeamResult) aqS16S1201000_13.l2;
                if (battleTeamResult2 != null && battleTeamResult2.result == 0) {
                    z = true;
                }
                LJIIIIZZ.rv0(BattleIsCurrentWinChannel.class, Boolean.valueOf(z));
            }
            ((C76286Two) aqS16S1201000_13.l1).LJIIJJI(aqS16S1201000_13.s0);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AqS16S1201000_13 aqS16S1201000_13) {
        C76287Twp c76287Twp = (C76287Twp) aqS16S1201000_13.l1;
        boolean z = false;
        c76287Twp.LJFF = false;
        BattleResult battleResult = (BattleResult) ((C68322mC) aqS16S1201000_13.l2).element;
        if (battleResult != null && battleResult.result == 2) {
            c76287Twp.LJIIJ("finish_draw", false);
        } else if (LiveMatchFinishOptimizeSettings.INSTANCE.isEnable() && aqS16S1201000_13.i3 == 2) {
            ((C76287Twp) aqS16S1201000_13.l1).LJIIJ("finish_cut_short", false);
            C76272Twa.LIZ.LJJJJZ("opposite_leave", false);
        } else {
            DataChannel LJIIIIZZ = ((C76287Twp) aqS16S1201000_13.l1).LJIIIIZZ();
            if (LJIIIIZZ != null) {
                BattleResult battleResult2 = (BattleResult) ((C68322mC) aqS16S1201000_13.l2).element;
                if (battleResult2 != null && battleResult2.result == 0) {
                    z = true;
                }
                LJIIIIZZ.rv0(BattleIsCurrentWinChannel.class, Boolean.valueOf(z));
            }
            ((C76287Twp) aqS16S1201000_13.l1).LJIIJJI(aqS16S1201000_13.s0);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS16S1201000_13 aqS16S1201000_13) {
        aqS16S1201000_13.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS16S1201000_13 aqS16S1201000_13) {
        String str = aqS16S1201000_13.s0;
        UZ1.LJFF(aqS16S1201000_13.i3, (UZ8) aqS16S1201000_13.l1, str, "close");
        ASQ.LIZLLL((UZ6) aqS16S1201000_13.l2, ASX.LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S1201000_13(int i, String str, UCC ucc, UC6 uc6, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.l1 = ucc;
        this.l2 = uc6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS16S1201000_13(C76279Twh c76279Twh, C76279Twh c76279Twh2, C68322mC<BattleResult> c68322mC, int i, String str) {
        super(0);
        this.$t = str;
        this.l1 = c76279Twh;
        this.l2 = c76279Twh2;
        this.i3 = c68322mC;
        this.s0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S1201000_13(C76286Two c76286Two, BattleTeamResult battleTeamResult, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c76286Two;
        this.l2 = battleTeamResult;
        this.i3 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS16S1201000_13(C76287Twp c76287Twp, C76287Twp c76287Twp2, C68322mC<BattleResult> c68322mC, int i, String str) {
        super(0);
        this.$t = str;
        this.l1 = c76287Twp;
        this.l2 = c76287Twp2;
        this.i3 = c68322mC;
        this.s0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S1201000_13(String str, UZ8 uz8, int i, UZ6 uz6, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l1 = uz8;
        this.i3 = i;
        this.l2 = uz6;
    }
}
