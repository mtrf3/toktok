package X;

import android.animation.ArgbEvaluator;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5Q implements C75O {
    public final /* synthetic */ ArgbEvaluator LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ TopVideoHolderVM LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ ActivityC45651qj LJLJJL;

    @Override // X.C75O
    public final void O4(float f, float f2) {
        Object evaluate = this.LJLIL.evaluate(C78842Uww.LJIIJJI(f / f2, 0.0f, 1.0f), 0, Integer.valueOf(this.LJLILLLLZI));
        o.LJII(evaluate, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) evaluate).intValue();
        SearchGlobalViewModel searchGlobalViewModel = this.LJLJI.LJLLLLLL;
        if (searchGlobalViewModel != null) {
            searchGlobalViewModel.LJLJI.postValue(Integer.valueOf(intValue));
            if (this.LJLJJI) {
                C61713OJx LIZJ = C61712OJw.LIZJ(this.LJLJJL);
                LIZJ.LJIIIIZZ(intValue);
                LIZJ.LIZIZ.LJIIJ(true);
                LIZJ.LIZ(false);
                LIZJ.LIZJ();
                return;
            }
            return;
        }
        o.LJIJI("searchGlobalVM");
        throw null;
    }

    public K5Q(ArgbEvaluator argbEvaluator, int i, TopVideoHolderVM topVideoHolderVM, boolean z, ActivityC45651qj activityC45651qj) {
        this.LJLIL = argbEvaluator;
        this.LJLILLLLZI = i;
        this.LJLJI = topVideoHolderVM;
        this.LJLJJI = z;
        this.LJLJJL = activityC45651qj;
    }
}
