package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import defpackage.i0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.FGn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38693FGn {
    public static java.util.Map LIZ(Context context) {
        SharedPreferences LIZJ = LIZJ(context, "CLIENT_EXPERIMENT_CACHE_TAG");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : LIZJ.getAll().entrySet()) {
            if (entry.getValue() instanceof Integer) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static java.util.Map<String, String> LIZIZ(Context context, String str) {
        SharedPreferences LIZJ = LIZJ(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : LIZJ.getAll().entrySet()) {
            if (entry.getValue() instanceof String) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static SharedPreferences LIZJ(Context context, String str) {
        try {
            return F9J.LIZIZ(context, 0, str);
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 24) {
                return F9J.LIZIZ(context.createDeviceProtectedStorageContext(), 0, str);
            }
            throw new RuntimeException(i0.LJFF("abtest SharedPreferences :", str));
        }
    }

    public static java.util.Set LIZLLL(Context context, String str) {
        return new ConcurrentSkipListSet(LIZJ(context, "SP_EXPERIMENT_CACHE").getStringSet(str, new ConcurrentSkipListSet()));
    }
}
