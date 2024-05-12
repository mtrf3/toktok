package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.a1;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import ujb.s;

/* renamed from: X.Q3d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66373Q3d {
    public static final /* synthetic */ int LIZ = 0;

    public static Cursor LIZLLL(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-5376867157050040043"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public static List LJ(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-5376867157050040043"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 65536);
    }

    public static String LJFF(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-5376867157050040043"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    public static Object LJI(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5376867157050040043"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static final boolean LJIJ() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String LLLZ = C16880lQ.LLLZ("fb%s://applinks", Arrays.copyOf(new Object[]{u.LIZLLL()}, 1));
            o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
            intent.setData(android.net.Uri.parse(LLLZ));
            Context LIZJ = u.LIZJ();
            PackageManager packageManager = LIZJ.getPackageManager();
            String packageName = LIZJ.getPackageName();
            Iterator it = LJ(packageManager, intent).iterator();
            while (it.hasNext()) {
                if (o.LJ(packageName, ((ResolveInfo) it.next()).activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final void LIZJ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final java.util.Map<String, Object> LJII(JSONObject jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                try {
                    String string = names.getString(i);
                    o.LJIIIIZZ(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = LJII((JSONObject) value);
                    }
                    o.LJIIIIZZ(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    public static final java.util.Map<String, String> LJIIIIZZ(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jSONObject.optString(key);
            if (optString != null) {
                o.LJIIIIZZ(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final void LJIIJ(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final String LJIILIIL(Context context) {
        if (context != null) {
            return u.LIZLLL();
        }
        throw new NullPointerException(a1.LJ("Argument '", "context", "' cannot be null"));
    }

    public static final boolean LJIJI(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null && new OJD(".+_cheets|cheets_.+").matches(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(android.net.Uri uri) {
        if (uri != null && (ujb.o.LJJJJIZL("http", uri.getScheme(), true) || ujb.o.LJJJJIZL("https", uri.getScheme(), true) || ujb.o.LJJJJIZL("fbstaging", uri.getScheme(), true))) {
            return true;
        }
        return false;
    }

    public static final java.util.Set<String> LJIL(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String string = jSONArray.getString(i);
                o.LJIIIIZZ(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashSet;
    }

    public static final List<String> LJJ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(jSONArray.getString(i));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public static final Bundle LJJI(String str) {
        Bundle bundle = new Bundle();
        if (!LJIJJ(str)) {
            if (str != null) {
                Object[] array = s.LJLJJL(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        i++;
                        Object[] array2 = s.LJLJJL(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException unused) {
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bundle;
    }

    public static final java.util.Map<String, String> LJJIIJ(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i = 0;
            do {
                i++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i < readInt);
        }
        return hashMap;
    }

    public static final String LJJIIJZLJL(byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance("SHA-1");
            o.LJIIIIZZ(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb = new StringBuilder();
            o.LJIIIIZZ(digest, "digest");
            int length = digest.length;
            int i = 0;
            while (i < length) {
                byte b = digest[i];
                i++;
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString((b >> 0) & 15));
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "builder.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static void LIZIZ(Context context, String str) {
        String LJFF;
        int i;
        boolean z;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String LJFF2 = LJFF(cookieManager, str);
        if (LJFF2 == null) {
            return;
        }
        Object[] array = s.LJLJJL(LJFF2, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = strArr[i2];
                i2++;
                Object[] array2 = s.LJLJJL(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
                        String str3 = strArr2[0];
                        int length2 = str3.length() - 1;
                        int i3 = 0;
                        boolean z2 = false;
                        while (i3 <= length2) {
                            if (!z2) {
                                i = i3;
                            } else {
                                i = length2;
                            }
                            if (o.LJIIJJI(str3.charAt(i), 32) <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z2) {
                                if (!z) {
                                    z2 = true;
                                } else {
                                    i3++;
                                }
                            } else if (!z) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        cookieManager.setCookie(str, o.LJIILLIIL("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i3, length2 + 1).toString()));
                        if (FCD.LJI(FKM.LIZ()) && FXL.LIZIZ() && (LJFF = LJFF(CookieManager.getInstance(), C39099FWd.LIZIZ())) != null && !TextUtils.equals(LJFF, C39099FWd.LIZ())) {
                            C39099FWd.LIZJ(C39099FWd.LIZIZ(), LJFF);
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final int LJIIIZ(InputStream inputStream, OutputStream outputStream) {
        o.LJIIIZ(outputStream, "outputStream");
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                bufferedInputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void LJIIL(final InterfaceC66375Q3f interfaceC66375Q3f, final String accessToken) {
        String str;
        String str2;
        o.LJIIIZ(accessToken, "accessToken");
        JSONObject jSONObject = L7L.LIZ.get(accessToken);
        if (jSONObject != null) {
            interfaceC66375Q3f.LIZIZ(jSONObject);
            return;
        }
        BMV bmv = new BMV() { // from class: X.Q3e
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
                InterfaceC66375Q3f callback = InterfaceC66375Q3f.this;
                String accessToken2 = accessToken;
                o.LJIIIZ(callback, "$callback");
                o.LJIIIZ(accessToken2, "$accessToken");
                FacebookRequestError facebookRequestError = c66381Q3l.LIZLLL;
                if (facebookRequestError != null) {
                    callback.LIZJ(facebookRequestError.exception);
                    return;
                }
                JSONObject jSONObject2 = c66381Q3l.LJ;
                if (jSONObject2 != null) {
                    L7L.LIZ.put(accessToken2, jSONObject2);
                    callback.LIZIZ(c66381Q3l.LJ);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
            }
        };
        Bundle bundle = new Bundle();
        AccessToken.Companion.getClass();
        AccessToken LIZIZ = C66382Q3m.LIZIZ();
        if (LIZIZ == null || (str = LIZIZ.graphDomain) == null) {
            str = "facebook";
        }
        if (o.LJ(str, "instagram")) {
            str2 = "id,name,profile_picture";
        } else {
            str2 = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str2);
        bundle.putString("access_token", accessToken);
        GraphRequest graphRequest = new GraphRequest(null, "me", null, null, new BMV() { // from class: X.Q3g
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
            }
        }, 32);
        graphRequest.LIZJ = bundle;
        graphRequest.LJIIIZ(EnumC66377Q3h.GET);
        u.LJIIIIZZ(EnumC66383Q3n.GRAPH_API_DEBUG_INFO);
        u.LJIIIIZZ(EnumC66383Q3n.GRAPH_API_DEBUG_WARNING);
        graphRequest.LJ = bmv;
        graphRequest.LIZLLL();
    }

    public static final void LJJIFFI(Bundle bundle, Object obj) {
        o.LJIIIZ(bundle, "bundle");
        if (obj instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble("media", ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt("media", ((Number) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray("media", (int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong("media", ((Number) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray("media", (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString("media", (String) obj);
        } else {
            bundle.putString("media", ((JSONArray) obj).toString());
        }
    }

    public static final void LJJIIZ(Parcel parcel, java.util.Map<String, String> map) {
        o.LJIIIZ(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final android.net.Uri LIZ(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle, str3);
                if (LLJJIII instanceof String) {
                    builder.appendQueryParameter(str3, (String) LLJJIII);
                }
            }
        }
        android.net.Uri build = builder.build();
        o.LJIIIIZZ(build, "builder.build()");
        return build;
    }

    public static final Date LJIIJJI(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
        if (LLJJIII instanceof Long) {
            parseLong = ((Number) LLJJIII).longValue();
        } else {
            if (LLJJIII instanceof String) {
                try {
                    parseLong = Long.parseLong((String) LLJJIII);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + date.getTime());
    }

    public static final Method LJIILJJIL(Class<?> cls, String str, Class<?>... parameterTypes) {
        o.LJIIIZ(parameterTypes, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method LJIILL(String str, String str2, Class<?>... clsArr) {
        try {
            return LJIILJJIL(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object LJIILLIIL(String str, String str2, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt != null) {
            if (!(opt instanceof String) || (opt = new JSONTokener((String) opt).nextValue()) != null) {
                if (!(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
                    if (str2 != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt(str2, opt);
                        return jSONObject2;
                    }
                    throw new Q4W("Got an unexpected non-JSON object.");
                }
                return opt;
            }
            return opt;
        }
        return opt;
    }

    public static final Object LJIIZILJ(Object obj, Method method, Object... objArr) {
        try {
            return LJI(obj, method, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final void LJJII(String str, String str2, Bundle bundle) {
        if (!LJIJJ(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static final void LJJIII(android.net.Uri uri, Bundle bundle, String str) {
        if (uri != null) {
            LJJII(str, uri.toString(), bundle);
        }
    }
}
