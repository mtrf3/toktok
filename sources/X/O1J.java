package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS0S0711000_10;
import kotlin.jvm.internal.AqS1S0700000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O1J implements InterfaceC39974FmU {
    public int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public IXResourceLoader LJLJJL;
    public final List<Class<? extends IXResourceLoader>> LJLJJLL;
    public final C39976FmW LJLJL;
    public final IResourceLoaderService LJLJLJ;

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public O1J(List<? extends Class<? extends IXResourceLoader>> list, C39976FmW loggerWrapper, IResourceLoaderService service) {
        o.LJIIJ(loggerWrapper, "loggerWrapper");
        o.LJIIJ(service, "service");
        this.LJLJJLL = list;
        this.LJLJL = loggerWrapper;
        this.LJLJLJ = service;
        this.LJLILLLLZI = -1;
    }

    public final void LIZ(C61222O1a c61222O1a, InterfaceC88472Yns<? super C61222O1a, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        JSONObject jSONObject;
        O1I loadSync;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (c61222O1a.LIZ) {
            Iterator<Class<? extends IXResourceLoader>> it = this.LJLJJLL.iterator();
            if (!it.hasNext()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ResourceLoaderChain# no processor for ");
                LIZ.append(c61222O1a.LIZIZ.LJFF);
                interfaceC88472Yns2.invoke(new Throwable(X1D.LIZIZ(LIZ)));
                return;
            }
            LIZIZ(c61222O1a, it, interfaceC88472Yns, interfaceC88472Yns2, new C61237O1p(), 0);
        } else {
            C61237O1p c61237O1p = new C61237O1p();
            Iterator<Class<? extends IXResourceLoader>> it2 = this.LJLJJLL.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Class<? extends IXResourceLoader> next = it2.next();
                try {
                    if (i == this.LJLIL && (jSONObject4 = c61222O1a.LIZIZ.LIZLLL.LJII) != null) {
                        jSONObject4.put("h_total", c61237O1p.LIZ());
                    }
                    if (i == this.LJLILLLLZI) {
                        c61237O1p.LIZ();
                        this.LJLJJI = true;
                    }
                    IXResourceLoader newInstance = next.newInstance();
                    newInstance.setService(this.LJLJLJ);
                    newInstance.setLoaderLogger(this.LJLJL);
                    this.LJLJJL = newInstance;
                    loadSync = newInstance.loadSync(c61222O1a.LIZIZ, c61222O1a.LIZJ);
                } catch (Throwable th) {
                    if (i == this.LJLJJLL.size() - 1) {
                        if (this.LJLJJI && (jSONObject = c61222O1a.LIZIZ.LIZLLL.LJII) != null) {
                            jSONObject.put("l_total", c61237O1p.LIZ());
                        }
                        interfaceC88472Yns2.invoke(th);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    C39973FmT.LIZIZ(this, C03090Af.LIZJ(LIZ2, "ResourceLoaderChain# onException ", th, LIZ2), null, null, 6);
                }
                if (loadSync == null) {
                    Throwable th2 = new Throwable(o.LJIILLIIL(" return null", C16880lQ.LJLLILLLL(next)));
                    if (i == this.LJLJJLL.size() - 1) {
                        if (this.LJLJJI && (jSONObject3 = c61222O1a.LIZIZ.LIZLLL.LJII) != null) {
                            jSONObject3.put("l_total", c61237O1p.LIZ());
                        }
                        interfaceC88472Yns2.invoke(th2);
                    }
                    printReject(th2, "");
                    if (this.LJLJI) {
                        interfaceC88472Yns2.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                        break;
                    }
                    i++;
                } else {
                    c61222O1a.LIZIZ = loadSync;
                    loadSync.LJIILJJIL = C16880lQ.LJLLJ(next);
                    if (this.LJLJJI && (jSONObject2 = c61222O1a.LIZIZ.LIZLLL.LJII) != null) {
                        jSONObject2.put("l_total", c61237O1p.LIZ());
                    }
                    interfaceC88472Yns.invoke(c61222O1a);
                    break;
                }
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Load url = ");
        LIZ3.append(c61222O1a.LIZIZ.LJFF);
        LIZ3.append(", message = ");
        LIZ3.append(c61222O1a.LIZIZ.LJ);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ3), null, null, 6);
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    public final void LIZIZ(C61222O1a c61222O1a, Iterator<? extends Class<? extends IXResourceLoader>> it, InterfaceC88472Yns<? super C61222O1a, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2, C61237O1p c61237O1p, int i) {
        boolean z;
        JSONObject jSONObject;
        Class<? extends IXResourceLoader> next = it.next();
        boolean hasNext = it.hasNext();
        IXResourceLoader newInstance = next.newInstance();
        newInstance.setService(this.LJLJLJ);
        newInstance.setLoaderLogger(this.LJLJL);
        this.LJLJJL = newInstance;
        try {
            if (i == this.LJLIL && (jSONObject = c61222O1a.LIZIZ.LIZLLL.LJII) != null) {
                jSONObject.put("h_total", c61237O1p.LIZ());
            }
            if (i == this.LJLILLLLZI) {
                this.LJLJJI = true;
                c61237O1p.LIZ();
            }
            O1I o1i = c61222O1a.LIZIZ;
            O1L o1l = c61222O1a.LIZJ;
            AqS1S0700000_10 aqS1S0700000_10 = new AqS1S0700000_10(this, interfaceC88472Yns2, c61222O1a, next, c61237O1p, interfaceC88472Yns, newInstance, 1);
            z = hasNext;
            try {
                newInstance.loadAsync(o1i, o1l, aqS1S0700000_10, new AqS0S0711000_10(this, c61222O1a, newInstance, interfaceC88472Yns2, hasNext, it, interfaceC88472Yns, c61237O1p, i, 0));
            } catch (Throwable th) {
                th = th;
                StringBuilder LIZ = X1D.LIZ();
                C39973FmT.LIZIZ(this, C03090Af.LIZJ(LIZ, "ResourceLoaderChain# onException ", th, LIZ), null, null, 6);
                if (z) {
                    LIZIZ(c61222O1a, it, interfaceC88472Yns, interfaceC88472Yns2, c61237O1p, i + 1);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    interfaceC88472Yns2.invoke(new Throwable(C03090Af.LIZJ(LIZ2, "ResourceLoaderChain# ", th, LIZ2)));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = hasNext;
        }
    }
}
