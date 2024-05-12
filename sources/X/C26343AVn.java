package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewer.setting.ProfileViewerPopupConflictPeriodSettingsModel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AVn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26343AVn {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C26346AVq.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(AQH.LJLIL);
    public static boolean LIZJ;

    public static Keva LIZJ() {
        return (Keva) LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            X.ORV r9 = LIZLLL()
            int r2 = r9.size()
            int r1 = X.C26197APx.LIZIZ()
            r0 = 5
            r8 = 0
            r7 = 1
            if (r1 == r0) goto L64
            r0 = 6
            if (r1 == r0) goto L62
            r0 = 9
            if (r1 == r0) goto L64
            r0 = 10
            if (r1 == r0) goto L62
            r0 = 0
        L1d:
            if (r2 < r0) goto L20
        L1f:
            return r8
        L20:
            long r5 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.profile.viewer.setting.ProfileViewerAnimationInvalidPeriodSettingsModel> r2 = com.ss.android.ugc.aweme.profile.viewer.setting.ProfileViewerAnimationInvalidPeriodSettingsModel.class
            com.ss.android.ugc.aweme.profile.viewer.setting.ProfileViewerAnimationInvalidPeriodSettingsModel r1 = X.C26344AVo.LIZ
            java.lang.String r0 = "tt_profile_viewer_animation_invalid_period"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.profile.viewer.setting.ProfileViewerAnimationInvalidPeriodSettingsModel r0 = (com.ss.android.ugc.aweme.profile.viewer.setting.ProfileViewerAnimationInvalidPeriodSettingsModel) r0
            if (r0 != 0) goto L60
        L38:
            int r0 = r1.frequencyInSecond
            long r0 = (long) r0
            long r0 = r4.toMillis(r0)
            long r5 = r5 - r0
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L47
        L46:
            return r7
        L47:
            java.util.Iterator r3 = r9.iterator()
        L4b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L4b
            goto L1f
        L60:
            r1 = r0
            goto L38
        L62:
            r0 = 3
            goto L1d
        L64:
            r0 = 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26343AVn.LIZIZ():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r1 != 10) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.ORV LIZLLL() {
        /*
            com.bytedance.keva.Keva r2 = LIZJ()
            java.lang.String r1 = "profile_viewer_entrance_animation_frequency_control"
            r0 = 95
            java.lang.StringBuilder r1 = X.C72972SkS.LJFF(r1, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            java.lang.String r0 = "profilePreference.getStr…ON_FREQUENCY_CONTROL, \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r7 = 0
            r10 = 6
            java.util.List r0 = ujb.s.LJLJJL(r1, r0, r7, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L3d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L3d
            r2.add(r0)
            goto L3d
        L53:
            X.ORV r6 = new X.ORV
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r12 = r2.iterator()
        L61:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r11 = r12.next()
            r0 = r11
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 24
            long r0 = r2.toMillis(r0)
            long r3 = r3 - r0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L61
            r5.add(r11)
            goto L61
        L87:
            int r1 = X.C26197APx.LIZIZ()
            r0 = 5
            if (r1 == r0) goto La2
            if (r1 == r10) goto La0
            r0 = 9
            if (r1 == r0) goto La2
            r0 = 10
            if (r1 == r0) goto La0
        L98:
            java.util.List r0 = X.ORZ.LLILZ(r7, r5)
            r6.addAll(r0)
            return r6
        La0:
            r7 = 3
            goto L98
        La2:
            r7 = 1
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26343AVn.LIZLLL():X.ORV");
    }

    public static void LJ() {
        Keva LIZJ2 = LIZJ();
        StringBuilder LJFF = C72972SkS.LJFF("profile_first_visit_time", '_');
        LJFF.append(((RBX) HG3.LJIILL()).getCurUserId());
        if (LIZJ2.getLong(X1D.LIZIZ(LJFF), 0L) == 0) {
            Keva LIZJ3 = LIZJ();
            StringBuilder LJFF2 = C72972SkS.LJFF("profile_first_visit_time", '_');
            LIZJ3.storeLong(UPJ.LJ((RBX) HG3.LJIILL(), LJFF2, LJFF2), System.currentTimeMillis());
        }
    }

    public static void LIZ(long j) {
        ORV LIZLLL = LIZLLL();
        LIZLLL.addLast(Long.valueOf(j));
        Keva LIZJ2 = LIZJ();
        StringBuilder LJFF = C72972SkS.LJFF("profile_viewer_entrance_animation_frequency_control", '_');
        LIZJ2.storeString(UPJ.LJ((RBX) HG3.LJIILL(), LJFF, LJFF), ORZ.LLD(LIZLLL, ",", null, null, null, 62));
    }

    public static boolean LJFF(User user) {
        long longValue;
        if (user != null && Long.valueOf(user.getRegisterTime()) != null) {
            longValue = Math.max(((Number) LIZ.getValue()).longValue(), TimeUnit.SECONDS.toMillis(user.getRegisterTime()));
        } else {
            longValue = ((Number) LIZ.getValue()).longValue();
        }
        if (longValue == 0) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ProfileViewerPopupConflictPeriodSettingsModel profileViewerPopupConflictPeriodSettingsModel = C26345AVp.LIZ;
        ProfileViewerPopupConflictPeriodSettingsModel profileViewerPopupConflictPeriodSettingsModel2 = (ProfileViewerPopupConflictPeriodSettingsModel) LIZLLL.LJIIIIZZ("tt_profile_viewer_popup_conflict_period", ProfileViewerPopupConflictPeriodSettingsModel.class, profileViewerPopupConflictPeriodSettingsModel);
        if (profileViewerPopupConflictPeriodSettingsModel2 != null) {
            profileViewerPopupConflictPeriodSettingsModel = profileViewerPopupConflictPeriodSettingsModel2;
        }
        if (longValue >= currentTimeMillis - timeUnit.toMillis(profileViewerPopupConflictPeriodSettingsModel.frequencyInDay)) {
            return true;
        }
        return false;
    }
}
