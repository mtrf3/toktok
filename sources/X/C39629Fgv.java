package X;

import android.content.Context;
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

/* renamed from: X.Fgv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39629Fgv {
    public static volatile String LIZ;
    public static final java.util.Map<String, Integer> LIZIZ;
    public static final java.util.Map<String, Field> LIZJ;
    public static volatile String LIZLLL;

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
        LIZLLL = null;
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

    public static String LIZJ(Context context) {
        String str;
        if (LIZLLL == null) {
            if (LIZ == null) {
                synchronized (C39629Fgv.class) {
                    if (LIZ == null) {
                        LIZ = LIZLLL(context);
                    }
                }
            }
            Integer num = (Integer) ((HashMap) LIZIZ).get(LIZ);
            if (num == null) {
                num = -1;
            }
            if (num.intValue() == 32) {
                str = "armeabi-v7a";
            } else if (num.intValue() == 64) {
                str = "arm64-v8a";
            } else {
                str = "armeabi-v7a";
            }
            LIZLLL = str;
        }
        return LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075 A[Catch: all -> 0x0086, TryCatch #3 {all -> 0x0086, blocks: (B:6:0x0038, B:8:0x0047, B:49:0x0053, B:14:0x0060, B:16:0x0075), top: B:5:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39629Fgv.LIZLLL(android.content.Context):java.lang.String");
    }

    public static Object LJ(Object obj) {
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
