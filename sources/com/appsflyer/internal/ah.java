package com.appsflyer.internal;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYT;
import X.PYU;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class ah implements Runnable {
    public final bu values;

    public ah() {
    }

    public static URLConnection com_appsflyer_internal_ah_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-2188558172191876278"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // java.lang.Runnable
    public void run() {
        com_appsflyer_internal_ah_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.net.HttpURLConnection AFInAppEventParameterName() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ah.AFInAppEventParameterName():java.net.HttpURLConnection");
    }

    public void com_appsflyer_internal_ah__run$___twin___() {
        HttpURLConnection AFInAppEventParameterName = AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            AFInAppEventParameterName.disconnect();
        }
    }

    public ah(bu buVar) {
        this.values = buVar;
    }

    public static String AFInAppEventParameterName(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return values(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.valueOf("Error turning " + str.substring(0, 6) + ".. to SHA-256", e);
            return null;
        }
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.valueOf("Error turning " + str.substring(0, 6) + ".. to MD5", e);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.valueOf("Error turning " + str.substring(0, 6) + ".. to SHA1", e);
            return null;
        }
    }

    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_ah_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_appsflyer_internal_ah_java_net_URL_openConnection(url);
        }
        PPC<URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection com_appsflyer_internal_ah_java_net_URL_openConnection = com_appsflyer_internal_ah_java_net_URL_openConnection(url);
            if (com_appsflyer_internal_ah_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_appsflyer_internal_ah_java_net_URL_openConnection);
            } else {
                if (!(com_appsflyer_internal_ah_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_appsflyer_internal_ah_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_appsflyer_internal_ah_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static void com_appsflyer_internal_ah_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ah ahVar) {
        boolean LIZ;
        try {
            ahVar.com_appsflyer_internal_ah__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static String values(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String AFInAppEventParameterName(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b : bArr) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    public static String valueOf(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            return values(mac.doFinal(str.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.values(e.getMessage(), e);
            return e.getMessage();
        }
    }
}
