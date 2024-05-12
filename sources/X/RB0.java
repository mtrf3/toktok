package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class RB0 implements TextWatcher {
    public final /* synthetic */ BaseUpdatePasswordFragment LJLIL;
    public final /* synthetic */ RB7 LJLILLLLZI;
    public final /* synthetic */ T0K LJLJI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        if (!this.LJLIL.isViewValid()) {
            return;
        }
        BaseUpdatePasswordFragment baseUpdatePasswordFragment = this.LJLIL;
        if (!baseUpdatePasswordFragment.LLFII) {
            baseUpdatePasswordFragment.LLFII = true;
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", baseUpdatePasswordFragment.getEnterFrom());
            c35936E8m.LIZLLL("enter_method", baseUpdatePasswordFragment.getEnterMethod());
            c35936E8m.LIZLLL("login_panel_type", baseUpdatePasswordFragment.wl());
            c35936E8m.LIZLLL("platform", baseUpdatePasswordFragment.Rl());
            c35936E8m.LIZLLL("page", (String) baseUpdatePasswordFragment.LLFF.getValue());
            FMX.LJIIL("start_password_typing", c35936E8m.LIZ);
        }
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        RB7 rb7 = this.LJLILLLLZI;
        rb7.getClass();
        Iterator it = ((ArrayList) rb7.LIZ.LIZ).iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                RB8 LIZ = ((RBL) it.next()).LIZ(str);
                rb7.LIZIZ.onNext(LIZ);
                if (!z || !LIZ.LIZIZ) {
                    z = false;
                }
            }
            rb7.LIZJ.onNext(Boolean.valueOf(z));
            this.LJLJI.LIZ(str);
            return;
        }
    }

    public RB0(BaseUpdatePasswordFragment baseUpdatePasswordFragment, RB7 rb7, T0K t0k) {
        this.LJLIL = baseUpdatePasswordFragment;
        this.LJLILLLLZI = rb7;
        this.LJLJI = t0k;
    }
}
