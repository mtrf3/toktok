package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NwV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60979NwV implements InterfaceC60132Niq {
    public final /* synthetic */ C60978NwU LIZ;
    public final /* synthetic */ C68322mC<String> LIZIZ;

    @Override // X.InterfaceC60132Niq
    public final void LIZ() {
        C60737Nsb hybridContext;
        InterfaceC60844NuK interfaceC60844NuK;
        WebKitView webKitView;
        C60977NwT.LIZ("go_back");
        SparkContext sparkContext = this.LIZ.LJLJI;
        if (sparkContext != null) {
            C78983UzD.LJJLIIIJLJLI(sparkContext);
            SparkContext sparkContext2 = this.LIZ.LJLJI;
            if (sparkContext2 != null) {
                C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
                String str = sparkContext2.containerId;
                c31999Ch9.getClass();
                InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
                if (LIZIZ == null || !(LIZIZ instanceof WebKitView) || (webKitView = (WebKitView) LIZIZ) == null || !webKitView.canGoBack()) {
                    SparkContext sparkContext3 = this.LIZ.LJLJI;
                    if (sparkContext3 != null) {
                        WebKitView LJJIJLIJ = C78983UzD.LJJIJLIJ(sparkContext3);
                        if (LJJIJLIJ != null && (hybridContext = LJJIJLIJ.getHybridContext()) != null && (interfaceC60844NuK = (InterfaceC60844NuK) hybridContext.LIZIZ(InterfaceC60844NuK.class)) != null) {
                            String LJFF = C86V.LJFF(R.string.qdp);
                            o.LJIIIIZZ(LJFF, "getString(R.string.searc…nternet_connection_title)");
                            interfaceC60844NuK.LJJIII(LJFF);
                        }
                    } else {
                        o.LJIJI("sparkContext");
                        throw null;
                    }
                }
                SearchLandingPageViewModel searchLandingPageViewModel = this.LIZ.LJLJJI;
                if (searchLandingPageViewModel != null) {
                    searchLandingPageViewModel.gv0(this.LIZIZ.element);
                    return;
                } else {
                    o.LJIJI("safeStatusViewModel");
                    throw null;
                }
            }
            o.LJIJI("sparkContext");
            throw null;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60979NwV(C60978NwU c60978NwU, C68322mC<String> c68322mC) {
        this.LIZ = c60978NwU;
        this.LIZIZ = c68322mC;
    }
}
