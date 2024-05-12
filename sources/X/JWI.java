package X;

import android.graphics.SurfaceTexture;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;

/* loaded from: classes9.dex */
public final class JWI implements InterfaceC47667InH {
    public final /* synthetic */ SearchJediMixFeedFragment LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public JWI(SearchJediMixFeedFragment searchJediMixFeedFragment) {
        this.LJLIL = searchJediMixFeedFragment;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        JQT jqt;
        Integer value;
        MutableLiveData<Integer> mutableLiveData = this.LJLIL.fm().searchState;
        if ((mutableLiveData == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 3) && (jqt = this.LJLIL.LLLILZ) != null) {
            jqt.LJIIZILJ();
        }
    }
}
