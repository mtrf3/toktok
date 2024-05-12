package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.PIk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64222PIk {
    public static C64222PIk LIZJ;
    public static final String[] LIZLLL = {"JAVA_RUNTIME", "NATIVE_HEAP", "THREAD_STACK", "DATA", "SYSTEM", "DEVICES", "DMABUF", "APK", "ASHMEM", "SHARED_MEMORY", "GPU", "ANON", "NAMELESS", "OTHER"};
    public final List<List<Long>> LIZ = new ArrayList();
    public final List<Long> LIZIZ = new ArrayList();

    public static C64222PIk LIZ() {
        if (LIZJ == null) {
            synchronized (C64222PIk.class) {
                if (LIZJ == null) {
                    LIZJ = new C64222PIk();
                }
            }
        }
        return LIZJ;
    }

    public final JSONArray LIZIZ() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:29:0x00d1
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public final void LIZJ(boolean r16) {
        /*
            r15 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto La
            r0 = 22
            if (r1 != r0) goto Lb
        La:
            return
        Lb:
            android.content.Context r0 = X.PK0.LIZ
            java.io.File r2 = new java.io.File
            java.lang.String r1 = X.C78596Usy.LJJIIJ(r0)
            java.lang.String r0 = "npth/tmpFiles"
            r2.<init>(r1, r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L21
            r2.mkdirs()
        L21:
            java.lang.String r2 = r2.getAbsolutePath()
            java.io.File r6 = new java.io.File
            java.lang.String r0 = "map_size.txt"
            r6.<init>(r2, r0)
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "maps.txt"
            r5.<init>(r2, r0)
            java.io.File r4 = new java.io.File
            java.lang.String r0 = "pthreads.txt"
            r4.<init>(r2, r0)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "threads.txt"
            r3.<init>(r2, r0)
            com.bytedance.crash.util.NativeTools r1 = com.bytedance.crash.util.NativeTools.LJIILJJIL()
            java.lang.String r0 = r5.getAbsolutePath()
            r1.LJIIIZ(r0)
            com.bytedance.crash.util.NativeTools r1 = com.bytedance.crash.util.NativeTools.LJIILJJIL()
            java.lang.String r0 = r4.getAbsolutePath()
            r1.LJIIJJI(r0)
            com.bytedance.crash.util.NativeTools r1 = com.bytedance.crash.util.NativeTools.LJIILJJIL()
            java.lang.String r0 = r3.getAbsolutePath()
            r1.LJFF(r0)
            com.bytedance.crash.util.NativeTools r0 = com.bytedance.crash.util.NativeTools.LJIILJJIL()
            int r0 = r0.LJIL(r2)
            if (r0 != 0) goto L6d
            return
        L6d:
            java.lang.String r0 = "/map_size.txt"
            java.lang.String r1 = defpackage.i0.LJFF(r2, r0)
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L81
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
            r2.load(r0)     // Catch: java.lang.Throwable -> L82
            goto L82
        L81:
            r0 = 0
        L82:
            X.FPX.LIZIZ(r0)
            long r13 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String[] r12 = X.C64222PIk.LIZLLL     // Catch: java.lang.Throwable -> Lb9
            int r11 = r12.length     // Catch: java.lang.Throwable -> Lb9
            r10 = 0
        L92:
            if (r10 >= r11) goto Lb9
            r0 = r12[r10]     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto La6
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lb9
            r9.add(r0)     // Catch: java.lang.Throwable -> Lb9
            goto Lb6
        La6:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb9
            long r7 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> Lb9
            r0 = 1024(0x400, double:5.06E-321)
            long r7 = r7 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lb9
            r9.add(r0)     // Catch: java.lang.Throwable -> Lb9
        Lb6:
            int r10 = r10 + 1
            goto L92
        Lb9:
            java.util.List<java.lang.Long> r1 = r15.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            java.util.List<java.util.List<java.lang.Long>> r0 = r15.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r9)
            if (r16 == 0) goto Le1
            X.PIm r0 = X.C64223PIl.LIZ
            if (r0 == 0) goto Le1
        Ld2:
            X.PG7 r1 = X.C38467F7v.LIZ     // Catch: java.lang.Throwable -> Le1
            r1.getClass()     // Catch: java.lang.Throwable -> Le1
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le1
            r0.<init>()     // Catch: java.lang.Throwable -> Le1
            r1.LJII = r0     // Catch: java.lang.Throwable -> Le1
            r0.putAll(r2)     // Catch: java.lang.Throwable -> Le1
        Le1:
            X.PK8.LIZJ(r5)     // Catch: java.lang.Throwable -> La
            X.PK8.LIZJ(r4)     // Catch: java.lang.Throwable -> La
            X.PK8.LIZJ(r3)     // Catch: java.lang.Throwable -> La
            X.PK8.LIZJ(r6)     // Catch: java.lang.Throwable -> La
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64222PIk.LIZJ(boolean):void");
    }
}
