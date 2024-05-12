package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xiv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85617Xiv extends C9X0 {
    public final /* synthetic */ TwoStepVerifyEmailFor2046Fragment LJLIL;

    public C85617Xiv(TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment) {
        this.LJLIL = twoStepVerifyEmailFor2046Fragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SY4 sy4 = (SY4) this.LJLIL._$_findCachedViewById(R.id.h0u);
        Editable text = ((C19K) this.LJLIL._$_findCachedViewById(R.id.enw)).getText();
        boolean z = false;
        if (text != null && text.length() == 6) {
            z = true;
        }
        sy4.setEnabled(z);
    }
}
