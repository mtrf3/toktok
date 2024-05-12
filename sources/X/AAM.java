package X;

import android.content.DialogInterface;

/* loaded from: classes5.dex */
public final class AAM implements DialogInterface.OnDismissListener {
    public final /* synthetic */ long LJLIL;

    public AAM(long j) {
        this.LJLIL = j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C2U8.LIZ(new C25741A8j(System.currentTimeMillis() - this.LJLIL));
    }
}
