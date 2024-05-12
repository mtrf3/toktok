package X;

import android.os.Bundle;
import com.benchmark.runtime.nativePort.BXStrategyManagePort;
import com.benchmark.strategy.nativePort.ByteBenchStrategyPort;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09580Ze {
    public static C09580Ze LIZJ;
    public final BXStrategyManagePort LIZ = new BXStrategyManagePort();
    public final ConcurrentHashMap<Integer, InterfaceC09240Xw> LIZIZ = new ConcurrentHashMap<>();

    public static C09580Ze LIZJ() {
        if (LIZJ == null) {
            synchronized (C09580Ze.class) {
                if (LIZJ == null) {
                    LIZJ = new C09580Ze();
                }
            }
        }
        return LIZJ;
    }

    public final InterfaceC09240Xw LIZ() {
        if (!C09590Zf.LJIILLIIL.LIZIZ()) {
            return null;
        }
        return LIZIZ(C09590Zf.LJIILLIIL.LIZJ);
    }

    public final synchronized InterfaceC09240Xw LIZIZ(final int i) {
        InterfaceC09240Xw interfaceC09240Xw = null;
        if (!C09590Zf.LJIILLIIL.LIZIZ()) {
            return null;
        }
        if (i <= 0) {
            i = C09590Zf.LJIILLIIL.LIZJ;
        }
        if (this.LIZIZ.containsKey(Integer.valueOf(i))) {
            return this.LIZIZ.get(Integer.valueOf(i));
        }
        synchronized (C09580Ze.class) {
            if (!this.LIZIZ.containsKey(Integer.valueOf(i))) {
                if (C09590Zf.LJIILLIIL.LIZIZ()) {
                    interfaceC09240Xw = new InterfaceC09240Xw(i) { // from class: X.1FQ
                        public C10930bp LIZ;
                        public final ConcurrentHashMap<String, InterfaceC09230Xv> LIZIZ = new ConcurrentHashMap<>();
                        public volatile boolean LIZJ = false;
                        public final int LIZLLL;
                        public final ByteBenchStrategyPort LJ;

                        @Override // X.InterfaceC09240Xw
                        public final int LJFF() {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ("video_size_index")) != null) {
                                return ((Integer) LJIIJ).intValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return 0;
                            }
                            return this.LJ.obtainStaticIntStrategy("video_size_index", 0);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final String LJIIJ() {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ("t_record_output_size")) != null) {
                                return (String) LJIIJ;
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return "";
                            }
                            return this.LJ.obtainStaticStrStrategy("t_record_output_size", "");
                        }

                        @Override // X.InterfaceC09240Xw
                        public final int getRepoName() {
                            int i2 = this.LIZLLL;
                            if (i2 <= 0) {
                                C09590Zf c09590Zf = C09590Zf.LJIILLIIL;
                                if (c09590Zf != null) {
                                    return c09590Zf.LIZJ;
                                }
                                return 0;
                            }
                            return i2;
                        }

                        {
                            new Gson();
                            this.LIZLLL = i;
                            this.LJ = new ByteBenchStrategyPort(i);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final int LIZJ(C10930bp c10930bp) {
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return -105;
                            }
                            if (this.LIZJ) {
                                return 0;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            this.LIZ = c10930bp;
                            this.LIZJ = true;
                            this.LJ.init(this.LIZ);
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            StringBuilder LIZJ2 = V10.LIZJ("init cost: ", currentTimeMillis2, "  the app id is: ");
                            LIZJ2.append(this.LIZLLL);
                            X1D.LIZIZ(LIZJ2);
                            C47261Igj.LJJIIJ("ByteBenchStrategy");
                            if (C1FO.LJIIIIZZ("bytebench_strategy_init_v2")) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("cost_time", currentTimeMillis2);
                                    jSONObject.put("strategy_origin_id", this.LIZLLL);
                                    C38891fp.LJJII("bytebench_strategy_init_v2", jSONObject);
                                } catch (JSONException unused) {
                                }
                            } else {
                                C47261Igj.LJIILJJIL("AppLogOpt");
                            }
                            return 0;
                        }

                        @Override // X.InterfaceC09240Xw
                        public final boolean LJIIIZ(String str) {
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return false;
                            }
                            return this.LJ.contains(str);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:14:0x00cb A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #1 {, blocks: (B:10:0x001d, B:23:0x0031, B:26:0x0077, B:29:0x009e, B:12:0x00a7, B:19:0x00af, B:14:0x00cb, B:15:0x00d0), top: B:9:0x001d }] */
                        /* JADX WARN: Removed duplicated region for block: B:18:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // X.InterfaceC09240Xw
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final <T extends X.InterfaceC09230Xv> T LJIILJJIL(java.lang.Class<T> r14) {
                            /*
                                r13 = this;
                                X.0Zf r0 = X.C09590Zf.LJIILLIIL
                                boolean r0 = r0.LIZIZ()
                                if (r0 != 0) goto La
                                r0 = 0
                                return r0
                            La:
                                java.lang.String r1 = r14.getName()
                                java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Xv> r0 = r13.LIZIZ
                                java.lang.Object r0 = r0.get(r1)
                                X.0Xv r0 = (X.InterfaceC09230Xv) r0
                                if (r0 != 0) goto Ld5
                                java.lang.String r12 = r14.getName()
                                monitor-enter(r12)
                                java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Xv> r0 = r13.LIZIZ     // Catch: java.lang.Throwable -> Ld2
                                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> Ld2
                                X.0Xv r3 = (X.InterfaceC09230Xv) r3     // Catch: java.lang.Throwable -> Ld2
                                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld2
                                r5.<init>()     // Catch: java.lang.Throwable -> Ld2
                                java.lang.String r6 = ""
                                r8 = 0
                                r1 = 0
                                if (r3 != 0) goto La7
                                long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.StringBuilder r4 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.String r0 = r14.getName()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                r4.append(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.String r0 = "$$Imp"
                                r4.append(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.String r9 = X.X1D.LIZIZ(r4)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.String r7 = "ByteBenchStrategy"
                                java.lang.StringBuilder r4 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.String r0 = "obtain class name: "
                                r4.append(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                r4.append(r9)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                X.X1D.LIZIZ(r4)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                X.C47261Igj.LJIILJJIL(r7)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.ClassLoader r0 = r14.getClassLoader()     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                r7 = 1
                                java.lang.Class r4 = java.lang.Class.forName(r9, r7, r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.reflect.Constructor r4 = r4.getConstructor(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                r4.setAccessible(r7)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                java.lang.Object r7 = r4.newInstance(r0)     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                X.0Xv r7 = (X.InterfaceC09230Xv) r7     // Catch: java.lang.Exception -> L9c java.lang.Throwable -> Ld2
                                r7.setByteBenchStrategy(r13)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Xv> r0 = r13.LIZIZ     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                r0.put(r9, r7)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                long r1 = r1 - r10
                                java.lang.String r4 = "ByteBenchStrategy"
                                java.lang.StringBuilder r3 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                java.lang.String r0 = "create IBXStrategy instance cost: "
                                r3.append(r0)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                r3.append(r1)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                X.X1D.LIZIZ(r3)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                X.C47261Igj.LJIILJJIL(r4)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> Ld2
                                r3 = r7
                                goto La7
                            L9a:
                                r0 = move-exception
                                goto L9e
                            L9c:
                                r0 = move-exception
                                r7 = r3
                            L9e:
                                java.lang.String r6 = r0.getMessage()     // Catch: java.lang.Throwable -> Ld2
                                X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> Ld2
                                r3 = r7
                                r8 = -1
                            La7:
                                java.lang.String r0 = "bytebench_strategy_class_obtain_v2"
                                boolean r0 = X.C1FO.LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> Ld2
                                if (r0 == 0) goto Lcb
                                java.lang.String r0 = "cost_time"
                                r5.put(r0, r1)     // Catch: java.lang.Exception -> Ld0 java.lang.Throwable -> Ld2
                                java.lang.String r0 = "ret"
                                r5.put(r0, r8)     // Catch: java.lang.Exception -> Ld0 java.lang.Throwable -> Ld2
                                java.lang.String r0 = "message"
                                r5.put(r0, r6)     // Catch: java.lang.Exception -> Ld0 java.lang.Throwable -> Ld2
                                java.lang.String r1 = "strategy_origin_id"
                                int r0 = r13.LIZLLL     // Catch: java.lang.Exception -> Ld0 java.lang.Throwable -> Ld2
                                r5.put(r1, r0)     // Catch: java.lang.Exception -> Ld0 java.lang.Throwable -> Ld2
                                java.lang.String r0 = "bytebench_strategy_class_obtain_v2"
                                X.C38891fp.LJJII(r0, r5)     // Catch: java.lang.Exception -> Ld0 java.lang.Throwable -> Ld2
                                goto Ld0
                            Lcb:
                                java.lang.String r0 = "AppLogOpt"
                                X.C47261Igj.LJIILJJIL(r0)     // Catch: java.lang.Throwable -> Ld2
                            Ld0:
                                monitor-exit(r12)     // Catch: java.lang.Throwable -> Ld2
                                return r3
                            Ld2:
                                r0 = move-exception
                                monitor-exit(r12)     // Catch: java.lang.Throwable -> Ld2
                                throw r0
                            Ld5:
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1FQ.LJIILJJIL(java.lang.Class):X.0Xv");
                        }

                        @Override // X.InterfaceC09240Xw
                        public final Boolean LJIILL(HashMap<String, String> hashMap) {
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return Boolean.FALSE;
                            }
                            this.LJ.getDeviceFeatureForServer(hashMap);
                            return Boolean.TRUE;
                        }

                        @Override // X.InterfaceC09240Xw
                        public final String LIZ(String str, String str2) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return (String) LJIIJ;
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return str2;
                            }
                            return this.LJ.obtainStrStrategy(str, str2, "{}", "", false);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final String LIZIZ(String str, String str2) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return (String) LJIIJ;
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return str2;
                            }
                            return this.LJ.obtainStrStrategy(str, str2, "{}", "", true);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final float LIZLLL(float f, String str) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Float) LJIIJ).floatValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return f;
                            }
                            return this.LJ.obtainFloatStrategy(str, f, "{}", "", false);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final float LJ(String str, float f) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Float) LJIIJ).floatValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return f;
                            }
                            return this.LJ.obtainFloatStrategy(str, f, "{}", "", true);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final int LJI(String str, int i2) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Integer) LJIIJ).intValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return i2;
                            }
                            return this.LJ.obtainIntStrategy(str, i2, "{}", "", true);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final boolean LJII(String str, boolean z) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Boolean) LJIIJ).booleanValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return z;
                            }
                            return this.LJ.obtainBoolStrategy(str, z, "{}", "", true);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final boolean LJIIIIZZ(String str, boolean z) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Boolean) LJIIJ).booleanValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return z;
                            }
                            return this.LJ.obtainBoolStrategy(str, z, "{}", "", false);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final int LJIIJJI(int i2, String str) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Integer) LJIIJ).intValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return i2;
                            }
                            return this.LJ.obtainIntStrategy(str, i2, "{}", "", false);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final long LJIIL(long j, String str) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Long) LJIIJ).longValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return j;
                            }
                            return this.LJ.obtainLongStrategy(str, j, "{}", "", false);
                        }

                        @Override // X.InterfaceC09240Xw
                        public final Boolean LJIILIIL(C05060Hu[] c05060HuArr, Bundle bundle) {
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return Boolean.FALSE;
                            }
                            C05090Hx.LIZJ.LIZ.getDeviceFeature(C09590Zf.LJIILLIIL.LIZJ, c05060HuArr, bundle);
                            return Boolean.TRUE;
                        }

                        @Override // X.InterfaceC09240Xw
                        public final long LJIILLIIL(String str, long j) {
                            Object LJIIJ;
                            if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
                                return ((Long) LJIIJ).longValue();
                            }
                            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                                return j;
                            }
                            return this.LJ.obtainLongStrategy(str, j, "{}", "", true);
                        }
                    };
                    this.LIZ.LIZ(i);
                    this.LIZIZ.put(Integer.valueOf(i), interfaceC09240Xw);
                }
            } else {
                interfaceC09240Xw = this.LIZIZ.get(Integer.valueOf(i));
            }
        }
        return interfaceC09240Xw;
    }
}
