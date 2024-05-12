package X;

import android.content.Context;
import com.bytedance.geckox.policy.meta.ChannelMetaDataItem;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.OCc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61510OCc {
    public static Context LIZ;
    public static final java.util.Map<String, java.util.Map<String, ChannelMetaDataItem>> LIZIZ = new LinkedHashMap();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static void LIZLLL() {
        if (LIZJ.compareAndSet(false, true)) {
            C61532OCy c61532OCy = EBC.LIZ;
            o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
            java.util.Set<String> set = c61532OCy.LIZ;
            if (set == null || set.isEmpty()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (String accessKey : set) {
                java.util.Map<String, java.util.Map<String, ChannelMetaDataItem>> map = LIZIZ;
                o.LJFF(accessKey, "accessKey");
                java.util.Map<String, ChannelMetaDataItem> LIZJ2 = LIZJ(accessKey);
                if (LIZJ2 != null) {
                    map.put(accessKey, LIZJ2);
                }
            }
            OC6.LIZ("gecko-debug-tag", "init meta data cost:" + (System.currentTimeMillis() - currentTimeMillis), set);
        }
    }

    public static File LIZ(String str) {
        File file = null;
        if (LIZ == null) {
            return null;
        }
        Context context = LIZ;
        if (context != null) {
            file = C16880lQ.LLIIJLIL(context);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("gecko_offline_res_x");
        String str2 = File.separator;
        YE1.LIZLLL(LIZ2, str2, str, str2, "channel.meta");
        File file2 = new File(file, X1D.LIZIZ(LIZ2));
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        return file2;
    }

    public static File LIZIZ(String str) {
        File file = null;
        if (LIZ == null) {
            return null;
        }
        Context context = LIZ;
        if (context != null) {
            file = C16880lQ.LLIIJLIL(context);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("gecko_offline_res_x");
        String str2 = File.separator;
        YE1.LIZLLL(LIZ2, str2, str, str2, "channel.meta");
        return new File(file, X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(java.lang.String r13) {
        /*
            java.lang.String r3 = "getStoredChannelMetaData close occurs exception:"
            java.lang.String r7 = "read meta data cost:"
            java.lang.String r5 = "gecko-debug-tag"
            java.io.File r1 = LIZIZ(r13)
            r12 = 0
            if (r1 == 0) goto Ld2
            boolean r0 = r1.exists()
            r4 = 1
            if (r0 != r4) goto Ld2
            long r10 = java.lang.System.currentTimeMillis()
            r9 = 0
            r2 = 2
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.lang.Object r6 = r8.readObject()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L8b
            boolean r0 = X.C65777Prh.LJII(r6)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L8b
            if (r0 != 0) goto L2f
            r6 = r12
        L2f:
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L8b
            if (r6 == 0) goto L57
            r8.close()     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r0 = move-exception
            X.OC6.LIZJ(r5, r3, r0)
        L3b:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r10
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3[r9] = r0
            r3[r4] = r13
            X.OC6.LIZ(r5, r3)
            r12 = r6
            goto Ld2
        L57:
            r8.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            X.OC6.LIZJ(r5, r3, r0)
        L5f:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r10
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3[r9] = r0
            r3[r4] = r13
            X.OC6.LIZ(r5, r3)
            return r12
        L7a:
            r1 = move-exception
            goto L80
        L7c:
            r6 = move-exception
            goto L8d
        L7e:
            r1 = move-exception
            r8 = r12
        L80:
            java.lang.String r0 = "getStoredChannelMetaData occurs exception:"
            X.OC6.LIZJ(r5, r0, r1)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto Lb6
            r8.close()     // Catch: java.io.IOException -> Lb2
            goto Lb6
        L8b:
            r6 = move-exception
            r12 = r8
        L8d:
            if (r12 == 0) goto L97
            r12.close()     // Catch: java.io.IOException -> L93
            goto L97
        L93:
            r0 = move-exception
            X.OC6.LIZJ(r5, r3, r0)
        L97:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r10
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3[r9] = r0
            r3[r4] = r13
            X.OC6.LIZ(r5, r3)
            throw r6
        Lb2:
            r0 = move-exception
            X.OC6.LIZJ(r5, r3, r0)
        Lb6:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r7)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r10
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            r3[r9] = r0
            r3[r4] = r13
            X.OC6.LIZ(r5, r3)
        Ld2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61510OCc.LIZJ(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if (r3 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r13) {
        /*
            java.lang.String r8 = "writeToMetaData close occurs exception"
            java.lang.String r6 = "write meta data cost:"
            java.lang.String r4 = "gecko-debug-tag"
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.bytedance.geckox.policy.meta.ChannelMetaDataItem>> r0 = X.C61510OCc.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r5 = r0.get(r13)
            if (r5 == 0) goto Lb3
            long r11 = java.lang.System.currentTimeMillis()
            r10 = 1
            r9 = 0
            r7 = 2
            r3 = 0
            java.io.File r1 = LIZIZ(r13)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L8c
            if (r1 == 0) goto L28
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L8c
            if (r0 != 0) goto L28
            java.io.File r1 = LIZ(r13)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L8c
        L28:
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L8c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L8c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L8c
            r2.<init>(r0)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L8c
            r2.writeObject(r5)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r2.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L39:
            r5 = move-exception
            goto L90
        L3b:
            r1 = move-exception
            r3 = r2
            goto L3f
        L3e:
            r1 = move-exception
        L3f:
            java.lang.String r0 = "writeToMetaData occurs exception"
            X.OC6.LIZJ(r4, r0, r1)     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r0 = move-exception
            X.OC6.LIZJ(r4, r8, r0)
        L4e:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r6)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            r3[r9] = r0
            r3[r10] = r13
            X.OC6.LIZ(r4, r3)
            goto L8b
        L6b:
            r0 = move-exception
            X.OC6.LIZJ(r4, r8, r0)
        L6f:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r6)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            r3[r9] = r0
            r3[r10] = r13
            X.OC6.LIZ(r4, r3)
        L8b:
            return
        L8c:
            r5 = move-exception
            r2 = r3
            if (r3 == 0) goto L98
        L90:
            r2.close()     // Catch: java.io.IOException -> L94
            goto L98
        L94:
            r0 = move-exception
            X.OC6.LIZJ(r4, r8, r0)
        L98:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3[r9] = r0
            r3[r10] = r13
            X.OC6.LIZ(r4, r3)
            throw r5
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61510OCc.LJ(java.lang.String):void");
    }
}
