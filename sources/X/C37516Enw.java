package X;

import com.bytedance.pia.core.spi.ConfigTask;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.vmsdk.worker.JsWorker;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Enw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37516Enw {
    public static final C37516Enw LIZJ = new C37516Enw();
    public final long LIZ = System.currentTimeMillis();
    public final long LIZIZ;

    public C37516Enw() {
        InterfaceC37547EoR interfaceC37547EoR;
        String LIZ;
        C37420EmO c37420EmO;
        ConfigTask.get().run();
        C37463En5.LJIILLIIL = C16880lQ.LLLLL(C37509Enp.LIZ);
        if (!C37519Enz.LIZIZ && C37519Enz.LIZ.compareAndSet(false, true)) {
            if (JsWorker.initialize()) {
                C37519Enz.LIZIZ = true;
            } else {
                C37518Eny c37518Eny = C37520Eo0.LIZ;
                c37518Eny.getClass();
                Object obj = ((ConcurrentHashMap) c37518Eny.LIZ).get(InterfaceC37529Eo9.class.getName());
                if (obj != null) {
                    interfaceC37547EoR = (InterfaceC37547EoR) obj;
                } else {
                    interfaceC37547EoR = null;
                }
                InterfaceC37529Eo9 interfaceC37529Eo9 = (InterfaceC37529Eo9) interfaceC37547EoR;
                if (interfaceC37529Eo9 == null) {
                    LIZ = "";
                } else {
                    LIZ = interfaceC37529Eo9.LIZ();
                }
                JsWorker.preLoadPlugin(LIZ);
                if (JsWorker.initializeWithPlugin2(LIZ)) {
                    C37519Enz.LIZIZ = true;
                }
            }
        }
        if (C37509Enp.LJ == null) {
            InterfaceC37408EmC<InterfaceC37599EpH> interfaceC37408EmC = new InterfaceC37408EmC() { // from class: X.Eo1
                @Override // X.InterfaceC37408EmC
                public final Object create() {
                    return new DefaultResourceLoader();
                }

                @Override // X.InterfaceC37408EmC
                public final Object LIZ(Object obj2) {
                    return create();
                }
            };
            if (C37509Enp.LJ == null) {
                C37509Enp.LJ = interfaceC37408EmC;
            }
        }
        if (C37509Enp.LJFF == null) {
            InterfaceC37408EmC<InterfaceC37169EiL> interfaceC37408EmC2 = new InterfaceC37408EmC() { // from class: X.Eo7
                @Override // X.InterfaceC37408EmC
                public final Object create() {
                    return new InterfaceC37169EiL() { // from class: X.Eo8
                        @Override // X.InterfaceC37169EiL
                        public final Object LIZ(Class cls, String str) {
                            return C65083PgV.LJIIIIZZ(cls, str);
                        }
                    };
                }

                @Override // X.InterfaceC37408EmC
                public final Object LIZ(Object obj2) {
                    return create();
                }
            };
            if (C37509Enp.LJFF == null) {
                C37509Enp.LJFF = interfaceC37408EmC2;
            }
        }
        Runnable runnable = C37509Enp.LIZIZ;
        if (runnable != null) {
            runnable.run();
        }
        C37425EmT c37425EmT = new C37425EmT();
        C37420EmO c37420EmO2 = C37420EmO.LIZIZ;
        C37420EmO c37420EmO3 = c37420EmO2.LIZ;
        if (c37420EmO3 == null) {
            c37420EmO2.LIZ = c37425EmT;
        } else {
            C37420EmO c37420EmO4 = c37420EmO3.LIZ;
            while (true) {
                c37420EmO = c37420EmO3;
                c37420EmO3 = c37420EmO4;
                if (c37420EmO3 == null) {
                    break;
                } else {
                    c37420EmO4 = c37420EmO3.LIZ;
                }
            }
            c37420EmO.LIZ = c37425EmT;
        }
        try {
            Class.forName("com.bytedance.pia.core.CompatEntry").getMethod("initialize", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        this.LIZIZ = System.currentTimeMillis();
    }
}
