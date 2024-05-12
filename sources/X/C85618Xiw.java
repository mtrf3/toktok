package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xiw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85618Xiw extends C9X0 {
    public final /* synthetic */ TwoStepVerifySmsFor2046Fragment LJLIL;

    public C85618Xiw(TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment) {
        this.LJLIL = twoStepVerifySmsFor2046Fragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        if (C35338Dtu.LIZ()) {
            i = 6;
        } else {
            i = 4;
        }
        SY4 sy4 = (SY4) this.LJLIL._$_findCachedViewById(R.id.h0u);
        Editable text = ((C19K) this.LJLIL._$_findCachedViewById(R.id.enw)).getText();
        boolean z = false;
        if (text != null && text.length() == i) {
            z = true;
        }
        sy4.setEnabled(z);
    }
}
