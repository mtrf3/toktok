package X;

import android.animation.Animator;

/* loaded from: classes15.dex */
public final class WND implements InterfaceC43357Gzx {
    public final /* synthetic */ Animator LIZ;

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        this.LIZ.end();
    }

    public WND(Animator animator) {
        this.LIZ = animator;
    }
}
