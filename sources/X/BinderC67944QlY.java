package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.QlY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC67944QlY extends BinderC67946Qla {
    public final C67649Qgn LJLIL;

    public BinderC67944QlY(C67649Qgn c67649Qgn) {
        this.LJLIL = c67649Qgn;
    }

    @Override // X.BinderC67946Qla, X.InterfaceC68717Qy1
    public final void LLILL(Status status, boolean z) {
        C78923UyF.LJIIZILJ(status, Boolean.valueOf(z), this.LJLIL);
    }

    @Override // X.BinderC67946Qla, X.InterfaceC68717Qy1
    public final void LLLLLL(int i, boolean z) {
        C78923UyF.LJIIZILJ(new Status(i, null, null), Boolean.valueOf(z), this.LJLIL);
    }
}
