package com.bytedance.realx.base;

/* loaded from: classes12.dex */
public class GPUUtil {
    public static String glRenderer = "unknown";
    public static String glVendor = "unknown";
    public static boolean initialized;

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|3|(3:115|116|(1:118)(5:119|36|37|(1:39)|(6:42|(1:46)|(1:50)|(1:56)|54|55)(1:58)))|5|6|7|(3:12|13|(2:15|(2:17|(2:19|(2:21|(2:98|99)(4:25|(3:29|30|(6:32|(2:34|35)|36|37|(0)|(0)(0)))|27|28))(2:100|101))(2:102|103))(2:104|105)))|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012d, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0129, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x012a, code lost:
    
        r10 = null;
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: all -> 0x00e7, Exception -> 0x00ea, TryCatch #9 {Exception -> 0x00ea, all -> 0x00e7, blocks: (B:37:0x00af, B:39:0x00b5), top: B:36:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Initialize() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.GPUUtil.Initialize():void");
    }

    public static String getGPURenderer() {
        if (!initialized) {
            Initialize();
        }
        return glRenderer;
    }

    public static String getGPURendererFallback() {
        return glRenderer;
    }
}
