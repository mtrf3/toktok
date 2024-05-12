package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.google.gson.s;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Aud, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27739Aud {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C65395PlX.LJLIL);

    public static final Gson LJFF() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-mapGson>(...)");
        return (Gson) value;
    }

    public static final String LJI(Object obj) {
        o.LJIIIZ(obj, "<this>");
        String json = GsonProtectorUtils.toJson(C75792yF.LIZIZ(), obj);
        o.LJIIIIZZ(json, "getGson().toJson(this)");
        return json;
    }

    public static final HashMap<String, Object> LJII(String str) {
        try {
            Object fromJson = GsonProtectorUtils.fromJson(LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(HashMap.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(Object.class)))));
            if (!(fromJson instanceof HashMap)) {
                fromJson = null;
            }
            return (HashMap) fromJson;
        } catch (s unused) {
            return null;
        }
    }

    public static final HashMap<String, Object> LIZ(Activity activity, String str) {
        o.LJIIIZ(activity, "<this>");
        return LIZIZ(activity.getIntent(), str);
    }

    public static final HashMap<String, Object> LIZIZ(Intent intent, String str) {
        Bundle bundle;
        if (intent != null) {
            bundle = C16880lQ.LLJJIJI(intent);
        } else {
            bundle = null;
        }
        return LIZLLL(bundle, str);
    }

    public static final HashMap<String, Object> LIZJ(android.net.Uri uri, String str) {
        String str2;
        if (uri != null) {
            str2 = UriProtector.getQueryParameter(uri, str);
        } else {
            str2 = null;
        }
        return LJII(str2);
    }

    public static final HashMap<String, Object> LIZLLL(Bundle bundle, String str) {
        Object LLJJIII;
        HashMap<String, Object> hashMap;
        String str2 = null;
        if (bundle == null || (LLJJIII = C16880lQ.LLJJIII(bundle, str)) == null) {
            return null;
        }
        if (!(LLJJIII instanceof HashMap) || (hashMap = (HashMap) LLJJIII) == null) {
            if (LLJJIII instanceof String) {
                str2 = (String) LLJJIII;
            }
            return LJII(str2);
        }
        return hashMap;
    }

    public static final HashMap LJ(String str, java.util.Map map) {
        Object obj;
        HashMap hashMap;
        String str2 = null;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof HashMap) || (hashMap = (HashMap) obj) == null) {
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            return LJII(str2);
        }
        return hashMap;
    }
}
