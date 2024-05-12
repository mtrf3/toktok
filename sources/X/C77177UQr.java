package X;

import Y.AfS1S1310000_13;
import Y.IDaS222S0100000_13;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.experiment.NewPopupRules;
import com.ss.android.ugc.aweme.experiment.Rules;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import java.sql.Timestamp;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UQr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77177UQr {
    public static boolean LIZIZ;
    public static C73411SrX LIZJ;
    public static C73411SrX LIZLLL;
    public static C73411SrX LJ;
    public static URB LJFF;
    public static final C77177UQr LIZ = new C77177UQr();
    public static final URD LJI = URD.LIZ;

    public static Keva LJIIIIZZ() {
        return UQ2.LIZ().LIZ;
    }

    public static boolean LJIIIZ() {
        return LJIIJ(1) || LJIIJ(2);
    }

    public static boolean LIZ() {
        C55719Ltr.LIZ.getClass();
        if (!C55719Ltr.LIZ().addFFPToNecessaryScene) {
            return true;
        }
        if (System.currentTimeMillis() - LJIIIIZZ().getLong("last_click_cancel_time", 0L) > 86400000) {
            return true;
        }
        return false;
    }

    public static RelationFreqControlData LJII() {
        int i = LJIIIIZZ().getInt("reask_count", 0) + LJIIIIZZ().getInt("rules_major_stage", 0);
        long j = LJIIIIZZ().getLong("last_show_contact_time", 0L);
        return new RelationFreqControlData(i, LJIIIIZZ().getInt("rules_major_stage", 0), LJIIIIZZ().getInt("reask_count", 0), Math.max(LJIIIIZZ().getInt("total_pop_up_count", 0), LJIIIIZZ().getInt("reask_count", 0) + LJIIIIZZ().getInt("rules_major_stage", 0)), j);
    }

    public static void LJIILJJIL() {
        URB urb = LJFF;
        if (urb != null) {
            urb.cV();
        }
        LJFF = null;
    }

    public static boolean LJIIJJI() {
        boolean z;
        if (LJIIIIZZ().getBoolean("finish_contact_permission_process", false) && LJIIIIZZ().getBoolean("finish_facebook_permission_process", false)) {
            z = true;
        } else {
            z = false;
        }
        if ((!LJIIIIZZ().getBoolean("has_go_through_process", false) && !z && LJIIIIZZ().getInt("rules_major_stage", 0) < 4) || C53154Kta.LIZ().group == 0) {
            return false;
        }
        return true;
    }

    public static UQF LIZLLL(int i) {
        boolean z;
        boolean z2 = false;
        if (!((RBX) HG3.LJIILL()).isLogin() || !URL.LIZ()) {
            LJI.getClass();
            return new UQF(false, false, i, 8);
        }
        UPZ upz = UPZ.LIZ;
        if (!upz.LIZJ()) {
            LJI.getClass();
        } else {
            LJI.getClass();
        }
        C77134UPa c77134UPa = C77134UPa.LIZ;
        if (!c77134UPa.LIZJ()) {
            LJI.getClass();
        } else {
            LJI.getClass();
        }
        if (LIZ() && !upz.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (LIZ() && !c77134UPa.LIZJ()) {
            z2 = true;
        }
        return new UQF(z, z2, i, 8);
    }

    public static boolean LJIIJ(int i) {
        OSZ<Boolean, Long> LJ2;
        ISocialFriendsService LJJIL = C77266UUc.LIZIZ.LJJIL();
        if (LJJIL != null && (LJ2 = LJJIL.LJ(i)) != null && LJ2.getFirst().booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = LJ2.getSecond().longValue();
            LIZ.getClass();
            if (currentTimeMillis < (C51788KUe.LIZ().interval * 86400000) + longValue) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(int i, int i2) {
        boolean LIZJ2;
        NewPopupRules LIZ2 = C53154Kta.LIZ();
        if (LIZ2.rules.isEmpty() || LIZ2.interval.isEmpty()) {
            LJI.getClass();
            return false;
        }
        if (LJIIIIZZ().getInt("reask_count", 0) >= C53154Kta.LIZ().frequency) {
            LJI.getClass();
            return false;
        }
        long j = LJIIIIZZ().getLong("last_show_contact_time", 0L);
        long j2 = LJIIIIZZ().getLong("sync_off_contact_time", 0L);
        long j3 = LJIIIIZZ().getLong("sync_off_facebook_time", 0L);
        if (j2 <= j3) {
            j2 = j3;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j <= j2) {
            j = j2;
        }
        long j4 = currentTimeMillis - j;
        int i3 = 0;
        while (i3 < C53154Kta.LIZ().rules.size() && j4 > ((Number) ListProtector.get(C53154Kta.LIZ().interval, i3)).longValue() * 86400000) {
            j4 -= ((Number) ListProtector.get(C53154Kta.LIZ().interval, i3)).longValue() * 86400000;
            i3++;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                LIZJ2 = C77134UPa.LIZ.LIZJ();
            }
            LJI.getClass();
            return false;
        }
        LIZJ2 = UPZ.LIZ.LIZJ();
        if (!LIZJ2) {
            if (LJIIIZ()) {
                LJI.getClass();
                return false;
            }
            if (i3 <= 0 || !((List) ListProtector.get(C53154Kta.LIZ().rules, i3 - 1)).contains(Integer.valueOf(i))) {
                LJI.getClass();
                return false;
            }
            LJI.getClass();
            return true;
        }
        LJI.getClass();
        return false;
    }

    public static boolean LIZJ(int i, int i2) {
        boolean z;
        int i3 = LJIIIIZZ().getInt("rules_major_stage", 0);
        long j = (C51788KUe.LIZ().interval * 86400000) + LJIIIIZZ().getLong("last_show_contact_time", 0L);
        long currentTimeMillis = System.currentTimeMillis() - j;
        boolean LIZJ2 = UPZ.LIZ.LIZJ();
        if (LIZJ2) {
            LJIIIIZZ().storeBoolean("finish_contact_permission_process", true);
        }
        boolean z2 = LJIIIIZZ().getBoolean("finish_contact_permission_process", false);
        boolean LIZJ3 = C77134UPa.LIZ.LIZJ();
        if (LIZJ3) {
            LJIIIIZZ().storeBoolean("finish_facebook_permission_process", true);
        }
        boolean z3 = LJIIIIZZ().getBoolean("finish_facebook_permission_process", false);
        if (LIZJ2 && LIZJ3) {
            LJIIIIZZ().storeBoolean("has_go_through_process", true);
        }
        if (i2 == 1 ? !(z2 || LIZJ2) : !(i2 == 2 && (z3 || LIZJ3))) {
            z = false;
        } else {
            z = true;
        }
        if (i3 >= 4) {
            String reason = "Unknown interest rule, major stage overmuch: " + i3;
            LJI.getClass();
            o.LJIIIZ(reason, "reason");
            return false;
        }
        if (currentTimeMillis < 0) {
            URD urd = LJI;
            String reason2 = "Unknown interest rule, interval not ok, next show time:" + new Timestamp(j);
            urd.getClass();
            o.LJIIIZ(reason2, "reason");
            return false;
        }
        if (LJIIIZ()) {
            LJI.getClass();
            return false;
        }
        if (z) {
            LJI.getClass();
            return false;
        }
        if (C51788KUe.LIZ().rules.isEmpty()) {
            LJI.getClass();
            return false;
        }
        int intValue = ((Number) ListProtector.get(((Rules) ListProtector.get(C51788KUe.LIZ().rules, i3)).duration, 0)).intValue();
        int i4 = 0;
        while (true) {
            long j2 = intValue * 86400000;
            if (currentTimeMillis <= j2 || i4 >= ((Rules) ListProtector.get(C51788KUe.LIZ().rules, i3)).stage.size() - 1) {
                break;
            }
            currentTimeMillis -= j2;
            i4++;
            intValue = ((Number) ListProtector.get(((Rules) ListProtector.get(C51788KUe.LIZ().rules, i3)).duration, i4)).intValue();
        }
        if (((Number) ListProtector.get(((Rules) ListProtector.get(C51788KUe.LIZ().rules, i3)).stage, i4)).intValue() != i) {
            LJI.getClass();
            return false;
        }
        LJI.getClass();
        return true;
    }

    public static UQF LJ(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (LIZIZ && !z) {
            LJI.getClass();
            return new UQF(false, false, i, 8);
        }
        if (C51788KUe.LIZ().group == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!((RBX) HG3.LJIILL()).isLogin() || !URL.LIZ()) {
            LJI.getClass();
            return new UQF(false, false, i, 8);
        }
        if (LJIIJJI()) {
            if (LIZ() && LIZIZ(i, 1)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (LIZ() && LIZIZ(i, 2)) {
                z5 = true;
            }
            return new UQF(z4, z5, i, 8);
        }
        if (z2) {
            if (LIZ() && LIZJ(i, 1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (LIZ() && LIZJ(i, 2)) {
                z5 = true;
            }
            return new UQF(z3, z5, i, 8);
        }
        LJI.getClass();
        return new UQF(false, false, 0, 12);
    }

    public static void LJIILLIIL(UQF popupConfig, String enterFrom, String enterMethod, int i, ActivityC45651qj activityC45651qj, URA ura) {
        int i2;
        int i3 = i;
        o.LJIIIZ(popupConfig, "popupConfig");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        boolean LJIIJJI = LJIIJJI();
        if (LJIIIZ()) {
            URD urd = LJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(enterFrom);
            LIZ2.append('-');
            LIZ2.append(enterMethod);
            String scene = X1D.LIZIZ(LIZ2);
            urd.getClass();
            o.LJIIIZ(scene, "scene");
            PopupManager.LIZJ(C246509lu.class);
            if (ura != null) {
                ura.LIZIZ();
                return;
            }
            return;
        }
        int i4 = LJIIIIZZ().getInt("last_permission_pop_up_type", 0);
        int i5 = LJIIIIZZ().getInt("contact_pop_up_count", 0);
        if (i4 == 1 || (i4 == 0 && i5 != 0)) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (LJIIJJI || C00F.LIZ(31744, 0, "permission_pop_up_ask_specific_platform", true) == 1) {
            if (i3 == 0) {
                C85990Xow.LIZ.getClass();
                if (C85990Xow.LJIIL()) {
                    i3 = 1;
                }
            }
            LJIILL(i3, activityC45651qj, popupConfig, ura, enterFrom, enterMethod, LJIIJJI);
        }
        i3 = i2;
        LJIILL(i3, activityC45651qj, popupConfig, ura, enterFrom, enterMethod, LJIIJJI);
    }

    public static void LJIIZILJ(String str, int i, boolean z, URA ura, UR7 ur7, boolean z2) {
        LIZIZ = false;
        LJIIIIZZ().storeLong("last_show_contact_time", System.currentTimeMillis());
        LJIIIIZZ().storeInt("last_permission_pop_up_type", i);
        if (UR8.LIZ[ur7.ordinal()] == 1) {
            if (z) {
                LJIIIIZZ().storeInt("reask_count", LJIIIIZZ().getInt("reask_count", 0) + 1);
            } else {
                LJIIIIZZ().storeInt("rules_major_stage", LJIIIIZZ().getInt("rules_major_stage", 0) + 1);
                LJIIIIZZ().storeInt("contact_pop_up_count", LJIIIIZZ().getInt("contact_pop_up_count", 0) + 1);
            }
        }
        if (o.LJ(str, "personal_homepage")) {
            Z8A.LIZIZ.updateProfilePermission(false);
        }
        if (ura != null) {
            ura.LIZ();
        }
        if (!z2) {
            PopupManager.LIZJ(C246509lu.class);
        }
    }

    public static void LJFF(String str, String str2, ActivityC45651qj activityC45651qj, boolean z, URA ura, java.util.Map map, UR7 ur7) {
        boolean z2;
        if (LJFF == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("is_passive", "on");
        Object obj = map.get("is_followed_pop_up");
        if (obj != null) {
            oszArr[1] = new OSZ("is_followed_pop_up", obj);
            LIZJ = (C73411SrX) T3Q.LIZIZ(activityC45651qj, ContactUFR.class, curUserId, str, str2, z2, C113554cx.LJJL(oszArr)).LJJJLL(new AfS1S1310000_13(str, z, ura, ur7, map, 0), UR0.LJLIL, UR2.LIZ);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static void LJI(String str, String str2, ActivityC45651qj activityC45651qj, boolean z, URA ura, java.util.Map map, UR7 ur7) {
        boolean z2;
        if (LJFF == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String uid = AV1.LIZIZ().getUid();
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("is_passive", "on");
        Object obj = map.get("is_followed_pop_up");
        if (obj != null) {
            oszArr[1] = new OSZ("is_followed_pop_up", obj);
            LIZLLL = (C73411SrX) T3Q.LIZIZ(activityC45651qj, UPG.class, uid, str, str2, z2, C113554cx.LJJL(oszArr)).LJJJLL(new AfS1S1310000_13(str, z, ura, ur7, map, 1), UR1.LJLIL, UR3.LIZ);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static void LJIIL(String str, String str2, ActivityC45651qj activityC45651qj, boolean z, URA ura, java.util.Map map, UR7 ur7) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj), null, null, new C77182UQw(map, activityC45651qj, str, str2, ur7, z, ura, null), 3);
    }

    public static void LJIILIIL(String str, String str2, ActivityC45651qj activityC45651qj, boolean z, URA ura, java.util.Map map, UR7 ur7) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj), null, null, new C77183UQx(map, activityC45651qj, str, str2, ur7, z, ura, null), 3);
    }

    public static void LJIILL(int i, ActivityC45651qj activityC45651qj, UQF popupConfig, URA ura, String enterFrom, String enterMethod, boolean z) {
        Aweme aweme;
        String authorUid;
        MainBusinessAbility LJIJJLI;
        boolean z2;
        Class cls;
        o.LJIIIZ(popupConfig, "popupConfig");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (!popupConfig.LJLIL && !popupConfig.LJLILLLLZI) {
            PopupManager.LIZJ(C246509lu.class);
            if (ura != null) {
                ura.LIZIZ();
                return;
            }
            return;
        }
        LIZIZ = true;
        if (LJFF == null && !o.LJ(enterFrom, "chat_list")) {
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("enter_from", enterFrom);
            c40883G2t.LIZLLL("enter_method", enterMethod);
            Bundle bundle = (Bundle) c40883G2t.LIZ;
            C57738MlK c57738MlK = C57738MlK.LIZIZ;
            o.LJIIIIZZ(bundle, "bundle");
            LJFF = c57738MlK.LIZ.LIZ(activityC45651qj, bundle);
        }
        boolean z3 = popupConfig.LJLIL;
        String str = null;
        if (z3 && popupConfig.LJLILLLLZI) {
            if (C52926Kpu.LIZ()) {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj), null, null, new C77181UQv(activityC45651qj, i, enterFrom, enterMethod, popupConfig.LJLJJI, z, ura, null), 3);
            } else {
                UR7 ur7 = popupConfig.LJLJJI;
                C34K c34k = new C34K();
                if (LJFF == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i == 2) {
                    cls = UPG.class;
                } else {
                    cls = ContactUFR.class;
                }
                LJ = (C73411SrX) T3Q.LIZIZ(activityC45651qj, cls, ((RBX) HG3.LJIILL()).getCurUserId(), enterFrom, enterMethod, z2, E2C.LIZJ("is_passive", "on")).LJJJLL(new C77179UQt(i, enterFrom, enterMethod, activityC45651qj, z, ura, ur7, c34k), UR9.LJLIL, new IDaS222S0100000_13(c34k, 15));
            }
        } else if (z3) {
            if (C52926Kpu.LIZ()) {
                LJIIL(enterFrom, enterMethod, activityC45651qj, z, ura, E2C.LIZJ("is_followed_pop_up", CardStruct.IStatusCode.DEFAULT), popupConfig.LJLJJI);
            } else {
                LJFF(enterFrom, enterMethod, activityC45651qj, z, ura, E2C.LIZJ("is_followed_pop_up", CardStruct.IStatusCode.DEFAULT), popupConfig.LJLJJI);
            }
        } else if (popupConfig.LJLILLLLZI) {
            C85990Xow.LIZ.getClass();
            if (!C85990Xow.LJIIL() || i == 2) {
                if (C52926Kpu.LIZ()) {
                    LJIILIIL(enterFrom, enterMethod, activityC45651qj, z, ura, E2C.LIZJ("is_followed_pop_up", CardStruct.IStatusCode.DEFAULT), popupConfig.LJLJJI);
                } else {
                    LJI(enterFrom, enterMethod, activityC45651qj, z, ura, E2C.LIZJ("is_followed_pop_up", CardStruct.IStatusCode.DEFAULT), popupConfig.LJLJJI);
                }
            }
        }
        MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj);
        if (LJJLIIIJJI != null && (LJIJJLI = C1JD.LJIJJLI(LJJLIIIJJI)) != null) {
            aweme = LJIJJLI.getCurrentAweme();
        } else {
            aweme = null;
        }
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        if (aweme != null) {
            str = aweme.getAid();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
            str2 = authorUid;
        }
        LJJIJLIJ.LJIILJJIL(enterFrom, str, str2, "3");
    }
}
