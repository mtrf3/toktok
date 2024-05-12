package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import kotlin.jvm.internal.AqS0S2001000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197387os implements LLE {
    public static boolean LJLILLLLZI;
    public static boolean LJLJJI;
    public static int LJLJJLL;
    public static boolean LJLJL;
    public static int LJLJLJ;
    public static final C197387os LJLIL = new C197387os();
    public static String LJLJI = "";
    public static long LJLJJL = -1;

    public static final IFriendsTabLayoutAbility LIZLLL() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            return C53976LGi.LIZJ(LIZLLL);
        }
        return null;
    }

    public static void LIZIZ(Bundle bundle) {
        String str;
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("monitorHide args: ");
        LIZ.append(bundle);
        C7XD.LIZ("NowFeedMonitor", X1D.LIZIZ(LIZ));
        if (LJLJJL != -1) {
            long currentTimeMillis = System.currentTimeMillis() - LJLJJL;
            if (LJLJLJ == 1) {
                str = "now_explore_page";
            } else {
                str = "homepage_now";
            }
            if (bundle != null) {
                z = bundle.getBoolean("is_from_inbox");
            } else {
                z = false;
            }
            C7MK.LJI("stay_time", new C197407ou(str, currentTimeMillis, z));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stay_time for now ");
            V1I.LIZJ(LIZ2, currentTimeMillis, ", is new page ", z);
            C7XD.LIZ("NowFeedMonitor", X1D.LIZIZ(LIZ2));
        }
        LJLJJL = -1L;
        C196157mt.LIZ = "";
    }

    public final void LIZJ(int i) {
        if (C00F.LIZ(31744, 1, "now_feed_explore_enable", true) != 1 || LJLJLJ == i) {
            return;
        }
        if (i == 1) {
            C7MK.LJI("enter_now_explore_page", C196187mw.LJLIL);
        }
        LIZIZ(null);
        LJLJLJ = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("monitorShow args: ");
        LIZ.append((Object) null);
        C7XD.LIZ("NowFeedMonitor", X1D.LIZIZ(LIZ));
        if (LJLJJI) {
            C7XD.LIZ("NowFeedMonitor", "reportHotStartPushLanding just return");
            LJLJJI = false;
            return;
        }
        LJLJJL = System.currentTimeMillis();
        IFriendsTabLayoutAbility LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.ys(-1);
        }
        boolean LJ = o.LJ("", "chat");
        if (LJLILLLLZI) {
            LIZ(0, LJLJI, "publish_landing");
            LJLILLLLZI = false;
        } else if (o.LJ("", "chat_share_invite")) {
            LIZ(0, "chat_share_invite", "chat_share_invite");
        } else {
            if (!LJ) {
                return;
            }
            LIZ(0, "chat", "chat_share_video");
        }
    }

    public static void LIZ(int i, String enterFrom, String enterMethod) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("mobEnterHomepageNow enterFrom: ", enterFrom, " enterMethod: ", enterMethod, " numberCount: ");
        LIZLLL.append(LJLJJLL);
        C7XD.LIZ("NowFeedMonitor", X1D.LIZIZ(LIZLLL));
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        Long l = C196157mt.LIZJ;
        if (l != null && l.longValue() == -1) {
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            C196157mt.LIZJ = valueOf;
            C196157mt.LIZLLL = valueOf;
            C196157mt.LJ = enterFrom;
        }
        C7MK.LJI("enter_homepage_now", new AqS0S2001000_3(enterFrom, enterMethod, i, 0));
        C196157mt.LIZ = enterFrom;
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        IFriendsTabLayoutAbility LIZLLL;
        String str4;
        String str5;
        String string;
        String str6;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTabChanged from ");
        LIZ.append(str2);
        LIZ.append(" to ");
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(bundle);
        C7XD.LIZ("NowFeedMonitor", X1D.LIZIZ(LIZ));
        ActivityC45651qj LIZLLL2 = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL2 != null && o.LJ(str, "FRIENDS_TAB") && (LIZLLL = LIZLLL()) != null && LIZLLL.ma("SOCIAL_NOWS")) {
            if (bundle != null && bundle.getBoolean("now_card")) {
                C7XD.LIZ("NowFeedMonitor", "switch tab by now card just return");
                return;
            }
            String str7 = "";
            if (bundle == null || (str4 = bundle.getString("now_unique_id")) == null) {
                str4 = "";
            }
            if (str4.length() > 0) {
                C7XD.LIZ("NowFeedMonitor", "switch tab by reflow just return");
                return;
            }
            if (str2 == null) {
                str5 = "";
            } else {
                str5 = str2;
            }
            String LJ = C54024LIe.LJ(LIZLLL2, str5, null);
            if (LJLJJI) {
                C7XD.LIZ("NowFeedMonitor", "switch tab by hot push landing just return");
                LJLJJI = false;
                return;
            }
            LJLJJLL = 0;
            if (LJLJL) {
                if (str2 == null) {
                    LIZ(0, LJ, "push_landing");
                }
                LJLILLLLZI = false;
            } else {
                if (o.LJ(LJ, "notification_page")) {
                    if (bundle == null || (str6 = bundle.getString("enter_method")) == null) {
                        str6 = "chat_share_video";
                    }
                    LIZ(0, LJ, str6);
                    return;
                }
                if (bundle != null && (string = bundle.getString("incentive_enter_method")) != null) {
                    str7 = string;
                }
                if (!C78857UxB.LJJJIL(str7)) {
                    return;
                }
                LIZ(0, LJ, str7);
            }
        }
    }
}
