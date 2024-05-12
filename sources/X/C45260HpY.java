package X;

import android.content.Context;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import kotlin.jvm.internal.o;

/* renamed from: X.HpY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45260HpY extends AbstractC65781Prl implements InterfaceC65784Pro<TemplateSourceConfig> {
    public static final C45260HpY LJLIL = new C45260HpY();

    public C45260HpY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TemplateSourceConfig invoke() {
        String str;
        Context LIZ = C5L7.LIZ();
        String effectHost = ((Host) ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0)).getItemName();
        C45261HpZ c45261HpZ = new C45261HpZ();
        if (((Boolean) C45263Hpb.LIZ.getValue()).booleanValue()) {
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            str = String.valueOf(EF7.LJIIIZ);
        } else {
            str = "3006";
        }
        o.LJIIIZ(str, "<set-?>");
        c45261HpZ.LIZ = str;
        c45261HpZ.LIZIZ = "7.7.0";
        c45261HpZ.LIZJ = "ab2d1a104e6311eaa93831049d485a70";
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        c45261HpZ.LIZLLL = serverDeviceId;
        String appLanguage = C60903NvH.LJIIJJI().getAppLanguage();
        o.LJIIIZ(appLanguage, "<set-?>");
        c45261HpZ.LJFF = appLanguage;
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        EnumC43651HBf enumC43651HBf = EnumC43651HBf.AUTOCUT_TEMPLATE;
        String absolutePath = C43073GvN.LJFF(LJ, enumC43651HBf, EnumC45262Hpa.TEMPLATE_CACHE.getDirName(), 4).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getAPI().storageService.…           ).absolutePath");
        c45261HpZ.LJI = absolutePath;
        String absolutePath2 = C43073GvN.LJFF(C62850Ola.LJ(), enumC43651HBf, EnumC45262Hpa.MEDIA_CACHE.getDirName(), 4).getAbsolutePath();
        o.LJIIIIZZ(absolutePath2, "getAPI().storageService.…           ).absolutePath");
        c45261HpZ.LJII = absolutePath2;
        String effectSDKVersion = C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion();
        o.LJIIIZ(effectSDKVersion, "<set-?>");
        c45261HpZ.LJIIIIZZ = effectSDKVersion;
        o.LJIIIIZZ(effectHost, "effectHost");
        c45261HpZ.LJIIIZ = effectHost;
        String absolutePath3 = EffectPlatform.LJLJJI.getAbsolutePath();
        o.LJIIIIZZ(absolutePath3, "LOCAL_CACHEDIR.absolutePath");
        c45261HpZ.LJIIJ = absolutePath3;
        String absolutePath4 = EffectPlatform.LJLJJL.getAbsolutePath();
        o.LJIIIIZZ(absolutePath4, "LOCAL_MODEL_CACHEDIR.absolutePath");
        c45261HpZ.LJIIJJI = absolutePath4;
        String downloadDir = C60903NvH.LJIIJJI().LJJIJ().getDownloadDir();
        if (ujb.o.LJJJJ(downloadDir, "/", false)) {
            downloadDir = C58314Muc.LIZIZ(downloadDir, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        String apiHost = C60903NvH.LJIIJJI().getNetworkService().getApiHost();
        o.LJIIIZ(apiHost, "<set-?>");
        c45261HpZ.LJIILJJIL = apiHost;
        c45261HpZ.LJIILL = downloadDir;
        c45261HpZ.LJIILLIIL = false;
        c45261HpZ.LJIIZILJ = "253cbc66f0020e93j00rpwjpvirxc02a7206";
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        o.LJIIIZ(valueOf, "<set-?>");
        c45261HpZ.LJIJ = valueOf;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String LIZLLL = EF7.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getAPI().applicationService.appVersion");
        c45261HpZ.LJIJI = LIZLLL;
        c45261HpZ.LJIJJ = "";
        String name = C48203Ivv.LIZIZ(LIZ).name();
        o.LJIIIZ(name, "<set-?>");
        c45261HpZ.LJIJJLI = name;
        String currentUserID = C60903NvH.LJIIJJI().getAccountService().getCurrentUserID();
        o.LJIIIZ(currentUserID, "<set-?>");
        c45261HpZ.LJIL = currentUserID;
        c45261HpZ.LJJ = 1;
        c45261HpZ.LJJI = effectHost;
        String absolutePath5 = C43073GvN.LJFF(C62850Ola.LJ(), enumC43651HBf, EnumC45262Hpa.MATERIAL_RESOURCE_CACHE.getDirName(), 4).getAbsolutePath();
        o.LJIIIIZZ(absolutePath5, "getAPI().storageService.…           ).absolutePath");
        c45261HpZ.LJJIFFI = absolutePath5;
        return c45261HpZ.LIZ();
    }
}
