package X;

import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67842lQ {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String str, List list) {
        int i;
        int i2;
        Integer num;
        int i3 = 0;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(str)).entrySet()) {
                String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                Object value = entry.getValue();
                if ((value instanceof Integer) && (num = (Integer) value) != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                linkedHashMap.put(lowerCase, Integer.valueOf(i2));
            }
            Iterator it = ((ArrayList) list).iterator();
            i3 = 0;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                Integer num2 = (Integer) linkedHashMap.get(lowerCase2);
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                i3 += i;
            }
        } catch (Exception unused) {
        }
        return i3;
    }

    public static List LIZIZ(String str, String str2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                try {
                    C61112aZ c61112aZ = (C61112aZ) GsonHolder.LIZLLL().LIZ().LJI(str, C61112aZ.class);
                    c61112aZ.getClass();
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public static void LIZJ(java.util.Map map, java.util.Map map2) {
        HashMap hashMap;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() instanceof HashMap) {
                    Object value = entry.getValue();
                    if (value instanceof HashMap) {
                        hashMap = (HashMap) value;
                    } else {
                        hashMap = null;
                    }
                    LIZJ(map, hashMap);
                } else {
                    ((HashMap) map).put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
