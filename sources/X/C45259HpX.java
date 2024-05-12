package X;

import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.ss.android.common.applog.AppLog;
import ujb.o;

/* renamed from: X.HpX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45259HpX extends AbstractC65781Prl implements InterfaceC65784Pro<TemplateSourceConfig> {
    public static final C45259HpX LJLIL = new C45259HpX();

    public C45259HpX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TemplateSourceConfig invoke() {
        String downloadDir = C60903NvH.LJIIJJI().LJJIJ().getDownloadDir();
        if (o.LJJJJ(downloadDir, "/", false)) {
            downloadDir = C58314Muc.LIZIZ(downloadDir, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C45261HpZ c45261HpZ = new C45261HpZ();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        kotlin.jvm.internal.o.LJIIIZ(valueOf, "<set-?>");
        c45261HpZ.LIZ = valueOf;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String LIZLLL = EF7.LIZLLL();
        kotlin.jvm.internal.o.LJIIIIZZ(LIZLLL, "getAPI().applicationService.appVersion");
        c45261HpZ.LIZIZ = LIZLLL;
        String LIZLLL2 = C60903NvH.LJIIJJI().LJIJI().LIZLLL();
        kotlin.jvm.internal.o.LJIIIZ(LIZLLL2, "<set-?>");
        c45261HpZ.LIZJ = LIZLLL2;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        c45261HpZ.LIZLLL = serverDeviceId;
        C60903NvH.LJIIJJI().getRegionService();
        String LIZ = C44296Ha0.LIZ();
        kotlin.jvm.internal.o.LJIIIIZZ(LIZ, "getAPI().regionService.region");
        c45261HpZ.LJ = LIZ;
        String appLanguage = C60903NvH.LJIIJJI().getAppLanguage();
        kotlin.jvm.internal.o.LJIIIZ(appLanguage, "<set-?>");
        c45261HpZ.LJFF = appLanguage;
        String absolutePath = C43073GvN.LJFF(C62850Ola.LJ(), EnumC43651HBf.UGC_TEMPLATE, EnumC45262Hpa.TEMPLATE_CACHE.getDirName(), 4).getAbsolutePath();
        kotlin.jvm.internal.o.LJIIIIZZ(absolutePath, "getAPI().storageService.…           ).absolutePath");
        c45261HpZ.LJI = absolutePath;
        String effectSDKVersion = C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
        kotlin.jvm.internal.o.LJIIIZ(effectSDKVersion, "<set-?>");
        c45261HpZ.LJIIIIZZ = effectSDKVersion;
        c45261HpZ.LJIILLIIL = true;
        String apiHost = C60903NvH.LJIIJJI().getNetworkService().getApiHost();
        kotlin.jvm.internal.o.LJIIIZ(apiHost, "<set-?>");
        c45261HpZ.LJIILJJIL = apiHost;
        c45261HpZ.LJIILL = downloadDir;
        return c45261HpZ.LIZ();
    }
}
