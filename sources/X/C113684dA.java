package X;

import Y.AgS119S0100000_1;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.account.loginsetting.BoolData;

/* renamed from: X.4dA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113684dA {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, InterfaceC113674d9 interfaceC113674d9) {
        C10K<BoolData> checkVoiceCodeAvailability;
        if (TextUtils.isEmpty(str)) {
            interfaceC113674d9.LIZ(false);
            return;
        }
        try {
            checkVoiceCodeAvailability = AccountApiInModule.LIZIZ.checkVoiceCodeAvailability(C78946Uyc.LJIIL(str), "1");
        } catch (Exception unused) {
        }
        if (checkVoiceCodeAvailability != null) {
            checkVoiceCodeAvailability.LIZLLL(new AgS119S0100000_1(interfaceC113674d9, 0));
        } else {
            interfaceC113674d9.LIZ(false);
        }
    }
}
