package X;

import com.bytedance.pitaya.api.bean.PTYClass;
import com.bytedance.pitaya.api.bean.nativeobj.python.CPyNativeArray;
import com.bytedance.pitaya.api.bean.nativeobj.python.CPyNativeDict;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.aO3, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93263aO3 {
    public static CPyNativeDict LIZ(JSONObject jsonObject, long j, boolean z) {
        o.LJIIJ(jsonObject, "jsonObject");
        CPyNativeDict cPyNativeDict = new CPyNativeDict(j);
        Iterator<String> keys = jsonObject.keys();
        o.LJFF(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jsonObject.opt(key);
            if (opt == null) {
                o.LJFF(key, "key");
                cPyNativeDict.setNull(key);
            } else if (opt instanceof JSONArray) {
                o.LJFF(key, "key");
                CPyNativeArray.Companion.getClass();
                cPyNativeDict.set(key, C93262aO2.LIZ((JSONArray) opt, j, z));
            } else if (opt instanceof JSONObject) {
                o.LJFF(key, "key");
                CPyNativeDict.Companion.getClass();
                cPyNativeDict.set(key, LIZ((JSONObject) opt, j, z));
            } else if (opt instanceof Boolean) {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, ((Boolean) opt).booleanValue());
            } else if (opt instanceof Long) {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, ((Number) opt).longValue());
            } else if (opt instanceof Integer) {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, ((Number) opt).intValue());
            } else if (opt instanceof Float) {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, ((Number) opt).floatValue());
            } else if (opt instanceof Double) {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, ((Number) opt).doubleValue());
            } else if (opt instanceof String) {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, (String) opt);
            } else if (opt instanceof PTYClass) {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, (PTYClass) opt, z);
            } else {
                o.LJFF(key, "key");
                cPyNativeDict.set(key, opt.toString());
            }
        }
        return cPyNativeDict;
    }
}
