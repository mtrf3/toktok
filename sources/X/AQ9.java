package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.ViewerEntranceInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQ9 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(User user, boolean z) {
        boolean z2;
        ViewerEntranceInfo viewerEntranceInfo;
        if (user != null && (viewerEntranceInfo = user.viewerEntranceInfo) != null) {
            z2 = viewerEntranceInfo.getCanShowEntrance();
        } else {
            z2 = false;
        }
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        if (!z2 || !isLogin || !z) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Context context, InterfaceC56322M8o pagePopupScene) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(pagePopupScene, "pagePopupScene");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            PopupManager.LJIIL(new AQB(pagePopupScene, supportFragmentManager, null));
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            c188727au.LJIIIZ("enter_method", "auto_scene");
            c188727au.LJIIIZ("pop_up_type", "one_button");
            FMX.LJIIL("profile_visitor_pop_up_show", c188727au.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.profile.model.User r11, boolean r12, boolean r13) {
        /*
            if (r11 == 0) goto Lc4
            long r0 = r11.getRegisterTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        La:
            r6 = 3
            r10 = 1
            r5 = 0
            if (r0 != 0) goto L9e
        Lf:
            r9 = 1
        L10:
            com.bytedance.keva.Keva r3 = X.C26343AVn.LIZJ()
            java.lang.String r1 = "profile_first_visit_time"
            r0 = 95
            java.lang.StringBuilder r1 = X.C72972SkS.LJFF(r1, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            r0 = 0
            long r7 = r3.getLong(r2, r0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L8b
        L37:
            r6 = 1
        L38:
            X.AVy r0 = X.C26354AVy.LIZ
            r0.getClass()
            boolean r4 = X.C26354AVy.LIZ()
            boolean r0 = X.AQF.LIZ()
            java.lang.String r3 = "profile_entrance_tips_has_show"
            java.lang.String r2 = "keva_repo_profile_viewer"
            if (r0 != 0) goto L76
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r0 = X.C226788vC.LIZ(r3)
            boolean r0 = r1.getBoolean(r0, r5)
        L57:
            if (r13 == 0) goto L71
            if (r0 == 0) goto L5f
            boolean r0 = X.C26343AVn.LIZJ
            if (r0 == 0) goto L74
        L5f:
            r0 = 1
        L60:
            if (r9 == 0) goto L6f
            if (r6 != 0) goto L6f
            if (r4 == 0) goto L6f
            if (r0 == 0) goto L6f
            boolean r0 = LIZJ(r11, r12)
            if (r0 == 0) goto L6f
        L6e:
            return r10
        L6f:
            r10 = 0
            goto L6e
        L71:
            if (r0 != 0) goto L74
            goto L5f
        L74:
            r0 = 0
            goto L60
        L76:
            java.lang.String r1 = "social"
            java.lang.String r0 = "profile"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            X.0Xp r0 = X.C09160Xo.LIZ(r0)
            X.1Px r0 = X.C25170yn.LIZ(r0, r2)
            boolean r0 = r0.getBoolean(r3, r5)
            goto L57
        L8b:
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            long r0 = (long) r6
            long r0 = r2.toMillis(r0)
            long r3 = r3 - r0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L9c
            goto L37
        L9c:
            r6 = 0
            goto L38
        L9e:
            long r7 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r7 = r7 / r0
            long r0 = r11.getRegisterTime()
            long r7 = r7 - r0
            java.lang.String r0 = "profile_view_permission_popup_new_user_protect_duration"
            int r0 = X.Q7K.LIZIZ(r0, r6)
            long r3 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r1 = r2.toSeconds(r0)
            long r1 = r1 * r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc1
            goto Lf
        Lc1:
            r9 = 0
            goto L10
        Lc4:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQ9.LIZ(com.ss.android.ugc.aweme.profile.model.User, boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.profile.model.User r10, boolean r11, boolean r12) {
        /*
            r9 = 0
            if (r10 == 0) goto L9c
            long r0 = r10.getRegisterTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        Lb:
            r8 = 1
            r5 = 0
            if (r0 != 0) goto L75
        Lf:
            r4 = 1
        L10:
            boolean r0 = X.AQF.LIZ()
            java.lang.String r3 = "profile_viewer_dialog_has_show"
            java.lang.String r2 = "profile_viewer_dialog_keva_repo_name"
            if (r0 != 0) goto L60
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r0 = X.C226788vC.LIZ(r3)
            boolean r3 = r1.getBoolean(r0, r5)
        L26:
            boolean r2 = X.C26149AOb.LIZ()
            com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService r0 = com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl.LJIIIIZZ()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = r0.getPrivacyUserSettings()
            if (r1 == 0) goto L3a
            java.lang.String r0 = "profile_view_history"
            java.lang.Integer r9 = r1.M(r0)
        L3a:
            if (r12 == 0) goto L5b
            if (r3 == 0) goto L42
            boolean r0 = X.C26343AVn.LIZJ
            if (r0 == 0) goto L5e
        L42:
            r1 = 1
        L43:
            boolean r0 = LIZJ(r10, r11)
            if (r0 == 0) goto L51
            if (r4 == 0) goto L51
            if (r1 == 0) goto L51
            if (r2 == 0) goto L51
            if (r9 != 0) goto L53
        L51:
            r8 = 0
        L52:
            return r8
        L53:
            int r1 = r9.intValue()
            r0 = 2
            if (r1 != r0) goto L51
            goto L52
        L5b:
            if (r3 != 0) goto L5e
            goto L42
        L5e:
            r1 = 0
            goto L43
        L60:
            java.lang.String r1 = "social"
            java.lang.String r0 = "profile"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            X.0Xp r0 = X.C09160Xo.LIZ(r0)
            X.1Px r0 = X.C25170yn.LIZ(r0, r2)
            boolean r3 = r0.getBoolean(r3, r5)
            goto L26
        L75:
            long r6 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r6 = r6 / r0
            long r0 = r10.getRegisterTime()
            long r6 = r6 - r0
            java.lang.String r1 = "profile_view_permission_popup_new_user_protect_duration"
            r0 = 3
            int r0 = X.Q7K.LIZIZ(r1, r0)
            long r3 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r1 = r2.toSeconds(r0)
            long r1 = r1 * r3
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L99
            goto Lf
        L99:
            r4 = 0
            goto L10
        L9c:
            r0 = r9
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQ9.LIZIZ(com.ss.android.ugc.aweme.profile.model.User, boolean, boolean):boolean");
    }
}
