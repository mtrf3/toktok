package X;

import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NwY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60982NwY implements InterfaceC60132Niq {
    public final /* synthetic */ NV7 LIZ;
    public final /* synthetic */ C68322mC<String> LIZIZ;
    public final /* synthetic */ C60978NwU LIZJ;

    @Override // X.InterfaceC60132Niq
    public final void LIZ() {
        C60977NwT.LIZ("retry");
        this.LIZ.refresh();
        this.LIZIZ.element = "safe";
        C60983NwZ.LIZ = "safe";
        SearchLandingPageViewModel searchLandingPageViewModel = this.LIZJ.LJLJJI;
        if (searchLandingPageViewModel != null) {
            searchLandingPageViewModel.gv0(this.LIZIZ.element);
            C60983NwZ.LIZLLL = false;
        } else {
            o.LJIJI("safeStatusViewModel");
            throw null;
        }
    }

    public C60982NwY(NV7 nv7, C68322mC<String> c68322mC, C60978NwU c60978NwU) {
        this.LIZ = nv7;
        this.LIZIZ = c68322mC;
        this.LIZJ = c60978NwU;
    }
}
