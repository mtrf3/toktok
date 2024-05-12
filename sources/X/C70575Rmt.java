package X;

import Y.IDeS357S0100000_12;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import kotlin.jvm.internal.AqS159S0200000_12;

/* renamed from: X.Rmt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70575Rmt {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, RouteIntent routeIntent) {
        if (routeIntent == null || context == null) {
            return false;
        }
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(context, routeIntent, 0);
        IAccountService LJIJ = AccountService.LJIJ();
        if (!LJIJ.LJFF().isLogin()) {
            InterfaceC65895Ptb LJI = LJIJ.LJI();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = C27740Aue.LIZ(context);
            c78450Uqc.LJ = new IDeS357S0100000_12(aqS159S0200000_12, 0);
            C40925G4j.LIZ(c78450Uqc, LJI);
            return true;
        }
        aqS159S0200000_12.invoke();
        return true;
    }
}
