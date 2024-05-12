package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;

/* renamed from: X.0Mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06320Mq {
    public static volatile boolean LIZ;

    public static boolean LIZ() {
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL == null) {
            C47261Igj.LJJJJZ("BXBundleTools");
            return false;
        }
        LIZLLL.enableInstall();
        if (!LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.benchmark")) {
            C47261Igj.LJJJJZ("BXBundleTools");
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Context context) {
        if (LIZ() && context != null) {
            IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
            if (LIZLLL.LIZJ() != null) {
                LIZLLL.LIZJ().getClass();
                return C39647FhD.LIZLLL(context);
            }
            return false;
        }
        return false;
    }
}
