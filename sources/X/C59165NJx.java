package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.geckox.GeckoGlobalConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.NJx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59165NJx {
    public static final C59156NJo LIZ = new C59156NJo();
    public static SharedPreferences LIZIZ;

    public static SharedPreferences LIZ() {
        Context context;
        if (LIZIZ == null) {
            C61532OCy c61532OCy = EBC.LIZ;
            o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
            SharedPreferences sharedPreferences = null;
            if (geckoGlobalConfig != null && (context = geckoGlobalConfig.getContext()) != null) {
                sharedPreferences = F9J.LIZIZ(context, 0, "gecko_channels_expire_time");
            }
            LIZIZ = sharedPreferences;
        }
        return LIZIZ;
    }
}
