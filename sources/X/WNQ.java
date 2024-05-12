package X;

import android.animation.Animator;

/* loaded from: classes15.dex */
public final class WNQ implements InterfaceC43357Gzx {
    public final /* synthetic */ Animator LIZ;

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        this.LIZ.end();
    }

    public WNQ(Animator animator) {
        this.LIZ = animator;
    }
}
