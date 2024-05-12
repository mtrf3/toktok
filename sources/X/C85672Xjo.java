package X;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xjo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85672Xjo extends C90233gR {
    public final /* synthetic */ InputEmailFragment LJLIL;

    public C85672Xjo(InputEmailFragment inputEmailFragment) {
        this.LJLIL = inputEmailFragment;
    }

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C252949wI c252949wI;
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.eo0);
        if (c74088T5w != null) {
            if (this.LJLIL.LJZL != null) {
                c74088T5w.setEnabled(!TextUtils.isEmpty(r0.getText()));
            } else {
                o.LJIJI("emailInput");
                throw null;
            }
        }
        View _$_findCachedViewById = this.LJLIL._$_findCachedViewById(R.id.enz);
        if (_$_findCachedViewById != null && (c252949wI = (C252949wI) _$_findCachedViewById.findViewById(R.id.eoi)) != null) {
            c252949wI.LIZ();
        }
    }
}
