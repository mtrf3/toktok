package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.Qig, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67766Qig implements InterfaceC67706Qhi, InterfaceC67707Qhj {
    public final C67718Qhu<?> LJLIL;
    public final boolean LJLILLLLZI;
    public C67759QiZ LJLJI;

    public C67766Qig(C67718Qhu<?> c67718Qhu, boolean z) {
        this.LJLIL = c67718Qhu;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC67784Qiy
    public final void H0(Bundle bundle) {
        QH7.LJIIIZ(this.LJLJI, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.LJLJI.H0(bundle);
    }

    @Override // X.InterfaceC67712Qho
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        QH7.LJIIIZ(this.LJLJI, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C67759QiZ c67759QiZ = this.LJLJI;
        C67718Qhu<?> c67718Qhu = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        c67759QiZ.LJLIL.lock();
        try {
            c67759QiZ.LJLLI.LIZIZ(connectionResult, c67718Qhu, z);
        } finally {
            c67759QiZ.LJLIL.unlock();
        }
    }

    @Override // X.InterfaceC67784Qiy
    public final void v7(int i) {
        QH7.LJIIIZ(this.LJLJI, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.LJLJI.v7(i);
    }
}
