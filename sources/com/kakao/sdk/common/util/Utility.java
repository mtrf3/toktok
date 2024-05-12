package com.kakao.sdk.common.util;

import X.AV1;
import X.C00F;
import X.C03880Dg;
import X.C113554cx;
import X.C16880lQ;
import X.C32I;
import X.C38485F8n;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C65928Pu8;
import X.E77;
import X.OJD;
import X.OKG;
import X.OSZ;
import X.PVC;
import X.Q8U;
import X.QZP;
import X.X1D;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.g;
import com.google.gson.l;
import com.google.gson.m;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.SdkIdentifier;
import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class Utility {
    public static final Utility INSTANCE = new Utility();

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KakaoSdk.Type.values().length];
            iArr[KakaoSdk.Type.RX_KOTLIN.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String com_kakao_sdk_common_util_Utility_android_provider_Settings$Secure_getString(ContentResolver contentResolver, String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "3144816136717614900");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, str);
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public final byte[] androidId(Context context) {
        o.LJIIIZ(context, "context");
        try {
            String androidId = INVOKESTATIC_com_kakao_sdk_common_util_Utility_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(context.getContentResolver(), "android_id");
            o.LJIIIIZZ(androidId, "androidId");
            String replace = new OJD("[0\\s]").replace(androidId, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            String LJIILLIIL = o.LJIILLIIL(replace, "SDK-");
            Charset charset = PVC.LIZ;
            if (LJIILLIIL != null) {
                byte[] bytes = LJIILLIIL.getBytes(charset);
                o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes);
                byte[] digest = messageDigest.digest();
                o.LJIIIIZZ(digest, "{\n            val androidId =\n                Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)\n            val stripped = androidId.replace(\"[0\\\\s]\".toRegex(), \"\")\n            val md = MessageDigest.getInstance(\"SHA-256\")\n            md.reset()\n            md.update(\"SDK-$stripped\".toByteArray())\n            md.digest()\n        }");
                return digest;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("xxxx");
            LIZ.append((Object) Build.PRODUCT);
            LIZ.append("a23456789012345bcdefg");
            String LIZIZ = X1D.LIZIZ(LIZ);
            Charset charset2 = PVC.LIZ;
            if (LIZIZ != null) {
                byte[] bytes2 = LIZIZ.getBytes(charset2);
                o.LJIIIIZZ(bytes2, "(this as java.lang.String).getBytes(charset)");
                return bytes2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final String buildQuery(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(key);
            LIZ.append('=');
            LIZ.append(value);
            arrayList.add(X1D.LIZIZ(LIZ));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = C00F.LIZIZ((String) next, '&', (String) it.next());
            }
            return (String) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final String getJson(String path) {
        o.LJIIIZ(path, "path");
        ClassLoader classLoader = Utility.class.getClassLoader();
        if (classLoader != null) {
            return new String(C38485F8n.LLLF(new File(classLoader.getResource(path).getPath())), PVC.LIZ);
        }
        throw null;
    }

    public final g getJsonArray(String path) {
        o.LJIIIZ(path, "path");
        return (g) KakaoJson.INSTANCE.fromJson(getJson(path), g.class);
    }

    public final m getJsonObject(String path) {
        o.LJIIIZ(path, "path");
        return (m) KakaoJson.INSTANCE.fromJson(getJson(path), m.class);
    }

    public final String getKeyHash(Context context) {
        o.LJIIIZ(context, "context");
        return getKeyHashDeprecated(context);
    }

    public final String getKeyHashDeprecated(Context context) {
        o.LJIIIZ(context, "context");
        Signature[] signatureArr = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 64).signatures;
        o.LJIIIIZZ(signatureArr, "packageInfo.signatures");
        if (signatureArr.length > 0) {
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            o.LJIIIIZZ(encodeToString, "encodeToString(md.digest(), Base64.NO_WRAP)");
            return encodeToString;
        }
        throw new IllegalStateException();
    }

    public final Map<String, String> parseQuery(String str) {
        if (str == null) {
            return C113554cx.LJJJLIIL();
        }
        List LJLJJL = s.LJLJJL(str, new String[]{"&"}, 0, 6);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
        Iterator it = LJLJJL.iterator();
        while (it.hasNext()) {
            arrayList.add(s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((List) next).size() > 1) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            List list = (List) it3.next();
            arrayList3.add(new OSZ(ListProtector.get(list, 0), ListProtector.get(list, 1)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            OSZ osz = (OSZ) it4.next();
            Object first = osz.getFirst();
            String decode = URLDecoder.decode((String) osz.getSecond(), "UTF-8");
            o.LJIIIIZZ(decode, "decode(pair.second, \"UTF-8\")");
            linkedHashMap.put(first, decode);
        }
        return linkedHashMap;
    }

    public static String INVOKESTATIC_com_kakao_sdk_common_util_Utility_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(ContentResolver contentResolver, String str) {
        if (TextUtils.equals(str, "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = com_kakao_sdk_common_util_Utility_android_provider_Settings$Secure_getString(contentResolver, str);
            }
            return E77.LIZ;
        }
        return com_kakao_sdk_common_util_Utility_android_provider_Settings$Secure_getString(contentResolver, str);
    }

    public final m getExtras(Context context, KakaoSdk.Type sdkType) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sdkType, "sdkType");
        m mVar = new m();
        mVar.LJJIIZ("appPkg", context.getPackageName());
        mVar.LJJIIZ("keyHash", getKeyHash(context));
        mVar.LJJIIZ("KA", getKAHeader$default(this, context, sdkType, null, 4, null));
        return mVar;
    }

    public final String getMetadata(Context context, String key) {
        ApplicationInfo LLLLLLLLL;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            LLLLLLLLL = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } else {
            LLLLLLLLL = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128);
        }
        o.LJIIIIZZ(LLLLLLLLL, "if (Build.VERSION.SDK_INT >= 33) {\n            context.packageManager.getApplicationInfo(\n                context.packageName,\n                PackageManager.ApplicationInfoFlags.of(PackageManager.GET_META_DATA.toLong())\n            )\n        } else {\n            @Suppress(\"DEPRECATION\")\n            context.packageManager.getApplicationInfo(\n                context.packageName,\n                PackageManager.GET_META_DATA\n            )\n        }");
        return LLLLLLLLL.metaData.getString(key);
    }

    public final boolean hasAndNotNull(m jsonObject, String key) {
        o.LJIIIZ(jsonObject, "jsonObject");
        o.LJIIIZ(key, "key");
        if (jsonObject.LJJIJLIJ(key) && !(jsonObject.LJJIJ(key) instanceof l)) {
            return true;
        }
        return false;
    }

    public final String getKAHeader(Context context, KakaoSdk.Type sdkType, SdkIdentifier sdkIdentifier) {
        String str;
        String str2;
        String identifiers;
        String LJIILLIIL;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sdkType, "sdkType");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName;
        } else {
            str = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
        }
        Object[] objArr = new Object[17];
        objArr[0] = "sdk";
        objArr[1] = "2.11.2";
        objArr[2] = "sdk_type";
        if (WhenMappings.$EnumSwitchMapping$0[sdkType.ordinal()] == 1) {
            str2 = "rx-kotlin";
        } else {
            str2 = "kotlin";
        }
        objArr[3] = str2;
        objArr[4] = "os";
        objArr[5] = Integer.valueOf(i);
        objArr[6] = "lang";
        String language = Locale.getDefault().getLanguage();
        o.LJIIIIZZ(language, "getDefault().language");
        Locale locale = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        objArr[7] = lowerCase;
        String country = Locale.getDefault().getCountry();
        o.LJIIIIZZ(country, "getDefault().country");
        String upperCase = country.toUpperCase(locale);
        o.LJIIIIZZ(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        objArr[8] = upperCase;
        objArr[9] = "origin";
        objArr[10] = getKeyHash(context);
        objArr[11] = "device";
        String MODEL = Build.MODEL;
        o.LJIIIIZZ(MODEL, "MODEL");
        Locale locale2 = Locale.US;
        objArr[12] = QZP.LIZIZ("\\s", QZP.LIZIZ("[^\\p{ASCII}]", OKG.LIZJ(locale2, "US", MODEL, locale2, "(this as java.lang.String).toUpperCase(locale)"), "*"), "-");
        objArr[13] = "android_pkg";
        objArr[14] = context.getPackageName();
        objArr[15] = "app_ver";
        objArr[16] = str;
        String LIZIZ = Q8U.LIZIZ(objArr, 17, "%s/%s %s/%s %s/android-%s %s/%s-%s %s/%s %s/%s %s/%s %s/%s", "java.lang.String.format(format, *args)");
        if (sdkIdentifier == null || (identifiers = sdkIdentifier.getIdentifiers()) == null || (LJIILLIIL = o.LJIILLIIL(identifiers, LIZIZ)) == null) {
            return LIZIZ;
        }
        return LJIILLIIL;
    }

    public static /* synthetic */ String getKAHeader$default(Utility utility, Context context, KakaoSdk.Type type, SdkIdentifier sdkIdentifier, int i, Object obj) {
        if ((i & 4) != 0) {
            sdkIdentifier = null;
        }
        return utility.getKAHeader(context, type, sdkIdentifier);
    }
}
