package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.LwT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnClickListenerC55881LwT implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public DialogInterfaceOnClickListenerC55881LwT(Context context, int i) {
        this.LJLIL = context;
        this.LJLILLLLZI = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        try {
            C40322Fs6.LIZLLL(this.LJLIL);
        } catch (Exception unused) {
            C16880lQ.LIZJ(this.LJLIL, new Intent("android.settings.SETTINGS"));
        }
        int i2 = this.LJLILLLLZI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("scene_id", "1001");
        c188727au.LJIIIZ("trigger_method", C55879LwR.LIZIZ(i2));
        FMX.LJIIL("push_pre_permission_auth", c188727au.LIZ);
    }
}
