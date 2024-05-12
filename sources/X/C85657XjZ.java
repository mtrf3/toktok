package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XjZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85657XjZ extends C9X0 {
    public final /* synthetic */ PhoneSignUpFragment LJLIL;

    public C85657XjZ(PhoneSignUpFragment phoneSignUpFragment) {
        this.LJLIL = phoneSignUpFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String obj;
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.hnp);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.hnn);
        if (c74088T5w != null) {
            if (editable != null && (obj = editable.toString()) != null && obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c74088T5w.setEnabled(z);
        }
        PhoneSignUpFragment phoneSignUpFragment = this.LJLIL;
        if (!phoneSignUpFragment.LLFF) {
            String enterMethod = phoneSignUpFragment.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            String enterFrom = this.LJLIL.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String loginPanelType = this.LJLIL.wl();
            o.LJIIIIZZ(loginPanelType, "loginPanelType");
            RC0.LIZIZ(enterMethod, enterFrom, loginPanelType, true);
            this.LJLIL.LLFF = true;
        }
    }
}
