package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CombinedEmailSignupLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XjY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85656XjY extends C9X0 {
    public final /* synthetic */ CombinedEmailSignupLoginFragment LJLIL;

    public C85656XjY(CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment) {
        this.LJLIL = combinedEmailSignupLoginFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z;
        if (editable != null) {
            str = editable.toString();
        } else {
            str = null;
        }
        this.LJLIL.Ql();
        this.LJLIL.Wl(false);
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.ctc);
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        c74088T5w.setEnabled(z);
        CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment = this.LJLIL;
        if (!combinedEmailSignupLoginFragment.LLD) {
            String enterMethod = combinedEmailSignupLoginFragment.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            String enterFrom = this.LJLIL.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            RC0.LIZIZ(enterMethod, enterFrom, "signup_login", false);
            this.LJLIL.LLD = true;
        }
    }
}
