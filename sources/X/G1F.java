package X;

import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;

/* loaded from: classes7.dex */
public final class G1F implements R5Y {
    public final /* synthetic */ C2UH LIZ;
    public final /* synthetic */ I18nSignUpActivity LIZIZ;

    @Override // X.R5Y
    public final void onFailure() {
        C12460eI.LJIIIZ(this.LIZ);
    }

    @Override // X.R5Y
    public final void onSuccess() {
        C12460eI.LJIIIZ(this.LIZ);
        this.LIZIZ.finish();
    }

    public G1F(C2UH c2uh, I18nSignUpActivity i18nSignUpActivity) {
        this.LIZ = c2uh;
        this.LIZIZ = i18nSignUpActivity;
    }
}
