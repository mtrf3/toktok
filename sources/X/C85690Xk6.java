package X;

import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationShowEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationTypingEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Xk6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85690Xk6 {
    public final EnumC85691Xk7 LIZ;
    public boolean LIZIZ;

    public final void LIZIZ() {
        IdentityVerificationShowEvent identityVerificationShowEvent = new IdentityVerificationShowEvent();
        identityVerificationShowEvent.LIZLLL("suspicious_login", "enter_from");
        EnumC85693Xk9 verificationMethod = this.LIZ.getShow();
        o.LJIIIZ(verificationMethod, "verificationMethod");
        identityVerificationShowEvent.LIZLLL(verificationMethod.getValue(), "verification_method");
        identityVerificationShowEvent.LIZLLL("suspicious_login", "page");
        identityVerificationShowEvent.LJFF();
    }

    public final void LIZJ() {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            IdentityVerificationTypingEvent identityVerificationTypingEvent = new IdentityVerificationTypingEvent();
            identityVerificationTypingEvent.LIZLLL("suspicious_login", "enter_from");
            EnumC85633XjB verificationMethod = this.LIZ.getTyping();
            o.LJIIIZ(verificationMethod, "verificationMethod");
            identityVerificationTypingEvent.LIZLLL(verificationMethod.getValue(), "verification_method");
            identityVerificationTypingEvent.LIZLLL("suspicious_login", "page");
            identityVerificationTypingEvent.LJFF();
        }
    }

    public C85690Xk6(EnumC85691Xk7 verificationMethod) {
        o.LJIIIZ(verificationMethod, "verificationMethod");
        this.LIZ = verificationMethod;
    }

    public final void LIZ(boolean z) {
        IMV isSuccess;
        IdentityVerificationResultEvent identityVerificationResultEvent = new IdentityVerificationResultEvent();
        identityVerificationResultEvent.LIZLLL("suspicious_login", "enter_from");
        if (z) {
            isSuccess = IMV.DIGITAL_1;
        } else {
            isSuccess = IMV.DIGITAL_0;
        }
        o.LJIIIZ(isSuccess, "isSuccess");
        identityVerificationResultEvent.LIZLLL(Integer.valueOf(isSuccess.getValue()), "is_success");
        EnumC85692Xk8 verificationMethod = this.LIZ.getResult();
        o.LJIIIZ(verificationMethod, "verificationMethod");
        identityVerificationResultEvent.LIZLLL(verificationMethod.getValue(), "verification_method");
        identityVerificationResultEvent.LIZLLL("suspicious_login", "page");
        identityVerificationResultEvent.LJFF();
    }
}
