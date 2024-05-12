package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.aQY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnFocusChangeListenerC93418aQY implements View.OnFocusChangeListener {
    public final /* synthetic */ GifsFragment LJLIL;

    public ViewOnFocusChangeListenerC93418aQY(GifsFragment gifsFragment) {
        this.LJLIL = gifsFragment;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            StatisticReporter LIZ = C93670aUc.LIZ();
            if (LIZ != null) {
                LIZ.onEvent("gifs_search_click", C51029K0z.LJJIIZI(new OSZ("is_ame_data", "1")));
            }
            this.LJLIL.xl(true);
            Fragment parentFragment = this.LJLIL.getParentFragment();
            if (!(parentFragment instanceof AssetsFragment)) {
                parentFragment = null;
            }
            AssetsFragment assetsFragment = (AssetsFragment) parentFragment;
            if (assetsFragment != null) {
                C94037aaX c94037aaX = assetsFragment.LJLILLLLZI;
                if (c94037aaX != null) {
                    c94037aaX.LJLILLLLZI.setExpanded(false);
                } else {
                    o.LJIJI("binding");
                    throw null;
                }
            }
        }
    }
}
