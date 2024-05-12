package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;

/* renamed from: X.K5d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51137K5d implements TextView.OnEditorActionListener {
    public final /* synthetic */ BaseDiscoverAndSearchFragmentNew LJLIL;

    public C51137K5d(BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew) {
        this.LJLIL = baseDiscoverAndSearchFragmentNew;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 0 ? i == 3 || 0 != 0 : keyEvent != null && keyEvent.getKeyCode() == 66) {
            this.LJLIL.Tl(this.LJLIL.LJLJJL.getText().toString());
            this.LJLIL.Hm("default_click_keyboard");
        }
        return true;
    }
}
