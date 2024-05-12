package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;

/* renamed from: X.KQn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51693KQn implements ViewModelStoreOwner {
    public final /* synthetic */ LandscapeFragmentPanel LJLIL;

    public C51693KQn(LandscapeFragmentPanel landscapeFragmentPanel) {
        this.LJLIL = landscapeFragmentPanel;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LJLIL.LLI;
    }
}
