package X;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public final class RBU extends C90233gR {
    public final /* synthetic */ InputPhoneFragment LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        C74088T5w c74088T5w = (C74088T5w) this.LJLIL._$_findCachedViewById(R.id.eo7);
        if (c74088T5w != null) {
            c74088T5w.setEnabled(!TextUtils.isEmpty(this.LJLILLLLZI.getText()));
        }
        C252949wI c252949wI = (C252949wI) this.LJLIL._$_findCachedViewById(R.id.eo8);
        if (c252949wI != null) {
            c252949wI.LIZ();
        }
        if (!this.LJLIL.LLFF && C77275UUl.LJIIIIZZ(EnumC69113RAn.INPUT_PHONE_BIND, EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN, EnumC69113RAn.INPUT_PHONE_MODIFY).contains(this.LJLIL.Al())) {
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("enter_from", this.LJLIL.LJJLIIIJJI());
            oszArr[1] = new OSZ("enter_method", this.LJLIL.getEnterMethod());
            Bundle arguments = this.LJLIL.getArguments();
            if (arguments != null) {
                str = arguments.getString("page", "");
            } else {
                str = null;
            }
            oszArr[2] = new OSZ("page", str);
            FMX.LJIIL("start_phone_typing", C113554cx.LJJL(oszArr));
            this.LJLIL.LLFF = true;
        }
    }

    public RBU(InputPhoneFragment inputPhoneFragment, EditText editText) {
        this.LJLIL = inputPhoneFragment;
        this.LJLILLLLZI = editText;
    }
}
