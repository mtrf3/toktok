package X;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aMN, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93159aMN extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C93159aMN(Object obj) {
        super(0, obj, OtpFragment.class, "onCountDownFinish", "onCountDownFinish()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        BaseFragment baseFragment = (BaseFragment) this.receiver;
        String string = baseFragment.getString(R.string.jr8);
        o.LJIIIIZZ(string, "getString(R.string.pipo_…ernter_otp_resend_button)");
        Context requireContext = baseFragment.requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, requireContext);
        TextView textView = (TextView) baseFragment._$_findCachedViewById(R.id.f8);
        if (textView != null) {
            textView.setText(string);
            textView.setTextColor(LJIIIIZZ);
        }
        TextView textView2 = (TextView) baseFragment._$_findCachedViewById(R.id.f8);
        if (textView2 != null) {
            textView2.setEnabled(true);
        }
        return C76800UCe.LIZ;
    }
}
