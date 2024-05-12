package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;

/* renamed from: X.LHr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54011LHr {
    public static long LIZ;
    public static long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;

    public static OSZ LIZ() {
        if (C54029LIj.LIZIZ.LJJIJL()) {
            return new OSZ(1, "is_top_tab");
        }
        return new OSZ(0, "is_top_tab");
    }

    public static void LIZLLL(String str) {
        long currentTimeMillis = System.currentTimeMillis() - LIZ;
        LIZ = 0L;
        FMX.LJIILL("homepage_friends_notice", new OSZ(str, "enter_from"), new OSZ("red_dot", "notice_type"), new OSZ("click", "action_type"), new OSZ(Long.valueOf(currentTimeMillis), "show_click_interval_ms"), new OSZ("friends", "icon"), LIZ());
    }

    public static void LJ(String str) {
        if (LIZ == 0) {
            LIZ = System.currentTimeMillis();
        }
        FMX.LJIILL("homepage_friends_notice", new OSZ(str, "enter_from"), new OSZ("red_dot", "notice_type"), new OSZ("show", "action_type"), new OSZ("friends", "icon"), LIZ());
    }

    public static void LIZIZ(int i, int i2, String str) {
        String str2;
        IBottomFriendsTabAvatarAbility LJIIJ;
        long currentTimeMillis = System.currentTimeMillis() - LIZ;
        LIZ = 0L;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null && (LJIIJ = C53976LGi.LJIIJ(LIZLLL)) != null && LJIIJ.isShowing()) {
            str2 = "head_number";
        } else {
            str2 = "number_dot";
        }
        FMX.LJIILL("homepage_friends_notice", new OSZ(str, "enter_from"), new OSZ(str2, "notice_type"), new OSZ("click", "action_type"), new OSZ(Long.valueOf(currentTimeMillis), "show_click_interval_ms"), new OSZ(Integer.valueOf(i), "number_cnt"), new OSZ("friends", "icon"), new OSZ(Integer.valueOf(i2), "friends_tab_number_cnt"), LIZ());
    }

    public static void LJFF(int i, String str, String str2, boolean z) {
        if (z) {
            LIZIZ = System.currentTimeMillis();
            FMX.LJIILL("homepage_2tab_top_notice", new OSZ(str, "enter_from"), new OSZ(Integer.valueOf(i), "number_cnt"), new OSZ("show", "action_type"), new OSZ(str2, "tab_kind"));
        } else {
            FMX.LJIILL("homepage_2tab_top_notice", new OSZ(str, "enter_from"), new OSZ(Long.valueOf(System.currentTimeMillis() - LIZIZ), "show_dismiss_interval_ms"), new OSZ(Integer.valueOf(i), "number_cnt"), new OSZ("dismiss", "action_type"), new OSZ(str2, "tab_kind"));
        }
    }

    public static void LIZJ(int i, String str, int i2, boolean z, EnumC36206EIw enumC36206EIw) {
        String str2;
        int i3;
        if (LIZ == 0) {
            LIZ = System.currentTimeMillis();
        }
        if (z) {
            str2 = "head_number";
        } else {
            str2 = "number_dot";
        }
        OSZ LIZ2 = LIZ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("notice_type", str2);
        c188727au.LIZLLL(i, "number_cnt");
        c188727au.LJIIIZ("action_type", "show");
        c188727au.LJIIIZ("icon", "friends");
        c188727au.LIZLLL(i2, "friends_tab_number_cnt");
        c188727au.LJFF(LIZ2.getFirst(), (String) LIZ2.getSecond());
        if (enumC36206EIw != null) {
            if (enumC36206EIw == EnumC36206EIw.COLD_START) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c188727au.LIZLLL(i3, "is_from_coldlaunch");
            if (i3 != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - C56672Kh.LIZ().LJJIIZI;
                long j2 = elapsedRealtime - C56672Kh.LIZ().LJJIJ;
                c188727au.LJ(j, "launch_to_show");
                c188727au.LJ(j2, "firstframe_to_show");
            }
        }
        FMX.LJIIL("homepage_friends_notice", c188727au.LIZ);
    }
}
