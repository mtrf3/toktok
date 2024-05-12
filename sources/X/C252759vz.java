package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.util.ThirdPartyLoginResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.9vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252759vz {
    public static ThirdPartyLoginResponse LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("user_login_window", ThirdPartyLoginResponse.class);
            o.LJIIIIZZ(LJII, "{\n            SettingsMa…V2::class.java)\n        }");
            return (ThirdPartyLoginResponse) LJII;
        } catch (Throwable unused) {
            return new ThirdPartyLoginResponse();
        }
    }
}
