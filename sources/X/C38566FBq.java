package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS42S0100000_6;
import Y.AfS17S0001000_5;
import Y.AfS37S0000000_5;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

/* renamed from: X.FBq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38566FBq {
    public static volatile int LIZ;

    public static void LIZ(final Context context, boolean z) {
        AwemeRedBadgerManager awemeRedBadgerManager = AwemeRedBadgerManager.LJLJI;
        awemeRedBadgerManager.getClass();
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(awemeRedBadgerManager);
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS11S0101000_7(4, awemeRedBadgerManager, 4));
        }
        C84763XOl.LIZLLL().LJJJJZI(new AfS37S0000000_5(13));
        C84763XOl.LIZJ().LJJJJZI(new AfS17S0001000_5(2, 14));
        if (z) {
            C36582EXi.LIZ.execute(new ARunnableS42S0100000_6(context, 172));
        } else {
            AccountService.LJIJ().LJIILJJIL(new LEA() { // from class: X.E9G
                @Override // X.LEA
                public final void onAccountResult(int i, boolean z2, int i2, User user) {
                    Context context2 = context;
                    AwemeRedBadgerManager.LJLJI.getClass();
                    AwemeRedBadgerManager.LIZIZ(context2);
                }
            });
        }
    }
}
