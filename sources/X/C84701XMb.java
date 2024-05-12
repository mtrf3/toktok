package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;

/* renamed from: X.XMb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84701XMb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ SignupViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84701XMb(SignupViewModel signupViewModel) {
        super(0);
        this.LJLIL = signupViewModel;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(this.LJLIL.mv0().getBoolean("should_change_signup_copy_for_increase_login_notify", false));
    }
}
