package com.bytedance.pitaya.api.feature.store;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class PTYFeatureProducer implements ReflectionCall {
    public abstract JSONObject getDictFeature(String str, JSONObject jSONObject);

    public abstract String getGroupName();

    public abstract float getNumericFeature(String str, JSONObject jSONObject);

    public abstract JSONArray getSeqFeature(String str, JSONObject jSONObject);

    public abstract String getStringFeature(String str, JSONObject jSONObject);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getDictFeature(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            r1 = 0
            int r0 = r4.length()     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L18
        Lc:
            r0 = r1
        Ld:
            org.json.JSONObject r0 = r2.getDictFeature(r3, r0)
            if (r0 == 0) goto L17
            java.lang.String r1 = r0.toString()
        L17:
            return r1
        L18:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lc
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.api.feature.store.PTYFeatureProducer.getDictFeature(java.lang.String, java.lang.String):java.lang.String");
    }

    private final float getNumericFeature(String str, String str2) {
        JSONObject jSONObject = null;
        try {
            if (str2.length() != 0) {
                jSONObject = new JSONObject(str2);
            }
        } catch (Throwable unused) {
        }
        return getNumericFeature(str, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getSeqFeature(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            r1 = 0
            int r0 = r4.length()     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L18
        Lc:
            r0 = r1
        Ld:
            org.json.JSONArray r0 = r2.getSeqFeature(r3, r0)
            if (r0 == 0) goto L17
            java.lang.String r1 = r0.toString()
        L17:
            return r1
        L18:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lc
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.api.feature.store.PTYFeatureProducer.getSeqFeature(java.lang.String, java.lang.String):java.lang.String");
    }

    private final String getStringFeature(String str, String str2) {
        boolean z;
        JSONObject jSONObject = null;
        try {
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                jSONObject = new JSONObject(str2);
            }
        } catch (Throwable unused) {
        }
        return getStringFeature(str, jSONObject);
    }
}
