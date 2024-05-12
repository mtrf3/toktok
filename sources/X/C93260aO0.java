package X;

import com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeArray;
import com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeDict;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.aO0, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93260aO0 {
    public static PTYNativeArray LIZ(JSONArray jsonArray) {
        o.LJIIJ(jsonArray, "jsonArray");
        int length = jsonArray.length();
        PTYNativeArray pTYNativeArray = new PTYNativeArray(length);
        for (int i = 0; i < length; i++) {
            Object opt = jsonArray.opt(i);
            if (opt == null) {
                pTYNativeArray.appendNull();
            } else if (opt instanceof JSONArray) {
                pTYNativeArray.append(LIZ((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                PTYNativeDict.Companion.getClass();
                pTYNativeArray.append(C93261aO1.LIZ((JSONObject) opt));
            } else if (opt instanceof Boolean) {
                pTYNativeArray.append(((Boolean) opt).booleanValue());
            } else if (opt instanceof Long) {
                pTYNativeArray.append(((Number) opt).longValue());
            } else if (opt instanceof Integer) {
                pTYNativeArray.append(((Number) opt).intValue());
            } else if (opt instanceof Float) {
                pTYNativeArray.append(((Number) opt).floatValue());
            } else if (opt instanceof Double) {
                pTYNativeArray.append(((Number) opt).doubleValue());
            } else if (opt instanceof String) {
                pTYNativeArray.append((String) opt);
            } else {
                pTYNativeArray.append(opt.toString());
            }
        }
        return pTYNativeArray;
    }
}
