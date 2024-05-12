package X;

import Y.ARunnableS37S0100000_1;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeySetUpFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.XjG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC85638XjG implements Runnable {
    public final /* synthetic */ PasskeySetUpFragment LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Boolean LJLJJL;

    public RunnableC85638XjG(PasskeySetUpFragment passkeySetUpFragment, Throwable th, ActivityC45651qj activityC45651qj, boolean z, Boolean bool) {
        this.LJLIL = passkeySetUpFragment;
        this.LJLILLLLZI = th;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = z;
        this.LJLJJL = bool;
    }

    public final void LIZ() {
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.runOnUiThread(new ARunnableS37S0100000_1(mo49getActivity, 96));
        }
        if (this.LJLILLLLZI == null) {
            return;
        }
        ActivityC45651qj activityC45651qj = this.LJLJI;
        o.LJIIIIZZ(activityC45651qj, "this");
        C85760XlE.LIZLLL(activityC45651qj, this.LJLILLLLZI, false, this.LJLJJI, this.LJLJJL, C85640XjI.LJLIL);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
