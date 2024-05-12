package X;

import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aMM, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93158aMM extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C93158aMM(Object obj) {
        super(0, obj, OtpFragment.class, "onCountDownStart", "onCountDownStart()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        OtpFragment otpFragment = (OtpFragment) this.receiver;
        ((TextView) otpFragment._$_findCachedViewById(R.id.f8)).setEnabled(false);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(otpFragment), C78613UtF.LIZJ, null, new C93144aM8(otpFragment, null), 2);
        return C76800UCe.LIZ;
    }
}
