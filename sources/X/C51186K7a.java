package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;

/* renamed from: X.K7a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51186K7a implements TextView.OnEditorActionListener {
    public final /* synthetic */ EcBaseDiscoverAndSearchFragmentNew LJLIL;

    public C51186K7a(EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew) {
        this.LJLIL = ecBaseDiscoverAndSearchFragmentNew;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            this.LJLIL.Ol(this.LJLIL.LJLJI.getText().toString());
            this.LJLIL.nm("default_click_keyboard");
            return true;
        }
        return true;
    }
}
