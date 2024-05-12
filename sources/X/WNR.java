package X;

import android.animation.Animator;

/* loaded from: classes15.dex */
public final class WNR implements InterfaceC43357Gzx {
    public final /* synthetic */ Animator LIZ;

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        this.LIZ.end();
    }

    public WNR(Animator animator) {
        this.LIZ = animator;
    }
}
