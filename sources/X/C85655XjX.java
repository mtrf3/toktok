package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CombinedEmailSignupLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XjX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85655XjX extends C9X0 {
    public final /* synthetic */ CombinedEmailSignupLoginFragment LJLIL;

    public C85655XjX(CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment) {
        this.LJLIL = combinedEmailSignupLoginFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String obj;
        this.LJLIL.Ql();
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.cta);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.ctc);
        if (editable != null && (obj = editable.toString()) != null && obj.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        c74088T5w.setEnabled(z);
        CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment = this.LJLIL;
        if (!combinedEmailSignupLoginFragment.LLF) {
            String enterMethod = combinedEmailSignupLoginFragment.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            String enterFrom = this.LJLIL.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            RC0.LIZIZ(enterMethod, enterFrom, "signup_login", false);
            this.LJLIL.LLF = true;
        }
    }
}
