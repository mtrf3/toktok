package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xip, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85611Xip extends C9X0 {
    public final /* synthetic */ TOTPCodeVerifyFragment LJLIL;

    public C85611Xip(TOTPCodeVerifyFragment tOTPCodeVerifyFragment) {
        this.LJLIL = tOTPCodeVerifyFragment;
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
