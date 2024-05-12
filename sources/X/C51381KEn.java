package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.KEn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51381KEn implements ViewModelProvider.Factory {
    public final KE0 LIZ;
    public final KEP LIZIZ;
    public final KFQ LIZJ;
    public final C51366KDy LIZLLL;
    public final C36036ECi LJ;
    public final KE1 LJFF;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new EcSearchResultShopViewModel(this.LIZLLL, this.LJ, this.LJFF, this.LIZJ, this.LIZ, this.LIZIZ);
    }

    public C51381KEn(KE0 ke0, KEP kep, KFQ kfq) {
        C51366KDy c51366KDy = new C51366KDy(ke0, kep);
        C36036ECi c36036ECi = new C36036ECi(ke0, kep);
        KE1 ke1 = new KE1(ke0, kep);
        this.LIZ = ke0;
        this.LIZIZ = kep;
        this.LIZJ = kfq;
        this.LIZLLL = c51366KDy;
        this.LJ = c36036ECi;
        this.LJFF = ke1;
    }
}
