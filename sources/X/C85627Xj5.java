package X;

import android.text.Editable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xj5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85627Xj5 extends C90233gR {
    public final /* synthetic */ VerifyPasswordFragment LJLIL;

    public C85627Xj5(VerifyPasswordFragment verifyPasswordFragment) {
        this.LJLIL = verifyPasswordFragment;
    }

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.eo4);
        if (c74088T5w != null) {
            if (this.LJLIL.LLF != null) {
                c74088T5w.setEnabled(!TextUtils.isEmpty(r0.getText()));
            } else {
                o.LJIJI("passwordInput");
                throw null;
            }
        }
        C74088T5w c74088T5w2 = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.h0u);
        if (c74088T5w2 != null) {
            if (this.LJLIL.LLF != null) {
                c74088T5w2.setEnabled(!TextUtils.isEmpty(r0.getText()));
            } else {
                o.LJIJI("passwordInput");
                throw null;
            }
        }
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.eoi);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        VerifyPasswordFragment verifyPasswordFragment = this.LJLIL;
        if (verifyPasswordFragment.LLIFFJFJJ && i > 0) {
            verifyPasswordFragment.LLIFFJFJJ = false;
            if (RBV.LJIIIIZZ(verifyPasswordFragment)) {
                String enterFrom = this.LJLIL.getEnterFrom();
                o.LJIIIIZZ(enterFrom, "enterFrom");
                String enterMethod = this.LJLIL.getEnterMethod();
                o.LJIIIIZZ(enterMethod, "enterMethod");
                String platform = this.LJLIL.Xl();
                o.LJIIIIZZ(platform, "platform");
                C85144XbI.LJJIJIIJIL(enterFrom, enterMethod, platform, "password");
            }
            if (C47261Igj.LJJIJIIJI(EnumC69116RAq.MODIFY_PHONE, EnumC69116RAq.CHANGE_EMAIL, EnumC69116RAq.UNBIND_PHONE, EnumC69116RAq.UNBIND_EMAIL).contains(this.LJLIL.xl())) {
                this.LJLIL.Vl(EnumC85633XjB.PASSWORD);
                return;
            }
            if (!((Boolean) this.LJLIL.LLII.getValue()).booleanValue()) {
                return;
            }
            String enterFrom2 = this.LJLIL.getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            String enterMethod2 = this.LJLIL.getEnterMethod();
            o.LJIIIIZZ(enterMethod2, "enterMethod");
            C85144XbI.LJIIJJI(enterFrom2, enterMethod2, "password");
        }
    }
}
