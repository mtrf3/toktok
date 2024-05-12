package X;

import android.os.Bundle;

/* renamed from: X.LGp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC53983LGp implements Runnable {
    public final /* synthetic */ LK1 LJLIL;

    public RunnableC53983LGp(LK1 lk1) {
        this.LJLIL = lk1;
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
