package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.GpA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42688GpA implements HJM {
    public final Aweme LIZ;
    public final Fragment LIZIZ;
    public final /* synthetic */ C72037SOz LIZJ;

    @Override // X.InterfaceC44391HbX
    public final Context getContext() {
        return getFragment().getContext();
    }

    @Override // X.HJM
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.InterfaceC42661Goj
    public final Fragment getFragment() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC42661Goj, X.InterfaceC41451GOp
    public final LifecycleOwner getLifecycleOwner() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC41452GOq
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC41449GOn
    public final void LJIIJJI(InterfaceC40967G5z listener) {
        o.LJIIIZ(listener, "listener");
        C42660Goi.LIZ(this, listener);
    }

    @Override // X.HJM
    public final void LJIILJJIL(int i) {
        this.LIZJ.LLIIL(i);
    }

    public C42688GpA(BaseVisibilityViewModel baseVisibilityViewModel, Fragment fragment, C72037SOz c72037SOz) {
        this.LIZJ = c72037SOz;
        this.LIZ = baseVisibilityViewModel.nv0();
        this.LIZIZ = fragment;
    }
}
