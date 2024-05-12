package com.ss.android.common.util;

import X.C0ON;
import X.C16880lQ;
import X.C1E4;
import X.C268513p;
import X.C268613q;
import X.C2NU;
import X.C36365EOz;
import X.C37280Ek8;
import X.C38281F0r;
import X.C39405FdJ;
import X.C39571Ffz;
import X.C48001Isf;
import X.C48189Ivh;
import X.C48211Iw3;
import X.C48493J1l;
import X.C63081OpJ;
import X.C65155Phf;
import X.C65158Phi;
import X.C65162Phm;
import X.C65167Phr;
import X.C66619QCp;
import X.C66621QCr;
import X.C8HY;
import X.EYT;
import X.EnumC36624EYy;
import X.EnumC48210Iw2;
import X.F30;
import X.FUA;
import X.InterfaceC36924EeO;
import X.InterfaceC38669FFp;
import X.InterfaceC39042FTy;
import X.InterfaceC49552Jca;
import X.InterfaceC61858OPm;
import X.InterfaceC65157Phh;
import X.InterfaceC65160Phk;
import X.InterfaceC65165Php;
import X.InterfaceC65166Phq;
import X.InterfaceC65169Pht;
import X.InterfaceC65170Phu;
import X.InterfaceC65171Phv;
import X.QJY;
import X.RunnableC64919Pdr;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.legoImp.NetWorkInjectImpl;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class NetworkUtils {
    public static InterfaceC65166Phq sApiInterceptor;
    public static InterfaceC65165Php sApiLibSelector;
    public static InterfaceC36924EeO sCommandListener;
    public static InterfaceC39042FTy sMonitorProcessHook;
    public static volatile InterfaceC38669FFp sServerTimeFromResponse;
    public static String sShareCookieHost;
    public static final Object sCookieLock = new Object();
    public static volatile boolean sCookieMgrInited = false;
    public static String sUserAgent = null;
    public static volatile boolean mAllowKeepAlive = true;
    public static volatile boolean sHasRebuildSsl = false;
    public static volatile int sUseDnsMapping = -1;
    public static volatile long mServerTime = -1;
    public static volatile long mLocalTime = -1;
    public static ArrayList<String> sNoHttpList = new ArrayList<>();
    public static int isForceHttps = 1;

    public static String com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(String str) {
        return str;
    }

    public static void com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(String str) {
    }

    public static String filterUrl(String str) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        return str;
    }

    public static InterfaceC65166Phq getApiRequestInterceptor() {
        return null;
    }

    public static List<String> getShareCookie(CookieManager cookieManager, String str) {
        return null;
    }

    public static List<String> getShareCookieHostList(String str) {
        return null;
    }

    public static void handleTimeStampFromResponse(String str) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(str);
    }

    public static void setApiLibrarySelector(InterfaceC65165Php interfaceC65165Php) {
    }

    public static void setApiRequestInterceptor(InterfaceC65166Phq interfaceC65166Phq) {
    }

    public static boolean getUseDnsMapping() {
        if (sUseDnsMapping > 0) {
            return true;
        }
        return false;
    }

    public static synchronized void tryInitUserAgent() {
        synchronized (NetworkUtils.class) {
            if (sUserAgent != null) {
                return;
            }
            String userAgentString = NetWorkInjectImpl.LIZIZ().getUserAgentString();
            if (userAgentString != null) {
                try {
                    char[] charArray = userAgentString.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        char c = charArray[i];
                        if (c < ' ' || c > '~') {
                            charArray[i] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        userAgentString = new String(charArray);
                    }
                } catch (Exception unused) {
                }
            }
            sUserAgent = userAgentString;
        }
    }

    public static CookieManager tryNecessaryInit() {
        synchronized (sCookieLock) {
            if (!sCookieMgrInited) {
                try {
                    Thread.sleep(1500L);
                } catch (Exception unused) {
                }
                sCookieMgrInited = true;
            }
        }
        C36365EOz LIZ = NetWorkInjectImpl.LIZIZ().LIZ();
        if (LIZ != null) {
            LIZ.LIZ();
        }
        CookieManager cookieManager = CookieManager.getInstance();
        if (!cookieManager.acceptCookie()) {
            cookieManager.setAcceptCookie(true);
        }
        return cookieManager;
    }

    public static int com_ss_android_common_util_NetworkUtils__getServerTime$___twin___() {
        return (int) (getServerTimeMills() / 1000);
    }

    public static int com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_getServerTime() {
        return C1E4.LJIIZILJ();
    }

    public static EYT getApiProcessHook() {
        return NetWorkInjectImpl.LIZIZ().LIZ();
    }

    public static Context getAppContext() {
        return NetWorkInjectImpl.LIZIZ().getAppContext();
    }

    public static int getServerTime() {
        return C1E4.LJIIZILJ();
    }

    public static long getServerTimeMills() {
        long currentTimeMillis = System.currentTimeMillis();
        if (mServerTime > 0) {
            return (System.currentTimeMillis() + mServerTime) - mLocalTime;
        }
        return currentTimeMillis;
    }

    public static String getUserAgent() {
        tryInitUserAgent();
        return sUserAgent;
    }

    public static boolean getAllowKeepAlive() {
        return mAllowKeepAlive;
    }

    public static InterfaceC36924EeO getCommandListener() {
        return sCommandListener;
    }

    public static boolean getHasRebuildSsl() {
        return sHasRebuildSsl;
    }

    public static int getIsForceHttps() {
        return isForceHttps;
    }

    public static String getShareCookieHost() {
        return sShareCookieHost;
    }

    public static boolean INVOKESTATIC_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int INVOKEVIRTUAL_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C48001Isf.LIZ.getAndSet(true)) {
                C48001Isf.LIZ().LIZIZ();
            }
            int LIZ = C48001Isf.LIZ().LIZ();
            if (!C48001Isf.LIZJ && LIZ == -1) {
                return 0;
            }
            return LIZ;
        }
        return telephonyManager.getNetworkType();
    }

    public static String com_ss_android_common_util_NetworkUtils__filterUrl$___twin___(String str) {
        TextUtils.isEmpty(str);
        return str;
    }

    public static void com_ss_android_common_util_NetworkUtils__handleTimeStampFromResponse$___twin___(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long j = -1;
        if (sServerTimeFromResponse != null) {
            sServerTimeFromResponse.getClass();
            try {
                j = ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1L);
            } catch (Exception unused) {
            }
            if (j > 0) {
                mServerTime = j;
                mLocalTime = System.currentTimeMillis();
                return;
            }
            return;
        }
        try {
            long optLong = ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1L);
            if (optLong >= 0) {
                mServerTime = optLong;
                mLocalTime = System.currentTimeMillis();
            }
        } catch (Exception unused2) {
        }
    }

    public static long extractMaxAge(F30 f30) {
        InterfaceC61858OPm LIZ;
        long j = -1;
        if (f30 == null || (LIZ = f30.LIZ("Cache-Control")) == null) {
            return -1L;
        }
        try {
            InterfaceC65160Phk[] elements = LIZ.getElements();
            if (elements != null) {
                for (InterfaceC65160Phk interfaceC65160Phk : elements) {
                    if ("max-age".equals(interfaceC65160Phk.getName())) {
                        String value = interfaceC65160Phk.getValue();
                        if (value == null) {
                            return -1L;
                        }
                        j = CastLongProtector.parseLong(value);
                        return j;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return j;
    }

    public static String getEtag(F30 f30) {
        InterfaceC61858OPm LIZ;
        if (f30 == null || (LIZ = f30.LIZ("ETag")) == null) {
            return null;
        }
        return LIZ.getValue();
    }

    public static String getLastModified(F30 f30) {
        InterfaceC61858OPm LIZ;
        if (f30 == null || (LIZ = f30.LIZ("Last-Modified")) == null) {
            return null;
        }
        return LIZ.getValue();
    }

    public static String getNetworkAccessType(EnumC48210Iw2 enumC48210Iw2) {
        try {
            int i = C48211Iw3.LIZ[enumC48210Iw2.ordinal()];
            if (i == 1) {
                return "wifi";
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "mobile";
                    }
                    return "4g";
                }
                return "3g";
            }
            return "2g";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getNetworkOperatorCode(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
            C39405FdJ.LJFF.getClass();
            return C39571Ffz.LIZJ(telephonyManager);
        } catch (Exception unused) {
            return "unkown";
        }
    }

    public static EnumC48210Iw2 getNetworkType(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null || !LJJLI.isAvailable()) {
                return EnumC48210Iw2.NONE;
            }
            int type = LJJLI.getType();
            if (1 == type) {
                return EnumC48210Iw2.WIFI;
            }
            if (type == 0) {
                switch (INVOKEVIRTUAL_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType((TelephonyManager) C16880lQ.LLILL(context, "phone"))) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return EnumC48210Iw2.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return EnumC48210Iw2.MOBILE_3G;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return EnumC48210Iw2.MOBILE_4G;
                    default:
                        return EnumC48210Iw2.MOBILE;
                }
            }
            return EnumC48210Iw2.MOBILE;
        } catch (Throwable unused) {
            return EnumC48210Iw2.MOBILE;
        }
    }

    public static boolean isHitNoHttpList(String str) {
        ArrayList<String> arrayList;
        if (isForceHttps == 1) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && (arrayList = sNoHttpList) != null && !arrayList.isEmpty()) {
            Iterator<String> it = sNoHttpList.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMobile(Context context) {
        EnumC48210Iw2 networkType = getNetworkType(context);
        if (EnumC48210Iw2.MOBILE_2G == networkType || EnumC48210Iw2.MOBILE_3G == networkType || EnumC48210Iw2.MOBILE_4G == networkType || EnumC48210Iw2.MOBILE == networkType) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        return INVOKESTATIC_com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(context);
    }

    public static boolean isWifi(Context context) {
        return C48189Ivh.LJI(context);
    }

    public static Pair<String, String> parseContentType(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        InterfaceC65160Phk[] elements = new C66621QCr("Content-Type", str).getElements();
        if (elements.length == 0) {
            return null;
        }
        int i = 0;
        InterfaceC65160Phk interfaceC65160Phk = elements[0];
        String name = interfaceC65160Phk.getName();
        InterfaceC49552Jca[] parameters = interfaceC65160Phk.getParameters();
        if (parameters != null) {
            int length = parameters.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC49552Jca interfaceC49552Jca = parameters[i];
                if ("charset".equalsIgnoreCase(interfaceC49552Jca.getName())) {
                    str2 = interfaceC49552Jca.getValue();
                    break;
                }
                i++;
            }
        }
        return new Pair<>(name, str2);
    }

    public static void safeClose(Closeable closeable) {
        safeClose(closeable, null);
    }

    public static void setAllowKeepAlive(boolean z) {
        mAllowKeepAlive = z;
    }

    public static void setCommandListener(InterfaceC36924EeO interfaceC36924EeO) {
        sCommandListener = interfaceC36924EeO;
    }

    public static void setHasRebuildSsl(boolean z) {
        sHasRebuildSsl = z;
    }

    public static void setIsForceHttps(int i) {
        isForceHttps = i;
    }

    public static void setMonitorProcessHook(InterfaceC39042FTy interfaceC39042FTy) {
        sMonitorProcessHook = interfaceC39042FTy;
    }

    public static void setNoHttpList(ArrayList<String> arrayList) {
        sNoHttpList = arrayList;
    }

    public static void setServerTimeFromResponse(InterfaceC38669FFp interfaceC38669FFp) {
        sServerTimeFromResponse = interfaceC38669FFp;
    }

    public static void setShareCookieHost(String str) {
        sShareCookieHost = str;
    }

    public static void setTimeout(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            uRLConnection.setConnectTimeout(15000);
            uRLConnection.setReadTimeout(15000);
        }
    }

    public static void setUseDnsMapping(int i) {
        sUseDnsMapping = i;
    }

    public static void setUserAgent(HttpParams httpParams) {
        tryInitUserAgent();
        String str = sUserAgent;
        if (!TextUtils.isEmpty(str)) {
            if (httpParams != null) {
                httpParams.setParameter("http.useragent", str);
                return;
            }
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public static boolean testIsSSBinary(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf("application/octet-stream")) < 0 || str.indexOf("ssmix=", indexOf + 24) <= 0) {
            return false;
        }
        return true;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static String addCommonParams(String str, boolean z) {
        if (NetWorkInjectImpl.LIZIZ().LIZ() != null) {
            return QJY.LIZIZ(str, z);
        }
        return str;
    }

    public static String addGetRetryCountParam(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C38281F0r c38281F0r = new C38281F0r(str);
            c38281F0r.LIZLLL("retry_type", str2);
            return c38281F0r.toString();
        }
        return str;
    }

    public static List<C66619QCp> addPostRetryCountParam(List<C66619QCp> list, String str) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new C66619QCp("retry_type", str));
        return list;
    }

    public static byte[] downloadFile(int i, String str) {
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh != null) {
            return interfaceC65157Phh.LIZJ(i, str);
        }
        return null;
    }

    public static String executeGet(int i, String str) {
        return executeGet(0, i, str, true, true);
    }

    public static String joinCommonParams(String str, List<C66619QCp> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C63081OpJ.LJJIII(list, "UTF-8"));
        return sb.toString();
    }

    public static void putCommonParams(List<C66619QCp> list, boolean z) {
        if (NetWorkInjectImpl.LIZIZ().LIZ() != null) {
            C36365EOz.LIZIZ(list, z);
        }
    }

    public static void safeClose(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static String tryDnsMapping(String str, String[] strArr) {
        EnumC48210Iw2 networkType;
        if (sUseDnsMapping <= 0) {
            return str;
        }
        if (strArr != null && strArr.length > 0) {
            if (str != null && str.startsWith("https://")) {
                return str;
            }
            if (NetWorkInjectImpl.LIZIZ().getAppContext() == null || (networkType = getNetworkType(C16880lQ.LLLLL(NetWorkInjectImpl.LIZIZ().getAppContext()))) == null) {
                return str;
            }
            networkType.ordinal();
        }
        return str;
    }

    public static void addCacheValidationHeaders(List<InterfaceC61858OPm> list, String str, String str2) {
        if (list == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            list.add(new C66621QCr("If-None-Match", str));
        }
        if (!TextUtils.isEmpty(str2)) {
            list.add(new C66621QCr("If-Modified-Since", str2));
        }
    }

    public static String decodeSSBinary(byte[] bArr, int i, String str) {
        if (bArr == null || i <= 0) {
            return null;
        }
        byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
            i2++;
        } while (i2 < i);
        return new String(bArr, 0, i, str);
    }

    public static String executeGet(int i, String str, List<C66619QCp> list) {
        return executeGet(0, i, str, true, true, list);
    }

    public static String executePost(int i, String str, C65155Phf c65155Phf) {
        return executePost(0, i, str, c65155Phf, (InterfaceC65171Phv[]) null);
    }

    public static byte[] getBytes(InputStream inputStream, long j, String str) {
        if (j <= 2147483647L) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read < 0) {
                    break;
                }
                i2 += read;
            }
            if (i2 >= i) {
                inputStream.close();
                return bArr;
            }
            throw new IOException(i0.LJFF("Could not completely read file ", str));
        }
        throw new IOException(i0.LJFF("File is too large: ", str));
    }

    public static void handleApiOk(String str, long j, C65167Phr c65167Phr) {
        NetWorkInjectImpl.LIZIZ().LIZ();
        TextUtils.isEmpty(str);
    }

    public static void jsonObjectToBasicNameValuePairs(List<C66619QCp> list, JSONObject jSONObject, String str) {
        String LIZJ;
        String obj;
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (TextUtils.isEmpty(str)) {
                LIZJ = next;
            } else {
                LIZJ = C0ON.LIZJ(str, "[", next, "]");
            }
            Object obj2 = jSONObject.get(next);
            if (obj2 instanceof JSONObject) {
                jsonObjectToBasicNameValuePairs(list, (JSONObject) obj2, LIZJ);
            } else if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                for (int i = 0; i < jSONArray.length(); i++) {
                    jsonObjectToBasicNameValuePairs(list, JSONArrayProtectorUtils.getJSONObject(jSONArray, i), LIZJ);
                }
            } else {
                if (obj2 == null) {
                    obj = "";
                } else {
                    obj = obj2.toString();
                }
                list.add(new C66619QCp(LIZJ, obj));
            }
        }
    }

    public static byte[] stream2ByteArray(int i, InputStream inputStream, long j) {
        if (inputStream == null) {
            return null;
        }
        if (j > 2147483647L) {
            return null;
        }
        if (j < 0) {
            j = 4096;
        } else if (j > i) {
            return null;
        }
        try {
            C65158Phi c65158Phi = new C65158Phi((int) j);
            byte[] bArr = new byte[4096];
            int i2 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    c65158Phi.LIZ(bArr, read);
                    i2 += read;
                } else {
                    int i3 = c65158Phi.LIZIZ;
                    byte[] bArr2 = new byte[i3];
                    if (i3 > 0) {
                        System.arraycopy(c65158Phi.LIZ, 0, bArr2, 0, i3);
                    }
                    return bArr2;
                }
            } while (i2 <= i);
            return null;
        } finally {
            inputStream.close();
        }
    }

    public static String executeGet(int i, String str, boolean z) {
        return executeGet(0, i, str, z, true);
    }

    public static String executePost(int i, String str, List<C66619QCp> list) {
        return executePost(0, i, str, list, (InterfaceC65171Phv[]) null);
    }

    public static String executeGet(int i, int i2, String str) {
        return executeGet(i, i2, str, true, true);
    }

    public static String executeGet(int i, String str, int i2, int i3) {
        return executeGet(0, i, str, true, true, (List<InterfaceC61858OPm>) null, (F30) null, true);
    }

    public static String executePost(String str, JSONObject jSONObject, String str2, List<InterfaceC61858OPm> list) {
        byte[] bytes;
        if (str2 != null && str2.startsWith("application/json")) {
            if (jSONObject == null) {
                bytes = null;
            } else {
                bytes = jSONObject.toString().getBytes("UTF-8");
            }
            return executePost(-1, str, bytes, EnumC36624EYy.GZIP, str2, list);
        }
        ArrayList arrayList = new ArrayList();
        jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
        return executePost(0, 0, str, arrayList, (InterfaceC65171Phv[]) null, list);
    }

    public static String executePut(String str, JSONObject jSONObject, String str2, List<InterfaceC61858OPm> list) {
        byte[] bytes;
        if (str2 != null && str2.startsWith("application/json")) {
            if (jSONObject == null) {
                bytes = null;
            } else {
                bytes = jSONObject.toString().getBytes("UTF-8");
            }
            return executePut(-1, str, bytes, EnumC36624EYy.GZIP, str2, list);
        }
        ArrayList arrayList = new ArrayList();
        jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
        return executePut(0, 0, str, arrayList, (InterfaceC65171Phv[]) null, list);
    }

    public static void handleApiError(String str, Throwable th, long j, C65167Phr c65167Phr) {
        if (TextUtils.isEmpty(str) || th == null) {
            return;
        }
        NetWorkInjectImpl.LIZIZ().LIZ();
    }

    public static String postFile(int i, String str, String str2, String str3) {
        C65155Phf c65155Phf = new C65155Phf();
        if (str3.startsWith("content://")) {
            Uri parse = UriProtector.parse(str3);
            InputStream LIZLLL = C268513p.LIZLLL(NetWorkInjectImpl.LIZIZ().getAppContext(), parse);
            long LJIIIZ = C268613q.LJIIIZ(NetWorkInjectImpl.LIZIZ().getAppContext(), parse);
            String path = parse.getPath();
            c65155Phf.LIZ(str2, getBytes(LIZLLL, LJIIIZ, path), path);
        } else {
            c65155Phf.LIZIZ(new File(str3), str2);
        }
        return executePost(0, i, str, c65155Phf);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2) {
        return executeGet(0, i, str, z, z2, (List<InterfaceC61858OPm>) null, (F30) null, true);
    }

    public static String executePost(int i, int i2, String str, C65155Phf c65155Phf) {
        return executePost(i, i2, str, c65155Phf, (InterfaceC65171Phv[]) null);
    }

    public static String executeGet(int i, int i2, String str, List<C66619QCp> list) {
        return executeGet(i, i2, str, true, true, list);
    }

    public static String executePost(int i, int i2, String str, List<C66619QCp> list) {
        return executePost(i, i2, str, list, (InterfaceC65171Phv[]) null);
    }

    public static String executeGet(int i, String str, boolean z, List<C66619QCp> list) {
        return executeGet(0, i, str, z, true, list);
    }

    public static String executePost(int i, String str, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        return executePost(0, i, str, c65155Phf, interfaceC65171PhvArr);
    }

    public static String executeGet(int i, int i2, String str, boolean z) {
        return executeGet(i, i2, str, z, true);
    }

    public static String executePost(int i, String str, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        return executePost(0, i, str, list, interfaceC65171PhvArr);
    }

    public static String executeDelete(int i, int i2, String str, List<InterfaceC61858OPm> list, List<C66619QCp> list2) {
        if (str == null) {
            return null;
        }
        String addCommonParams = addCommonParams(str, true);
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LIZLLL(i, i2, addCommonParams, list);
    }

    public static String executeGet(int i, String str, int i2, int i3, List<C66619QCp> list) {
        return executeGet(0, i, str, true, true, null, null, true, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Phf] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.Phv[]] */
    public static String executePost(int i, int i2, String str, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        try {
            i2 = interfaceC65171PhvArr;
            i = c65155Phf;
            return executePostRetry(i, i2, str, i, i2, addPostRetryCountParam(null, "no_retry"), true);
        } catch (Exception e) {
            if (!TextUtils.isEmpty(str) && str.startsWith("https") && ((e instanceof SSLException) || (e instanceof GeneralSecurityException))) {
                return executePostRetry(i, i2, str, i, i2, addPostRetryCountParam(null, "retry_http"), false);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executePostRetry(i, i2, str, i, i2, addPostRetryCountParam(null, "first_retry"), false);
        }
    }

    public static String executePostFile(int i, int i2, String str, C65155Phf c65155Phf, List<C66619QCp> list) {
        return executePostFile(i, i2, str, c65155Phf, null, list);
    }

    public static String executePostRetry(int i, int i2, String str, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        return executePostRetry(i, i2, str, list, interfaceC65171PhvArr, null);
    }

    public static void monitorApiSample(final long j, final long j2, final String str, final String str2, C65167Phr c65167Phr) {
        InterfaceC39042FTy interfaceC39042FTy = sMonitorProcessHook;
        if (!TextUtils.isEmpty(str) && j > 0 && interfaceC39042FTy != null) {
            final C8HY c8hy = (C8HY) interfaceC39042FTy;
            try {
                FUA.LIZJ.submit(new Runnable() { // from class: X.8Hc
                    public final void LIZ() {
                        String str3;
                        String[] strArr = new String[1];
                        C38354F3m.LJ(strArr[0]);
                        if (!TextUtils.isEmpty(str)) {
                            str3 = UriProtector.getQueryParameter(UriProtector.parse(str), "retry_type");
                        } else {
                            str3 = null;
                        }
                        if (!C8HY.this.LIZ && !TextUtils.isEmpty(str) && str.contains("aweme/v1/feed/?type=0")) {
                            C8HY.this.LIZ = true;
                        }
                        long j3 = j;
                        long j4 = j2;
                        String str4 = str;
                        String str5 = strArr[0];
                        String str6 = str2;
                        C198517qh c198517qh = new C198517qh();
                        c198517qh.LIZ.put("retry_type", str3);
                        c198517qh.LIZ.put("First_Request", String.valueOf(C8HY.this.LIZ));
                        C09900aA.LJIIIIZZ(j3, j4, str4, str5, str6, 200, c198517qh.LJ());
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static String postFile(int i, String str, String str2, String str3, List<C66619QCp> list) {
        C65155Phf c65155Phf = new C65155Phf();
        if (str3.startsWith("content://")) {
            Uri parse = UriProtector.parse(str3);
            InputStream LIZLLL = C268513p.LIZLLL(NetWorkInjectImpl.LIZIZ().getAppContext(), parse);
            long LJIIIZ = C268613q.LJIIIZ(NetWorkInjectImpl.LIZIZ().getAppContext(), parse);
            String path = parse.getPath();
            c65155Phf.LIZ(str2, getBytes(LIZLLL, LJIIIZ, path), path);
        } else {
            c65155Phf.LIZIZ(new File(str3), str2);
        }
        return executePostFile(0, i, str, c65155Phf, list);
    }

    public static String response2String(boolean z, boolean z2, int i, InputStream inputStream, String str) {
        int read;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        if (str == null) {
            str = "UTF-8";
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } finally {
                safeClose(inputStream);
            }
        }
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        int i2 = 0;
        do {
            try {
                try {
                    if (i2 + 4096 > bArr.length) {
                        byte[] bArr2 = new byte[bArr.length * 2];
                        System.arraycopy(bArr, 0, bArr2, 0, i2);
                        bArr = bArr2;
                    }
                    read = inputStream.read(bArr, i2, 4096);
                } catch (IOException e) {
                    String message = e.getMessage();
                    if (!z || i2 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                        throw e;
                    }
                }
            } catch (EOFException e2) {
                if (!z || i2 <= 0) {
                    throw e2;
                }
            }
            if (read > 0) {
                i2 += read;
            } else {
                if (i2 <= 0) {
                    return null;
                }
                if (z2) {
                    return decodeSSBinary(bArr, i2, str);
                }
                return new String(bArr, 0, i2, str);
            }
        } while (i2 <= i);
        return null;
    }

    public static String response2StringOpt(boolean z, boolean z2, int i, InputStream inputStream, String str) {
        int read;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        if (str == null) {
            str = "UTF-8";
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } finally {
                safeClose(inputStream);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        do {
            try {
                read = inputStream.read(bArr, 0, FileUtils.BUFFER_SIZE);
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                if (byteArrayOutputStream.size() <= 0) {
                    return null;
                }
                if (z2) {
                    return decodeSSBinary(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size(), str);
                }
                return byteArrayOutputStream.toString(str);
            }
        } while (byteArrayOutputStream.size() <= i);
        return null;
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<C66619QCp> list) {
        return executeGet(0, i, str, z, z2, null, null, true, list);
    }

    public static String executePost(int i, int i2, String str, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        return executePost(i, i2, str, list, interfaceC65171PhvArr, (List<InterfaceC61858OPm>) null);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4) {
        return executeGet(i, i2, str, true, true, (List<InterfaceC61858OPm>) null, (F30) null, true);
    }

    public static String executePost(int i, String str, byte[] bArr, EnumC36624EYy enumC36624EYy, String str2) {
        return executePost(i, str, bArr, enumC36624EYy, str2, (List<InterfaceC61858OPm>) null);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2) {
        return executeGet(i, i2, str, z, z2, (List<InterfaceC61858OPm>) null, (F30) null, true);
    }

    public static String executeGet(int i, int i2, String str, boolean z, List<C66619QCp> list) {
        return executeGet(i, i2, str, z, true, list);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4, List<C66619QCp> list) {
        return executeGet(i, i2, str, true, true, null, null, true, list);
    }

    public static String executePost(int i, int i2, String str, byte[] bArr, EnumC36624EYy enumC36624EYy, String str2) {
        String str3;
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (EnumC36624EYy.GZIP == enumC36624EYy) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str3 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                return null;
            }
        } else if (EnumC36624EYy.DEFLATER == enumC36624EYy && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[FileUtils.BUFFER_SIZE];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str3 = "deflate";
        } else {
            str3 = null;
        }
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LIZ(i, i2, str, bArr, str3, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Phf] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Phv[]] */
    public static String executePostFile(int i, int i2, String str, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr, List<C66619QCp> list) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        try {
            i2 = interfaceC65171PhvArr;
            i = c65155Phf;
            return executePostFileRetry(i, i2, str, i, i2, addPostRetryCountParam(list, "no_retry"), true);
        } catch (Exception e) {
            if (!TextUtils.isEmpty(str) && str.startsWith("https") && ((e instanceof SSLException) || (e instanceof GeneralSecurityException))) {
                return executePostFileRetry(i, i2, str, i, i2, addPostRetryCountParam(list, "retry_http"), false);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executePostFileRetry(i, i2, str, i, i2, addPostRetryCountParam(list, "first_retry"), false);
        }
    }

    public static String executePostRetry(int i, int i2, String str, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr, List<InterfaceC61858OPm> list2) {
        return executetRetry("post", i, i2, str, list, interfaceC65171PhvArr, list2);
    }

    public static String executePut(int i, String str, byte[] bArr, EnumC36624EYy enumC36624EYy, String str2, List<InterfaceC61858OPm> list) {
        if (str == null) {
            return null;
        }
        return execute("put", i, addCommonParams(str, true), bArr, enumC36624EYy, str2, list);
    }

    public static String executePutRetry(int i, int i2, String str, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr, List<InterfaceC61858OPm> list2) {
        return executetRetry("put", i, i2, str, list, interfaceC65171PhvArr, list2);
    }

    public static void monitorApiError(long j, long j2, String str, String str2, C65167Phr c65167Phr, Throwable th) {
        InterfaceC39042FTy interfaceC39042FTy;
        if (TextUtils.isEmpty(str) || th == null || (interfaceC39042FTy = sMonitorProcessHook) == null) {
            return;
        }
        try {
            FUA.LIZJ.submit(new RunnableC64919Pdr((C8HY) interfaceC39042FTy, str, th, str2, j, j2));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static String postFile(int i, String str, String str2, String str3, Map<String, String> map, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        C65155Phf c65155Phf = new C65155Phf();
        if (str3.startsWith("content://")) {
            Uri parse = UriProtector.parse(str3);
            InputStream LIZLLL = C268513p.LIZLLL(NetWorkInjectImpl.LIZIZ().getAppContext(), parse);
            long LJIIIZ = C268613q.LJIIIZ(NetWorkInjectImpl.LIZIZ().getAppContext(), parse);
            String path = parse.getPath();
            c65155Phf.LIZ(str2, getBytes(LIZLLL, LJIIIZ, path), path);
        } else {
            c65155Phf.LIZIZ(new File(str3), str2);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                ((HashSet) c65155Phf.LIZ).add(new C65162Phm(key, value));
            }
        }
        return executePost(0, i, str, c65155Phf, interfaceC65171PhvArr);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<C66619QCp> list) {
        return executeGet(i, i2, str, z, z2, null, null, true, list);
    }

    public static String executePost(int i, String str, byte[] bArr, EnumC36624EYy enumC36624EYy, String str2, List<InterfaceC61858OPm> list) {
        if (str == null) {
            return null;
        }
        return execute("post", i, addCommonParams(str, true), bArr, enumC36624EYy, str2, list);
    }

    public static String executePut(int i, int i2, String str, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr, List<InterfaceC61858OPm> list2) {
        return execute("put", i, i2, str, list, interfaceC65171PhvArr, list2);
    }

    public static String executePost(int i, int i2, String str, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr, List<InterfaceC61858OPm> list2) {
        return execute("post", i, i2, str, list, interfaceC65171PhvArr, list2);
    }

    public static String execute(String str, int i, String str2, byte[] bArr, EnumC36624EYy enumC36624EYy, String str3, List<InterfaceC61858OPm> list) {
        String str4;
        byte[] bArr2 = bArr;
        if (!"get".equals(str)) {
            if (!"delete".equals(str)) {
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
                if (str2 != null && !TextUtils.isEmpty(str)) {
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    int length = bArr2.length;
                    if (EnumC36624EYy.GZIP == enumC36624EYy) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(bArr2);
                            gZIPOutputStream.close();
                            bArr2 = byteArrayOutputStream.toByteArray();
                            str4 = "gzip";
                        } catch (Throwable unused) {
                            gZIPOutputStream.close();
                            return null;
                        }
                    } else if (EnumC36624EYy.DEFLATER == enumC36624EYy && length > 128) {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
                        Deflater deflater = new Deflater();
                        deflater.setInput(bArr2);
                        deflater.finish();
                        byte[] bArr3 = new byte[FileUtils.BUFFER_SIZE];
                        while (!deflater.finished()) {
                            byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
                        }
                        deflater.end();
                        bArr2 = byteArrayOutputStream2.toByteArray();
                        str4 = "deflate";
                    } else {
                        str4 = null;
                    }
                    InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
                    if (interfaceC65157Phh != null) {
                        if ("put".equals(str)) {
                            return interfaceC65157Phh.LJFF(i, str2, bArr2, str4, str3, list);
                        }
                        return interfaceC65157Phh.LJIIJJI(0, i, str2, bArr2, str4, str3, list);
                    }
                }
                return null;
            }
            throw new RuntimeException("This method does not support [delete]");
        }
        throw new RuntimeException("this method does not support [get]");
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<InterfaceC61858OPm> list, F30 f30, boolean z3) {
        return executeGet(0, i, str, z, z2, list, f30, z3);
    }

    public static String executePostFileRetry(int i, int i2, String str, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr, List<C66619QCp> list, boolean z) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(str, arrayList);
        list.addAll(arrayList);
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LJIIIZ(i, i2, joinCommonParams, c65155Phf, interfaceC65171PhvArr, list);
    }

    public static String executePostRetry(int i, int i2, String str, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr, List<C66619QCp> list, boolean z) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null) {
            return null;
        }
        putCommonParams(list, true);
        String joinCommonParams = joinCommonParams(str, list);
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LJIIIZ(i, i2, joinCommonParams, c65155Phf, interfaceC65171PhvArr, list);
    }

    public static String executetRetry(String str, int i, int i2, String str2, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr, List<InterfaceC61858OPm> list2) {
        if (str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (!"get".equals(str)) {
            if (!"delete".equals(str)) {
                ArrayList arrayList = new ArrayList();
                putCommonParams(arrayList, true);
                String joinCommonParams = joinCommonParams(str2, arrayList);
                list.addAll(arrayList);
                InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
                if (interfaceC65157Phh == null) {
                    return null;
                }
                if ("put".equals(str)) {
                    return interfaceC65157Phh.LJI(i, i2, joinCommonParams, list, interfaceC65171PhvArr, list2);
                }
                return interfaceC65157Phh.LJII(i, i2, joinCommonParams, list, interfaceC65171PhvArr, list2);
            }
            throw new RuntimeException("executetRetry does not support [delete]");
        }
        throw new RuntimeException("executetRetry does not support [get]");
    }

    public static String postData(int i, String str, String str2, byte[] bArr, String str3, Map<String, String> map, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        C65155Phf c65155Phf = new C65155Phf();
        c65155Phf.LIZ(str2, bArr, str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                ((HashSet) c65155Phf.LIZ).add(new C65162Phm(key, value));
            }
        }
        return executePost(0, i, str, c65155Phf, interfaceC65171PhvArr);
    }

    public static String uploadFile(int i, String str, String str2, String str3, InterfaceC65170Phu interfaceC65170Phu, long j, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null || TextUtils.isEmpty(str3)) {
            return null;
        }
        File file = new File(str3);
        C65155Phf c65155Phf = new C65155Phf();
        c65155Phf.LIZIZ(file, str2);
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(str, arrayList);
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LJIIJ(i, joinCommonParams, c65155Phf, j, interfaceC65171PhvArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.Phv[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.Phv[]] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static String execute(String str, int i, int i2, String str2, List<C66619QCp> list, InterfaceC65171Phv[] interfaceC65171PhvArr, List<InterfaceC61858OPm> list2) {
        com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
        try {
            i2 = list2;
            i = interfaceC65171PhvArr;
            return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "no_retry"), i, i2);
        } catch (Exception unused) {
            if (!TextUtils.isEmpty(str2) && str2.startsWith("https")) {
                if (!isHitNoHttpList(str2)) {
                    return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "retry_http"), i, i2);
                }
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
                return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "first_retry"), i, i2);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str2);
            return executetRetry(str, i, i2, str2, addPostRetryCountParam(list, "first_retry"), i, i2);
        }
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<InterfaceC61858OPm> list, F30 f30, boolean z3) {
        return executeGet(i, i2, str, z, z2, list, f30, z3, null);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<InterfaceC61858OPm> list, F30 f30, boolean z3, List<C66619QCp> list2) {
        return executeGet(0, i, str, z, z2, list, f30, z3, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<InterfaceC61858OPm> list, F30 f30, boolean z3, List<C66619QCp> list2) {
        try {
            i = list2;
            i2 = z2;
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executeGetRetry(i, i2, addGetRetryCountParam(str, "no_retry"), z, list, f30, z3, i, i2);
        } catch (Exception e) {
            if (!TextUtils.isEmpty(str) && str.startsWith("https") && ((e instanceof SSLException) || (e instanceof GeneralSecurityException))) {
                if (!isHitNoHttpList(str)) {
                    return executeGetRetry(i, i2, addGetRetryCountParam(str, "retry_http"), z, list, f30, z3, i, i2);
                }
                com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
                return executeGetRetry(i, i2, addGetRetryCountParam(str, "first_retry"), z, list, f30, z3, i, i2);
            }
            com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
            return executeGetRetry(i, i2, addGetRetryCountParam(str, "first_retry"), z, list, f30, z3, i, i2);
        }
    }

    public static String executeGetRetry(int i, int i2, String str, boolean z, List<InterfaceC61858OPm> list, F30 f30, boolean z2, List<C66619QCp> list2, boolean z3) {
        if (str == null) {
            return null;
        }
        if (z3) {
            str = addCommonParams(str, true);
        }
        if (!mAllowKeepAlive) {
            z = false;
        }
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LJIIIIZZ(i, i2, str, z, list, f30, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        throw new X.C48186Ive(r21, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        r3 = 0;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014d, code lost:
    
        X.C16880lQ.LLLZZIL(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
    
        r7 = null;
        r17.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ed, code lost:
    
        if (r11 <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f1, code lost:
    
        r5.seek(0);
        r3 = new java.io.FileOutputStream(new java.io.File(r14, r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0100, code lost:
    
        r1 = r5.read(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0104, code lost:
    
        if (r1 == (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0106, code lost:
    
        r3.write(r2, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010b, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0127, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0111, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0114, code lost:
    
        X.C16880lQ.LLLZZIL(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0117, code lost:
    
        safeClose(null, "close instream exception ");
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0121, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0122, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0123, code lost:
    
        r3 = 0;
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean stream2File(java.io.InputStream r17, long r18, X.InterfaceC65168Phs r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.InterfaceC65169Pht<java.lang.String> r25, java.lang.String r26, X.C37280Ek8 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.stream2File(java.io.InputStream, long, X.Phs, int, java.lang.String, java.lang.String, java.lang.String, X.Pht, java.lang.String, X.Ek8):boolean");
    }

    public static boolean downloadFile(int i, String str, String str2, String str3, String str4, InterfaceC65169Pht<String> interfaceC65169Pht, String str5, C37280Ek8 c37280Ek8, List<C66619QCp> list, String[] strArr, int[] iArr) {
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh != null) {
            return interfaceC65157Phh.LJ(i, str, str2, str3, str4, interfaceC65169Pht, str5, list, strArr, iArr);
        }
        return false;
    }

    public static boolean downloadVideo(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, InterfaceC65169Pht<String> interfaceC65169Pht, String str2, C37280Ek8 c37280Ek8, List<C66619QCp> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        InterfaceC65157Phh interfaceC65157Phh = C48493J1l.LIZ;
        if (interfaceC65157Phh != null) {
            return interfaceC65157Phh.LIZIZ(i, str, stringBuffer, stringBuffer2, stringBuffer3, interfaceC65169Pht, str2, list, strArr, iArr);
        }
        return false;
    }
}
