package X;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Pft, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65045Pft implements InterfaceC65003PfD {
    public static C65045Pft LJ;
    public IMessageManager LIZJ;
    public final ConcurrentHashMap<Class<?>, Pair<IMessageManager, Object>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Method, Pair<IMessageManager, C64971Peh<?>>> LIZIZ = new ConcurrentHashMap<>();
    public final C65047Pfv LIZLLL = new C65047Pfv(this);

    public static C65045Pft LIZ() {
        if (LJ == null) {
            synchronized (C65045Pft.class) {
                if (LJ == null) {
                    LJ = new C65045Pft();
                }
            }
        }
        return LJ;
    }

    public final <T> T LIZIZ(final Class<T> cls, final T t) {
        if (this.LIZJ == null) {
            return t;
        }
        if (!LiveUplinkStrategySetting.INSTANCE.supportUplink() || !this.LIZJ.isWsConnected()) {
            return t;
        }
        Pair<IMessageManager, Object> pair = this.LIZ.get(cls);
        if (pair == null || pair.first != this.LIZJ) {
            final IMessageManager iMessageManager = this.LIZJ;
            if (cls.isInterface()) {
                if (cls.getInterfaces().length <= 0) {
                    pair = new Pair<>(iMessageManager, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.Pfu
                        /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
                        @Override // java.lang.reflect.InvocationHandler
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) {
                            /*
                                r10 = this;
                                java.lang.String r8 = ""
                                X.Pft r1 = X.C65045Pft.this
                                com.ss.ugc.live.sdk.message.interfaces.IMessageManager r7 = r2
                                java.lang.Class r5 = r3
                                java.lang.Object r4 = r4
                                r1.getClass()
                                r6 = 0
                                X.PsI r0 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> L37
                                r0.getClass()     // Catch: java.lang.Exception -> L37
                                java.lang.Class<com.bytedance.android.livesdk.comp.api.network.INetworkService> r0 = com.bytedance.android.livesdk.comp.api.network.INetworkService.class
                                X.0Mx r0 = X.CN1.LIZ(r0)     // Catch: java.lang.Exception -> L37
                                com.bytedance.android.livesdk.comp.api.network.INetworkService r0 = (com.bytedance.android.livesdk.comp.api.network.INetworkService) r0     // Catch: java.lang.Exception -> L37
                                X.PfT r0 = r0.gF()     // Catch: java.lang.Exception -> L37
                                X.Peh r3 = r1.LIZJ(r7, r0, r12)     // Catch: java.lang.Exception -> L37
                                X.Pei r6 = r3.LIZIZ(r13)     // Catch: java.lang.Exception -> L35
                                java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L35
                                java.lang.String r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L35
                                r1.<init>(r0)     // Catch: java.lang.Exception -> L35
                                java.lang.String r2 = r1.getPath()     // Catch: java.lang.Exception -> L35
                                goto L53
                            L35:
                                r2 = move-exception
                                goto L39
                            L37:
                                r2 = move-exception
                                r3 = r6
                            L39:
                                java.lang.StringBuilder r1 = X.X1D.LIZ()
                                java.lang.String r0 = "loadServiceMethod error or toRequest error: "
                                r1.append(r0)
                                java.lang.String r0 = r2.toString()
                                r1.append(r0)
                                java.lang.String r1 = X.X1D.LIZIZ(r1)
                                java.lang.String r0 = "LiveUplinkClient"
                                X.C0NB.LJIIIZ(r0, r1)
                                r2 = r8
                            L53:
                                com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting r9 = com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting.INSTANCE
                                java.util.Map r1 = r9.getUplinkApiAllowedList()
                                if (r5 != 0) goto Lc9
                                r0 = r8
                            L5c:
                                java.lang.Object r1 = r1.get(r0)
                                java.util.Map r1 = (java.util.Map) r1
                                if (r1 == 0) goto L6a
                                boolean r0 = r1.containsKey(r2)
                                if (r0 != 0) goto L76
                            L6a:
                                java.util.Map r0 = r9.uplinkApiAlternativeServiceIdList()
                                if (r5 != 0) goto Lc4
                            L70:
                                java.lang.Object r1 = r0.get(r8)
                                java.util.Map r1 = (java.util.Map) r1
                            L76:
                                if (r3 == 0) goto L8c
                                if (r6 == 0) goto L8c
                                boolean r0 = android.text.TextUtils.isEmpty(r2)
                                if (r0 != 0) goto L8c
                                if (r1 == 0) goto L8c
                                boolean r0 = r1.containsKey(r2)
                                if (r0 == 0) goto L8c
                                X.Pfw r0 = r3.LJII
                                if (r0 != 0) goto L95
                            L8c:
                                java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r4)
                                java.lang.Object r0 = r0.invoke(r11, r12, r13)
                            L94:
                                return r0
                            L95:
                                java.lang.Object r0 = r1.get(r2)
                                java.lang.Long r0 = (java.lang.Long) r0
                                r1 = 20000(0x4e20, double:9.8813E-320)
                                if (r0 != 0) goto Lbf
                                r8 = 20000(0x4e20, double:9.8813E-320)
                            La1:
                                X.Pfw r5 = r3.LJII
                                r3 = 0
                                int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                                if (r0 > 0) goto Lbd
                            La9:
                                java.lang.String r0 = "uplinkRequestAdapter"
                                kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                                java.lang.String r0 = "messageManager"
                                kotlin.jvm.internal.o.LJIIIZ(r7, r0)
                                X.YMG r0 = new X.YMG
                                r0.<init>(r7, r1, r6)
                                java.lang.Object r0 = r5.LIZ(r0)
                                goto L94
                            Lbd:
                                r1 = r8
                                goto La9
                            Lbf:
                                long r8 = r0.longValue()
                                goto La1
                            Lc4:
                                java.lang.String r8 = X.C16880lQ.LJLLJ(r5)
                                goto L70
                            Lc9:
                                java.lang.String r0 = X.C16880lQ.LJLLJ(r5)
                                goto L5c
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C65046Pfu.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                        }
                    }));
                    this.LIZ.put(cls, pair);
                } else {
                    throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
                }
            } else {
                throw new IllegalArgumentException("API declarations must be interfaces.");
            }
        }
        T t2 = (T) pair.second;
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public final C64971Peh<?> LIZJ(IMessageManager iMessageManager, C65019PfT c65019PfT, Method method) {
        Pair<IMessageManager, C64971Peh<?>> pair;
        synchronized (this.LIZIZ) {
            pair = this.LIZIZ.get(method);
            if (pair == null || pair.first != iMessageManager) {
                pair = new Pair<>(iMessageManager, new C64952PeO(c65019PfT, method, LJ).LIZ());
                this.LIZIZ.put(method, pair);
            }
        }
        return (C64971Peh) pair.second;
    }
}
