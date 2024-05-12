package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a4Y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92054a4Y {
    public static C92049a4T LJI;
    public static final Pattern LIZ = PatternProtector.compile("\\{[^}]*\\}");
    public static String LIZIZ = "en";
    public static final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LJFF = new ConcurrentHashMap<>();
    public static InterfaceC88471Ynr<? super String, ? super JSONObject, C76800UCe> LJII = C92986aJa.LJLIL;

    public static void LIZJ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        try {
            List<C92285a8H> list = C92055a4Z.LIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<C92285a8H> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(LJ(ctx, it.next().LJLILLLLZI));
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = C113554cx.LJJLIIIJILLIZJL((java.util.Map) it2.next(), (java.util.Map) next);
                }
                for (Map.Entry entry : ((java.util.Map) next).entrySet()) {
                    LJFF.put((String) entry.getKey(), (String) entry.getValue());
                }
                return;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        } catch (Throwable unused) {
        }
    }

    public static final String LIZ(String key, String... fields) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(fields, "fields");
        String str = LIZJ.get(key);
        if (str == null && (str = LIZLLL.get(key)) == null && (str = LJ.get(key)) == null && (str = LJFF.get(key)) == null) {
            str = key;
        }
        if (o.LJ(str, key) && key.length() > 0) {
            InterfaceC88471Ynr<? super String, ? super JSONObject, C76800UCe> interfaceC88471Ynr = LJII;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", key);
            jSONObject.put("language", LIZIZ);
            interfaceC88471Ynr.invoke("rd_pipo_nativeui_did_fail_get_localizedstring_by_key", jSONObject);
        }
        return LJFF(str, (String[]) Arrays.copyOf(fields, fields.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029 A[LOOP:0: B:5:0x0023->B:7:0x0029, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r2, java.lang.String r3) {
        /*
            X.a4T r1 = new X.a4T
            r1.<init>(r2)
            X.C92054a4Y.LJI = r1
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            android.content.SharedPreferences r1 = r1.LIZ
            java.lang.String r0 = "{}"
            java.lang.String r0 = r1.getString(r3, r0)
            if (r0 != 0) goto L3d
        L16:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L1b:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = X.C92054a4Y.LIZLLL
            r0.put(r2, r1)
            goto L23
        L3d:
            java.util.Map r0 = X.C92055a4Z.LIZ(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L1b
            goto L16
        L44:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L1b
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92054a4Y.LIZIZ(android.content.Context, java.lang.String):void");
    }

    public static void LIZLLL(Context ctx, String language) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(language, "language");
        try {
            List<C92285a8H> list = C92055a4Z.LIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (C92285a8H c92285a8H : list) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c92285a8H.LJLIL);
                LIZ2.append('/');
                LIZ2.append(language);
                LIZ2.append(".json");
                arrayList.add(LJ(ctx, X1D.LIZIZ(LIZ2)));
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = C113554cx.LJJLIIIJILLIZJL((java.util.Map) it.next(), (java.util.Map) next);
                }
                for (Map.Entry entry : ((java.util.Map) next).entrySet()) {
                    LJ.put((String) entry.getKey(), (String) entry.getValue());
                }
                return;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        } catch (Throwable unused) {
        }
    }

    public static java.util.Map LJ(Context ctx, String path) {
        BufferedReader bufferedReader;
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(path, "path");
        HashMap hashMap = new HashMap();
        try {
            InputStream open = ctx.getAssets().open(path);
            o.LJIIIIZZ(open, "ctx.assets.open(path)");
            Reader inputStreamReader = new InputStreamReader(open, PVC.LIZ);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
            }
            try {
                String LJIILJJIL = C77321UWf.LJIILJJIL(bufferedReader);
                AnonymousClass636.LJFF(bufferedReader, null);
                JSONObject jSONObject = new JSONObject(LJIILJJIL);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "obj.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    o.LJIIIIZZ(key, "key");
                    String optString = jSONObject.optString(key);
                    o.LJIIIIZZ(optString, "obj.optString(key)");
                    hashMap.put(key, optString);
                }
            } finally {
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static String LJFF(String str, String... fields) {
        boolean z;
        o.LJIIIZ(fields, "fields");
        if (fields.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        try {
            Matcher matcher = LIZ.matcher(str);
            int length = fields.length;
            String str2 = str;
            int i = 0;
            while (i < length) {
                String str3 = fields[i];
                i++;
                if (matcher.find()) {
                    String item = matcher.group();
                    o.LJIIIIZZ(item, "item");
                    str2 = ujb.o.LJJJJZ(str2, item, str3, false);
                }
            }
            return str2;
        } catch (Throwable th) {
            System.out.println(th.getStackTrace());
            return str;
        }
    }

    public static void LJI(String language, java.util.Map map) {
        o.LJIIIZ(language, "language");
        o.LJIIIZ(map, "map");
        if (map.isEmpty()) {
            return;
        }
        try {
            C92049a4T c92049a4T = LJI;
            if (c92049a4T != null) {
                String jSONObject = new JSONObject(map).toString();
                o.LJIIIIZZ(jSONObject, "JSONObject(map).toString()");
                SharedPreferences.Editor edit = c92049a4T.LIZ.edit();
                edit.putString(language, jSONObject);
                edit.apply();
                for (Map.Entry entry : map.entrySet()) {
                    LIZLLL.put((String) entry.getKey(), (String) entry.getValue());
                }
                return;
            }
            o.LJIJI("apiCache");
            throw null;
        } catch (Throwable unused) {
            System.out.println((Object) "write cache failed");
        }
    }
}
