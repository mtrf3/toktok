package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XjJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85641XjJ extends C90233gR {
    public final /* synthetic */ InputPasswordFragment LJLIL;

    public C85641XjJ(InputPasswordFragment inputPasswordFragment) {
        this.LJLIL = inputPasswordFragment;
    }

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.eo4);
        if (c74088T5w != null) {
            if (this.LJLIL.LJZL != null) {
                c74088T5w.setEnabled(!C9WD.LIZJ(r0));
            } else {
                o.LJIJI("passwordInput");
                throw null;
            }
        }
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.eoi);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
    }
}
