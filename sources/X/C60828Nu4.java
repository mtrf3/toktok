package X;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Nu4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60828Nu4 {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C60828Nu4.class), "CACHE_POOL", "getCACHE_POOL()Ljava/util/Map;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
    }

    public static java.util.Map LIZJ() {
        return (java.util.Map) C37724ErI.LIZ.getValue();
    }

    public static void LJFF(String biz) {
        LinkedHashMap<String, SoftReference<InterfaceC60833Nu9>> linkedHashMap;
        o.LJIIJ(biz, "biz");
        C25570A1u c25570A1u = (C25570A1u) LIZJ().remove(C60797NtZ.LIZ(biz));
        if (c25570A1u != null && (linkedHashMap = c25570A1u.LIZIZ) != null) {
            Iterator<Map.Entry<String, SoftReference<InterfaceC60833Nu9>>> it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC60833Nu9 interfaceC60833Nu9 = it.next().getValue().get();
                if (interfaceC60833Nu9 != null) {
                    interfaceC60833Nu9.release();
                }
            }
        }
    }

    public static void LJ(C25570A1u c25570A1u, Boolean bool) {
        String str;
        if (c25570A1u.LIZ) {
            LIZJ().put(C60797NtZ.LIZ(c25570A1u.LIZLLL), c25570A1u);
            if (o.LJ(bool, Boolean.TRUE)) {
                str = "jsb";
            } else {
                str = "native";
            }
            FD5.LJIIIZ(null, "container_reuse", "config", str, null, null, C60797NtZ.LIZ(c25570A1u.LIZLLL), null, 177);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        if (r2 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC60833Nu9 r8) {
        /*
            java.lang.String r0 = "hybridView"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            java.util.Map r1 = LIZJ()
            r5 = r7
            java.lang.String r0 = X.C60797NtZ.LIZ(r5)
            boolean r0 = r1.containsKey(r0)
            java.lang.String r3 = "ReUseTool"
            r4 = 0
            if (r0 != 0) goto L21
            X.FUe r2 = X.C39048FUe.LIZIZ
            java.lang.String r1 = "biz not register ReUseConfig"
            X.Fkk r0 = X.EnumC39866Fkk.D
            r2.LIZ(r1, r0, r3)
            return r4
        L21:
            boolean r0 = r8.LIZLLL()
            if (r0 != 0) goto L31
            X.FUe r2 = X.C39048FUe.LIZIZ
            java.lang.String r1 = "hybridView didn't load success, can not be reused"
            X.Fkk r0 = X.EnumC39866Fkk.D
            r2.LIZ(r1, r0, r3)
            return r4
        L31:
            java.util.Map r1 = LIZJ()
            java.lang.String r0 = X.C60797NtZ.LIZ(r5)
            java.lang.Object r2 = r1.get(r0)
            X.A1u r2 = (X.C25570A1u) r2
            X.OSZ r3 = new X.OSZ
            java.lang.String r1 = "useReuse"
            java.lang.String r0 = "1"
            r3.<init>(r1, r0)
            java.util.Map r0 = X.C51029K0z.LJJIIZI(r3)
            r8.LIZ(r0)
            if (r2 == 0) goto L87
            int r1 = r2.LIZJ
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L87
            java.util.LinkedHashMap<java.lang.String, java.lang.ref.SoftReference<X.Nu9>> r0 = r2.LIZIZ
            if (r0 == 0) goto Lc3
            int r0 = r0.size()
        L60:
            int r4 = r2.LIZJ
        L62:
            if (r0 < r4) goto L87
            if (r2 == 0) goto L87
            java.util.LinkedHashMap<java.lang.String, java.lang.ref.SoftReference<X.Nu9>> r0 = r2.LIZIZ
            if (r0 == 0) goto Lbf
            java.util.Set r0 = r0.entrySet()
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = X.ORZ.LJLLILLLL(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto Lbf
            java.lang.Object r1 = r0.getKey()
        L7c:
            java.util.LinkedHashMap<java.lang.String, java.lang.ref.SoftReference<X.Nu9>> r0 = r2.LIZIZ
            if (r0 == 0) goto L87
            java.util.Map r0 = X.C65777Prh.LIZJ(r0)
            r0.remove(r1)
        L87:
            X.Ezy r0 = X.C39836FkG.LJII
            r0.getClass()
            X.FkG r0 = X.C38262Ezy.LIZ()
            android.app.Application r0 = r0.LIZIZ()
            X.C60797NtZ.LIZIZ(r8, r0)
            r4 = r6
            if (r2 == 0) goto Lad
            java.util.LinkedHashMap<java.lang.String, java.lang.ref.SoftReference<X.Nu9>> r1 = r2.LIZIZ
            if (r1 == 0) goto La6
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r8)
            r1.put(r4, r0)
        La6:
            X.9t7 r0 = r2.LJI
            if (r0 == 0) goto Lad
            r0.invoke(r8)
        Lad:
            r0 = 0
            java.lang.String r1 = "container_reuse"
            java.lang.String r2 = "enqueue"
            java.lang.String r6 = X.C60797NtZ.LIZ(r5)
            r8 = 137(0x89, float:1.92E-43)
            r3 = r0
            r7 = r0
            X.FD5.LJIIIZ(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1
            return r0
        Lbf:
            r1 = 0
            if (r2 == 0) goto L87
            goto L7c
        Lc3:
            r0 = 0
            if (r2 == 0) goto L62
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60828Nu4.LIZ(java.lang.String, java.lang.String, X.Nu9):boolean");
    }

    public static boolean LIZLLL(Context context, String schema, String str) {
        LinkedHashMap<String, SoftReference<InterfaceC60833Nu9>> linkedHashMap;
        long j;
        o.LJIIJ(context, "context");
        o.LJIIJ(schema, "schema");
        C25570A1u c25570A1u = (C25570A1u) LIZJ().get(C60797NtZ.LIZ(str));
        if (c25570A1u == null || (linkedHashMap = c25570A1u.LIZIZ) == null) {
            return false;
        }
        for (Map.Entry<String, SoftReference<InterfaceC60833Nu9>> entry : linkedHashMap.entrySet()) {
            if (c25570A1u.LJFF.invoke(schema, entry.getKey()).booleanValue()) {
                if (c25570A1u.LJ != -1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC60833Nu9 interfaceC60833Nu9 = entry.getValue().get();
                    if (interfaceC60833Nu9 != null) {
                        j = interfaceC60833Nu9.getViewCreatedTime();
                    } else {
                        j = 0;
                    }
                    if (currentTimeMillis - j >= c25570A1u.LJ * 1000) {
                        return false;
                    }
                }
                if (entry.getValue().get() == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC60833Nu9 LIZIZ(android.content.Context r14, java.lang.String r15, java.lang.String r16, X.C60737Nsb r17) {
        /*
            java.lang.String r0 = "context"
            r4 = r14
            kotlin.jvm.internal.o.LJIIJ(r4, r0)
            java.lang.String r0 = "biz"
            r14 = r16
            kotlin.jvm.internal.o.LJIIJ(r14, r0)
            java.util.Map r1 = LIZJ()
            java.lang.String r0 = X.C60797NtZ.LIZ(r14)
            java.lang.Object r5 = r1.get(r0)
            X.A1u r5 = (X.C25570A1u) r5
            r9 = 0
            if (r5 == 0) goto Ld5
            java.util.LinkedHashMap<java.lang.String, java.lang.ref.SoftReference<X.Nu9>> r0 = r5.LIZIZ
            if (r0 == 0) goto Ld5
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L2a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r3 = r8.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            X.Ynr<? super java.lang.String, ? super java.lang.String, java.lang.Boolean> r1 = r5.LJFF
            java.lang.Object r0 = r3.getKey()
            r13 = r15
            java.lang.Object r0 = r1.invoke(r13, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2a
            int r1 = r5.LJ
            r0 = -1
            if (r1 == r0) goto La8
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r3.getValue()
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
            java.lang.Object r0 = r0.get()
            X.Nu7 r0 = (X.InterfaceC60831Nu7) r0
            if (r0 == 0) goto La5
            long r0 = r0.getViewCreatedTime()
        L64:
            long r6 = r6 - r0
            int r0 = r5.LJ
            int r0 = r0 * 1000
            long r0 = (long) r0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto La8
            r2 = 1
        L6f:
            java.util.LinkedHashMap<java.lang.String, java.lang.ref.SoftReference<X.Nu9>> r1 = r5.LIZIZ
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r0 = r1.remove(r0)
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
            if (r2 != 0) goto Lc8
            java.lang.Object r0 = r3.getValue()
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
            java.lang.Object r1 = r0.get()
            X.Nu9 r1 = (X.InterfaceC60833Nu9) r1
            if (r1 == 0) goto La3
            X.Nsb r0 = r1.getHybridContext()
        L8f:
            r2 = r17
            boolean r0 = X.C60806Nti.LIZ(r0, r2)
            if (r0 != 0) goto Laa
            X.FUe r3 = X.C39048FUe.LIZIZ
            X.Fkk r2 = X.EnumC39866Fkk.E
            java.lang.String r1 = "ReUseTool"
            java.lang.String r0 = "the theme of reused view is inconsistent"
            r3.LIZ(r0, r2, r1)
            goto L2a
        La3:
            r0 = r9
            goto L8f
        La5:
            r0 = 0
            goto L64
        La8:
            r2 = 0
            goto L6f
        Laa:
            if (r1 == 0) goto Lc6
            X.C60797NtZ.LIZIZ(r1, r4)
            r0 = 4
            r1.setOptimization(r0)
            java.lang.String r10 = "container_reuse"
            java.lang.String r11 = "use"
            java.lang.String r15 = X.C60797NtZ.LIZ(r14)
            r17 = 137(0x89, float:1.92E-43)
            r12 = r9
            r16 = r9
            X.FD5.LJIIIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.LIZJ(r4, r9)
        Lc6:
            r9 = r1
            goto Ld5
        Lc8:
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r0.get()
            X.Nu7 r0 = (X.InterfaceC60831Nu7) r0
            if (r0 == 0) goto Ld5
            r0.release()
        Ld5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60828Nu4.LIZIZ(android.content.Context, java.lang.String, java.lang.String, X.Nsb):X.Nu9");
    }
}
