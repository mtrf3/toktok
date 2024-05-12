package Y;

import X.C61419O8p;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;

/* loaded from: classes11.dex */
public class IDCListenerS285S0100000_10 implements DialogInterface.OnCancelListener {
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
            default:
                return;
        }
    }

    public IDCListenerS285S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS285S0100000_10 iDCListenerS285S0100000_10, DialogInterface dialogInterface) {
        ((I18nAuthorizeFragment) iDCListenerS285S0100000_10.l0).LJLLLL = true;
    }

    public static final void onCancel$1(IDCListenerS285S0100000_10 iDCListenerS285S0100000_10, DialogInterface dialogInterface) {
        ((C61419O8p) iDCListenerS285S0100000_10.l0).LJLJL = false;
    }
}
