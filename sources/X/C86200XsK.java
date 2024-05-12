package X;

import Y.IDCListenerS289S0100000_15;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* renamed from: X.XsK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86200XsK {
    public DialogC25756A8y LIZ;
    public WeakReference<InterfaceC86201XsL> LIZIZ;

    public static void LIZ(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "4821916703011834")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    public final void LIZIZ() {
        DialogC25756A8y dialogC25756A8y = this.LIZ;
        if (dialogC25756A8y == null) {
            return;
        }
        dialogC25756A8y.dismiss();
        this.LIZ = null;
        WeakReference<InterfaceC86201XsL> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.clear();
            this.LIZIZ = null;
        }
    }

    public final void LIZJ(Context context) {
        DialogC25756A8y dialogC25756A8y = this.LIZ;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            return;
        }
        DialogC25756A8y dialogC25756A8y2 = new DialogC25756A8y(context);
        this.LIZ = dialogC25756A8y2;
        dialogC25756A8y2.LIZIZ(R.string.thp);
        LIZ(this.LIZ);
    }

    public final void LIZLLL(Context context, InterfaceC86201XsL interfaceC86201XsL) {
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
        this.LIZ = dialogC25756A8y;
        dialogC25756A8y.LIZIZ(R.string.thp);
        this.LIZIZ = new WeakReference<>(interfaceC86201XsL);
        this.LIZ.setOnCancelListener(new IDCListenerS289S0100000_15(this, 1));
        LIZ(this.LIZ);
    }
}
