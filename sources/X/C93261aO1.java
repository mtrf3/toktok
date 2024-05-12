package X;

import com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeArray;
import com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeDict;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.aO1, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93261aO1 {
    public static PTYNativeDict LIZ(JSONObject jsonObject) {
        o.LJIIJ(jsonObject, "jsonObject");
        PTYNativeDict pTYNativeDict = new PTYNativeDict(jsonObject.length());
        Iterator<String> keys = jsonObject.keys();
        o.LJFF(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jsonObject.opt(key);
            if (opt == null) {
                o.LJFF(key, "key");
                pTYNativeDict.setNull(key);
            } else if (opt instanceof JSONArray) {
                o.LJFF(key, "key");
                PTYNativeArray.Companion.getClass();
                pTYNativeDict.set(key, C93260aO0.LIZ((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                o.LJFF(key, "key");
                PTYNativeDict.Companion.getClass();
                pTYNativeDict.set(key, LIZ((JSONObject) opt));
            } else if (opt instanceof Boolean) {
                o.LJFF(key, "key");
                pTYNativeDict.set(key, ((Boolean) opt).booleanValue());
            } else if (opt instanceof Long) {
                o.LJFF(key, "key");
                pTYNativeDict.set(key, ((Number) opt).longValue());
            } else if (opt instanceof Integer) {
                o.LJFF(key, "key");
                pTYNativeDict.set(key, ((Number) opt).intValue());
            } else if (opt instanceof Float) {
                o.LJFF(key, "key");
                pTYNativeDict.set(key, ((Number) opt).floatValue());
            } else if (opt instanceof Double) {
                o.LJFF(key, "key");
                pTYNativeDict.set(key, ((Number) opt).doubleValue());
            } else if (opt instanceof String) {
                o.LJFF(key, "key");
                pTYNativeDict.set(key, (String) opt);
            } else {
                o.LJFF(key, "key");
                pTYNativeDict.set(key, opt.toString());
            }
        }
        return pTYNativeDict;
    }
}
