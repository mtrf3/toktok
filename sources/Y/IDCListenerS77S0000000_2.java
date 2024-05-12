package Y;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public class IDCListenerS77S0000000_2 implements DialogInterface.OnClickListener {
    public final int $t;

    public static final void onClick$0(IDCListenerS77S0000000_2 iDCListenerS77S0000000_2, DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                dialogInterface.dismiss();
                return;
            default:
                return;
        }
    }

    public IDCListenerS77S0000000_2(int i) {
        this.$t = i;
    }
}
