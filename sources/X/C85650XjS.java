package X;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSIModeFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XjS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85650XjS extends C90233gR {
    public final /* synthetic */ RuInstantLoginSIModeFragment LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SY4 sy4 = (SY4) this.LJLIL._$_findCachedViewById(R.id.g_8);
        if (sy4 != null) {
            sy4.setEnabled(!TextUtils.isEmpty(this.LJLILLLLZI.getText()));
        }
        ((C252949wI) this.LJLIL._$_findCachedViewById(R.id.eo8)).LIZ();
    }

    public C85650XjS(RuInstantLoginSIModeFragment ruInstantLoginSIModeFragment, EditText editText) {
        this.LJLIL = ruInstantLoginSIModeFragment;
        this.LJLILLLLZI = editText;
    }
}
