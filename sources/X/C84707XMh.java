package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XMh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84707XMh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ SignupViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84707XMh(SignupViewModel signupViewModel) {
        super(0);
        this.LJLIL = signupViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Intent intent = this.LJLIL.LJLILLLLZI;
        if (intent != null) {
            Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "sign_up_data");
            if (LJJLIIIIJ != null) {
                z = LJJLIIIIJ.getBoolean("is_from_new_user_journey");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        o.LJIJI("intent");
        throw null;
    }
}
