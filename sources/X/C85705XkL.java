package X;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XkL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85705XkL extends C90233gR {
    public final /* synthetic */ CommonInputEmailFragment LJLIL;

    public C85705XkL(CommonInputEmailFragment commonInputEmailFragment) {
        this.LJLIL = commonInputEmailFragment;
    }

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        C252949wI c252949wI;
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.eo0);
        if (c74088T5w != null) {
            c74088T5w.setEnabled(!TextUtils.isEmpty(this.LJLIL.cm().getText()));
        }
        View _$_findCachedViewById = this.LJLIL._$_findCachedViewById(R.id.enz);
        if (_$_findCachedViewById != null && (c252949wI = (C252949wI) _$_findCachedViewById.findViewById(R.id.eoi)) != null) {
            c252949wI.LIZ();
        }
        if (this.LJLIL.LLF) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", this.LJLIL.getEnterFrom());
            c35936E8m.LIZLLL("enter_method", this.LJLIL.getEnterMethod());
            Bundle arguments = this.LJLIL.getArguments();
            if (arguments != null) {
                str = arguments.getString("page", "");
            } else {
                str = null;
            }
            c35936E8m.LIZLLL("page", str);
            FMX.LJIIL("start_email_typing", c35936E8m.LIZ);
            this.LJLIL.LLF = false;
        }
    }
}
