package Y;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public class IDCListenerS79S0000000_7 implements DialogInterface.OnClickListener {
    public final int $t;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                dialogInterface.dismiss();
                return;
            case 1:
                dialogInterface.dismiss();
                return;
            default:
                return;
        }
    }

    public IDCListenerS79S0000000_7(int i) {
        this.$t = i;
    }
}
