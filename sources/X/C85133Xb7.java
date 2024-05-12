package X;

import Y.IDeS359S0100000_15;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.twostep.BindOrUpdateTOTPResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.services.BindService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xb7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85133Xb7<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ TOTPCodeVerifyFragment LIZIZ;

    public C85133Xb7(View view, TOTPCodeVerifyFragment tOTPCodeVerifyFragment) {
        this.LIZ = view;
        this.LIZIZ = tOTPCodeVerifyFragment;
    }

    @Override // X.C10I
    public final Object then(C10K<BindOrUpdateTOTPResponse> it) {
        Integer num;
        String str;
        String str2;
        String totpKeyUri;
        this.LIZ.setEnabled(true);
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = this.LIZIZ;
        o.LJIIIIZZ(it, "it");
        if (!tOTPCodeVerifyFragment.ym(it, true)) {
            return null;
        }
        BindOrUpdateTOTPResponse LJIIJJI = it.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", LJIIJJI.getMessage(), true) || LJIIJJI.getData() == null) {
            BindOrUpdateTOTPResponse.RegisterData data = LJIIJJI.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            BindOrUpdateTOTPResponse.RegisterData data2 = LJIIJJI.getData();
            if (data2 != null) {
                str = data2.getDescription();
            } else {
                str = null;
            }
            if (num == null) {
                return null;
            }
            TOTPCodeVerifyFragment tOTPCodeVerifyFragment2 = this.LIZIZ;
            int intValue = num.intValue();
            if (str != null) {
                tOTPCodeVerifyFragment2.Sg(intValue, str);
            }
            return C76800UCe.LIZ;
        }
        BindOrUpdateTOTPResponse.RegisterData data3 = LJIIJJI.getData();
        String str3 = "";
        if (data3 == null || (str2 = data3.getTotpSecret()) == null) {
            str2 = "";
        }
        BindOrUpdateTOTPResponse.RegisterData data4 = LJIIJJI.getData();
        if (data4 != null && (totpKeyUri = data4.getTotpKeyUri()) != null) {
            str3 = totpKeyUri;
        }
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment3 = this.LIZIZ;
        KeyboardUtils.LIZIZ(tOTPCodeVerifyFragment3._$_findCachedViewById(R.id.enw));
        BindService LIZIZ = R41.LIZIZ();
        ActivityC45651qj mo49getActivity = tOTPCodeVerifyFragment3.mo49getActivity();
        String enterFrom = tOTPCodeVerifyFragment3.getEnterFrom();
        String enterMethod = tOTPCodeVerifyFragment3.getEnterMethod();
        Bundle bundle = new Bundle();
        Bundle arguments = tOTPCodeVerifyFragment3.getArguments();
        int i = -1;
        if (arguments != null) {
            i = arguments.getInt("progress", -1);
        }
        bundle.putInt("progress", i);
        bundle.putBoolean("show_success_toast", false);
        bundle.putString("totp_secret", str2);
        bundle.putString("totp_key_uri", str3);
        LIZIZ.updateTOTP(mo49getActivity, enterFrom, enterMethod, bundle, new IDeS359S0100000_15(tOTPCodeVerifyFragment3, 6));
        return C76800UCe.LIZ;
    }
}
