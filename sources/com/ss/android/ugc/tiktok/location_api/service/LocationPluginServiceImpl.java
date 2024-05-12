package com.ss.android.ugc.tiktok.location_api.service;

import X.C221018lt;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C39647FhD;
import X.C58096Mr6;
import X.EnumC217558gJ;
import X.F5Q;
import X.F5S;
import X.X1D;
import android.content.Context;
import com.bytedance.bdlocation.df.ILocationPluginInstallListener;
import com.bytedance.bdlocation.df.ILocationPluginService;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LocationPluginServiceImpl implements ILocationPluginService {
    public final IPluginService LIZ = AabPluginServiceImpl.LIZLLL();

    public static ILocationPluginService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ILocationPluginService.class, false);
        if (LIZ != null) {
            return (ILocationPluginService) LIZ;
        }
        if (C58096Mr6.Q8 == null) {
            synchronized (ILocationPluginService.class) {
                if (C58096Mr6.Q8 == null) {
                    C58096Mr6.Q8 = new LocationPluginServiceImpl();
                }
            }
        }
        return C58096Mr6.Q8;
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginService
    public final boolean enableInstall() {
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            iPluginService.enableInstall();
            return true;
        }
        return false;
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginService
    public final List<String> getInstalledModules() {
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            return iPluginService.getInstalledModules();
        }
        return null;
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginService
    public final List<String> getInstalledPackageNames() {
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            return iPluginService.getInstalledPackageNames();
        }
        return null;
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginService
    public final boolean checkPluginInstalled(String packageName) {
        o.LJIIIZ(packageName, "packageName");
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            return iPluginService.checkPluginInstalled(packageName);
        }
        return false;
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginService
    public final boolean splitCompatInstall(Context context) {
        o.LJIIIZ(context, "context");
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null && iPluginService.LIZJ() != null) {
            return C39647FhD.LIZLLL(context);
        }
        return false;
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginService
    public final boolean splitCompatInstallActivity(Context context) {
        o.LJIIIZ(context, "context");
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null && iPluginService.LIZJ() != null) {
            return C39647FhD.LJ(context);
        }
        return false;
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginService
    public final void install(String packageName, ILocationPluginInstallListener iLocationPluginInstallListener) {
        o.LJIIIZ(packageName, "packageName");
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZ = packageName;
        c37132Ehk.LIZIZ = true;
        c37132Ehk.LIZJ = false;
        c37132Ehk.LIZLLL = new F5S(iLocationPluginInstallListener);
        F5Q f5q = new F5Q();
        f5q.LJI = EnumC217558gJ.APPEND;
        c37132Ehk.LJ = f5q.LIZ();
        C37131Ehj LIZ = c37132Ehk.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start install >>packageName ");
        LIZ2.append(packageName);
        LIZ2.append("  listener>>");
        LIZ2.append(iLocationPluginInstallListener);
        C221018lt.LIZ("LocationPluginService", X1D.LIZIZ(LIZ2));
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            iPluginService.LIZ(LIZ);
        }
    }
}
