package com.bytedance.router.util;

import X.C0NY;
import X.C16880lQ;
import X.F9J;
import X.JBR;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* loaded from: classes7.dex */
public class ClassUtils {
    public static final String SECONDARY_FOLDER_NAME;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 < 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isVMMultidexCapable() {
        /*
            r5 = 0
            boolean r0 = isYunOS()     // Catch: java.lang.Throwable -> L4b
            r4 = 1
            if (r0 == 0) goto L1b
            java.lang.String r0 = "ro.build.version.sdk"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.valueOf(r0)     // Catch: java.lang.Throwable -> L4b
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L4b
            r0 = 21
            if (r1 < r0) goto L4b
            goto L4a
        L1b:
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4b
            java.lang.String r0 = "(\\d+)\\.(\\d+)(\\.\\d+)?"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Throwable -> L4b
            java.util.regex.Matcher r3 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r3.matches()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4b
            java.lang.String r0 = r3.group(r4)     // Catch: java.lang.Throwable -> L4b
            int r2 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L4b
            r1 = 2
            java.lang.String r0 = r3.group(r1)     // Catch: java.lang.Throwable -> L4b
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L4b
            if (r2 > r1) goto L4a
            if (r2 != r1) goto L4b
            if (r0 < r4) goto L4b
        L4a:
            r5 = 1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.util.ClassUtils.isVMMultidexCapable():boolean");
    }

    public static boolean isYunOS() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            if (property2 == null || !property2.toLowerCase().contains("lemur")) {
                if (property == null) {
                    return false;
                }
                if (property.trim().length() <= 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("code_cache");
        SECONDARY_FOLDER_NAME = JBR.LJFF(LIZ, File.separator, "secondary-dexes", LIZ);
    }

    public static SharedPreferences getMultiDexPreferences(Context context) {
        return F9J.LIZIZ(context, 4, "multidex.version");
    }

    public static List<String> getSourcePaths(Context context) {
        ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 0);
        File file = new File(LLLLLLLLL.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(LLLLLLLLL.sourceDir);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(file.getName());
        LIZ.append(".classes");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!isVMMultidexCapable()) {
            int i = getMultiDexPreferences(context).getInt("dex.number", 1);
            File file2 = new File(LLLLLLLLL.dataDir, SECONDARY_FOLDER_NAME);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, C0NY.LIZIZ(LIZIZ, i2, ".zip"));
                if (file3.isFile()) {
                    arrayList.add(file3.getAbsolutePath());
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Missing extracted secondary dex file '");
                    LIZ2.append(file3.getPath());
                    LIZ2.append("'");
                    throw new IOException(X1D.LIZIZ(LIZ2));
                }
            }
        }
        return arrayList;
    }

    public static List<String> getFileNameByPackageName(Context context, String str) {
        DexFile dexFile;
        ArrayList arrayList = new ArrayList();
        for (String str2 : getSourcePaths(context)) {
            if (str2.endsWith(".zip")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(".tmp");
                dexFile = DexFile.loadDex(str2, X1D.LIZIZ(LIZ), 0);
            } else {
                dexFile = new DexFile(str2);
            }
            Enumeration<String> entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                String nextElement = entries.nextElement();
                if (nextElement.contains(str)) {
                    arrayList.add(nextElement);
                }
            }
        }
        return arrayList;
    }
}
