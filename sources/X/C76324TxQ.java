package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleInviteEachOtherSetting;

/* renamed from: X.TxQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76324TxQ {
    public static volatile int LIZIZ;
    public static volatile int LIZ = -1;
    public static volatile int LIZJ = -1;

    public static void LIZJ() {
        LIZ = -1;
        LIZIZ = 0;
        LIZJ = -1;
    }

    public static boolean LIZ() {
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (!c76280Twi.LJIILIIL || c76280Twi.LJ().compareTo(EnumC76178Tv4.RECEIVED) > 0 || LIZIZ != 0) {
            C76280Twi c76280Twi2 = C76265TwT.LIZIZ;
            if (!c76280Twi2.LJIILIIL || c76280Twi2.LJ().compareTo(EnumC76178Tv4.RECEIVED) > 0 || LIZIZ != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ() {
        EnumC76325TxR enumC76325TxR;
        if (!LiveBattleInviteEachOtherSetting.INSTANCE.getValue()) {
            return false;
        }
        if (LIZ() && LIZ == 0 && LIZJ == 0) {
            enumC76325TxR = EnumC76325TxR.NORMAL_SEND_NORMAL_RECEIVE;
        } else if (LIZ() && LIZ == 1 && LIZJ == 0) {
            enumC76325TxR = EnumC76325TxR.NORMAL_SUCCESS_NORMAL_RECEIVE;
        } else if (LIZ() && LIZ == -1 && LIZJ == 0) {
            enumC76325TxR = EnumC76325TxR.NORMAL_NONE_NORMAL_RECEIVE;
        } else if (LIZ() && LIZ == 0 && LIZJ == 1) {
            enumC76325TxR = EnumC76325TxR.REMATCH_SEND_REMATCH_RECEIVE;
        } else if (LIZ() && LIZ == 1 && LIZJ == 1) {
            enumC76325TxR = EnumC76325TxR.REMATCH_SUCCESS_REMATCH_RECEIVE;
        } else if (LIZ() && LIZ == -1 && LIZJ == 1) {
            enumC76325TxR = EnumC76325TxR.REMATCH_NONE_REMATCH_RECEIVE;
        } else {
            enumC76325TxR = EnumC76325TxR.NONE;
        }
        if (enumC76325TxR != EnumC76325TxR.NORMAL_SEND_NORMAL_RECEIVE && enumC76325TxR != EnumC76325TxR.NORMAL_SUCCESS_NORMAL_RECEIVE && enumC76325TxR != EnumC76325TxR.REMATCH_SEND_REMATCH_RECEIVE && enumC76325TxR != EnumC76325TxR.REMATCH_SUCCESS_REMATCH_RECEIVE) {
            return false;
        }
        return true;
    }
}
