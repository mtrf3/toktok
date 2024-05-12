package X;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FbZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39297FbZ {
    public static void LIZ(Context context, String str, C39316Fbs preInstallResult, String str2, String str3, String matchType) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(preInstallResult, "preInstallResult");
        o.LJIIIZ(matchType, "matchType");
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("preinstall", "preload_conf", "preload_pai", "id_matching");
        if (ujb.o.LJJJJIZL("id_matching", matchType, true)) {
            preInstallResult.LIZ.LJLLILLLL = 8;
        }
        Locale locale = Locale.ROOT;
        o.LJIIIIZZ(locale, "Locale.ROOT");
        String lowerCase = matchType.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (LJJIJIIJI.contains(lowerCase)) {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C39298Fba(context, str, preInstallResult, str2, str3, null), 2);
        }
    }
}
