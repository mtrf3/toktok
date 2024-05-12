package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Eug, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37934Eug implements InterfaceC38157EyH {
    public final /* synthetic */ C37905EuD LIZ;
    public final /* synthetic */ C39132FXk LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ List<String> LIZLLL;

    @Override // X.InterfaceC38157EyH
    public final void LJIILLIIL() {
        boolean z;
        C37905EuD c37905EuD = this.LIZ;
        Context LIZIZ = EF7.LIZIZ();
        C39132FXk appInfo = this.LIZIZ;
        List<String> reportURL = this.LIZJ;
        List<String> configURL = this.LIZLLL;
        c37905EuD.getClass();
        o.LJIIJ(appInfo, "appInfo");
        o.LJIIJ(reportURL, "reportURL");
        o.LJIIJ(configURL, "configURL");
        C37932Eue.LIZLLL.getClass();
        boolean z2 = false;
        if (C37932Eue.LIZIZ.compareAndSet(false, true)) {
            C37932Eue.LIZJ = new C39130FXi(LIZIZ, appInfo, reportURL, configURL);
        }
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("use_BDXBridgeSDK", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C37905EuD.LJI = z;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("use_BDXBridgeSDK_lynx", 0) == 1) {
            z2 = true;
        }
        C37905EuD.LJII = z2;
    }

    public C37934Eug(C37905EuD c37905EuD, C39132FXk c39132FXk, List<String> list, List<String> list2) {
        this.LIZ = c37905EuD;
        this.LIZIZ = c39132FXk;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
