package X;

import Y.AObserverS62S0101000_8;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;

/* renamed from: X.K2k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51066K2k implements KEW {
    public final /* synthetic */ SearchContainerFragment LIZ;

    public C51066K2k(SearchContainerFragment searchContainerFragment) {
        this.LIZ = searchContainerFragment;
    }

    @Override // X.KEW
    public final void LIZIZ(Fragment fragment) {
        if (C48054ItW.LIZ()) {
            this.LIZ.LLF.LJLIL.removeObservers(fragment);
        }
    }

    @Override // X.KEW
    public final void LIZ(int i, Fragment fragment) {
        if (C48054ItW.LIZ()) {
            this.LIZ.LLF.LJLIL.observe(fragment, new AObserverS62S0101000_8(i, fragment, 0));
        }
    }
}
