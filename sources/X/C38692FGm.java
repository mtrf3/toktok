package X;

import Y.ARunnableS42S0100000_6;
import Y.ARunnableS5S1200000_6;
import Y.ARunnableS6S2200000_6;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FGm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38692FGm {
    public static volatile String LJIIJ;
    public static volatile byte[] LJIIJJI = new byte[0];
    public static java.util.Map<String, String> LJIIL = new ConcurrentHashMap();
    public final String LIZ;
    public final Context LIZIZ;
    public JSONObject LIZJ;
    public final java.util.Map<String, Integer> LIZLLL;
    public final InterfaceC38689FGj LJFF;
    public final C43588H8u LJI;
    public final C38694FGo LJII;
    public Future LJIIIIZZ;
    public final java.util.Map<String, Object> LJ = new ConcurrentHashMap();
    public final java.util.Map<String, Runnable> LJIIIZ = new ConcurrentHashMap();

    public static String LIZIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-8564638046565422683");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public final void LIZLLL() {
        String str;
        try {
            new StringBuilder(this.LIZ);
            if (!LJIIL.isEmpty()) {
                this.LIZ.indexOf(63);
                boolean z = true;
                for (Map.Entry<String, String> entry : LJIIL.entrySet()) {
                    if (z) {
                        z = false;
                    }
                    URLEncoder.encode(entry.getKey(), "UTF-8");
                    URLEncoder.encode(entry.getValue(), "UTF-8");
                }
            }
            this.LJI.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("message", "");
                jSONObject.put("data", new JSONObject());
                str = jSONObject.toString();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str = null;
            }
            JSONObject jSONObject2 = new JSONObject(str);
            if (!jSONObject2.has("code") || !jSONObject2.has("data") || jSONObject2.optInt("code", -1) != 0) {
                return;
            }
            LJ(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "data"));
        } catch (Exception unused) {
        }
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = LIZIZ(contentResolver);
            }
            return E77.LIZ;
        }
        return LIZIZ(contentResolver);
    }

    public static int LIZJ(String key) {
        int i;
        if (LJIIJJI.length > 1) {
            C38691FGl.LJFF.getClass();
            o.LJIIJ(key, "key");
            if (!C38691FGl.LJ.contains(key)) {
                try {
                    byte[] bArr = LJIIJJI;
                    byte[] bytes = key.getBytes(PVC.LIZ);
                    int length = bArr.length + bytes.length;
                    byte[] bArr2 = new byte[length];
                    int i2 = 0;
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    System.arraycopy(bytes, 0, bArr2, bArr.length, bytes.length);
                    int i3 = length >> 2;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        int i6 = i5 << 2;
                        i4 = (Integer.rotateLeft(i4 ^ (Integer.rotateLeft((((bArr2[i6 + 3] & 255) << 24) | (((bArr2[i6] & 255) | ((bArr2[i6 + 1] & 255) << 8)) | ((bArr2[i6 + 2] & 255) << 16))) * (-862048943), 15) * 461845907), 13) * 5) - 430675100;
                    }
                    int i7 = i3 << 2;
                    int i8 = length - i7;
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                i2 = 0 ^ ((bArr2[i7 + 2] & 255) << 16);
                            }
                            int i9 = i4 ^ length;
                            int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
                            int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
                            i = i11 ^ (i11 >>> 16);
                            if (i >= 0 && i < 1000) {
                                return i;
                            }
                            return ((i % 1000) + 1000) % 1000;
                        }
                        i2 ^= (bArr2[i7 + 1] & 255) << 8;
                    }
                    i4 ^= Integer.rotateLeft(((bArr2[i7] & 255) ^ i2) * (-862048943), 15) * 461845907;
                    int i92 = i4 ^ length;
                    int i102 = (i92 ^ (i92 >>> 16)) * (-2048144789);
                    int i112 = (i102 ^ (i102 >>> 13)) * (-1028477387);
                    i = i112 ^ (i112 >>> 16);
                    if (i >= 0) {
                        return i;
                    }
                    return ((i % 1000) + 1000) % 1000;
                } catch (Exception unused) {
                    return new Random().nextInt(1000);
                }
            }
        }
        return new Random().nextInt(1000);
    }

    public final void LJ(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, next);
                jSONObject2.put(next, jSONObject3.get("val"));
                String string = JSONObjectProtectorUtils.getString(jSONObject3, "vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(next, string);
                    long j = JSONObjectProtectorUtils.getLong(jSONObject3, "et");
                    if (j > 0) {
                        hashMap2.put(string, Long.valueOf(j));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        ((ConcurrentHashMap) this.LJ).clear();
        this.LIZJ = jSONObject2;
        C38696FGq.LIZ(new ARunnableS6S2200000_6(this.LIZIZ, jSONObject2, 0));
        C38694FGo c38694FGo = this.LJII;
        c38694FGo.LJIIIIZZ = hashMap;
        C38696FGq.LIZ(new ARunnableS5S1200000_6(c38694FGo.LIZ, hashMap, 2));
        c38694FGo.LIZJ.retainAll(c38694FGo.LJIIIIZZ.values());
        C38696FGq.LIZ(new ARunnableS6S2200000_6(c38694FGo.LIZ, "SP_EXPERIMENT_EXPOSURE_CACHE", c38694FGo.LIZJ, 1));
        c38694FGo.LIZJ();
    }

    public C38692FGm(Application application, String str, boolean z, InterfaceC38689FGj interfaceC38689FGj, TTL ttl, C43588H8u c43588H8u, java.util.Map<String, String> map, java.util.Set<String> set) {
        byte[] bytes;
        JSONObject jSONObject;
        this.LIZ = str;
        LJIIL = map;
        this.LIZIZ = application;
        synchronized (this) {
            if (LJIIJ == null) {
                try {
                    String LIZ = LIZ(application.getContentResolver());
                    if (LIZ != null) {
                        LJIIJ = LIZ;
                        String str2 = LJIIJ;
                        if (str2 == null) {
                            bytes = null;
                        } else {
                            bytes = str2.getBytes(PVC.LIZ);
                        }
                        LJIIJJI = bytes;
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            jSONObject = new JSONObject(C38693FGn.LIZJ(this.LIZIZ, "SP_EXPERIMENT_CACHE").getString("SP_EXPERIMENT_CACHE", ""));
        } catch (JSONException unused2) {
            jSONObject = new JSONObject();
        }
        this.LIZJ = jSONObject;
        this.LIZLLL = C38693FGn.LIZ(this.LIZIZ);
        C38694FGo c38694FGo = new C38694FGo(application, ttl, set);
        this.LJII = c38694FGo;
        C38691FGl.LJFF.getClass();
        if (C38691FGl.LIZJ == null) {
            C38691FGl.LIZJ = c38694FGo;
            C38696FGq.LIZ(new ARunnableS42S0100000_6(c38694FGo, 107));
        }
        this.LJFF = interfaceC38689FGj;
        this.LJI = c43588H8u;
        if (z) {
            this.LJIIIIZZ = C38696FGq.LIZ.scheduleWithFixedDelay(new ARunnableS42S0100000_6(this, 108), 2000L, 3600000L, TimeUnit.MILLISECONDS);
        }
    }
}
