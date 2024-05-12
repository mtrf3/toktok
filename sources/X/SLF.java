package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSettingsApi;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLF {
    public static final UserSettingsApi LIZ = (UserSettingsApi) RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(UserSettingsApi.class);

    public static C73422Sri LIZ() {
        String lastVersion = C38776FJs.LJIIL().LJ(EF7.LIZIZ(), "last_user_setting_version");
        UserSettingsApi userSettingsApi = LIZ;
        o.LJIIIIZZ(lastVersion, "lastVersion");
        return userSettingsApi.getUserSettings(lastVersion).LJIJJLI(C53834LAw.LJLIL).LJIJJ(SLE.LJLIL);
    }

    public static void LIZIZ(String str) {
        C38776FJs.LJIIL().LJIIJJI(EF7.LIZIZ(), "last_user_setting_version", str);
    }
}
