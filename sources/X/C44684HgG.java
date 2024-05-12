package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HgG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44684HgG implements InterfaceC151015wH, InterfaceC172546pu, InterfaceC172476pn, InterfaceC172536pt, InterfaceC44686HgI {
    public final Context LIZ;
    public final CreativeInfo LIZIZ;

    @Override // X.InterfaceC172476pn
    public final boolean LJI() {
        if ((e1.LIZ(31744, "enable_creative_compile_import_hw_encode", true, false) || C44674Hg6.LIZ()) && GAD.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC172546pu
    public final String LJII() {
        CreativeInfo creativeInfo = this.LIZIZ;
        if (creativeInfo != null) {
            return C43073GvN.LIZIZ(C62850Ola.LJ(), creativeInfo, EnumC43650HBe.MAGIC_EFFECT_CACHE, null, 12);
        }
        return "";
    }

    @Override // X.InterfaceC44686HgI
    public final C45246HpK LIZIZ() {
        IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(this.LIZ);
        EffectConfiguration build = LIZ.createEffectConfigurationBuilder(effectPlatformBuilder).build();
        String appID = build.getAppID();
        o.LJIIIIZZ(appID, "effectConfiguration.appID");
        String appVersion = build.getAppVersion();
        o.LJIIIIZZ(appVersion, "effectConfiguration.appVersion");
        String sdkVersion = build.getSdkVersion();
        o.LJIIIIZZ(sdkVersion, "effectConfiguration.sdkVersion");
        String accessKey = build.getAccessKey();
        o.LJIIIIZZ(accessKey, "effectConfiguration.accessKey");
        String platform = build.getPlatform();
        o.LJIIIIZZ(platform, "effectConfiguration.platform");
        String deviceId = build.getDeviceId();
        o.LJIIIIZZ(deviceId, "effectConfiguration.deviceId");
        String deviceType = build.getDeviceType();
        o.LJIIIIZZ(deviceType, "effectConfiguration.deviceType");
        String region = build.getRegion();
        o.LJIIIIZZ(region, "effectConfiguration.region");
        String appLanguage = build.getAppLanguage();
        o.LJIIIIZZ(appLanguage, "effectConfiguration.appLanguage");
        String channel = build.getChannel();
        o.LJIIIIZZ(channel, "effectConfiguration.channel");
        String absolutePath = EffectPlatform.LJLJJI.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "LOCAL_CACHEDIR.absolutePath");
        List<Host> hosts = build.getHosts();
        o.LJIIIIZZ(hosts, "effectConfiguration.hosts");
        ArrayList arrayList = new ArrayList(C32I.LJJL(hosts, 10));
        Iterator<Host> it = hosts.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getItemName());
        }
        String str = (String) ORZ.LJLLLL(arrayList);
        if (str == null) {
            str = "";
        }
        String absolutePath2 = EffectPlatform.LJLJJL.getAbsolutePath();
        o.LJIIIIZZ(absolutePath2, "LOCAL_MODEL_CACHEDIR.absolutePath");
        return new C45246HpK(appID, appVersion, sdkVersion, accessKey, platform, deviceId, deviceType, region, appLanguage, channel, absolutePath, str, absolutePath2);
    }

    @Override // X.InterfaceC172546pu
    public final String LIZJ() {
        String path = C43073GvN.LJFF(C62850Ola.LJ(), EnumC43651HBf.MAGIC_PROCESSOR, null, 6).getPath();
        o.LJIIIIZZ(path, "getAPI().storageService.…_PROCESSOR\n        ).path");
        return path;
    }

    @Override // X.InterfaceC172476pn
    public final boolean LJFF() {
        return C44685HgH.LIZ();
    }

    @Override // X.InterfaceC172476pn
    public final String LIZ(String path) {
        o.LJIIIZ(path, "path");
        String LJI = C44694HgQ.LJI(this.LIZ, path);
        if (LJI == null) {
            return "";
        }
        return LJI;
    }

    @Override // X.InterfaceC172476pn
    public final C173856s1 LIZLLL(String path) {
        o.LJIIIZ(path, "path");
        C173916s7 LIZIZ = C173926s8.LIZIZ(path);
        return new C173856s1(LIZIZ.LIZJ, LIZIZ.LIZLLL, LIZIZ.LJ, LIZIZ.LJFF, LIZIZ.LJI, LIZIZ.LJII, LIZIZ.LJIIIIZZ, LIZIZ.LJIIIZ, LIZIZ.LIZ, LIZIZ.LIZIZ);
    }

    @Override // X.InterfaceC172476pn
    public final boolean LJ(String path) {
        o.LJIIIZ(path, "path");
        return C44694HgQ.LJIL(path);
    }

    @Override // X.InterfaceC151015wH
    public final <T> T LJIIIIZZ(Class<T> cls) {
        return (T) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, cls);
    }

    @Override // X.InterfaceC172536pt
    public final void i(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicLightWaveHandler");
        LIZ.append(" -> ");
        LIZ.append(str);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    public C44684HgG(Context context, CreativeInfo creativeInfo) {
        this.LIZ = context;
        this.LIZIZ = creativeInfo;
    }

    @Override // X.InterfaceC172536pt
    public final void d(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(" -> ");
        LIZ.append(str2);
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }
}
