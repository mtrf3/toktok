package X;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashMap;

/* renamed from: X.CIi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC31096CIi implements DialogInterface.OnClickListener {
    public final /* synthetic */ String LJLIL;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        HashMap LIZJ = C03660Ck.LIZJ("bind_page_source", this.LJLIL);
        BZI LIZ = C28787BRn.LIZ("livesdk_phone_bind_page_show");
        LIZ.LJJIFFI(LIZJ);
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    public DialogInterfaceOnClickListenerC31096CIi(Activity activity, String str, InterfaceC31102CIo interfaceC31102CIo) {
        this.LJLIL = str;
    }
}
