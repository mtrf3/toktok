package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FsR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40343FsR {
    public static boolean LIZJ;
    public static volatile InterfaceC65784Pro<C76800UCe> LJI;
    public static final Class<?> LJIIJ;
    public static final Object LJIIJJI;
    public static final Method LJIIL;
    public static final Method LJIILIIL;
    public final Context LIZ;
    public final SparkContext LIZIZ;
    public static final C40342FsQ LJIILJJIL = new C40342FsQ();
    public static final CopyOnWriteArrayList<AbstractC40151FpL> LIZLLL = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<String, AbstractC40122Fos> LJ = new ConcurrentHashMap<>();
    public static QXX LJFF = FB8.LIZ;
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:2|3)|4|(3:25|26|(12:28|7|8|9|(7:11|12|13|14|(1:16)|18|19)|23|12|13|14|(0)|18|19))|6|7|8|9|(0)|23|12|13|14|(0)|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:9:0x0050, B:11:0x0054), top: B:8:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x0064, B:16:0x0068), top: B:13:0x0064 }] */
    static {
        /*
            X.FsQ r0 = new X.FsQ
            r0.<init>()
            X.C40343FsR.LJIILJJIL = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            X.C40343FsR.LIZLLL = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            X.C40343FsR.LJ = r0
            a04.IDfS1S0000000_6 r0 = X.FB8.LIZ
            X.C40343FsR.LJFF = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r6 = 0
            r0.<init>(r6)
            X.C40343FsR.LJII = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r6)
            X.C40343FsR.LJIIIIZZ = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r6)
            X.C40343FsR.LJIIIZ = r0
            r5 = 0
            java.lang.String r0 = "com.bytedance.hybrid.spark.prefetch.PrefetchService"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L37
            goto L38
        L37:
            r1 = r5
        L38:
            X.C40343FsR.LJIIJ = r1
            r4 = 1
            if (r1 == 0) goto L4d
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4d
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r0 = r5
        L4e:
            X.C40343FsR.LJIIJJI = r0
            java.lang.Class<?> r3 = X.C40343FsR.LJIIJ     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L61
            java.lang.String r2 = "prefetchWhenNavigate"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L61
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
            r0 = r5
        L62:
            X.C40343FsR.LJIIL = r0
            java.lang.Class<?> r3 = X.C40343FsR.LJIIJ     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L74
            java.lang.String r2 = "prefetchWhenLoad"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L74
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch: java.lang.Throwable -> L74
            java.lang.reflect.Method r5 = r3.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L74
        L74:
            X.C40343FsR.LJIILIIL = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40343FsR.<clinit>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
    
        if (r6 == 2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40343FsR.LIZIZ():void");
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ(C40343FsR c40343FsR) {
        boolean z;
        Context context;
        InterfaceC60837NuD LJ2;
        c40343FsR.getClass();
        C37682Eqc.LIZIZ(c40343FsR.LIZIZ, "Spark", "createView");
        LJIILJJIL.LJIIIZ();
        SparkSchemaParam LJIIZILJ = c40343FsR.LIZIZ.LJIIZILJ(3);
        if (LJIIZILJ != null) {
            z = LJIIZILJ.getUseMutableContext();
        } else {
            z = false;
        }
        if (C60806Nti.LIZ) {
            C60809Ntl.LIZIZ.getClass();
            InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
            if (interfaceC60799Ntb != null && (LJ2 = interfaceC60799Ntb.LJ()) != null && LJ2.LIZ(c40343FsR.LIZ) != c40343FsR.LIZIZ.LJ(c40343FsR.LIZ)) {
                Integer LJIJI = c40343FsR.LIZIZ.LJIJI(c40343FsR.LIZ);
                if (LJIJI != null) {
                    int intValue = LJIJI.intValue();
                    if (z) {
                        context = new C40345FsT(c40343FsR.LIZ, intValue);
                    } else {
                        context = new C40347FsV(c40343FsR.LIZ, intValue);
                    }
                } else if (z) {
                    context = new MutableContextWrapper(c40343FsR.LIZ);
                } else {
                    context = c40343FsR.LIZ;
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = new SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(context, null, 62);
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIIJJI(c40343FsR.LIZIZ);
                return sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
            }
        }
        if (z) {
            context = new MutableContextWrapper(c40343FsR.LIZ);
        } else {
            context = c40343FsR.LIZ;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = new SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(context, null, 62);
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIIJJI(c40343FsR.LIZIZ);
        return sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
    }

    public C40343FsR(Context context, SparkContext sparkContext) {
        this.LIZ = context;
        this.LIZIZ = sparkContext;
    }
}
