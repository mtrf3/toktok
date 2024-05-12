package X;

import Y.ARunnableS29S0200000_10;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.zhiliaoapp.musically.R;
import ujb.s;

/* loaded from: classes11.dex */
public final class NVN extends AbstractC59145NJd {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ NZR LJLJI;

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        MixActivityContainer mixActivityContainer;
        if (webView != null && str != null && s.LJJJLZIJ(str, this.LJLIL, false) && !NWB.LIZIZ(((CrossPlatformFragment) this.LJLILLLLZI).LJLILLLLZI) && (mixActivityContainer = ((CrossPlatformFragment) this.LJLILLLLZI).LJLIL) != null) {
            ((ImageView) mixActivityContainer.LL.LIZ(R.id.bfd)).setVisibility(8);
        }
        this.LJLJI.getView().post(new ARunnableS29S0200000_10(this.LJLJI, this, 11));
    }

    public NVN(String str, Fragment fragment, NZR nzr) {
        this.LJLIL = str;
        this.LJLILLLLZI = fragment;
        this.LJLJI = nzr;
    }
}
