package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class J5B {
    public static final J5B LIZIZ = new J5B();
    public final HashMap<String, J3L> LIZ;

    public J5B() {
        HashMap<String, J3L> hashMap = new HashMap<>();
        this.LIZ = hashMap;
        hashMap.put("log", new J5H());
        hashMap.put("log1p", new J5J());
        hashMap.put("sigmoid", new J5I());
        hashMap.put("div", new J5K());
        hashMap.put("max", new J5C());
        hashMap.put("min", new J5E());
        hashMap.put("normalize", new J5F());
        hashMap.put("standardize", new J5G());
        hashMap.put("predict_regression", new C48546J3m());
        hashMap.put("predict_bin", new C48547J3n());
        hashMap.put("onehotEncode", new J5D());
        hashMap.put("predict_multi", new C48548J3o());
        hashMap.put("embedding", new J5A());
        hashMap.put("embedding_vector", new J59());
    }
}
