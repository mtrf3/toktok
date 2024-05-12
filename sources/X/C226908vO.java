package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.profile.experiment.ProfileViewersConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewer.api.ProfileViewerApiService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8vO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226908vO {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        C62822Ol8 c62822Ol8 = C226958vT.LIZ;
        if ((((Number) c62822Ol8.getValue()).intValue() != 1 && ((Number) c62822Ol8.getValue()).intValue() != 2) || !C7ZI.LIZIZ() || !C107454Jp.LIZ()) {
            return false;
        }
        return true;
    }

    public static final void LIZ(String str, String str2, List<Integer> list) {
        int i;
        boolean z;
        int i2;
        Integer M;
        Integer num;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        User LIZIZ = AV1.LIZIZ();
        boolean LIZIZ2 = C78966Uyw.LJJIJ().LIZIZ();
        int i3 = LIZIZ.historyMaxFollowerCount;
        C226918vP.LIZ.getClass();
        ProfileViewersConfig profileViewersConfig = (ProfileViewersConfig) C226918vP.LIZJ.getValue();
        if (profileViewersConfig != null && (num = profileViewersConfig.enabledMaxFollowers) != null) {
            i = num.intValue();
        } else {
            i = 5000;
        }
        if (i3 < i) {
            z = true;
        } else {
            z = false;
        }
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null && (M = privacyUserSettings.M("profile_view_history")) != null) {
            i2 = M.intValue();
        } else {
            i2 = 2;
        }
        C26354AVy.LIZ.getClass();
        boolean LIZIZ3 = C26354AVy.LIZIZ();
        boolean LJ = o.LJ(LIZIZ.getUid(), str);
        if (LIZIZ2 || !z || !LIZIZ3 || LJ || i2 != 1) {
            return;
        }
        ProfileViewerApiService.LIZIZ.reportView(str, str2, ORZ.LLD(list, ",", "[", "]", null, 56)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.8vR
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.8vS
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
