package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class K9I implements TextView.OnEditorActionListener {
    public final /* synthetic */ ECSearchBarAssem LJLIL;

    public K9I(ECSearchBarAssem eCSearchBarAssem) {
        this.LJLIL = eCSearchBarAssem;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            this.LJLIL.K3(String.valueOf(((C19K) this.LJLIL._$_findCachedViewById(R.id.jf6)).getText()));
            return true;
        }
        return true;
    }
}
