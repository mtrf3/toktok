package X;

import com.bytedance.morpheus.PluginEntity;
import defpackage.i0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ef8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36970Ef8 {
    public static final java.util.Map<String, String> LIZ = new HashMap();
    public static final java.util.Map<String, String> LIZIZ = new HashMap();

    static {
        for (PluginEntity pluginEntity : (List) C36969Ef7.LIZ.getValue()) {
            String packageName = pluginEntity.getPackageName();
            String aabName = pluginEntity.getAabName();
            HashMap hashMap = (HashMap) LIZ;
            if (!hashMap.containsKey(packageName)) {
                HashMap hashMap2 = (HashMap) LIZIZ;
                if (!hashMap2.containsKey(aabName)) {
                    hashMap.put(packageName, aabName);
                    hashMap2.put(aabName, packageName);
                } else {
                    String LJFF = i0.LJFF("duplicate config for aab name ", aabName);
                    LJFF.toString();
                    throw new IllegalArgumentException(LJFF);
                }
            } else {
                String LJFF2 = i0.LJFF("duplicate config for package name ", packageName);
                LJFF2.toString();
                throw new IllegalArgumentException(LJFF2);
            }
        }
    }

    public static String LIZ(String packageName) {
        String str;
        o.LJIIIZ(packageName, "packageName");
        if (ujb.o.LJJJLIIL(packageName, "com.ss.android.ugc.aweme.dflanguage", false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("df_language_");
            LIZ2.append(C40689Fy1.LLF(36, packageName));
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = (String) ((HashMap) LIZ).get(packageName);
        }
        if (str == null) {
            return packageName;
        }
        return str;
    }

    public static String LIZIZ(String aabName) {
        o.LJIIIZ(aabName, "aabName");
        if (ujb.o.LJJJLIIL(aabName, "df_language", false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("com.ss.android.ugc.aweme.dflanguage.");
            LIZ2.append(C40689Fy1.LLF(12, aabName));
            return X1D.LIZIZ(LIZ2);
        }
        return (String) ((HashMap) LIZIZ).get(aabName);
    }
}
