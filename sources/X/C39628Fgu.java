package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Fgu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39628Fgu {
    public static volatile String LIZ;
    public static final java.util.Map<String, Integer> LIZIZ;
    public static final java.util.Map<String, Field> LIZJ;

    static {
        HashMap hashMap = new HashMap();
        LIZIZ = hashMap;
        LIZJ = new HashMap();
        hashMap.put("armeabi", 32);
        hashMap.put("armeabi-v7a", 32);
        hashMap.put("arm64-v8a", 64);
        hashMap.put("x86", 32);
        hashMap.put("x86_64", 64);
        hashMap.put("mips", 32);
        hashMap.put("mips64", 64);
        LIZ = LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:6:0x0038, B:8:0x004b, B:50:0x0057, B:14:0x0064, B:16:0x0079), top: B:5:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39628Fgu.LIZJ():java.lang.String");
    }

    public static java.util.Map<String, List<ZipEntry>> LIZIZ(ZipFile zipFile) {
        String[] split;
        HashMap hashMap = new HashMap();
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Pattern compile = PatternProtector.compile("^lib/[^/]+/lib[^/]+.so$");
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && compile.matcher(nextElement.getName()).matches() && (split = nextElement.getName().split(File.separator)) != null && split.length >= 2) {
                String str = split[split.length - 2];
                if (((HashMap) LIZIZ).containsKey(str)) {
                    if (hashMap.get(str) == null) {
                        hashMap.put(str, new LinkedList());
                    }
                    ((List) hashMap.get(str)).add(nextElement);
                }
            }
        }
        return hashMap;
    }

    public static Object LIZLLL(Object obj) {
        Field field;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (!TextUtils.isEmpty("primaryCpuAbi")) {
                String str = cls.toString() + "#primaryCpuAbi";
                java.util.Map<String, Field> map = LIZJ;
                synchronized (map) {
                    field = (Field) ((HashMap) map).get(str);
                }
                if (field == null) {
                    while (true) {
                        if (cls != null) {
                            try {
                                field = cls.getDeclaredField("primaryCpuAbi");
                                if (!field.isAccessible()) {
                                    field.setAccessible(true);
                                }
                                java.util.Map<String, Field> map2 = LIZJ;
                                synchronized (map2) {
                                    continue;
                                    ((HashMap) map2).put(str, field);
                                }
                                break;
                            } catch (NoSuchFieldException unused) {
                                cls = cls.getSuperclass();
                            }
                        } else {
                            field = null;
                            break;
                        }
                    }
                } else if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                if (field == null) {
                    return null;
                }
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field.get(obj);
            }
            throw new IllegalArgumentException("The field name must not be blank");
        }
        throw new IllegalArgumentException("target object must not be null");
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
