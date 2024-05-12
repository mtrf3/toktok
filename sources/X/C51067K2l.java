package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;

/* renamed from: X.K2l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51067K2l implements KEX {
    public final /* synthetic */ SearchContainerFragment LIZ;

    public C51067K2l(SearchContainerFragment searchContainerFragment) {
        this.LIZ = searchContainerFragment;
    }

    @Override // X.KEX
    public final void LIZ(boolean z) {
        this.LIZ.LJLLLL.jv0().postValue(Boolean.valueOf(z));
    }

    @Override // X.KEX
    public final void LIZIZ(boolean z) {
        this.LIZ.LJLLLL.gv0().postValue(Boolean.valueOf(z));
    }

    @Override // X.KEX
    public final void LIZJ(boolean z) {
        ((LiveData) this.LIZ.LJLLLL.LJLL.getValue()).postValue(Boolean.valueOf(z));
    }
}
