package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;

/* loaded from: classes9.dex */
public final class K9R implements View.OnFocusChangeListener {
    public final /* synthetic */ ECSearchBarAssem LJLIL;

    public K9R(ECSearchBarAssem eCSearchBarAssem) {
        this.LJLIL = eCSearchBarAssem;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.LJLIL.H3(z, false);
    }
}
