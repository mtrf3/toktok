package X;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.Fln, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39931Fln implements InterfaceC66817QKf {
    public final /* synthetic */ SettingServiceImpl LIZ;

    public C39931Fln(SettingServiceImpl settingServiceImpl) {
        this.LIZ = settingServiceImpl;
    }

    @Override // X.InterfaceC66817QKf
    public final HashMap LIZ() {
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_language", this.LIZ.getAppLanguage());
        if (!AV1.LJIIJJI()) {
            hashMap.put("uoo", String.valueOf(MainServiceImpl.createIMainServicebyMonsterPlugin(false).isLimitAdTrackingEnabled() ? 1 : 0));
            hashMap.put("content_language", ContentLanguageServiceImpl.LJIIJJI().LJ());
        }
        hashMap.put("build_number", EF7.LJII());
        hashMap.put("locale", C85999Xp5.LIZIZ());
        hashMap.put("timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset() / 1000));
        hashMap.put("carrier_region", C85990Xow.LJ());
        hashMap.put("region", C85990Xow.LIZJ());
        hashMap.put("op_region", C85990Xow.LIZ());
        this.LIZ.getClass();
        if (C19N.LJ("common_params_host_abi", true)) {
            if (C39628Fgu.LIZ == null) {
                synchronized (C39628Fgu.class) {
                    if (C39628Fgu.LIZ == null) {
                        C39628Fgu.LIZ = C39628Fgu.LIZJ();
                    }
                }
            }
            str = C39628Fgu.LIZ;
        } else {
            String[] abis = Build.SUPPORTED_ABIS;
            o.LJIIIIZZ(abis, "abis");
            if (abis.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (true ^ z) {
                str = abis[0];
            } else {
                str = null;
            }
        }
        hashMap.put("host_abi", str);
        hashMap.put("ts", String.valueOf(C1E4.LJIIZILJ()));
        if (TextUtils.equals(EF7.LJIILJJIL, "lark_inhouse")) {
            hashMap.put("fake_region", C85990Xow.LJ());
        }
        hashMap.put("ac2", C47971IsB.LIZ(EF7.LIZIZ()));
        return hashMap;
    }
}
