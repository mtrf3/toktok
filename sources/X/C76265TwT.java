package X;

import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchStatusRestEvent;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TwT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76265TwT {
    public static BattleResult LIZJ;
    public static BattleResult LIZLLL;
    public static BattleTeamResult LJ;
    public static BattleTeamResult LJFF;
    public static BattleResult LJI;
    public static BattleTeamResult LJII;
    public static long LJIIIIZZ;
    public static boolean LJIIIZ;
    public static int LJIIJ;
    public static long LJIIJJI;
    public static boolean LJIILIIL;
    public static PrepareBattleResponse.ResponseData LJIILL;
    public static MultiMatchPrepareResponse LJIILLIIL;
    public static final C76280Twi LIZ = new C76280Twi("data_battle_state", C76266TwU.LJLIL);
    public static final C76280Twi LIZIZ = new C76280Twi("data_battle_rematch_state", null);
    public static final C278417k<Long, Boolean> LJIIL = new C278417k<>();
    public static EnumC76330TxW LJIILJJIL = EnumC76330TxW.UNKNOWN;

    public static final boolean LJ() {
        EnumC76178Tv4 LJ2 = LIZ.LJ();
        if (EnumC76178Tv4.START.compareTo(LJ2) <= 0 && LJ2.compareTo(EnumC76178Tv4.END) < 0) {
            return true;
        }
        return false;
    }

    public static boolean LJFF() {
        EnumC76178Tv4 LJ2 = LIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.INVITED;
        if (LJ2 == enumC76178Tv4 || LIZIZ.LJ() == enumC76178Tv4) {
            return true;
        }
        return false;
    }

    public static boolean LJI() {
        Long l;
        BattleResult battleResult;
        BattleResult battleResult2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        long j = B5G.LIZIZ().LJI;
        BattleResult battleResult3 = LIZJ;
        if (battleResult3 != null) {
            l2 = Long.valueOf(battleResult3.userId);
        }
        if (!o.LJ(l2, l) || (battleResult = LIZLLL) == null || battleResult.userId != j || (battleResult2 = LIZJ) == null || battleResult2.result != 2) {
            return false;
        }
        return true;
    }

    public static void LJIIIZ() {
        C76280Twi c76280Twi = LIZIZ;
        if (c76280Twi.LJI()) {
            C76280Twi c76280Twi2 = LIZ;
            c76280Twi2.LJIIJ("replace_data_with_rematch", false);
            c76280Twi2.LJ = c76280Twi.LJ;
            c76280Twi2.LJJIIJZLJL = c76280Twi.LJJIIJZLJL;
            c76280Twi2.LJIIJJI(c76280Twi.LIZIZ());
            c76280Twi2.LJIILIIL(c76280Twi.LIZLLL);
            c76280Twi2.LJIILL(c76280Twi.LJ(), true);
            c76280Twi2.LJIILIIL = c76280Twi.LJIILIIL;
            c76280Twi2.LJJJJJ = c76280Twi.LJJJJJ;
            c76280Twi2.LJJJI = c76280Twi.LJJJI;
            c76280Twi2.LJIIL(c76280Twi.LJIILLIIL);
            c76280Twi2.LJIILL = c76280Twi.LJIILL;
        }
        c76280Twi.LJIIIZ("replace_data", true);
    }

    public static boolean LIZ() {
        BattleABTestList battleABTestList;
        List<BattleABTest> list;
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        java.util.Map LIZIZ3 = LIZIZ();
        boolean z = false;
        if (LIZIZ3 != null && (battleABTestList = (BattleABTestList) LIZIZ3.get(Long.valueOf(((C29374Bfu) LIZIZ2).getCurrentUserId()))) != null && (list = battleABTestList.abTestList) != null) {
            for (BattleABTest battleABTest : list) {
                if (battleABTest.abTestType == 2 && battleABTest.group == 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static java.util.Map LIZIZ() {
        if (!C8E.LIZLLL().LLIFFJFJJ() || C8E.LIZLLL().LJIILJJIL().size() == 2) {
            PrepareBattleResponse.ResponseData responseData = LJIILL;
            if (responseData != null) {
                return responseData.abtestSetting;
            }
        } else {
            MultiMatchPrepareResponse multiMatchPrepareResponse = LJIILLIIL;
            if (multiMatchPrepareResponse != null) {
                return multiMatchPrepareResponse.abTestSettings;
            }
        }
        return null;
    }

    public static List LIZJ() {
        if (!C8E.LIZLLL().LLIFFJFJJ() || C8E.LIZLLL().LJIILJJIL().size() == 2) {
            PrepareBattleResponse.ResponseData responseData = LJIILL;
            if (responseData != null) {
                return responseData.giftMode;
            }
        } else {
            MultiMatchPrepareResponse multiMatchPrepareResponse = LJIILLIIL;
            if (multiMatchPrepareResponse != null) {
                return multiMatchPrepareResponse.giftMode;
            }
        }
        return null;
    }

    public static void LIZLLL() {
        List<GiftMode> LIZJ2 = LIZJ();
        java.util.Map<String, String> versionMap = InterfaceC30442Bx8.Q2.LIZJ();
        java.util.Map<String, String> LIZJ3 = InterfaceC30442Bx8.P2.LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (LIZJ2 != null) {
            for (GiftMode giftMode : LIZJ2) {
                long j = giftMode.releaseVersion;
                if (j <= 0) {
                    j = 1;
                }
                o.LJIIIIZZ(versionMap, "versionMap");
                if (!versionMap.containsKey(String.valueOf(giftMode.giftId))) {
                    linkedHashMap.put(String.valueOf(giftMode.giftId), String.valueOf(j));
                    linkedHashMap2.put(String.valueOf(giftMode.giftId), CardStruct.IStatusCode.DEFAULT);
                } else {
                    String str = "1";
                    if (versionMap.containsKey(String.valueOf(giftMode.giftId))) {
                        String str2 = versionMap.get(String.valueOf(giftMode.giftId));
                        if (str2 == null) {
                            str2 = "1";
                        }
                        if (!o.LJ(str2, String.valueOf(j))) {
                            linkedHashMap.put(String.valueOf(giftMode.giftId), String.valueOf(j));
                            linkedHashMap2.put(String.valueOf(giftMode.giftId), CardStruct.IStatusCode.DEFAULT);
                        }
                    }
                    linkedHashMap.put(String.valueOf(giftMode.giftId), String.valueOf(j));
                    String valueOf = String.valueOf(giftMode.giftId);
                    String str3 = LIZJ3.get(String.valueOf(giftMode.giftId));
                    if (str3 != null) {
                        str = str3;
                    }
                    linkedHashMap2.put(valueOf, str);
                }
            }
        }
        C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.Q2;
        c48459J0d.LIZ(linkedHashMap);
        C48459J0d<java.util.Map<String, String>> c48459J0d2 = InterfaceC30442Bx8.P2;
        c48459J0d2.LIZ(linkedHashMap2);
        c48459J0d.LIZLLL();
        c48459J0d2.LIZLLL();
    }

    public static void LJIIIIZZ(EnumC76330TxW enumC76330TxW) {
        o.LJIIIZ(enumC76330TxW, "<set-?>");
        LJIILJJIL = enumC76330TxW;
    }

    public static void LJII(int i, String str) {
        DataChannel dataChannel = B5G.LIZIZ().LIZIZ;
        if (dataChannel != null) {
            dataChannel.qv0(MatchStatusRestEvent.class, Integer.valueOf(i));
        }
        if (i != 1) {
            if (i != 2) {
                LIZ.LJIIIZ(str, false);
                LIZIZ.LJIIIZ(str, true);
            } else {
                LIZIZ.LJIIIZ(str, true);
            }
        } else {
            LIZ.LJIIIZ(str, false);
        }
        LJIILJJIL = EnumC76330TxW.UNKNOWN;
    }
}
