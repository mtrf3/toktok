package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.services.BindService;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS462S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xb4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85130Xb4 extends AbstractC65781Prl implements InterfaceC88475Ynv<Boolean, String, String, List<String>, Integer, C76800UCe> {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85130Xb4(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel) {
        super(5);
        this.LJLIL = twoStepVerificationActivityViewModel;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(Boolean bool, String str, String str2, List<String> list, Integer num) {
        Activity activity;
        boolean booleanValue = bool.booleanValue();
        String verifyMethod = str;
        String ticket = str2;
        List<String> ways = list;
        int intValue = num.intValue();
        o.LJIIIZ(verifyMethod, "verifyMethod");
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(ways, "ways");
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = this.LJLIL;
        IDqS462S0100000_15 iDqS462S0100000_15 = new IDqS462S0100000_15(twoStepVerificationActivityViewModel, 1);
        C85136XbA c85136XbA = (C85136XbA) ((LinkedHashMap) twoStepVerificationActivityViewModel.LJLJJL).get(EnumC85151XbP.SMS);
        if (c85136XbA != null && c85136XbA.LIZ) {
            iDqS462S0100000_15.invoke(Boolean.valueOf(booleanValue), verifyMethod, ticket, ways, Integer.valueOf(intValue));
        } else {
            BindService LIZIZ = R41.LIZIZ();
            Context context = twoStepVerificationActivityViewModel.lv0().LJLJI;
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            } else {
                activity = null;
            }
            String enterFrom = twoStepVerificationActivityViewModel.getEnterFrom();
            String enterMethod = twoStepVerificationActivityViewModel.getEnterMethod();
            Bundle jv0 = twoStepVerificationActivityViewModel.jv0();
            jv0.putBoolean("show_success_toast", false);
            jv0.putBoolean("show_skip", true);
            jv0.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeTwoStepVerification.getValue());
            LIZIZ.bindMobile(activity, enterFrom, enterMethod, jv0, new C85120Xau(intValue, twoStepVerificationActivityViewModel, verifyMethod, ticket, ways, iDqS462S0100000_15, booleanValue));
        }
        return C76800UCe.LIZ;
    }
}
