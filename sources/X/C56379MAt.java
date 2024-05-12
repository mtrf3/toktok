package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.model.AppWidgetStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.MAt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56379MAt {
    public static final C56379MAt LIZ = new C56379MAt();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C56381MAv.LJLIL);
    public static AppWidgetStruct LIZJ;

    public static Keva LIZIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public final AppWidgetStruct LIZ() {
        AppWidgetStruct appWidgetStruct = null;
        if (((Boolean) C88024Yge.LIZJ.getValue()).booleanValue()) {
            if (LIZJ == null) {
                synchronized (this) {
                    if (LIZJ == null) {
                        try {
                            appWidgetStruct = (AppWidgetStruct) new Gson().LJI(LIZIZ().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
                        } catch (Throwable unused) {
                        }
                        LIZJ = appWidgetStruct;
                    }
                }
            }
            return LIZJ;
        }
        try {
            return (AppWidgetStruct) new Gson().LJI(LIZIZ().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
        } catch (Throwable unused2) {
            return null;
        }
    }
}
