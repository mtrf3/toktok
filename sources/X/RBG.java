package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment;

/* loaded from: classes12.dex */
public final class RBG extends C90233gR {
    public final /* synthetic */ CreatePasswordFragment LJLIL;

    public RBG(CreatePasswordFragment createPasswordFragment) {
        this.LJLIL = createPasswordFragment;
    }

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            editable.length();
        }
        this.LJLIL.getClass();
    }
}
