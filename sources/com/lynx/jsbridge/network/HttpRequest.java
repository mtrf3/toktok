package com.lynx.jsbridge.network;

import android.text.TextUtils;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class HttpRequest {
    public String LIZ;
    public String LIZIZ;
    public byte[] LIZJ;
    public Map<String, String> LIZLLL;
    public boolean LJ;
    public Map<String, String> LJFF;

    public static Map<String, String> LIZ(JavaOnlyMap javaOnlyMap) {
        HashMap hashMap = new HashMap();
        for (String str : javaOnlyMap.keySet()) {
            Object obj = javaOnlyMap.get(str);
            if (obj instanceof List) {
                hashMap.put(str, TextUtils.join(",", (Iterable) obj));
            } else if (obj instanceof Number) {
                hashMap.put(str, RawTextShadowNode.LJJIII(((Number) obj).doubleValue()));
            } else if (obj != null) {
                hashMap.put(str, obj.toString());
            }
        }
        return hashMap;
    }

    public static HttpRequest CreateHttpRequest(String str, String str2, byte[] bArr, JavaOnlyMap javaOnlyMap, boolean z, JavaOnlyMap javaOnlyMap2) {
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.LIZ = str;
        httpRequest.LIZIZ = str2;
        httpRequest.LIZJ = bArr;
        if (javaOnlyMap != null) {
            httpRequest.LIZLLL = LIZ(javaOnlyMap);
        }
        httpRequest.LJ = z;
        if (javaOnlyMap2 != null) {
            httpRequest.LJFF = LIZ(javaOnlyMap2);
        }
        return httpRequest;
    }
}
