package com.appsflyer.internal;

import X.C16880lQ;
import X.C77339UWx;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class ac {
    public final Map<String, String> AFInAppEventParameterName;
    public final List<Purchase> AFInAppEventType;
    public final boolean valueOf;
    public final boolean values;

    public ac() {
    }

    public static boolean AFInAppEventParameterName() {
        return Build.BRAND.equals("OPPO");
    }

    public final int hashCode() {
        int i;
        int LIZ = C77339UWx.LIZ(this.AFInAppEventType, (((this.valueOf ? 1 : 0) * 31) + (this.values ? 1 : 0)) * 31, 31);
        Map<String, String> map = this.AFInAppEventParameterName;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        return LIZ + i;
    }

    public final String toString() {
        return "ArsValidateRequestData{isSandbox=" + this.valueOf + ", isHistory=" + this.values + ", subscriptions=" + this.AFInAppEventType + ", additionalParams=" + this.AFInAppEventParameterName + '}';
    }

    public final boolean AFInAppEventType() {
        return this.values;
    }

    public final boolean AFKeystoreWrapper() {
        return this.valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ac.class == obj.getClass()) {
            ac acVar = (ac) obj;
            if (this.valueOf != acVar.valueOf || this.values != acVar.values || !this.AFInAppEventType.equals(acVar.AFInAppEventType)) {
                return false;
            }
            Map<String, String> map = this.AFInAppEventParameterName;
            Map<String, String> map2 = acVar.AFInAppEventParameterName;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean AFKeystoreWrapper(Context context, String str) {
        if (str != null) {
            int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
            AFLogger.AFInAppEventParameterName("is Permission Available: " + str + "; res: " + checkPermission);
            if (checkPermission == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static long valueOf(Context context, String str) {
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return LLLLLLZ.getLongVersionCode();
            }
            return LLLLLLZ.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return 0L;
        }
    }

    public static String values(PackageManager packageManager, String str) {
        Signature[] signatureArr = C16880lQ.LLLLLLZ(packageManager, str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(generateCertificate.getEncoded());
        return C16880lQ.LLLZ("%032X", new Object[]{new BigInteger(1, messageDigest.digest())});
    }

    public static boolean AFKeystoreWrapper(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentServices(intent, 0).size() <= 0) {
            return false;
        }
        return true;
    }

    public static String values(Context context, String str) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return "";
        }
    }

    public static Map<String, String> values(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = UriProtector.getQueryParameterNames(uri).iterator();
        while (true) {
            String str = "media_source";
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = UriProtector.getQueryParameter(uri, next);
                if (!map.containsKey(next)) {
                    int hashCode = next.hashCode();
                    if (hashCode != -1420799080) {
                        if (hashCode != 99) {
                            if (hashCode == 110987 && next.equals("pid")) {
                            }
                        } else if (next.equals("c")) {
                            str = "campaign";
                        }
                    } else if (next.equals("af_prt")) {
                        str = "agency";
                    }
                    map.put(str, queryParameter);
                }
                str = next;
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e) {
                    AFLogger.valueOf("Could not fetch install time. ", e);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    public ac(boolean z, boolean z2, List<Purchase> list, Map<String, String> map) {
        this.valueOf = z;
        this.values = z2;
        this.AFInAppEventType = list;
        this.AFInAppEventParameterName = map;
    }
}
