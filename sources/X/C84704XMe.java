package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XMe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84704XMe extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ SignupViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84704XMe(SignupViewModel signupViewModel) {
        super(0);
        this.LJLIL = signupViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Intent intent = this.LJLIL.LJLILLLLZI;
        if (intent != null) {
            Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "sign_up_data");
            boolean z = true;
            if (LJJLIIIIJ != null && !LJJLIIIIJ.getBoolean("is_skippable_dialog") && this.LJLIL.rv0()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        o.LJIJI("intent");
        throw null;
    }
}
