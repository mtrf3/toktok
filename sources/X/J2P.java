package X;

import android.os.Handler;

/* loaded from: classes9.dex */
public class J2P implements J2Q {
    public final Handler LJLIL;

    @Override // X.J2Q
    public final void notifyVsync() {
        this.LJLIL.sendEmptyMessage(28);
    }

    public J2P(Handler handler) {
        this.LJLIL = handler;
    }
}
