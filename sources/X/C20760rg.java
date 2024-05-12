package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.o;

/* renamed from: X.0rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20760rg {
    public static final C20760rg LIZ = new C20760rg();
    public static final Thread LIZIZ = C16880lQ.LLLLIIIILLL();
    public static final ConcurrentHashMap<Integer, List<C20750rf>> LIZJ = new ConcurrentHashMap<>();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C24G.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C24J.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C24I.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C24H.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C24K.LJLIL);

    public static Context LIZJ() {
        Object value = LJ.getValue();
        o.LJIIIIZZ(value, "<get-themeContext>(...)");
        return (Context) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.view.View LIZIZ(android.content.Context r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.List<X.0rf>> r1 = X.C20760rg.LIZJ     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb0
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> Lb0
            X.2mC r4 = new X.2mC     // Catch: java.lang.Throwable -> Lb0
            r4.<init>()     // Catch: java.lang.Throwable -> Lb0
            X.C20800rk.LIZJ(r10)     // Catch: java.lang.Throwable -> Lb0
            r3 = 0
            if (r7 == 0) goto L98
            int r0 = r7.size()     // Catch: java.lang.Throwable -> Lb0
            if (r0 <= 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r2 = 0
            if (r0 == 0) goto L2d
            r0 = r7
        L2a:
            if (r0 == 0) goto L98
            goto L2f
        L2d:
            r0 = r2
            goto L2a
        L2f:
            java.lang.Object r6 = X.ORS.LJJLL(r0)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            X.0rf r6 = (X.C20750rf) r6     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            int r0 = r0.size()     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            if (r0 != 0) goto L42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            r1.remove(r0)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
        L42:
            boolean r0 = r6.LIZLLL     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            if (r0 == 0) goto L58
            r0 = 5000000(0x4c4b40, double:2.470328E-317)
            java.util.concurrent.locks.LockSupport.parkNanos(r0)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            android.view.View r5 = r6.LIZJ     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            if (r5 == 0) goto L6c
            boolean r0 = r9 instanceof android.content.MutableContextWrapper     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            if (r0 == 0) goto L6e
            r0 = r9
            android.content.MutableContextWrapper r0 = (android.content.MutableContextWrapper) r0     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            goto L6f
        L58:
            android.view.View r5 = r6.LIZJ     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            if (r5 == 0) goto L6c
            boolean r0 = r9 instanceof android.content.MutableContextWrapper     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            if (r0 == 0) goto L64
            r0 = r9
            android.content.MutableContextWrapper r0 = (android.content.MutableContextWrapper) r0     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            goto L65
        L64:
            r0 = r2
        L65:
            if (r0 != 0) goto L68
            goto L71
        L68:
            r0.setBaseContext(r9)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            goto L71
        L6c:
            r5 = r2
            goto L71
        L6e:
            r0 = r2
        L6f:
            if (r0 != 0) goto L74
        L71:
            if (r5 == 0) goto L8f
            goto L78
        L74:
            r0.setBaseContext(r9)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            goto L71
        L78:
            int r1 = r7.size()     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            int r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            if (r1 >= r0) goto L8e
            java.util.concurrent.ExecutorService r2 = X.C38995FSd.LIZLLL()     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            Y.IDRunnableS6S0101000 r1 = new Y.IDRunnableS6S0101000     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            r0 = 33
            r1.<init>(r10, r6, r0)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            r2.submit(r1)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
        L8e:
            r2 = r5
        L8f:
            r4.element = r2     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Lb0
            goto L98
        L92:
            r1 = move-exception
            java.lang.String r0 = "LayoutAutoPreloadManager"
            X.C0NB.LJI(r0, r1)     // Catch: java.lang.Throwable -> Lb0
        L98:
            android.content.Context r1 = LIZJ()     // Catch: java.lang.Throwable -> Lb0
            T r0 = r4.element     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto La1
            goto La3
        La1:
            r0 = 0
            goto La4
        La3:
            r0 = 1
        La4:
            if (r0 != 0) goto La7
            r3 = 1
        La7:
            X.C20800rk.LIZ(r1, r10, r3)     // Catch: java.lang.Throwable -> Lb0
            T r0 = r4.element     // Catch: java.lang.Throwable -> Lb0
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r8)
            return r0
        Lb0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20760rg.LIZIZ(android.content.Context, int):android.view.View");
    }

    public static void LIZ(int i, int i2, ViewGroup viewGroup) {
        boolean z;
        C20750rf c20750rf = new C20750rf(i, i2, viewGroup);
        c20750rf.LIZLLL = true;
        Context LIZJ2 = LIZJ();
        C20800rk.LIZLLL(i);
        View ib0 = ((IHostPerformanceOpt) LJII.getValue()).ib0(i, LIZJ2, viewGroup, false);
        if (ib0 == null) {
            ib0 = ((LayoutInflater) LJI.getValue()).inflate(i, viewGroup, false);
            z = false;
        } else {
            z = true;
        }
        C20800rk.LIZIZ(LIZJ(), i, z);
        c20750rf.LIZJ = ib0;
        c20750rf.LIZLLL = false;
        ConcurrentHashMap<Integer, List<C20750rf>> concurrentHashMap = LIZJ;
        List<C20750rf> list = concurrentHashMap.get(Integer.valueOf(i));
        if (list != null) {
            list.add(c20750rf);
        } else {
            concurrentHashMap.put(Integer.valueOf(i), C47261Igj.LJJIJIL(c20750rf));
        }
        LockSupport.unpark(LIZIZ);
    }
}
