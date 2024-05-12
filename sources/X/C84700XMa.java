package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;

/* renamed from: X.XMa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84700XMa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ SignupViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84700XMa(SignupViewModel signupViewModel) {
        super(0);
        this.LJLIL = signupViewModel;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(this.LJLIL.mv0().getBoolean("login_panel_adjust_height_automatically", false));
    }
}
