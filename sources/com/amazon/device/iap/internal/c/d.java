package com.amazon.device.iap.internal.c;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import defpackage.i0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public String d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("KEY_USER_ID", this.a);
        jSONObject.put("KEY_RECEIPT_STRING", this.b);
        jSONObject.put("KEY_REQUEST_ID", this.d);
        jSONObject.put("KEY_TIMESTAMP", this.c);
        return jSONObject.toString();
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public static d a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new d(JSONObjectProtectorUtils.getString(jSONObject, "KEY_USER_ID"), JSONObjectProtectorUtils.getString(jSONObject, "KEY_RECEIPT_STRING"), JSONObjectProtectorUtils.getString(jSONObject, "KEY_REQUEST_ID"), JSONObjectProtectorUtils.getLong(jSONObject, "KEY_TIMESTAMP"));
        } catch (Throwable th) {
            throw new e(i0.LJFF("Input invalid for PendingReceipt Object:", str), th);
        }
    }

    public d(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.c = j;
    }
}
