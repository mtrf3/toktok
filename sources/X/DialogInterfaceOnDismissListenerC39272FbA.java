package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;

/* renamed from: X.FbA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnDismissListenerC39272FbA implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C39273FbB LJLIL;

    public DialogInterfaceOnDismissListenerC39272FbA(C39273FbB c39273FbB) {
        this.LJLIL = c39273FbB;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C12460eI.LJIIIZ(this.LJLIL);
        SpecActServiceImpl.LJJJIL().LJIJI(false);
    }
}
