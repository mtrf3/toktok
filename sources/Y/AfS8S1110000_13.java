package Y;

import X.AbstractC76282Twk;
import X.C08880Wm;
import X.C0NB;
import X.C1EW;
import X.C75622Tm6;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76279Twh;
import X.C76280Twi;
import X.C76324TxQ;
import X.C76802UCg;
import X.C8E;
import X.EnumC75744To4;
import X.EnumC76178Tv4;
import X.InterfaceC64592gB;
import X.InterfaceC75441TjB;
import X.InterfaceC76313TxF;
import X.Q7L;
import X.U8H;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptAbTest;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS8S1110000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS8S1110000_13 afS8S1110000_13, Object obj) {
        String str;
        long j;
        C76280Twi c76280Twi;
        Integer valueOf;
        long j2;
        int i;
        long j3;
        BattleUserInfo battleUserInfo;
        BattleUserInfo battleUserInfo2;
        long j4;
        long j5;
        Object obj2;
        long j6;
        User owner;
        long j7;
        User owner2;
        U8H LJJZZI;
        long j8;
        List<TeamUsersInfo> list;
        EnumC75744To4 enumC75744To4;
        long j9;
        BaseResponse baseResponse = (BaseResponse) obj;
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) baseResponse.data;
        String str2 = "open_result";
        if (o.LJ(afS8S1110000_13.s0, "each_other")) {
            str = "open_result";
        } else {
            str = afS8S1110000_13.s0;
        }
        T t = baseResponse.data;
        o.LJIIIIZZ(t, "it.data");
        C76272Twa.LJJIJ(str, (BattleInfoResponse) t, true, afS8S1110000_13.z2);
        C76279Twh c76279Twh = (C76279Twh) afS8S1110000_13.l1;
        Long l = battleInfoResponse.battleId;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        boolean z = afS8S1110000_13.z2;
        boolean LJ = o.LJ(afS8S1110000_13.s0, "resume_match");
        c76279Twh.getClass();
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (LJ) {
            c76280Twi.LJIIJJI(j);
        }
        if (j == c76280Twi.LIZIZ()) {
            C76279Twh c76279Twh2 = (C76279Twh) afS8S1110000_13.l1;
            String str3 = afS8S1110000_13.s0;
            c76279Twh2.getClass();
            if (!C76279Twh.LJIJJ(str3)) {
                if (C76265TwT.LIZ.LJ().compareTo(EnumC76178Tv4.START) >= 0) {
                    ((C76279Twh) afS8S1110000_13.l1).LJJI();
                    ((C76279Twh) afS8S1110000_13.l1).LJIJI(afS8S1110000_13.s0);
                    return;
                }
                return;
            }
            BattleSetting battleSetting = battleInfoResponse.setting;
            if (battleSetting != null && (valueOf = Integer.valueOf(battleSetting.status)) != null) {
                if (valueOf.intValue() == 1) {
                    ((C76279Twh) afS8S1110000_13.l1).LJJI();
                    C76279Twh c76279Twh3 = (C76279Twh) afS8S1110000_13.l1;
                    if (!o.LJ(afS8S1110000_13.s0, "each_other")) {
                        str2 = afS8S1110000_13.s0;
                    }
                    boolean z2 = afS8S1110000_13.z2;
                    c76279Twh3.getClass();
                    C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "handleBattleInfoForBattleStart into");
                    if (LiveTwoMatchLinkOptAbTest.INSTANCE.getValue()) {
                        Long l2 = battleInfoResponse.battleId;
                        if (l2 != null) {
                            j9 = l2.longValue();
                        } else {
                            j9 = 0;
                        }
                        if (!C76279Twh.LJJIJIIJI(j9)) {
                            return;
                        }
                    }
                    C76280Twi c76280Twi2 = C76265TwT.LIZ;
                    ((HashMap) c76280Twi2.LJJIJL).clear();
                    if (c76280Twi2.LJ() == EnumC76178Tv4.PUNISH) {
                        c76279Twh3.LJJIJIL();
                        C75832TpU c75832TpU = C75832TpU.LIZ;
                        C76244Tw8 LJII = c76279Twh3.LJII();
                        if (LJII != null) {
                            list = LJII.LJIILL;
                        } else {
                            list = null;
                        }
                        if (C76265TwT.LIZIZ.LJIILIIL) {
                            enumC75744To4 = EnumC75744To4.POSITIVE_OVER;
                        } else {
                            enumC75744To4 = EnumC75744To4.NEGATIVE_OVER;
                        }
                        c75832TpU.LJJIIJ(list, false, enumC75744To4);
                        C76265TwT.LJI = c76280Twi2.LJIJI;
                    }
                    C76802UCg c76802UCg = c76279Twh3.LJIIJJI;
                    if (c76802UCg != null) {
                        c76802UCg.LIZ();
                    }
                    Long l3 = battleInfoResponse.battleId;
                    if (l3 != null) {
                        j3 = l3.longValue();
                    } else {
                        j3 = 0;
                    }
                    C75622Tm6.LJIIJJI(j3, false, z2);
                    InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
                    if (LJJIJL != null && (LJJZZI = LJJIJL.LJJZZI()) != null) {
                        Long l4 = battleInfoResponse.battleId;
                        if (l4 != null) {
                            j8 = l4.longValue();
                        } else {
                            j8 = 0;
                        }
                        LJJZZI.LJJZ(j8);
                    }
                    C76265TwT.LJIIIZ();
                    c76280Twi2.LJIILIIL(battleInfoResponse.setting);
                    Map<Long, BattleUserInfo> map = battleInfoResponse.userInfoMap;
                    if (map != null) {
                        Room room = c76279Twh3.LJ;
                        if (room != null && (owner2 = room.getOwner()) != null) {
                            j7 = owner2.getId();
                        } else {
                            j7 = 0;
                        }
                        battleUserInfo = map.get(Long.valueOf(j7));
                    } else {
                        battleUserInfo = null;
                    }
                    c76280Twi2.LJJIJLIJ = battleUserInfo;
                    if (map != null) {
                        Iterator LIZLLL = C08880Wm.LIZLLL();
                        while (true) {
                            if (LIZLLL.hasNext()) {
                                obj2 = LIZLLL.next();
                                C75883TqJ c75883TqJ = (C75883TqJ) obj2;
                                Room room2 = c76279Twh3.LJ;
                                if (room2 == null || (owner = room2.getOwner()) == null || c75883TqJ.LIZ != owner.getId()) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        C75883TqJ c75883TqJ2 = (C75883TqJ) obj2;
                        if (c75883TqJ2 != null) {
                            j6 = c75883TqJ2.LIZ;
                        } else {
                            j6 = 0;
                        }
                        battleUserInfo2 = map.get(Long.valueOf(j6));
                    } else {
                        battleUserInfo2 = null;
                    }
                    c76280Twi2.LJJIL = battleUserInfo2;
                    C76280Twi c76280Twi3 = C76265TwT.LIZ;
                    BattleSetting battleSetting2 = battleInfoResponse.setting;
                    if (battleSetting2 != null) {
                        j4 = battleSetting2.startTimeMs;
                    } else {
                        j4 = 0;
                    }
                    c76280Twi3.LJJIIZI = j4;
                    c76279Twh3.LJJIIZ(AbstractC76282Twk.LJFF(), str2, battleInfoResponse.battleCombos);
                    if (o.LJ(str2, "resume_match")) {
                        Long l5 = battleInfoResponse.battleId;
                        if (l5 != null) {
                            j5 = l5.longValue();
                        } else {
                            j5 = 0;
                        }
                        c76280Twi3.LJJLI = j5;
                        C76271TwZ.LIZ.LJLJI();
                        Map<Long, BattleUserArmies> map2 = battleInfoResponse.armies;
                        if (map2 != null) {
                            c76279Twh3.LJJJ(map2, 0L, 0L, false);
                        }
                    }
                    C76324TxQ.LIZJ();
                    c76280Twi3.LJJIJIIJIL = battleInfoResponse.mBattleDisplayConfig;
                    C75832TpU c75832TpU2 = C75832TpU.LIZ;
                    Room room3 = c76279Twh3.LJ;
                    if (room3 != null) {
                        room3.getOwnerUserId();
                    }
                    c75832TpU2.LJIJJLI(null, false, "livesdk_connection_success");
                    Room room4 = c76279Twh3.LJ;
                    if (room4 != null) {
                        room4.getOwnerUserId();
                    }
                    c75832TpU2.LJIJJLI(null, false, "livesdk_connection_success_rec");
                    return;
                }
                if (valueOf.intValue() == 0) {
                    if (o.LJ(afS8S1110000_13.s0, "inviter_battle_info") && ((C76279Twh) afS8S1110000_13.l1).LJIILIIL < LiveTwoMatchLinkOptSetting.INSTANCE.getValue().inviter_battle_info_retry_count) {
                        return;
                    }
                    ((C76279Twh) afS8S1110000_13.l1).LJJI();
                    ((C76279Twh) afS8S1110000_13.l1).LJIJI(afS8S1110000_13.s0);
                    return;
                }
                if (valueOf.intValue() == 3) {
                    ((C76279Twh) afS8S1110000_13.l1).LJJI();
                    if (o.LJ(afS8S1110000_13.s0, "resume_match")) {
                        C76279Twh c76279Twh4 = (C76279Twh) afS8S1110000_13.l1;
                        c76279Twh4.getClass();
                        C76280Twi c76280Twi4 = C76265TwT.LIZ;
                        Long l6 = battleInfoResponse.battleId;
                        if (l6 != null) {
                            j2 = l6.longValue();
                        } else {
                            j2 = 0;
                        }
                        c76280Twi4.LJJLI = j2;
                        c76280Twi4.LJIILIIL(battleInfoResponse.setting);
                        Map<Long, BattleUserArmies> map3 = battleInfoResponse.armies;
                        if (map3 != null && (!map3.isEmpty())) {
                            c76279Twh4.LJJJ(map3, 0L, 0L, false);
                        }
                        long value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue() + AbstractC76282Twk.LJFF();
                        if (value > 0) {
                            c76280Twi4.LJJIJIIJI = value;
                        }
                        C76271TwZ.LIZ.LJLJI();
                        Map<Long, BattleResult> map4 = battleInfoResponse.resultMap;
                        Map<Long, BattleComboInfo> map5 = battleInfoResponse.battleCombos;
                        BattleSetting battleSetting3 = battleInfoResponse.setting;
                        if (battleSetting3 != null) {
                            i = battleSetting3.status;
                        } else {
                            i = 3;
                        }
                        c76279Twh4.LJJ(14, "resume_match", map4, map5, i);
                        return;
                    }
                    ((C76279Twh) afS8S1110000_13.l1).LJIJI(afS8S1110000_13.s0);
                    return;
                }
            }
            ((C76279Twh) afS8S1110000_13.l1).LJJI();
            ((C76279Twh) afS8S1110000_13.l1).LJIJI(afS8S1110000_13.s0);
            return;
        }
        ((C76279Twh) afS8S1110000_13.l1).LJJI();
        ((C76279Twh) afS8S1110000_13.l1).LJIJI(afS8S1110000_13.s0);
    }

    public static final void accept$1(AfS8S1110000_13 afS8S1110000_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (o.LJ(afS8S1110000_13.s0, "each_other")) {
            str = "open_result";
        } else {
            str = afS8S1110000_13.s0;
        }
        C76272Twa.LJJIIJZLJL(str, th, afS8S1110000_13.z2);
        C76279Twh c76279Twh = (C76279Twh) afS8S1110000_13.l1;
        String str2 = afS8S1110000_13.s0;
        c76279Twh.getClass();
        if (!C76279Twh.LJIJJ(str2) || ((C76279Twh) afS8S1110000_13.l1).LJIILIIL >= LiveTwoMatchLinkOptSetting.INSTANCE.getValue().inviter_battle_info_retry_count) {
            ((C76279Twh) afS8S1110000_13.l1).LJJI();
            ((C76279Twh) afS8S1110000_13.l1).LJIJI(afS8S1110000_13.s0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void accept$2(AfS8S1110000_13 afS8S1110000_13, Object obj) {
        Long l;
        String str;
        C76280Twi c76280Twi;
        int i;
        long j;
        long j2;
        long j3;
        User owner;
        if (((C76279Twh) afS8S1110000_13.l1).LJIILIIL >= LiveTwoMatchLinkOptSetting.INSTANCE.getValue().inviter_battle_info_retry_count) {
            ((C76279Twh) afS8S1110000_13.l1).LJJI();
            return;
        }
        C76279Twh c76279Twh = (C76279Twh) afS8S1110000_13.l1;
        c76279Twh.LJIILIIL++;
        String str2 = afS8S1110000_13.s0;
        boolean z = afS8S1110000_13.z2;
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "startBattleByBattleInfo method");
        if (!C76279Twh.LJIJJ(str2)) {
            if (C76265TwT.LIZ.LJ().compareTo(EnumC76178Tv4.START) < 0) {
                return;
            }
            c76279Twh.LJJI();
            c76279Twh.LJIJI(str2);
            return;
        }
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "checkStateByScene pass");
        InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) c76279Twh.LIZLLL;
        Long l2 = null;
        if (interfaceC76313TxF != null) {
            l = Long.valueOf(interfaceC76313TxF.LJIL());
        } else {
            l = null;
        }
        InterfaceC76313TxF interfaceC76313TxF2 = (InterfaceC76313TxF) c76279Twh.LIZLLL;
        if (interfaceC76313TxF2 != null) {
            l2 = Long.valueOf(interfaceC76313TxF2.LIZ());
        }
        if (o.LJ(str2, "each_other")) {
            str = "open_result";
        } else {
            str = str2;
        }
        C76272Twa.LJJIIZI(str, z);
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestBattleInfo battleId = ");
        LIZ.append(c76280Twi.LIZIZ());
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
        switch (str2.hashCode()) {
            case -1420548720:
                if (str2.equals("cancel_battle_info")) {
                    i = 12;
                    break;
                }
                i = 10;
                break;
            case -520945838:
                if (str2.equals("each_other")) {
                    i = 13;
                    break;
                }
                i = 10;
                break;
            case 1026886431:
                if (str2.equals("inviter_battle_info")) {
                    i = 11;
                    break;
                }
                i = 10;
                break;
            case 1838837555:
                if (str2.equals("resume_match")) {
                    i = 14;
                    break;
                }
                i = 10;
                break;
            default:
                i = 10;
                break;
        }
        LinkBattleApi linkBattleApi = (LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        long LIZIZ = c76280Twi.LIZIZ();
        Room room = c76279Twh.LJ;
        if (room != null && (owner = room.getOwner()) != null) {
            j3 = owner.getId();
        } else {
            Room room2 = c76279Twh.LJ;
            if (room2 != null) {
                j3 = room2.getOwnerUserId();
            } else {
                j3 = 0;
            }
        }
        C1EW.LIZ(linkBattleApi.getInfo(j, j2, LIZIZ, j3, i)).LJJJLIIL(new AfS8S1110000_13(c76279Twh, str2, z, 0), new AfS8S1110000_13(c76279Twh, str2, z, 1));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS8S1110000_13(X.C76279Twh r2, java.lang.String r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            r0.z2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.s0 = r3
            r0.z2 = r4
            r0.l1 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS8S1110000_13.<init>(X.Twh, java.lang.String, boolean, int):void");
    }
}
