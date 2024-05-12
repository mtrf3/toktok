package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UIA implements DialogInterface.OnClickListener {
    public final /* synthetic */ UI8 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public UIA(int i, UI8 ui8) {
        this.LJLIL = ui8;
        this.LJLILLLLZI = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        UI8 ui8 = this.LJLIL;
        if (ui8.LJII) {
            C77541Ubx.LJIIIZ(ui8.LJIIIIZZ, ui8.LJFF, this.LJLILLLLZI, "dismiss");
        }
        if (this.LJLILLLLZI == 4005209) {
            CLG.LIZJ("dismiss", "recharge", "room_recharge");
        }
        dialog.dismiss();
    }
}
