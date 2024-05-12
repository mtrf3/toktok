package X;

import com.bytedance.pitaya.api.bean.PTYClass;
import com.bytedance.pitaya.api.bean.nativeobj.python.CPyNativeArray;
import com.bytedance.pitaya.api.bean.nativeobj.python.CPyNativeDict;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.aO2, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93262aO2 {
    public static CPyNativeArray LIZ(JSONArray jsonArray, long j, boolean z) {
        o.LJIIJ(jsonArray, "jsonArray");
        int length = jsonArray.length();
        CPyNativeArray cPyNativeArray = new CPyNativeArray(length, j);
        for (int i = 0; i < length; i++) {
            Object opt = jsonArray.opt(i);
            if (opt == null) {
                cPyNativeArray.appendNull(i);
            } else if (opt instanceof JSONArray) {
                cPyNativeArray.append(LIZ((JSONArray) opt, j, z), i);
            } else if (opt instanceof JSONObject) {
                CPyNativeDict.Companion.getClass();
                cPyNativeArray.append(C93263aO3.LIZ((JSONObject) opt, j, z), i);
            } else if (opt instanceof Boolean) {
                cPyNativeArray.append(((Boolean) opt).booleanValue(), i);
            } else if (opt instanceof Long) {
                cPyNativeArray.append(((Number) opt).longValue(), i);
            } else if (opt instanceof Integer) {
                cPyNativeArray.append(((Number) opt).intValue(), i);
            } else if (opt instanceof Float) {
                cPyNativeArray.append(((Number) opt).floatValue(), i);
            } else if (opt instanceof Double) {
                cPyNativeArray.append(((Number) opt).doubleValue(), i);
            } else if (opt instanceof String) {
                cPyNativeArray.append((String) opt, i);
            } else if (opt instanceof PTYClass) {
                cPyNativeArray.append((PTYClass) opt, i, z);
            } else {
                cPyNativeArray.append(opt.toString(), i);
            }
        }
        return cPyNativeArray;
    }
}
