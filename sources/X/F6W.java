package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F6W implements QBY {
    public final IPluginService LIZ = AabPluginServiceImpl.LIZLLL();

    @Override // X.QBY
    public final boolean LIZ() {
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            return iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_vksdk");
        }
        return false;
    }

    @Override // X.QBY
    public final boolean enableInstall() {
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            iPluginService.enableInstall();
            return true;
        }
        return false;
    }

    @Override // X.QBY
    public final void LIZIZ(QBW qbw) {
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZ = "com.ss.android.ugc.aweme.df_vksdk";
        c37132Ehk.LIZIZ = false;
        c37132Ehk.LIZJ = false;
        c37132Ehk.LIZLLL = new F6X(qbw);
        C37131Ehj c37131Ehj = new C37131Ehj(c37132Ehk);
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null) {
            iPluginService.LIZ(c37131Ehj);
        }
    }

    @Override // X.QBY
    public final boolean splitCompatInstall(Context context) {
        o.LJIIIZ(context, "context");
        IPluginService iPluginService = this.LIZ;
        if (iPluginService != null && iPluginService.LIZJ() != null) {
            return C39647FhD.LIZLLL(context);
        }
        return false;
    }
}
