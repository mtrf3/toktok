package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYB extends AbstractC65781Prl implements InterfaceC88471Ynr<AuthInfoState, Bundle, AuthInfoState> {
    public static final AYB INSTANCE = new AYB();

    public AYB() {
        super(2);
    }

    public final AuthInfoState invoke(AuthInfoState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ AuthInfoState invoke(AuthInfoState authInfoState, Bundle bundle) {
        AuthInfoState authInfoState2 = authInfoState;
        invoke(authInfoState2, bundle);
        return authInfoState2;
    }
}
