package X;

import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.service.IResourceService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS0S0711000_10;
import kotlin.jvm.internal.AqS3S0600000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2L {
    public EnumC61253O2f LIZ;
    public EnumC61253O2f LIZIZ;
    public boolean LIZJ;
    public IHybridResourceLoader LIZLLL;
    public final List<Class<? extends IHybridResourceLoader>> LJ;
    public final IResourceService LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public O2L(List<? extends Class<? extends IHybridResourceLoader>> list, IResourceService service) {
        o.LJIIJ(service, "service");
        this.LJ = list;
        this.LJFF = service;
    }

    public final void LIZ(C61261O2n c61261O2n, InterfaceC88472Yns<? super C61261O2n, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        EnumC61253O2f enumC61253O2f;
        O26 loadSync;
        if (c61261O2n.LIZJ) {
            Iterator<Class<? extends IHybridResourceLoader>> it = this.LJ.iterator();
            if (!it.hasNext()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ResourceLoaderChain# no processor for ");
                LIZ.append(c61261O2n.LIZ.LJI);
                interfaceC88472Yns2.invoke(new Throwable(X1D.LIZIZ(LIZ)));
                return;
            }
            LIZIZ(c61261O2n, it, interfaceC88472Yns, interfaceC88472Yns2, new C61268O2u(), 0);
        } else {
            C61268O2u c61268O2u = new C61268O2u();
            Iterator<Class<? extends IHybridResourceLoader>> it2 = this.LJ.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Class<? extends IHybridResourceLoader> clazz = it2.next();
                try {
                    o.LJIIJ(clazz, "clazz");
                    java.util.Map<Class<? extends IHybridResourceLoader>, EnumC61253O2f> map = C61251O2d.LIZ;
                    if (map.containsKey(clazz)) {
                        enumC61253O2f = (EnumC61253O2f) ((LinkedHashMap) map).get(clazz);
                    } else {
                        enumC61253O2f = EnumC61253O2f.DEFAULT;
                    }
                    this.LIZIZ = enumC61253O2f;
                    EnumC61253O2f enumC61253O2f2 = this.LIZ;
                    EnumC61253O2f enumC61253O2f3 = EnumC61253O2f.LOW;
                    if (enumC61253O2f2 != enumC61253O2f3 && enumC61253O2f == enumC61253O2f3) {
                        c61268O2u.LIZ();
                    }
                    this.LIZ = this.LIZIZ;
                    IHybridResourceLoader newInstance = clazz.newInstance();
                    newInstance.setService(this.LJFF);
                    this.LIZLLL = newInstance;
                    loadSync = newInstance.loadSync(c61261O2n.LIZ, c61261O2n.LIZIZ);
                } catch (Throwable th) {
                    if (i == this.LJ.size() - 1) {
                        interfaceC88472Yns2.invoke(th);
                    }
                    C39048FUe c39048FUe = C39048FUe.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    C39048FUe.LIZIZ(c39048FUe, C03090Af.LIZJ(LIZ2, "ResourceLoaderChain# onException ", th, LIZ2), null, null, 6);
                }
                if (loadSync == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(C16880lQ.LJLLILLLL(clazz));
                    LIZ3.append(" return null");
                    Throwable th2 = new Throwable(X1D.LIZIZ(LIZ3));
                    if (i == this.LJ.size() - 1) {
                        interfaceC88472Yns2.invoke(th2);
                    }
                    C39048FUe.LIZJ(C39048FUe.LIZIZ, th2, null, 6);
                    if (this.LIZJ) {
                        interfaceC88472Yns2.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                        break;
                    }
                    i++;
                } else {
                    c61261O2n.LIZ = loadSync;
                    loadSync.LJIILJJIL = C16880lQ.LJLLJ(clazz);
                    interfaceC88472Yns.invoke(c61261O2n);
                    break;
                }
            }
        }
        C39048FUe c39048FUe2 = C39048FUe.LIZIZ;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Load url = ");
        LIZ4.append(c61261O2n.LIZ.LJI);
        LIZ4.append(", message = ");
        LIZ4.append(c61261O2n.LIZ.LIZLLL);
        C39048FUe.LIZIZ(c39048FUe2, X1D.LIZIZ(LIZ4), null, null, 6);
    }

    public final void LIZIZ(C61261O2n c61261O2n, Iterator<? extends Class<? extends IHybridResourceLoader>> it, InterfaceC88472Yns<? super C61261O2n, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2, C61268O2u c61268O2u, int i) {
        EnumC61253O2f enumC61253O2f;
        Class<? extends IHybridResourceLoader> clazz = it.next();
        o.LJIIJ(clazz, "clazz");
        java.util.Map<Class<? extends IHybridResourceLoader>, EnumC61253O2f> map = C61251O2d.LIZ;
        if (map.containsKey(clazz)) {
            enumC61253O2f = (EnumC61253O2f) ((LinkedHashMap) map).get(clazz);
        } else {
            enumC61253O2f = EnumC61253O2f.DEFAULT;
        }
        this.LIZIZ = enumC61253O2f;
        EnumC61253O2f enumC61253O2f2 = this.LIZ;
        EnumC61253O2f enumC61253O2f3 = EnumC61253O2f.LOW;
        if (enumC61253O2f2 != enumC61253O2f3 && enumC61253O2f == enumC61253O2f3) {
            c61268O2u.LIZ();
        }
        this.LIZ = this.LIZIZ;
        boolean hasNext = it.hasNext();
        IHybridResourceLoader newInstance = clazz.newInstance();
        newInstance.setService(this.LJFF);
        this.LIZLLL = newInstance;
        try {
            newInstance.loadAsync(c61261O2n.LIZ, c61261O2n.LIZIZ, new AqS3S0600000_10(this, interfaceC88472Yns2, c61261O2n, clazz, interfaceC88472Yns, newInstance, 4), new AqS0S0711000_10(this, c61261O2n, newInstance, interfaceC88472Yns2, hasNext, it, interfaceC88472Yns, c61268O2u, i, 1));
        } catch (Throwable th) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            C39048FUe.LIZIZ(c39048FUe, C03090Af.LIZJ(LIZ, "ResourceLoaderChain# onException ", th, LIZ), null, null, 6);
            if (it.hasNext()) {
                LIZIZ(c61261O2n, it, interfaceC88472Yns, interfaceC88472Yns2, c61268O2u, i + 1);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                interfaceC88472Yns2.invoke(new Throwable(C03090Af.LIZJ(LIZ2, "ResourceLoaderChain# ", th, LIZ2)));
            }
        }
    }
}
