package X;

import android.os.Bundle;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.F4i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38376F4i {
    public static JavaOnlyArray LIZIZ(List list) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (list == null) {
            return javaOnlyArray;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object LIZLLL = LIZLLL(it.next());
            if (LIZLLL == null) {
                javaOnlyArray.pushNull();
            } else if (LIZLLL instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) LIZLLL).booleanValue());
            } else if (LIZLLL instanceof Integer) {
                javaOnlyArray.pushInt(((Integer) LIZLLL).intValue());
            } else if (LIZLLL instanceof Double) {
                javaOnlyArray.pushDouble(((Double) LIZLLL).doubleValue());
            } else if (LIZLLL instanceof String) {
                javaOnlyArray.pushString((String) LIZLLL);
            } else if (LIZLLL instanceof JavaOnlyArray) {
                javaOnlyArray.pushArray((JavaOnlyArray) LIZLLL);
            } else if (LIZLLL instanceof JavaOnlyMap) {
                javaOnlyArray.pushMap((JavaOnlyMap) LIZLLL);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Could not convert ");
                LIZ.append(LIZLLL.getClass());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LIZJ(java.util.Map<String, Object> map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (map == null) {
            return javaOnlyMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            LIZ(javaOnlyMap, entry.getKey(), entry.getValue());
        }
        return javaOnlyMap;
    }

    public static Object LIZLLL(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj.getClass().isArray()) {
            return LIZIZ(new C39619Fgl(obj));
        }
        if (obj instanceof List) {
            return LIZIZ((List) obj);
        }
        if (obj instanceof java.util.Map) {
            return LIZJ((java.util.Map) obj);
        }
        if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            for (String str : bundle.keySet()) {
                LIZ(javaOnlyMap, str, C16880lQ.LLJJIII(bundle, str));
            }
            return javaOnlyMap;
        }
        return obj;
    }

    public static void LIZ(JavaOnlyMap javaOnlyMap, String str, Object obj) {
        Object LIZLLL = LIZLLL(obj);
        if (LIZLLL == null) {
            javaOnlyMap.putNull(str);
            return;
        }
        if (LIZLLL instanceof Boolean) {
            javaOnlyMap.putBoolean(str, ((Boolean) LIZLLL).booleanValue());
            return;
        }
        if (LIZLLL instanceof Integer) {
            javaOnlyMap.putInt(str, ((Integer) LIZLLL).intValue());
            return;
        }
        if (LIZLLL instanceof Number) {
            javaOnlyMap.putDouble(str, ((Number) LIZLLL).doubleValue());
            return;
        }
        if (LIZLLL instanceof String) {
            javaOnlyMap.putString(str, (String) LIZLLL);
            return;
        }
        if (LIZLLL instanceof JavaOnlyArray) {
            javaOnlyMap.putArray(str, (JavaOnlyArray) LIZLLL);
        } else {
            if (LIZLLL instanceof JavaOnlyMap) {
                javaOnlyMap.putMap(str, (JavaOnlyMap) LIZLLL);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Could not convert ");
            LIZ.append(LIZLLL.getClass());
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }
}
