package X;

import android.os.Bundle;

/* renamed from: X.LGk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC53978LGk implements Runnable {
    public final /* synthetic */ ViewOnClickListenerC54142LMs LJLIL;

    public RunnableC53978LGk(ViewOnClickListenerC54142LMs viewOnClickListenerC54142LMs) {
        this.LJLIL = viewOnClickListenerC54142LMs;
    }

    public final void LIZ() {
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "RootNode");
        bundle.putBoolean("passiveSwitch", true);
        com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLIL.LJLILLLLZI).Cv0(bundle, "page_feed");
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
