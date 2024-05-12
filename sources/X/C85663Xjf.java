package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xjf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85663Xjf extends C9X0 {
    public final /* synthetic */ EmailSignUpFragment LJLIL;

    public C85663Xjf(EmailSignUpFragment emailSignUpFragment) {
        this.LJLIL = emailSignUpFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String obj;
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.ctg);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.ctc);
        if (c74088T5w != null) {
            if (editable != null && (obj = editable.toString()) != null && obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c74088T5w.setEnabled(z);
        }
        EmailSignUpFragment emailSignUpFragment = this.LJLIL;
        if (!emailSignUpFragment.LL) {
            String enterMethod = emailSignUpFragment.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            String enterFrom = this.LJLIL.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            RC0.LIZIZ(enterMethod, enterFrom, "signup", false);
            this.LJLIL.LL = true;
        }
    }
}
