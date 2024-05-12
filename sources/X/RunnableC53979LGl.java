package X;

import android.os.Bundle;

/* renamed from: X.LGl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC53979LGl implements Runnable {
    public final /* synthetic */ LN0 LJLIL;

    public RunnableC53979LGl(LN0 ln0) {
        this.LJLIL = ln0;
    }

    public final void LIZ() {
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "RootNode");
        bundle.putBoolean("passiveSwitch", true);
        ActivityC45651qj activityC45651qj = this.LJLIL.LJLILLLLZI;
        if (activityC45651qj != null) {
            com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Cv0(bundle, "page_feed");
        }
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
