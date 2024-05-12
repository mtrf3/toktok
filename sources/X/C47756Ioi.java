package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import defpackage.a1;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.Ioi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47756Ioi {
    public static String LIZ;

    public static Looper LJII() {
        if (Looper.myLooper() != null) {
            return Looper.myLooper();
        }
        return C16880lQ.LLJJJJ();
    }

    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("p2p=0")) {
            return str;
        }
        if (str.contains("p2p=0")) {
            return str;
        }
        if (!str.contains("?")) {
            return a1.LJ(str, "?", "p2p=0");
        }
        return a1.LJ(str, "&", "p2p=0");
    }

    public static String LIZJ(String str) {
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty("")) {
            return str;
        }
        boolean contains = str.contains("");
        boolean LJIIJ = LJIIJ(str);
        if (str.startsWith("https")) {
            str = str.replace("https", "http");
        }
        if (!LJIIJ && str.indexOf("http") == 0 && !contains) {
            try {
                String host = new java.net.URL(str).getHost();
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(C16880lQ.LLLZ(".%s", new Object[]{""}));
                str = str.replace(host, sb);
                return str;
            } catch (Exception e) {
                TTVideoEngineLog.d(e);
                return str;
            }
        }
        return str;
    }

    public static String LIZLLL(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https")) {
            return str.replace("https", "http");
        }
        return str;
    }

    public static String LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String LJFF(Context context) {
        String str = LIZ;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = C16880lQ.LLIIJLIL(C16880lQ.LLLLL(context)).getAbsolutePath();
            LIZ = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static float LJIIIZ(Context context) {
        AudioManager audioManager;
        int i;
        int streamVolume;
        double d;
        if (C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 256L)) {
            if (!C47820Ipk.LIZJ) {
                try {
                    if (!C47820Ipk.LIZ(context)) {
                        C47820Ipk.LIZLLL = new C47848IqC(C47820Ipk.LIZ);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                        C16880lQ.LJJLIIIJILLIZJL(C47820Ipk.LIZLLL, context, intentFilter);
                        C47820Ipk.LIZJ = true;
                    }
                } catch (Exception unused) {
                }
            }
            if (!C47820Ipk.LIZ(context)) {
                try {
                    if (C47820Ipk.LIZIZ < 0 || !C47820Ipk.LIZJ) {
                        if (!C47820Ipk.LIZ(context)) {
                            try {
                                streamVolume = C47820Ipk.LIZ.getStreamVolume(3);
                            } catch (Exception unused2) {
                            }
                            C47820Ipk.LIZIZ = streamVolume;
                        }
                        streamVolume = -1;
                        C47820Ipk.LIZIZ = streamVolume;
                    }
                    d = C47820Ipk.LIZIZ;
                } catch (Exception unused3) {
                }
                return (float) d;
            }
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            return (float) d;
        }
        if (context == null) {
            return 0.0f;
        }
        int i2 = 0;
        try {
            audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
        } catch (Exception unused4) {
        }
        if (audioManager != null) {
            i = audioManager.getStreamVolume(3);
            if (i < 0) {
                return i2;
            }
        } else {
            i = 0;
        }
        i2 = i;
        return i2;
    }

    public static boolean LJIIJ(String str) {
        if (str != null) {
            String str2 = "";
            if (!str.equals("")) {
                try {
                    str2 = new java.net.URL(str).getHost();
                } catch (Exception e) {
                    TTVideoEngineLog.d(e);
                }
                if (PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
                    return true;
                }
                int indexOf = str.indexOf("[");
                int indexOf2 = str.indexOf("]");
                if (indexOf > 0 && indexOf2 > indexOf && str.substring(indexOf, indexOf2).indexOf(":") > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIIJJI(String[] strArr) {
        if (strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("----start check url:");
                    LIZ2.append(str);
                    TTVideoEngineLog.d("isTranscodeUrl", X1D.LIZIZ(LIZ2));
                    String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "btag");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TTVideoEngineLog.d("isTranscodeUrl", "get query value is null");
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("get query value is:");
                        LIZ3.append(queryParameter);
                        TTVideoEngineLog.d("isTranscodeUrl", X1D.LIZIZ(LIZ3));
                        if (TextUtils.isEmpty(queryParameter) || !queryParameter.matches("^[A-Fa-f0-9]+$")) {
                            TTVideoEngineLog.d("isTranscodeUrl", "not hex string");
                        } else {
                            BigInteger bigInteger = new BigInteger(queryParameter, 16);
                            BigInteger bigInteger2 = new BigInteger("80000", 16);
                            if (bigInteger.and(bigInteger2).compareTo(bigInteger2) == 0) {
                                TTVideoEngineLog.d("isTranscodeUrl", "end url is transcoded");
                                return true;
                            }
                            TTVideoEngineLog.d("isTranscodeUrl", "****end url is not transcoded");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static String LJIILIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(CardStruct.IStatusCode.DEFAULT);
                    LIZ2.append(hexString);
                    hexString = X1D.LIZIZ(LIZ2);
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            TTVideoEngineLog.d(e);
            return "";
        }
    }

    public static int LJIILL(Object obj) {
        if (obj != null) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                return CastIntegerProtector.parseInt((String) obj);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Can't format ");
            LIZ2.append(obj.getClass());
            LIZ2.append(" to int");
            throw new NumberFormatException(X1D.LIZIZ(LIZ2));
        }
        throw null;
    }

    public static void LJIILLIIL(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            C16880lQ.LLLZZIL(file);
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                C16880lQ.LLLZZIL(file);
                return;
            }
            for (File file2 : listFiles) {
                LJIILLIIL(file2);
            }
            C16880lQ.LLLZZIL(file);
        }
    }

    public static long LJIJI(Long l) {
        if (l == null) {
            l = 0L;
        }
        return l.longValue();
    }

    public static String LIZIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str)) {
            try {
                byte[] decode = Base64.decode(str, 0);
                if (TextUtils.isEmpty(str2)) {
                    return new String(decode, "utf-8");
                }
                return C47810Ipa.LIZIZ(decode, Base64.decode(str2, 0));
            } catch (Throwable th) {
                TTVideoEngineLog.d("TTHelper", th.toString());
                return "";
            }
        }
        return str;
    }

    public static Class<?> LJI(int i, String str) {
        if (i >= 0 && !TextUtils.isEmpty(str)) {
            return Class.forName(str);
        }
        throw new Exception("pluginName or/and className is empty");
    }

    public static List<String> LJIIIIZZ(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("[?]");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2);
        LIZ2.append("=");
        int indexOf = str4.indexOf(X1D.LIZIZ(LIZ2));
        if (indexOf == -1) {
            return null;
        }
        arrayList.add(str3);
        arrayList.add("?");
        arrayList.add(str4.substring(0, indexOf));
        int indexOf2 = str4.indexOf("&", indexOf);
        if (indexOf2 == -1) {
            arrayList.add(str4.substring(indexOf));
            return arrayList;
        }
        arrayList.add(str4.substring(indexOf, indexOf2));
        arrayList.add(str4.substring(indexOf2));
        return arrayList;
    }

    public static String LJIIL(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (context != null) {
            String LJFF = LJFF(context);
            if (!TextUtils.isEmpty(LJFF)) {
                str.replace(LJFF, "");
            }
        }
        return LJIILIIL(str);
    }

    public static long LJIIZILJ(String str, java.util.Map map) {
        Object obj;
        if (map == null) {
            obj = null;
        } else {
            obj = ((HashMap) map).get(str);
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    public static String LJIILJJIL(String str, String str2, String str3) {
        List<String> LJIIIIZZ = LJIIIIZZ(str, str2);
        if (LJIIIIZZ != null) {
            ArrayList arrayList = (ArrayList) LJIIIIZZ;
            if (arrayList.size() == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append("=");
                if (str4.startsWith(X1D.LIZIZ(LIZ2))) {
                    C1DI.LIZIZ(sb, str2, "=", str3);
                } else {
                    sb.append(str4);
                }
            }
            return sb.toString();
        }
        return str;
    }

    public static double LJIJ(JSONObject jSONObject, String str, double d) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString)) {
            return d;
        }
        try {
            return CastDoubleProtector.parseDouble(optString);
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
            return d;
        }
    }
}
