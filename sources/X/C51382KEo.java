package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.KEo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51382KEo implements ViewModelProvider.Factory {
    public final KFQ LIZ;
    public final C51366KDy LIZIZ;
    public final C36036ECi LIZJ;
    public final KE1 LIZLLL;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new EcSearchResultLiveViewModel(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LIZ);
    }

    public C51382KEo(C50632Ju0 c50632Ju0, KEP kep, KFQ kfq) {
        C51366KDy c51366KDy = new C51366KDy(c50632Ju0, kep);
        C36036ECi c36036ECi = new C36036ECi(c50632Ju0, kep);
        KE1 ke1 = new KE1(c50632Ju0, kep);
        this.LIZ = kfq;
        this.LIZIZ = c51366KDy;
        this.LIZJ = c36036ECi;
        this.LIZLLL = ke1;
    }
}
