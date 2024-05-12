package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xja, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85658Xja extends C9X0 {
    public final /* synthetic */ PhoneLoginFragment LJLIL;

    public C85658Xja(PhoneLoginFragment phoneLoginFragment) {
        this.LJLIL = phoneLoginFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String obj;
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.hnl);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.hnk);
        if (c74088T5w != null) {
            if (editable != null && (obj = editable.toString()) != null && obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c74088T5w.setEnabled(z);
        }
        PhoneLoginFragment phoneLoginFragment = this.LJLIL;
        if (!phoneLoginFragment.LLFF) {
            String enterMethod = phoneLoginFragment.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            String enterFrom = this.LJLIL.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            RC0.LIZIZ(enterMethod, enterFrom, "login", true);
            this.LJLIL.LLFF = true;
        }
    }
}
