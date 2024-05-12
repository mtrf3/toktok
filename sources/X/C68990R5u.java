package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.util.PlatformConfig;
import com.ss.android.ugc.aweme.account.util.ThirdPartyLoginResponse;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.R5u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68990R5u {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final PlatformConfig LJ;

    public final boolean LIZ() {
        return !TextUtils.isEmpty(this.LIZJ);
    }

    public C68990R5u(String platform, boolean z, String str) {
        j jVar;
        String str2;
        o.LJIIIZ(platform, "platform");
        this.LIZ = platform;
        this.LIZIZ = str;
        ThirdPartyLoginResponse LIZ = C252759vz.LIZ();
        Gson LJIIJJI = NetworkProxyAccount.LIZ.LJIIJJI();
        m mVar = LIZ.platformConfigs;
        if (mVar != null) {
            Locale ENGLISH = Locale.ENGLISH;
            o.LJIIIIZZ(ENGLISH, "ENGLISH");
            String upperCase = platform.toUpperCase(ENGLISH);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            jVar = mVar.LJJIJ(upperCase);
        } else {
            jVar = null;
        }
        PlatformConfig platformConfig = (PlatformConfig) GsonProtectorUtils.fromJson(LJIIJJI, jVar, PlatformConfig.class);
        this.LJ = platformConfig;
        if (z) {
            if (platformConfig != null) {
                str2 = platformConfig.signUpFallBackUrl;
            }
            str2 = null;
        } else {
            if (platformConfig != null) {
                str2 = platformConfig.loginFallBackUrl;
            }
            str2 = null;
        }
        this.LIZJ = str2;
        this.LIZLLL = platformConfig != null ? platformConfig.needConfirm : null;
    }
}
