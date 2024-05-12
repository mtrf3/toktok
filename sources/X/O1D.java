package X;

import Y.ACallableS4S0300100_10;
import android.app.Application;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class O1D extends C60379Nmp implements IResourceLoaderService {
    public O1E LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public final List<Class<? extends IXResourceLoader>> LJLJI = new ArrayList();
    public final List<Class<? extends IXResourceLoader>> LJLJJI = new ArrayList();
    public final List<EnumC60489Nob> LJLJLJ = C47261Igj.LJJIJIL(EnumC60489Nob.GECKO, EnumC60489Nob.BUILTIN, EnumC60489Nob.CDN);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 373));
    public final java.util.Map<O25, O1J> LJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void deleteResource(O1I info) {
        o.LJIIJ(info, "info");
    }

    @Override // X.C60379Nmp, X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final java.util.Map<String, String> getPreloadConfigs() {
        O1E o1e = this.LJLJJL;
        if (o1e != null) {
            String accessKey = o1e.LJIIIZ.getAccessKey();
            GeckoConfig LIZIZ = O1F.LIZIZ(C61238O1q.LIZ.LIZ(this), accessKey);
            return LIZIZ.getLoaderDepender().LIZIZ(LIZIZ.getOfflineDir(), accessKey);
        }
        o.LJIJI("mConfig");
        throw null;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final O1E getResourceConfig() {
        O1E o1e = this.LJLJJL;
        if (o1e != null) {
            return o1e;
        }
        o.LJIJI("mConfig");
        throw null;
    }

    @Override // X.C60379Nmp, X.InterfaceC60387Nmx
    public final void onUnRegister() {
        O1R o1r = C61238O1q.LIZ;
        o1r.getClass();
        o1r.LIZIZ.remove(this);
        java.util.Map<O25, O1J> map = this.LJLL;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = ((LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            O1J o1j = (O1J) ((Map.Entry) it.next()).getValue();
            o1j.LJLJI = true;
            IXResourceLoader iXResourceLoader = o1j.LJLJJL;
            if (iXResourceLoader != null) {
                iXResourceLoader.cancelLoad();
            }
            arrayList.add(C76800UCe.LIZ);
        }
        ((LinkedHashMap) this.LJLL).clear();
    }

    public O1D(Application application) {
        C61238O1q.LIZ.LIZJ = application;
    }

    public static final /* synthetic */ O1E LJJIJIIJIL(O1D o1d) {
        O1E o1e = o1d.LJLJJL;
        if (o1e != null) {
            return o1e;
        }
        o.LJIJI("mConfig");
        throw null;
    }

    public static String LJJIJLIJ(String str) {
        if (s.LJJLIIJ(str, "/", 6) == str.length() - 1) {
            String substring = str.substring(0, str.length() - 1);
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void cancel(O25 task) {
        o.LJIIJ(task, "task");
        O1J o1j = (O1J) ((LinkedHashMap) this.LJLL).get(task);
        if (o1j != null) {
            o1j.LJLJI = true;
            IXResourceLoader iXResourceLoader = o1j.LJLJJL;
            if (iXResourceLoader != null) {
                iXResourceLoader.cancelLoad();
            }
        }
        this.LJLL.remove(task);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void init(O1E config) {
        o.LJIIJ(config, "config");
        if (this.LJLJJLL) {
            C39973FmT.LIZIZ(this, "init# service is already init", null, null, 6);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init globalConfig = ");
        LIZ.append(config);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        this.LJLJJLL = true;
        C61243O1v c61243O1v = C61242O1u.LIZ;
        int i = config.LIZIZ;
        if (c61243O1v.LIZ == null && i > 0) {
            c61243O1v.LIZ = new C61234O1m(i);
        }
        O1R o1r = C61238O1q.LIZ;
        o1r.getClass();
        o1r.LIZIZ.put(this, config);
        this.LJLJJL = config;
        registerConfig(config.LJIIIZ.getAccessKey(), config.LJIIIZ);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void unRegisterConfig(String ak) {
        o.LJIIJ(ak, "ak");
        O1E o1e = this.LJLJJL;
        if (o1e != null) {
            o1e.LJIIJ.remove(ak);
        } else {
            o.LJIJI("mConfig");
            throw null;
        }
    }

    public final O1J LJJIJIL(android.net.Uri uri, O1L o1l) {
        ArrayList arrayList = new ArrayList();
        o1l.LIZ.getClass();
        arrayList.addAll(this.LJLJI);
        int size = arrayList.size();
        if (o1l.LIZ.LIZ.isEmpty()) {
            C51587KMl c51587KMl = o1l.LIZ;
            if (!c51587KMl.LIZIZ) {
                List<EnumC60489Nob> list = this.LJLJLJ;
                o.LJIIJ(list, "<set-?>");
                c51587KMl.LIZ = list;
            }
        }
        if (LJJIL(uri, o1l)) {
            arrayList.add(O1H.class);
        }
        Iterator<EnumC60489Nob> it = o1l.LIZ.LIZ.iterator();
        while (it.hasNext()) {
            int i = C60488Noa.LIZJ[it.next().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        arrayList.add(C61228O1g.class);
                    }
                } else {
                    arrayList.add(O1Y.class);
                }
            } else {
                arrayList.add(C61225O1d.class);
            }
        }
        arrayList.addAll(this.LJLJJI);
        o1l.LIZ.getClass();
        o1l.LIZ.getClass();
        O1J o1j = new O1J(arrayList, getLoggerWrapper(), this);
        o1j.LJLIL = size;
        o1j.LJLILLLLZI = -1;
        return o1j;
    }

    public final boolean LJJIL(android.net.Uri uri, O1L o1l) {
        InterfaceC60323Nlv interfaceC60323Nlv;
        InterfaceC60302Nla Zf;
        String queryParameter = UriProtector.getQueryParameter(uri, "__dev");
        if (o.LJ(queryParameter, "1")) {
            return false;
        }
        if ((queryParameter == null || queryParameter.length() == 0) && (interfaceC60323Nlv = o1l.LJIIJ) != null && (Zf = interfaceC60323Nlv.Zf()) != null && Zf.isDebug()) {
            return false;
        }
        if (!o.LJ(C47261Igj.LJJJ(uri, "enable_memory_cache"), "1")) {
            O1E o1e = this.LJLJJL;
            if (o1e != null) {
                o1e.getClass();
                return false;
            }
            o.LJIJI("mConfig");
            throw null;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.O1I loadSync(java.lang.String r19, X.O1L r20) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O1D.loadSync(java.lang.String, X.O1L):X.O1I");
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void registerConfig(String ak, GeckoConfig config) {
        o.LJIIJ(ak, "ak");
        o.LJIIJ(config, "config");
        config.getLoaderDepender().LJ(this);
        O1E o1e = this.LJLJJL;
        if (o1e != null) {
            o1e.LJIIJ.put(ak, config);
            if (config.getNetworkImpl() == null) {
                if (config.getLocalInfo().length() > 0) {
                    O1E o1e2 = this.LJLJJL;
                    if (o1e2 != null) {
                        config.setNetworkImpl(o1e2.LJIIL);
                        return;
                    } else {
                        o.LJIJI("mConfig");
                        throw null;
                    }
                }
                O1E o1e3 = this.LJLJJL;
                if (o1e3 != null) {
                    config.setNetworkImpl(o1e3.LJIILIIL);
                    return;
                } else {
                    o.LJIJI("mConfig");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mConfig");
        throw null;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void registerCustomLoader(Class<? extends IXResourceLoader> clazz, EnumC60171NjT type) {
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(type, "type");
        int i = C60488Noa.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2 || ((ArrayList) this.LJLJI).contains(clazz)) {
                return;
            }
            ((ArrayList) this.LJLJJI).add(clazz);
            return;
        }
        if (((ArrayList) this.LJLJI).contains(clazz)) {
            return;
        }
        ((ArrayList) this.LJLJI).add(clazz);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public final void unregisterCustomLoader(Class<? extends IXResourceLoader> clazz, EnumC60171NjT type) {
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(type, "type");
        int i = C60488Noa.LIZIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((ArrayList) this.LJLJJI).remove(clazz);
            return;
        }
        ((ArrayList) this.LJLJI).remove(clazz);
    }

    public final void LJJIZ(O1W o1w, O1L o1l, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportFailed ");
        LIZ.append(o1w.LJFF.getScheme());
        LIZ.append(o1w.LJFF.getAuthority());
        LIZ.append(o1w.LJFF.getHost());
        LIZ.append(o1w.LJFF.getPath());
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        C10K.LIZIZ(new O1G(this, o1w, o1l, str), C10K.LJI, null);
    }

    public final void LJJJ(O1I o1i, O1L o1l, long j) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportSuccess ");
        LIZ.append(O1F.LIZJ(o1i.LJFF));
        LIZ.append(",message=");
        LIZ.append(o1i.LJ);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("load success: isMemory = ");
        if (o1i instanceof O1W) {
            z = ((O1W) o1i).LJIJ;
        } else {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append(",duration:");
        LIZ2.append(j);
        LIZ2.append('\n');
        LIZ2.append(o1i.LIZLLL.LJII);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ2), null, null, 6);
        C10K.LIZIZ(new ACallableS4S0300100_10(j, o1l, this, o1i, 0), C10K.LJI, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0154, code lost:
    
        if (r0 != null) goto L192;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(java.lang.String r9, X.O1W r10, X.O1L r11, X.C61237O1p r12) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O1D.LJJIJL(java.lang.String, X.O1W, X.O1L, X.O1p):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.O25 loadAsync(java.lang.String r24, X.O1L r25, X.InterfaceC88472Yns<? super X.O1I, X.C76800UCe> r26, X.InterfaceC88472Yns<? super java.lang.Throwable, X.C76800UCe> r27) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O1D.loadAsync(java.lang.String, X.O1L, X.Yns, X.Yns):X.O25");
    }
}
