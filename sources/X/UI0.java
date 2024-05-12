package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UI0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ UI8 LJLILLLLZI;

    public UI0(int i, UI8 ui8) {
        this.LJLIL = i;
        this.LJLILLLLZI = ui8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        C77541Ubx.LJIILL(this.LJLIL, this.LJLILLLLZI, false, false);
        UI3 ui3 = this.LJLILLLLZI.LJIIJ;
        if (ui3 != null) {
            ui3.LIZIZ();
        }
        dialog.dismiss();
    }
}
