package X;

import Y.AObserverS76S0100000_8;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KEM implements KEP {
    public final /* synthetic */ KEX LIZ;
    public final /* synthetic */ KEA LIZIZ;
    public final /* synthetic */ InterfaceC51365KDx LIZJ;
    public final /* synthetic */ KEW LIZLLL;

    @Override // X.KEP
    public final InterfaceC51365KDx LIZ() {
        return this.LIZJ;
    }

    @Override // X.KEP
    public final KEA LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.KEP
    public final KEW LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.KEP
    public final KEX LIZLLL() {
        return this.LIZ;
    }

    @Override // X.KEP
    public final void LJ(KEU resultForOuterService) {
        o.LJIIIZ(resultForOuterService, "resultForOuterService");
    }

    @Override // X.KEP
    public final void LJII(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj != null) {
            ((SearchStateViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStateViewModel.class)).setIsRefreshingData(true);
        }
    }

    @Override // X.KEP
    public final void LJI(boolean z, KEU resultForOuterService) {
        o.LJIIIZ(resultForOuterService, "resultForOuterService");
        resultForOuterService.Z0();
        if (z) {
            resultForOuterService.LLZZJLIL();
        }
    }

    @Override // X.KEP
    public final void LJFF(KEU resultForOuterService, ActivityC45651qj activityC45651qj, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(resultForOuterService, "resultForOuterService");
        if (activityC45651qj != null) {
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStateViewModel.class);
            if (lifecycleOwner != null) {
                searchStateViewModel.searchState.observe(lifecycleOwner, new AObserverS76S0100000_8(resultForOuterService, 149));
            }
        }
    }

    public KEM(KEX kex, KEA kea, InterfaceC51365KDx interfaceC51365KDx, KEW kew) {
        this.LIZ = kex;
        this.LIZIZ = kea;
        this.LIZJ = interfaceC51365KDx;
        this.LIZLLL = kew;
    }
}
