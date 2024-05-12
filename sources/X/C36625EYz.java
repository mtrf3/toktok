package X;

import android.util.Pair;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.EYz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36625EYz implements INetworkDepend {
    public static OSJ LIZ(C36774Eby c36774Eby) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(new C38281F0r(c36774Eby.LJ).LJ(), linkedHashMap);
        return new OSJ(LIZJ.first, LIZJ.second, linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r4 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(X.C36774Eby r7) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r7.LIZ
            java.lang.String r5 = "x-tt-dataflow-id"
            r4 = 0
            if (r0 == 0) goto L39
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r2)
            if (r0 == 0) goto L33
            r4 = 1
        L33:
            X.C77800Ug8.LJFF(r2, r1, r6)
            goto L14
        L37:
            if (r4 != 0) goto L3e
        L39:
            java.lang.String r0 = "671089409"
            X.C77800Ug8.LJFF(r5, r0, r6)
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36625EYz.LIZIZ(X.Eby):java.util.List");
    }

    public static void LIZJ(InputStream inputStream, WeakReference weakReference) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
        }
        if (weakReference != null) {
            try {
                InterfaceC37276Ek4 interfaceC37276Ek4 = (InterfaceC37276Ek4) weakReference.get();
                if (interfaceC37276Ek4 != null && !interfaceC37276Ek4.isCanceled()) {
                    interfaceC37276Ek4.cancel();
                }
            } catch (Throwable th2) {
                C78983UzD.LJIIZILJ(th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x016d, code lost:
    
        if (r0 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #0 {all -> 0x0183, blocks: (B:3:0x002e, B:5:0x0060, B:7:0x0066, B:8:0x0077, B:16:0x016f, B:22:0x008f, B:24:0x00be, B:26:0x00c7, B:28:0x00cd, B:30:0x00d3, B:31:0x00d7, B:33:0x00df, B:34:0x00e3, B:36:0x00e9, B:40:0x00fb, B:43:0x00ff, B:49:0x0103, B:47:0x0134, B:51:0x00a0, B:53:0x00ae), top: B:2:0x002e, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.ref.WeakReference] */
    @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EZ3 requestForStream(X.EZ5 r19, X.C36774Eby r20) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36625EYz.requestForStream(X.EZ5, X.Eby):X.EZ3");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x015f, code lost:
    
        if (r0 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #2 {all -> 0x0178, blocks: (B:3:0x002e, B:5:0x0062, B:7:0x0068, B:8:0x0078, B:16:0x0161, B:22:0x0091, B:24:0x00c3, B:26:0x00c7, B:28:0x00cd, B:30:0x00d7, B:31:0x00db, B:33:0x00e1, B:37:0x00f3, B:40:0x00f7, B:44:0x00fb, B:46:0x0129, B:49:0x00a5, B:52:0x00b2), top: B:2:0x002e, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable, T, X.Pby] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Pbv, java.lang.Throwable, T] */
    @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EZ6 requestForString(X.EZ5 r20, X.C36774Eby r21) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36625EYz.requestForString(X.EZ5, X.Eby):X.EZ6");
    }
}
