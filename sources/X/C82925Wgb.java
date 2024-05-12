package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Wgb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82925Wgb implements ViewModelProvider.Factory {
    public final int LIZ;
    public final UniversalPopupResponse LIZIZ;
    public final InterfaceC36824Ecm LIZJ;
    public final C73992T2e LIZLLL;
    public final InterfaceC82923WgZ LJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new UniversalPopupViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C82925Wgb(int i, UniversalPopupResponse universalPopupResponse, InterfaceC36824Ecm loader, C73992T2e logger, InterfaceC82923WgZ interfaceC82923WgZ) {
        o.LJIIIZ(loader, "loader");
        o.LJIIIZ(logger, "logger");
        this.LIZ = i;
        this.LIZIZ = universalPopupResponse;
        this.LIZJ = loader;
        this.LIZLLL = logger;
        this.LJ = interfaceC82923WgZ;
    }
}
