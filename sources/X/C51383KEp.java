package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultOrderViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.KEp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51383KEp implements ViewModelProvider.Factory {
    public final KE0 LIZ;
    public final KFQ LIZIZ;
    public final C51366KDy LIZJ;
    public final C36036ECi LIZLLL;
    public final KE1 LJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new EcSearchResultOrderViewModel(this.LIZJ, this.LIZLLL, this.LJ, this.LIZIZ, this.LIZ);
    }

    public C51383KEp(C50632Ju0 c50632Ju0, KEP kep, KFQ kfq) {
        C51366KDy c51366KDy = new C51366KDy(c50632Ju0, kep);
        C36036ECi c36036ECi = new C36036ECi(c50632Ju0, kep);
        KE1 ke1 = new KE1(c50632Ju0, kep);
        this.LIZ = c50632Ju0;
        this.LIZIZ = kfq;
        this.LIZJ = c51366KDy;
        this.LIZLLL = c36036ECi;
        this.LJ = ke1;
    }
}
