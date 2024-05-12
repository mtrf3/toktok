package com.appsflyer.internal;

import X.C16880lQ;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {
    public final boolean AFInAppEventParameterName;
    public final byte[] AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String valueOf;
    public final Map<String, String> values;

    public v() {
    }

    public final int hashCode() {
        return (this.values.hashCode() + ((this.valueOf.hashCode() + ((Arrays.hashCode(this.AFInAppEventType) + (this.AFKeystoreWrapper.hashCode() * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Request{url='" + this.AFKeystoreWrapper + "', body=" + Arrays.toString(this.AFInAppEventType) + ", method='" + this.valueOf + "', headers=" + this.values + ", isEncrypted=false}";
    }

    public static Map<String, String> values(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = context.getResources().getConfiguration().screenLayout & 15;
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(i));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.valueOf("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.AFKeystoreWrapper.equals(vVar.AFKeystoreWrapper) || !Arrays.equals(this.AFInAppEventType, vVar.AFInAppEventType) || !this.valueOf.equals(vVar.valueOf)) {
            return false;
        }
        return this.values.equals(vVar.values);
    }

    public v(String str, byte[] bArr, String str2, Map<String, String> map) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = bArr;
        this.valueOf = str2;
        this.values = map;
    }
}
