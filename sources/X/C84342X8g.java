package X;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.RouteManager;
import defpackage.e1;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.X8g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84342X8g {
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    public static void LIZ() {
        C84339X8d.LIZJ.getClass();
        if (C84339X8d.LIZ != null) {
            return;
        }
        IRetrofitFactory service = RetrofitFactory.LIZLLL();
        X8O x8o = new X8O(FKM.LIZ());
        C38825FLp pool = C38825FLp.LJLIL;
        o.LJIIJ(pool, "pool");
        x8o.LIZJ = pool;
        o.LJIIIIZZ(service, "service");
        x8o.LIZIZ.LIZ = service;
        x8o.LIZ = false;
        x8o.LIZLLL.put(AbstractC73638SvC.class, new XF4());
        x8o.LIZLLL.put(Future.class, new C84345X8j());
        x8o.LIZLLL.put(AbstractC73672Svk.class, new XF3());
        x8o.LIZLLL.put(InterfaceC37276Ek4.class, new C84344X8i());
        if (x8o.LIZJ == null) {
            x8o.LIZJ = C36823Ecl.LJLIL;
        }
        Application application = x8o.LJ;
        boolean z = x8o.LIZ;
        X8I x8i = x8o.LIZIZ;
        InterfaceC65784Pro<? extends ExecutorService> interfaceC65784Pro = x8o.LIZJ;
        if (interfaceC65784Pro != null) {
            X8N x8n = new X8N(application, z, x8i, interfaceC65784Pro, x8o.LIZLLL);
            C84346X8k c84346X8k = new C84346X8k(new AqS181S0100000_15(x8n, 254));
            Object obj = c84346X8k.LIZIZ;
            if (obj == null) {
                synchronized (c84346X8k) {
                    Object obj2 = c84346X8k.LIZIZ;
                    if (obj2 != null) {
                        c84346X8k.LIZ = null;
                        obj = obj2;
                    } else {
                        InterfaceC88472Yns<? super A, ? extends T> interfaceC88472Yns = c84346X8k.LIZ;
                        if (interfaceC88472Yns != 0) {
                            ?? invoke = interfaceC88472Yns.invoke(x8n);
                            c84346X8k.LIZIZ = invoke;
                            c84346X8k.LIZ = null;
                            obj = invoke;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                }
            }
            C84339X8d c84339X8d = (C84339X8d) obj;
            o.LJIIJ(c84339X8d, "<set-?>");
            C84339X8d.LIZ = c84339X8d;
            interfaceC65784Pro.invoke().execute(RunnableC84341X8f.LJLIL);
            if (C84339X8d.LIZ != null) {
                X8K.LJLJLLL = e1.LIZ(31744, "power_preload_preload_key_opt", true, false);
                C65110Pgw.LIZJ = new C65118Ph4();
                RouteManager.getInstance().addGlobalResultCallback(new C84347X8l());
                C61210O0o.LJ.add(new C84348X8m());
                return;
            }
            o.LJIJI("instance");
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(Intent intent, boolean z) {
        String str;
        X8X x8x;
        ComponentName component;
        String className;
        intent.putExtra("EXTRA_PRELOAD_PAGE_START_TIME", SystemClock.elapsedRealtime());
        if (C52941Kq9.LIZ()) {
            C76800UCe c76800UCe = null;
            if (z) {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "POWER_FRAGMENT_CLASS_NAME");
                if (LLJJIJIIJIL == null || (component = intent.getComponent()) == null || (className = component.getClassName()) == null) {
                    return;
                }
                try {
                    C84339X8d.LIZJ.getClass();
                    X8W LIZ = C84340X8e.LIZ();
                    if (LIZ != 0) {
                        String dataString = intent.getDataString();
                        if (dataString == null) {
                            dataString = "";
                        }
                        LIZ.LIZJ(dataString, Class.forName(className), Class.forName(LLJJIJIIJIL), C16880lQ.LLJJIJI(intent));
                        c76800UCe = C76800UCe.LIZ;
                    }
                    C3C5.m7constructorimpl(c76800UCe);
                    return;
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    return;
                }
            }
            C84340X8e c84340X8e = C84339X8d.LIZJ;
            c84340X8e.getClass();
            X8W LIZ2 = C84340X8e.LIZ();
            if (LIZ2 != null) {
                X8V x8v = LIZ2.LIZ;
                x8v.getClass();
                android.net.Uri data = intent.getData();
                ComponentName component2 = intent.getComponent();
                if (component2 != null) {
                    str = component2.getClassName();
                } else {
                    str = null;
                }
                if (data != null && data.isOpaque()) {
                    return;
                }
                c84340X8e.getClass();
                if (C84339X8d.LIZ == null) {
                    return;
                }
                if (data != null) {
                    if (str == null) {
                        return;
                    }
                    String uri = data.toString();
                    o.LJFF(uri, "uri.toString()");
                    X8X LIZ3 = C84343X8h.LIZ(uri);
                    if (LIZ3 == null || !o.LJ(LIZ3.LJLJJLL, str)) {
                        return;
                    }
                    try {
                        C78847Ux1.LJJIJL(intent);
                        X8S x8s = x8v.LIZ;
                        if (x8s != null) {
                            x8s.LIZIZ(LIZ3, C16880lQ.LLJJIJI(intent));
                            return;
                        } else {
                            o.LJIJI("preloadProxy");
                            throw null;
                        }
                    } catch (Exception e) {
                        X8G.LIZ(e);
                        return;
                    }
                }
                if (str == null) {
                    return;
                }
                Iterator<X8X> it = C84343X8h.LIZ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        x8x = it.next();
                        if (o.LJ(x8x.LJLJJLL, str)) {
                            break;
                        }
                    } else {
                        x8x = null;
                        break;
                    }
                }
                X8X x8x2 = x8x;
                if (x8x2 == null) {
                    return;
                }
                try {
                    C78847Ux1.LJJIJL(intent);
                    X8S x8s2 = x8v.LIZ;
                    if (x8s2 != null) {
                        x8s2.LIZIZ(x8x2, C16880lQ.LLJJIJI(intent));
                    } else {
                        o.LJIJI("preloadProxy");
                        throw null;
                    }
                } catch (Exception e2) {
                    X8G.LIZ(e2);
                }
            }
        }
    }
}
