package X;

import android.text.TextUtils;

/* loaded from: classes13.dex */
public final class SDD extends C113664d8 {
    public final /* synthetic */ SD6 LJLIL;

    public SDD(SD6 sd6) {
        this.LJLIL = sd6;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        this.LJLIL.getOnValueChange().invoke(this.LJLIL.getValue());
        SD6 sd6 = this.LJLIL;
        if (TextUtils.isEmpty(charSequence)) {
            str = "";
        } else {
            str = "normal";
        }
        sd6.setInputMethod(str);
    }
}
