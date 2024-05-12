package X;

import android.os.Bundle;
import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;

/* renamed from: X.XjN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85645XjN extends C90233gR {
    public final /* synthetic */ InputCodeFragmentV2 LJLIL;

    public C85645XjN(InputCodeFragmentV2 inputCodeFragmentV2) {
        this.LJLIL = inputCodeFragmentV2;
    }

    @Override // X.C90233gR, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        if (this.LJLIL.LLIFFJFJJ) {
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
            FMX.LJIIL("input_email_code", c35936E8m.LIZ);
            this.LJLIL.LLIFFJFJJ = false;
        }
    }
}
