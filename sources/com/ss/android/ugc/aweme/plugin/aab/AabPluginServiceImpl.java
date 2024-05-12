package com.ss.android.ugc.aweme.plugin.aab;

import X.AbstractC37134Ehm;
import X.AbstractC38521fE;
import X.C36970Ef8;
import X.C36976EfE;
import X.C37105EhJ;
import X.C37112EhQ;
import X.C37122Eha;
import X.C37123Ehb;
import X.C37124Ehc;
import X.C37125Ehd;
import X.C37129Ehh;
import X.C37130Ehi;
import X.C37131Ehj;
import X.C58096Mr6;
import X.EF7;
import X.EPA;
import X.F5Q;
import X.F5R;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AabPluginServiceImpl implements IPluginService {
    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LIZIZ() {
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void enableInstall() {
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void init() {
    }

    public static IPluginService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IPluginService.class, false);
        if (LIZ != null) {
            return (IPluginService) LIZ;
        }
        if (C58096Mr6.S3 == null) {
            synchronized (IPluginService.class) {
                if (C58096Mr6.S3 == null) {
                    C58096Mr6.S3 = new AabPluginServiceImpl();
                }
            }
        }
        return C58096Mr6.S3;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final C37123Ehb LIZJ() {
        return new C37123Ehb();
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final List<String> getInstalledModules() {
        return new ArrayList(EPA.LIZIZ());
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final List<String> getInstalledPackageNames() {
        return C36976EfE.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LIZ(C37131Ehj c37131Ehj) {
        AbstractC37134Ehm c37122Eha;
        AbstractC38521fE c37129Ehh;
        Locale locale = c37131Ehj.LJI;
        String packageName = c37131Ehj.LIZ;
        boolean z = c37131Ehj.LIZIZ;
        boolean z2 = c37131Ehj.LIZJ;
        F5R f5r = c37131Ehj.LJ;
        if (f5r == null) {
            f5r = new F5R(new F5Q());
        }
        C37125Ehd c37125Ehd = new C37125Ehd(c37131Ehj, z);
        if (locale != null) {
            c37122Eha = new C37124Ehc(locale, z, false, c37125Ehd, f5r);
        } else {
            o.LJIIIIZZ(packageName, "packageName");
            c37122Eha = new C37122Eha(packageName, z, z2, false, c37125Ehd, f5r, 8);
        }
        c37122Eha.LJII = c37131Ehj.LJFF;
        if (c37122Eha instanceof C37124Ehc) {
            c37129Ehh = new C37130Ehi((C37124Ehc) c37122Eha);
        } else {
            c37129Ehh = new C37129Ehh((C37122Eha) c37122Eha);
        }
        c37129Ehh.LJIIIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean checkPluginInstalled(String str) {
        return EPA.LIZIZ().contains(C36970Ef8.LIZ(str));
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean loadLibrary(String str) {
        try {
            if (!EPA.LIZIZ().contains(C36970Ef8.LIZ("com.ss.android.ugc.aweme.pitaya"))) {
                return false;
            }
            Context LIZIZ = EF7.LIZIZ();
            String packageName = LIZIZ.getPackageName();
            if (!((Boolean) C37105EhJ.LIZJ.getValue()).booleanValue()) {
                LIZIZ = LIZIZ.createPackageContext(packageName, 0);
            }
            C37112EhQ.LIZ(LIZIZ, str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
