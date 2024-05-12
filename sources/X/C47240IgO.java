package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IgO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47240IgO {
    public static final Gson LIZ = new Gson();
    public static final C37481dY LIZIZ = new C37481dY(0);
    public static final boolean LIZJ = TextUtils.equals("local_test", C46982IcE.LIZIZ().getChannel());
    public static final java.util.Map<String, IXJ> LIZLLL = new ConcurrentHashMap();
    public static final java.util.Map<String, IXJ> LJ = new ConcurrentHashMap();

    public static <T> T LIZ(String key, Type type) {
        boolean contains;
        String string;
        if (LIZJ) {
            try {
                C37481dY c37481dY = LIZIZ;
                c37481dY.getClass();
                o.LJIIIZ(key, "key");
                SharedPreferences sharedPreferences = (SharedPreferences) c37481dY.LJLILLLLZI;
                if (sharedPreferences == null) {
                    Application application = C46982IcE.LIZ;
                    if (application != null && (sharedPreferences = F9J.LIZIZ(application, 0, (String) c37481dY.LJLIL)) != null) {
                        c37481dY.LJLILLLLZI = sharedPreferences;
                    }
                    sharedPreferences = null;
                }
                if (sharedPreferences == null) {
                    contains = false;
                } else {
                    contains = sharedPreferences.contains(key);
                }
                if (contains) {
                    o.LJIIIZ(type, "type");
                    Gson gson = LIZ;
                    SharedPreferences sharedPreferences2 = (SharedPreferences) c37481dY.LJLILLLLZI;
                    if (sharedPreferences2 == null) {
                        Application application2 = C46982IcE.LIZ;
                        if (application2 != null && (sharedPreferences2 = F9J.LIZIZ(application2, 0, (String) c37481dY.LJLIL)) != null) {
                            c37481dY.LJLILLLLZI = sharedPreferences2;
                        }
                        sharedPreferences2 = null;
                    }
                    if (sharedPreferences2 != null) {
                        string = sharedPreferences2.getString(key, null);
                        if (string == null) {
                        }
                        return (T) GsonProtectorUtils.fromJson(gson, string, type);
                    }
                    string = null;
                    return (T) GsonProtectorUtils.fromJson(gson, string, type);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
