package X;

import com.ss.android.ugc.aweme.comment.experiment.VideoViewerMaxFollowersConfig;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.7GH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GH {
    public static boolean LIZ = true;

    public static final boolean LIZIZ() {
        int intValue = ((Number) C183417Ht.LIZ.getValue()).intValue();
        int LIZ2 = C7EJ.LIZ(LJFF("local_pop_up_show_frequency"), 0);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("autoShowAuthPopUpIfNeed count:");
        LIZ3.append(intValue);
        LIZ3.append("  local:");
        LIZ3.append(LIZ2);
        C71Y.LIZ("VideoViewerAuthControlHelper", X1D.LIZIZ(LIZ3));
        if (LIZ2 >= intValue) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL() {
        int i;
        if ((((Number) C7GK.LIZ.getValue()).intValue() & 1) != 1) {
            return false;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null) {
            i = curUser.historyMaxFollowerCount;
        } else {
            i = 0;
        }
        if (i < ((VideoViewerMaxFollowersConfig) C7GN.LIZIZ.getValue()).getEnabledMaxFollowers() && !C78966Uyw.LJJIJ().LIZIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ() {
        boolean z;
        boolean z2;
        long LIZIZ = C7EJ.LIZIZ(LJFF("last_show_time"));
        long LIZIZ2 = C7EJ.LIZIZ(LJFF("last_click_tips_time"));
        if (LIZJ(LIZIZ, System.currentTimeMillis()) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (LIZJ(LIZIZ2, System.currentTimeMillis()) != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("showTipsIfNeed isTheSameDayAndNotClickYet showInSameDay:[{");
        LIZ2.append(z);
        LIZ2.append("}] hasNotClickToday:[");
        LIZ2.append(z2);
        LIZ2.append(']');
        C71Y.LIZLLL("VideoViewerAuthControlHelper", X1D.LIZIZ(LIZ2));
        if (z && z2) {
            return true;
        }
        return false;
    }

    public static final boolean LJI() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("video_view_history")) == null || M.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r2.equals("zh-hant") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r2.equals("zh-hans") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r2.equals("ko") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r2.equals("en") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r2.equals("cs") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r2.equals("bn") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJII() {
        /*
            com.ss.android.ugc.aweme.setting.services.ISettingService r0 = com.ss.android.ugc.aweme.setting.services.SettingServiceImpl.LIZ()
            java.lang.String r3 = r0.getAppLanguage()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r1 = r2.hashCode()
            r0 = 3148(0xc4c, float:4.411E-42)
            if (r1 == r0) goto L76
            r0 = 3184(0xc70, float:4.462E-42)
            if (r1 == r0) goto L6d
            r0 = 3241(0xca9, float:4.542E-42)
            if (r1 == r0) goto L64
            r0 = 3428(0xd64, float:4.804E-42)
            if (r1 == r0) goto L5b
            switch(r1) {
                case -371515459: goto L52;
                case -371515458: goto L49;
                default: goto L2a;
            }
        L2a:
            r2 = 1
        L2b:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "lan:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " hitLan:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "VideoViewShowIconTab"
            X.C71Y.LIZLLL(r0, r1)
            return r2
        L49:
            java.lang.String r0 = "zh-hant"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7e
            goto L2a
        L52:
            java.lang.String r0 = "zh-hans"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7e
            goto L2a
        L5b:
            java.lang.String r0 = "ko"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7e
            goto L2a
        L64:
            java.lang.String r0 = "en"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7e
            goto L2a
        L6d:
            java.lang.String r0 = "cs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L7e
            goto L2a
        L76:
            java.lang.String r0 = "bn"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2a
        L7e:
            r2 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7GH.LJII():boolean");
    }

    public static final boolean LIZ(Aweme aweme) {
        if (!C7GI.LIZ() ? !(!LJIIIIZZ(aweme) || !LJIIJ(aweme) || !LJI() || LJ(aweme) <= 0) : !(!LJIIIIZZ(aweme) || !LJIIJ(aweme) || LJ(aweme) <= 0)) {
            return true;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("A ");
        LIZ2.append(LJIIIIZZ(aweme));
        LIZ2.append(" B ");
        LIZ2.append(LJIIJ(aweme));
        LIZ2.append(" C ");
        LIZ2.append(LJI());
        LIZ2.append(" D ");
        LIZ2.append(LJ(aweme));
        String info = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(info, "info");
        return false;
    }

    public static final long LJ(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            return statistics.getPlayCount();
        }
        return 0L;
    }

    public static String LJFF(String str) {
        StringBuilder LJFF = C72972SkS.LJFF(str, '_');
        return UPJ.LJ((RBX) HG3.LJIILL(), LJFF, LJFF);
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        if (aweme == null || !HG3.LJIILL().isMe(aweme.getAuthorUid())) {
            return false;
        }
        return LIZLLL();
    }

    public static final boolean LJIIJ(Aweme aweme) {
        String str;
        StringBuilder LIZ2 = X1D.LIZ();
        Long l = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(" isVideoWithin7Days createTime: ");
        if (aweme != null) {
            l = Long.valueOf(aweme.getCreateTime());
        }
        LIZ2.append(l);
        C71Y.LIZ("VideoViewerAuthControlHelper", X1D.LIZIZ(LIZ2));
        if (aweme == null || System.currentTimeMillis() - (aweme.getCreateTime() * 1000) > 604800000) {
            return false;
        }
        return true;
    }

    public static final long LIZJ(long j, long j2) {
        long j3 = 86400000;
        long j4 = (j2 - j) / j3;
        long j5 = j4 + 1;
        if (new Date((j3 * j4) + j).getDay() != new Date(j2).getDay()) {
            return j5 + 1;
        }
        return j5;
    }
}
