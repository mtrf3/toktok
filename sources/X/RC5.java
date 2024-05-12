package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RC5 implements TextWatcher {
    public final /* synthetic */ FtcCreatePasswordFragment LJLIL;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public RC5(FtcCreatePasswordFragment ftcCreatePasswordFragment) {
        this.LJLIL = ftcCreatePasswordFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        RC4 rc4 = this.LJLIL.LJZL;
        if (rc4 != null) {
            String valueOf = String.valueOf(editable);
            boolean z = true;
            if (valueOf.length() == 0) {
                rc4.LIZ.ik(null);
                rc4.LIZ.D1(null);
                rc4.LIZ.y9(null);
                rc4.LIZ.Qk(false);
                return;
            }
            rc4.LIZLLL.getClass();
            boolean matches = PatternProtector.compile("^.{8,20}$").matcher(valueOf).matches();
            rc4.LIZLLL.getClass();
            boolean matches2 = PatternProtector.compile("^(?=.*?\\d)(?=.*?[a-zA-Z]).+$").matcher(valueOf).matches();
            rc4.LIZLLL.getClass();
            boolean matches3 = PatternProtector.compile("^.*[_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\].*$").matcher(valueOf).matches();
            rc4.LIZ.ik(Boolean.valueOf(matches));
            rc4.LIZ.D1(Boolean.valueOf(matches2));
            rc4.LIZ.y9(Boolean.valueOf(matches3));
            RC8 rc8 = rc4.LIZ;
            if (!matches || !matches2 || !matches3) {
                z = false;
            }
            rc8.Qk(z);
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }
}
