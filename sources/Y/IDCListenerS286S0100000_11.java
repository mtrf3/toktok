package Y;

import X.InterfaceC65784Pro;
import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDCListenerS286S0100000_11 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS286S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS286S0100000_11 iDCListenerS286S0100000_11, DialogInterface dialogInterface) {
        WebDialog this$0 = (WebDialog) iDCListenerS286S0100000_11.l0;
        o.LJIIIZ(this$0, "this$0");
        this$0.cancel();
    }

    public static final void onCancel$1(IDCListenerS286S0100000_11 iDCListenerS286S0100000_11, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDCListenerS286S0100000_11.l0).invoke();
    }

    public static final void onCancel$2(IDCListenerS286S0100000_11 iDCListenerS286S0100000_11, DialogInterface dialogInterface) {
        ((Activity) iDCListenerS286S0100000_11.l0).finish();
    }
}
