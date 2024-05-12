package X;

import android.os.Build;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.HgF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44683HgF implements InterfaceC151015wH, InterfaceC172546pu, InterfaceC172476pn, InterfaceC172536pt, InterfaceC44686HgI {
    public final EnumC43651HBf LIZ;
    public final CreativeInfo LIZIZ;

    @Override // X.InterfaceC44686HgI
    public final C45246HpK LIZIZ() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        C60903NvH.LJIIJJI().getApplicationService();
        String LIZLLL = EF7.LIZLLL();
        LIZLLL.toString();
        String effectSDKVersion = C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
        String LIZLLL2 = C60903NvH.LJIIJJI().LJIJI().LIZLLL();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        String MODEL = Build.MODEL;
        o.LJIIIIZZ(MODEL, "MODEL");
        C60903NvH.LJIIJJI().getRegionService();
        String LIZ = C44296Ha0.LIZ();
        o.LJIIIIZZ(LIZ, "getAPI().regionService.region");
        String appLanguage = C60903NvH.LJIIJJI().getAppLanguage();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String str = EF7.LJIILIIL;
        o.LJIIIIZZ(str, "getAPI().applicationService.channel");
        String absolutePath = EffectPlatform.LJLJJI.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "LOCAL_CACHEDIR.absolutePath");
        String apiHost = C60903NvH.LJIIJJI().getNetworkService().getApiHost();
        String absolutePath2 = EffectPlatform.LJLJJL.getAbsolutePath();
        o.LJIIIIZZ(absolutePath2, "LOCAL_MODEL_CACHEDIR.absolutePath");
        return new C45246HpK(valueOf, LIZLLL, effectSDKVersion, LIZLLL2, "android", serverDeviceId, MODEL, LIZ, appLanguage, str, absolutePath, apiHost, absolutePath2);
    }

    @Override // X.InterfaceC172476pn
    public final boolean LJI() {
        if ((e1.LIZ(31744, "enable_creative_compile_import_hw_encode", true, false) || C44674Hg6.LIZ()) && GAD.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC172546pu
    public final String LIZJ() {
        String path = C43073GvN.LJFF(C62850Ola.LJ(), this.LIZ, null, 6).getPath();
        o.LJIIIIZZ(path, "getAPI().storageService.…e.genPublicDir(type).path");
        return path;
    }

    @Override // X.InterfaceC172476pn
    public final boolean LJFF() {
        return C44685HgH.LIZ();
    }

    @Override // X.InterfaceC172546pu
    public final String LJII() {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), this.LIZIZ, EnumC43650HBe.EDIT_EFFECT_CACHE, null, 12);
    }

    @Override // X.InterfaceC172476pn
    public final String LIZ(String path) {
        o.LJIIIZ(path, "path");
        if (C44694HgQ.LJIL(path)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZJ());
            LIZ.append('/');
            LIZ.append(path.hashCode());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (C44694HgQ.LIZJ(path, LIZIZ)) {
                return LIZIZ;
            }
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("ClientConfigImpl", "getMediaPath result error");
            return path;
        }
        return path;
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
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    public C44683HgF(EnumC43651HBf type, CreativeInfo creativeInfo) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = creativeInfo;
    }

    @Override // X.InterfaceC172536pt
    public final void d(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(" -> ");
        LIZ.append(str2);
        H78.LIZ(X1D.LIZIZ(LIZ));
    }
}
