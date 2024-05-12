package X;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* renamed from: X.LNe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54154LNe {
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();

    public static final String LIZIZ(Activity activity) {
        int i;
        if (activity == null) {
            return "backpress_virtual_gesture";
        }
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier > 0) {
            i = resources.getInteger(identifier);
        } else {
            i = 0;
        }
        if (LTT.LIZ(activity)) {
            return "backpress_real_icon";
        }
        if (i >= 2 || !LTT.LIZIZ(activity)) {
            return "backpress_virtual_gesture";
        }
        return "backpress_virtual_icon";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    public static final String LIZ(Activity activity, String str) {
        String str2 = (String) ((LinkedHashMap) LIZ).get(str);
        switch (str.hashCode()) {
            case 896693702:
                str.equals("shoot_2_main");
                LJ(str, "");
                return str2;
            case 1378457662:
                if (str.equals("live_2_feed") && TextUtils.isEmpty(str2)) {
                    return "click_back";
                }
                LJ(str, "");
                return str2;
            case 1737023713:
                if (str.equals("profile_2_feed") && TextUtils.isEmpty(str2)) {
                    return "slide_back";
                }
                LJ(str, "");
                return str2;
            case 1805271917:
                if (str.equals("setting_2_profile") && TextUtils.isEmpty(str2)) {
                    return LIZIZ(activity);
                }
                LJ(str, "");
                return str2;
            default:
                LJ(str, "");
                return str2;
        }
    }

    public static final void LIZJ(ActivityC45651qj activityC45651qj, String str) {
        if (activityC45651qj != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", LIZIZ(activityC45651qj));
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LIZLLL(0, "is_quite");
            FMX.LJIIL("click_back_quit", c188727au.LIZ);
        }
    }

    public static final void LJ(String str, String str2) {
        LIZ.put(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r0 = "enter_personal_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 == 0) goto L3b
            X.Yp3 r4 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r4 == 0) goto L19
            java.lang.String r1 = r4.LJ()
            if (r1 != 0) goto L1c
        L19:
            r1 = r2
            if (r4 == 0) goto L66
        L1c:
            boolean r0 = r4.isConnected()
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.LJFF(r0, r1)
            if (r4 == 0) goto L2f
            java.lang.String r1 = r4.LIZIZ()
            if (r1 != 0) goto L32
        L2f:
            r1 = r2
            if (r4 == 0) goto L38
        L32:
            java.lang.String r0 = r4.LJIILJJIL()
            if (r0 != 0) goto L64
        L38:
            r3.LJI(r1, r2)
        L3b:
            java.lang.String r0 = "enter_method"
            r3.LJIIIZ(r0, r7)
            java.lang.String r0 = "enter_from"
            r3.LJIIIZ(r0, r6)
            r2 = 0
            if (r8 == 0) goto L62
            java.lang.String r1 = r8.getGroupId()
        L4c:
            java.lang.String r0 = "group_id"
            r3.LJIIIZ(r0, r1)
            if (r8 == 0) goto L57
            java.lang.String r2 = r8.getAuthorUid()
        L57:
            java.lang.String r0 = "author_id"
            r3.LJI(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.FMX.LJIIL(r5, r0)
            return
        L62:
            r1 = r2
            goto L4c
        L64:
            r2 = r0
            goto L38
        L66:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54154LNe.LIZLLL(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
