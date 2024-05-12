package X;

import android.content.res.Configuration;
import com.bytedance.common.utility.reflect.Reflect;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FQW {
    public static void LIZ(Locale curLocale) {
        o.LJIIIZ(curLocale, "curLocale");
        try {
            Object obj = Reflect.on("android.app.ResourcesManager").call("getInstance").get();
            o.LJIIIIZZ(obj, "on(\"android.app.Resource…\"getInstance\").get<Any>()");
            Configuration configuration = (Configuration) Reflect.on(obj).call("getConfiguration").get();
            if (configuration != null) {
                configuration.setLocale(curLocale);
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateLocaleInternal error:");
            LIZ.append(V0N.LJJIJL(th));
            X1D.LIZIZ(LIZ);
        }
    }
}
