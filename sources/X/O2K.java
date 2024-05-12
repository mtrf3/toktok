package X;

import android.app.Application;
import android.os.SystemClock;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS15S0500000_10;
import kotlin.jvm.internal.AqS15S1400000_10;
import kotlin.jvm.internal.AqS3S0600000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O2K extends C39887Fl5 implements IResourceService {
    public O2J LIZIZ;
    public final AtomicBoolean LIZJ;
    public final Application LIZLLL;

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void deleteResource(O26 info) {
        o.LJIIJ(info, "info");
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final java.util.Map<String, String> getPreloadConfigs() {
        java.util.Map<String, String> LIZIZ;
        O2J o2j = this.LIZIZ;
        if (o2j != null) {
            String accessKey = o2j.LIZJ.getAccessKey();
            GeckoConfig LIZIZ2 = C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(this), accessKey);
            InterfaceC61252O2e geckoDepender = LIZIZ2.getGeckoDepender();
            if (geckoDepender != null && (LIZIZ = geckoDepender.LIZIZ(LIZIZ2.getOfflineDir(), accessKey)) != null) {
                return LIZIZ;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIJI("mConfigHybrid");
        throw null;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final O2J getResourceConfig() {
        O2J o2j = this.LIZIZ;
        if (o2j != null) {
            return o2j;
        }
        o.LJIJI("mConfigHybrid");
        throw null;
    }

    @Override // X.C39887Fl5, X.InterfaceC61488OBg
    public final void onUnRegister() {
        O2S o2s = C61270O2w.LIZ;
        o2s.getClass();
        o2s.LIZIZ.remove(this);
        java.util.Map<O31, O2L> map = O2R.LIZJ;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = ((LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            O2L o2l = (O2L) ((Map.Entry) it.next()).getValue();
            o2l.LIZJ = true;
            IHybridResourceLoader iHybridResourceLoader = o2l.LIZLLL;
            if (iHybridResourceLoader != null) {
                iHybridResourceLoader.cancelLoad();
            }
            arrayList.add(C76800UCe.LIZ);
        }
        ((LinkedHashMap) O2R.LIZJ).clear();
    }

    public O2K(Application application) {
        o.LJIIJ(application, "application");
        this.LIZLLL = application;
        this.LIZJ = new AtomicBoolean(false);
        C61270O2w.LIZ.LIZJ = application;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void cancel(O31 task) {
        o.LJIIJ(task, "task");
        java.util.Map<O31, O2L> map = O2R.LIZJ;
        O2L o2l = (O2L) ((LinkedHashMap) map).get(task);
        if (o2l != null) {
            o2l.LIZJ = true;
            IHybridResourceLoader iHybridResourceLoader = o2l.LIZLLL;
            if (iHybridResourceLoader != null) {
                iHybridResourceLoader.cancelLoad();
            }
        }
        map.remove(task);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final IResourceService copyAndModifyConfig(AbstractC40201Fq9 configModifier) {
        o.LJIIJ(configModifier, "configModifier");
        O2K o2k = new O2K(this.LIZLLL);
        O2J o2j = this.LIZIZ;
        if (o2j != null) {
            String host = o2j.LIZ;
            List<String> prefix = o2j.LIZIZ;
            GeckoConfig dftGeckoCfg = o2j.LIZJ;
            java.util.Map<String, GeckoConfig> geckoConfigs = o2j.LIZLLL;
            Object obj = o2j.LJ;
            Object obj2 = o2j.LJFF;
            InterfaceC61272O2y download = o2j.LJI;
            int i = o2j.LJII;
            int i2 = o2j.LJIIIIZZ;
            boolean z = o2j.LJIIIZ;
            boolean z2 = o2j.LJIIJ;
            boolean z3 = o2j.LJIIJJI;
            List<String> sampleWhiteList = o2j.LJIIL;
            o.LJIIJ(host, "host");
            o.LJIIJ(prefix, "prefix");
            o.LJIIJ(dftGeckoCfg, "dftGeckoCfg");
            o.LJIIJ(geckoConfigs, "geckoConfigs");
            o.LJIIJ(download, "download");
            o.LJIIJ(sampleWhiteList, "sampleWhiteList");
            O2J o2j2 = new O2J(host, prefix, dftGeckoCfg, geckoConfigs, obj, obj2, download, i, i2, z, z2, z3, sampleWhiteList);
            o2j2.LIZIZ = ORZ.LLJILJILJ(o2j.LIZIZ);
            o2j2.LIZJ = GeckoConfig.copy$default(o2j.LIZJ, null, null, false, false, 15, null);
            o2j2.LIZLLL = C113554cx.LJJLIL(o2j.LIZLLL);
            o2j2.LJIIL = ORZ.LLJILJILJ(o2j.LJIIL);
            configModifier.LIZ(o2j2);
            o2k.init(o2j2);
            return o2k;
        }
        o.LJIJI("mConfigHybrid");
        throw null;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void init(FD3 resourceConfig) {
        o.LJIIJ(resourceConfig, "resourceConfig");
        if (!this.LIZJ.compareAndSet(false, true)) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "init# service is already init", null, null, 6);
            return;
        }
        if ((resourceConfig instanceof O2J) && resourceConfig != null) {
            O2J o2j = (O2J) resourceConfig;
            C61250O2c c61250O2c = C61271O2x.LIZ;
            int i = o2j.LJIIIIZZ;
            if (c61250O2c.LIZ == null && i > 0) {
                c61250O2c.LIZ = new O2Y(c61250O2c, i);
            }
            O2S o2s = C61270O2w.LIZ;
            o2s.getClass();
            o2s.LIZIZ.put(this, o2j);
            this.LIZIZ = o2j;
            registerConfig(o2j.LIZJ.getAccessKey(), o2j.LIZJ);
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init globalConfig = ");
            LIZ.append(o2j);
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void unRegisterConfig(String ak) {
        o.LJIIJ(ak, "ak");
        O2J o2j = this.LIZIZ;
        if (o2j != null) {
            o2j.LIZLLL.remove(ak);
        } else {
            o.LJIJI("mConfigHybrid");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final O26 loadSync(String uri, O1M config) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(config, "config");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadSync# url=");
        LIZ.append(uri);
        LIZ.append(",taskConfig=");
        LIZ.append(config);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        if (!this.LIZJ.get()) {
            C39048FUe.LIZIZ(c39048FUe, "call loadSync# but not init ", null, null, 6);
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        C61268O2u c61268O2u = new C61268O2u();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("loadSync# url=");
        LIZ2.append(uri);
        LIZ2.append(",taskConfig=");
        LIZ2.append(config);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ2), null, null, 6);
        android.net.Uri srcUri = UriProtector.parse(uri);
        o.LJFF(srcUri, "srcUri");
        if (!srcUri.isHierarchical()) {
            return null;
        }
        String queryParameter = UriProtector.getQueryParameter(srcUri, "disable_builtin");
        if (queryParameter != null) {
            config.LJIIIZ = o.LJ(queryParameter, "1");
        }
        String queryParameter2 = UriProtector.getQueryParameter(srcUri, "disable_offline");
        if (queryParameter2 != null) {
            config.LJIIJ = o.LJ(queryParameter2, "1");
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        O2G.LIZIZ.getClass();
        C61261O2n LIZ3 = O2G.LIZ(false, uptimeMillis, uri, srcUri, config, this);
        LIZ3.LIZ.LJIILLIIL = jSONObject;
        jSONObject.put("m_prepare", c61268O2u.LIZ());
        C61269O2v.LIZIZ.LIZ(LIZ3.LIZ, LIZ3.LIZIZ);
        O2L LIZ4 = O2O.LIZ(this, LIZ3);
        jSONObject.put("m_create_pipeline", c61268O2u.LIZ());
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("loadSync# start load taskConfig=");
        LIZ5.append(config);
        LIZ5.append(",resInfo = ");
        LIZ5.append(LIZ3.LIZ);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ5), null, null, 6);
        LIZ4.LIZ(LIZ3, new AqS15S0500000_10(c68322mC, config, jSONObject, c61268O2u, LIZ3, 2), new AqS15S1400000_10(uri, jSONObject, c61268O2u, LIZ3, config, 1));
        o.LJFF(LIZ3.LIZ.LIZLLL.toString(), "resourceLoadTask.info.pipelineStatus.toString()");
        String jSONArray = LIZ3.LIZ.LIZLLL.toString();
        o.LJFF(jSONArray, "resourceLoadTask.info.pipelineStatus.toString()");
        C39048FUe.LIZIZ(c39048FUe, jSONArray, null, null, 6);
        return (O26) c68322mC.element;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void registerConfig(String ak, GeckoConfig config) {
        o.LJIIJ(ak, "ak");
        o.LJIIJ(config, "config");
        InterfaceC61252O2e geckoDepender = config.getGeckoDepender();
        if (geckoDepender != null) {
            geckoDepender.LJFF(this);
            O2J o2j = this.LIZIZ;
            if (o2j != null) {
                o2j.LIZLLL.put(ak, config);
                if (config.getNetworkImpl() == null) {
                    if (config.getLocalInfo().length() > 0) {
                        O2J o2j2 = this.LIZIZ;
                        if (o2j2 != null) {
                            config.setNetworkImpl(o2j2.LJ);
                            return;
                        } else {
                            o.LJIJI("mConfigHybrid");
                            throw null;
                        }
                    }
                    O2J o2j3 = this.LIZIZ;
                    if (o2j3 != null) {
                        config.setNetworkImpl(o2j3.LJFF);
                        return;
                    } else {
                        o.LJIJI("mConfigHybrid");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("mConfigHybrid");
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void registerCustomLoader(Class<? extends IHybridResourceLoader> clazz, EnumC61253O2f priority) {
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(priority, "priority");
        int i = C61260O2m.LIZ[priority.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ArrayList arrayList = (ArrayList) O2R.LIZIZ;
            if (arrayList.contains(clazz)) {
                return;
            }
            arrayList.add(clazz);
            EnumC61253O2f priority2 = EnumC61253O2f.LOW;
            o.LJIIJ(priority2, "priority");
            C61251O2d.LIZ.put(clazz, priority2);
            return;
        }
        ArrayList arrayList2 = (ArrayList) O2R.LIZ;
        if (arrayList2.contains(clazz)) {
            return;
        }
        arrayList2.add(clazz);
        EnumC61253O2f priority3 = EnumC61253O2f.HIGH;
        o.LJIIJ(priority3, "priority");
        C61251O2d.LIZ.put(clazz, priority3);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void unregisterCustomLoader(Class<? extends IHybridResourceLoader> clazz, EnumC61253O2f priority) {
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(priority, "priority");
        int i = C61260O2m.LIZIZ[priority.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((ArrayList) O2R.LIZIZ).remove(clazz);
            return;
        }
        ((ArrayList) O2R.LIZ).remove(clazz);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final O31 loadAsync(String uri, O1M config, InterfaceC88472Yns<? super O26, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(config, "config");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        android.net.Uri srcUri = UriProtector.parse(uri);
        o.LJFF(srcUri, "srcUri");
        O31 o31 = new O31(srcUri);
        if (!this.LIZJ.get()) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "call loadAsync# but not init ", null, null, 6);
            reject.invoke(new Throwable("resource loader service not init"));
            return o31;
        }
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, "loadAsync#begin", null, null, 6);
        long uptimeMillis = SystemClock.uptimeMillis();
        C61268O2u c61268O2u = new C61268O2u();
        JSONObject jSONObject = new JSONObject();
        if (!srcUri.isHierarchical()) {
            reject.invoke(new Throwable("is not hierarchical url"));
            return o31;
        }
        String queryParameter = UriProtector.getQueryParameter(srcUri, "disable_builtin");
        if (queryParameter != null) {
            config.LJIIIZ = o.LJ(queryParameter, "1");
        }
        String queryParameter2 = UriProtector.getQueryParameter(srcUri, "disable_offline");
        if (queryParameter2 != null) {
            config.LJIIJ = o.LJ(queryParameter2, "1");
        }
        O2G.LIZIZ.getClass();
        C61261O2n LIZ = O2G.LIZ(true, uptimeMillis, uri, srcUri, config, this);
        LIZ.LIZ.LJIILLIIL = jSONObject;
        jSONObject.put("m_prepare", c61268O2u.LIZ());
        C61269O2v.LIZIZ.LIZ(LIZ.LIZ, LIZ.LIZIZ);
        O2L LIZ2 = O2O.LIZ(this, LIZ);
        jSONObject.put("m_create_pipeline", c61268O2u.LIZ());
        LIZ2.LIZ(LIZ, new AqS3S0600000_10(config, o31, LIZ, c61268O2u, resolve, jSONObject, 2), new AqS3S0600000_10(config, o31, LIZ, c61268O2u, reject, jSONObject, 3));
        O2R.LIZJ.put(o31, LIZ2);
        return o31;
    }
}
