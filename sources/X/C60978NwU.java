package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NwU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60978NwU extends AbstractC60796NtY {
    public Context LJLILLLLZI;
    public SparkContext LJLJI;
    public SearchLandingPageViewModel LJLJJI;

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        return null;
    }

    @Override // X.AbstractC60796NtY, X.M2J
    public final void release() {
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        this.LJLILLLLZI = context;
    }

    @Override // X.AbstractC60796NtY
    public final void LIZIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        this.LJLJI = sparkContext;
        Object LJIILL = sparkContext.LJIILL();
        ActivityC45651qj activityC45651qj = null;
        if (LJIILL != null && (LJIILL instanceof SparkActivity)) {
            activityC45651qj = (ActivityC45651qj) LJIILL;
        }
        o.LJII(activityC45651qj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJJI = (SearchLandingPageViewModel) ViewModelProviders.of(activityC45651qj).get(SearchLandingPageViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        C60980NwW c60980NwW;
        o.LJIIIZ(refresher, "refresher");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "no_internet";
        Context context = this.LJLILLLLZI;
        if (context != null) {
            c60980NwW = new C60980NwW(context);
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    c68322mC.element = "broken";
                    c60980NwW.setCurrentStatus$search_release("broken");
                    c60980NwW.setCurrentStatusView$search_release(new C60979NwV(this, c68322mC));
                }
            } catch (Exception unused) {
            }
            c60980NwW.setCurrentStatus$search_release((String) c68322mC.element);
            c60980NwW.setCurrentStatusView$search_release(new C60982NwY(refresher, c68322mC, this));
        } else {
            c60980NwW = null;
        }
        if (C60983NwZ.LIZLLL) {
            C60983NwZ.LIZLLL = false;
            String str = (String) c68322mC.element;
            o.LJIIIZ(str, "<set-?>");
            C60983NwZ.LIZ = str;
            SearchLandingPageViewModel searchLandingPageViewModel = this.LJLJJI;
            if (searchLandingPageViewModel != null) {
                searchLandingPageViewModel.gv0((String) c68322mC.element);
                C60977NwT.LIZIZ("");
            } else {
                o.LJIJI("safeStatusViewModel");
                throw null;
            }
        }
        return c60980NwW;
    }
}
