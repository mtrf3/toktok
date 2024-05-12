package X;

import android.content.DialogInterface;
import java.util.HashMap;

/* renamed from: X.ICw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnClickListenerC46242ICw implements DialogInterface.OnClickListener {
    public final /* synthetic */ HashMap<String, String> LJLIL;
    public final /* synthetic */ C46240ICu LJLILLLLZI;
    public final /* synthetic */ InterfaceC46243ICx<T> LJLJI;

    public DialogInterfaceOnClickListenerC46242ICw(HashMap<String, String> hashMap, C46240ICu c46240ICu, InterfaceC46243ICx<T> interfaceC46243ICx) {
        this.LJLIL = hashMap;
        this.LJLILLLLZI = c46240ICu;
        this.LJLJI = interfaceC46243ICx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.LJLIL.put("to_status", "confirm");
        GXR.LIZ("shoot_video_delete_confirm", this.LJLIL);
        C46240ICu c46240ICu = this.LJLILLLLZI;
        InterfaceC46243ICx<T> interfaceC46243ICx = this.LJLJI;
        c46240ICu.LJ = interfaceC46243ICx;
        c46240ICu.LIZLLL.invoke(interfaceC46243ICx);
    }
}
