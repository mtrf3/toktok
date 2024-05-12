package Y;

import X.C74751TVj;
import android.content.DialogInterface;

/* loaded from: classes14.dex */
public class IDCListenerS80S0000000_13 implements DialogInterface.OnClickListener {
    public final int $t;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                C74751TVj.LIZIZ("voice", "click", "cancel");
                return;
            case 1:
                dialogInterface.dismiss();
                return;
            case 2:
                dialogInterface.cancel();
                return;
            default:
                return;
        }
    }

    public IDCListenerS80S0000000_13(int i) {
        this.$t = i;
    }
}
