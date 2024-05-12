package X;

import Y.IDeS357S0100000_12;
import android.app.Activity;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.RoC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70656RoC {
    public static final void LIZ(Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        IAccountService LJIJ = AccountService.LJIJ();
        if (!LJIJ.LJFF().isLogin()) {
            InterfaceC65895Ptb LJI = LJIJ.LJI();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = activity;
            c78450Uqc.LJ = new IDeS357S0100000_12(interfaceC65784Pro, 6);
            C40925G4j.LIZ(c78450Uqc, LJI);
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
