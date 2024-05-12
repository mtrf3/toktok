package X;

import android.text.TextUtils;

/* loaded from: classes13.dex */
public final class SDE extends C113664d8 {
    public final /* synthetic */ SD5 LJLIL;

    public SDE(SD5 sd5) {
        this.LJLIL = sd5;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        this.LJLIL.getOnValueChange().invoke(this.LJLIL.getValue());
        SD5 sd5 = this.LJLIL;
        if (TextUtils.isEmpty(charSequence)) {
            str = "";
        } else {
            str = "normal";
        }
        sd5.setInputMethod(str);
    }
}
