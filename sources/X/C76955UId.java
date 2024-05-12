package X;

import android.view.View;

/* renamed from: X.UId, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76955UId implements InterfaceC77393UYz {
    public final /* synthetic */ C76954UIc LIZ;

    @Override // X.InterfaceC77393UYz
    public final void LIZ() {
    }

    public C76955UId(C76954UIc c76954UIc) {
        this.LIZ = c76954UIc;
    }

    @Override // X.InterfaceC77393UYz
    public final void LIZIZ(C76956UIe c76956UIe) {
        this.LIZ.getClass();
        View view = c76956UIe.LJ;
        if (view == null) {
            return;
        }
        view.setBackground(null);
    }

    @Override // X.InterfaceC77393UYz
    public final void LIZJ(C76956UIe c76956UIe) {
        int i;
        this.LIZ.LIZ(c76956UIe);
        C76954UIc c76954UIc = this.LIZ;
        if (c76956UIe != null) {
            i = c76956UIe.LIZLLL;
        } else {
            i = -1;
        }
        c76954UIc.LIZJ = i;
    }
}
