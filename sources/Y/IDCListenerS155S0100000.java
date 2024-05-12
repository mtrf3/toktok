package Y;

import X.C40210FqI;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.android.live.broadcast.dialog.GameMessageAlertDialog;

/* loaded from: classes.dex */
public class IDCListenerS155S0100000 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS155S0100000(GameMessageAlertDialog gameMessageAlertDialog, int i) {
        this.$t = i;
        this.l0 = gameMessageAlertDialog;
    }

    public static final void onClick$0(IDCListenerS155S0100000 iDCListenerS155S0100000, DialogInterface dialogInterface, int i) {
        Context context = ((GameMessageAlertDialog) iDCListenerS155S0100000.l0).getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            C40210FqI.LJII(context, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
        } else {
            C40210FqI.LJI(context);
        }
        dialogInterface.dismiss();
    }

    public static final void onClick$1(IDCListenerS155S0100000 iDCListenerS155S0100000, DialogInterface dialogInterface, int i) {
        ((GameMessageAlertDialog) iDCListenerS155S0100000.l0).getClass();
        dialogInterface.dismiss();
    }
}
