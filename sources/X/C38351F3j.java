package X;

import Y.ARunnableS5S1200000_6;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.F3j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38351F3j {
    public static String LIZ;
    public static String LIZIZ;

    public static void LIZ(IEventMonitor iEventMonitor, ExecutorService executorService, C39492Fei c39492Fei, View view, String str, JSONObject jSONObject) {
        o.LJIIIZ(view, "view");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        if (!heliosEnvImpl.LJFF()) {
            return;
        }
        String str2 = c39492Fei.LJLILLLLZI;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        for (String str3 : C37202Eis.LIZ) {
            if (str2 != null) {
                Locale locale = Locale.ROOT;
                o.LJIIIIZZ(locale, "Locale.ROOT");
                String lowerCase = str2.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (ujb.o.LJJJJ(lowerCase, str3, false)) {
                    return;
                }
            }
            String LIZIZ2 = QZZ.LIZIZ('.', str2);
            Locale locale2 = Locale.ROOT;
            o.LJIIIIZZ(locale2, "Locale.ROOT");
            if (LIZIZ2 != null) {
                String lowerCase2 = LIZIZ2.toLowerCase(locale2);
                o.LJIIIIZZ(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                if (ujb.o.LJJJJ(lowerCase2, str3, false)) {
                    return;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        if ((view instanceof WebView) && view != null && !(view.getTag(R.id.nhu) instanceof C35586Dxu)) {
        }
        if (executorService != null) {
            executorService.execute(new ARunnableS5S1200000_6(iEventMonitor, str, c39492Fei, 13));
        }
    }
}
