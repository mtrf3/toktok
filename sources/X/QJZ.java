package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes12.dex */
public final class QJZ {
    public static InterfaceC66783QIx LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static volatile int LJI;
    public static volatile InterfaceC66817QKf LJIIJ;
    public static InterfaceC66827QKp LJIIJJI;
    public static InterfaceC66830QKs LJIIL;
    public static final String[] LIZ = {"aid", "app_version", "tt_data", "device_id"};
    public static final String[] LIZIZ = {"tt_data", "device_platform", "aid", "device_id", "iid"};
    public static final String[] LIZJ = {"aid", "version_code", "ab_version", "device_id", "iid", "device_platform"};
    public static final Object LJII = new Object();
    public static final ConcurrentHashMap<String, String> LJIIIIZZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LJIIIZ = new ConcurrentHashMap<>();

    public static void LIZ(Context context) {
        if (LJ || context == null) {
            return;
        }
        synchronized (LJII) {
            try {
                SharedPreferences LIZIZ2 = F9J.LIZIZ(context, 0, "app_log_encrypt_switch_count");
                LJI = LIZIZ2.getInt("app_log_encrypt_faild_count", 0);
                SharedPreferences.Editor edit = LIZIZ2.edit();
                edit.putInt("app_log_encrypt_faild_count", LJI + 1);
                edit.apply();
                LJ = true;
            } catch (Throwable unused) {
            }
        }
    }

    public static String LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri.Builder buildUpon = UriProtector.parse(LJ(str, LIZ)).buildUpon();
        try {
            buildUpon.appendQueryParameter("tt_info", new String(Base64.encode(LIZIZ(null, UriProtector.parse(str).getQuery().getBytes("UTF-8"), null), 8)));
            return buildUpon.build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void LJFF(Context context) {
        if (LJFF || context == null) {
            return;
        }
        synchronized (LJII) {
            try {
                SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "app_log_encrypt_switch_count").edit();
                if (LJI > 2) {
                    LJI -= 2;
                } else {
                    LJI = 0;
                }
                edit.putInt("app_log_encrypt_faild_count", LJI);
                edit.apply();
                LJFF = true;
            } catch (Throwable unused) {
            }
        }
    }

    public static void LIZJ(java.util.Map<String, String> map, java.util.Map<String, String> map2) {
        try {
            if (!map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!C38354F3m.LJ(key) && !C38354F3m.LJ(value)) {
                            map2.put(key, value);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static String LJ(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        android.net.Uri parse = UriProtector.parse(str);
        HashMap hashMap = new HashMap(strArr.length);
        for (String str2 : strArr) {
            String queryParameter = UriProtector.getQueryParameter(parse, str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put(str2, queryParameter);
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str3 : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) hashMap.get(str3));
        }
        return buildUpon.build().toString();
    }

    public static byte[] LIZIZ(Context context, byte[] bArr, String str) {
        byte[] bArr2 = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (context != null) {
                    LIZ(context);
                    if (LJI < 3) {
                        bArr2 = EncryptorUtil.LIZ(byteArray.length, byteArray);
                        LJFF(context);
                        if (bArr2 == null) {
                            QIV.LIZJ(str, QIL.f_to_bytes_encrypt);
                        }
                    }
                } else {
                    bArr2 = EncryptorUtil.LIZ(byteArray.length, byteArray);
                    if (bArr2 == null) {
                        QIV.LIZJ(str, QIL.f_to_bytes_encrypt);
                    }
                }
                return bArr2;
            } catch (Throwable unused) {
                QIV.LIZJ(str, QIL.f_to_bytes_compress);
                return null;
            }
        } finally {
            gZIPOutputStream.close();
        }
    }
}
