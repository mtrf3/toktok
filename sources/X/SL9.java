package X;

import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSetSettingApi;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SL9 {
    public static final /* synthetic */ SL9 LIZ = new SL9();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C71929SKv.LJLIL);

    public static C73390SrC LIZ(String field, int i) {
        o.LJIIIZ(field, "field");
        return C77119UOl.LJIJ(((UserSetSettingApi) LIZIZ.getValue()).setUserSetting(field, i), "/aweme/v1/user/set/settings/");
    }
}
