package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.XMm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84712XMm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ SignupViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84712XMm(SignupViewModel signupViewModel) {
        super(0);
        this.LJLIL = signupViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        WeakReference<ActivityC45651qj> weakReference = this.LJLIL.LJLIL;
        if (weakReference != null) {
            ActivityC45651qj activityC45651qj = weakReference.get();
            if (activityC45651qj == null) {
                return Boolean.FALSE;
            }
            if (((int) TypedValue.applyDimension(1, activityC45651qj.getResources().getDisplayMetrics().heightPixels, activityC45651qj.getResources().getDisplayMetrics())) < 700) {
                return Boolean.FALSE;
            }
            Intent intent = this.LJLIL.LJLILLLLZI;
            if (intent != null) {
                Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "sign_up_data");
                if (LJJLIIIIJ != null) {
                    z = LJJLIIIIJ.getBoolean("is_expandable_dialog");
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            o.LJIJI("intent");
            throw null;
        }
        o.LJIJI("weakFragmentActivity");
        throw null;
    }
}
