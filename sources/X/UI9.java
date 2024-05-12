package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UI9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ UI8 LJLJI;
    public final /* synthetic */ String LJLJJI = "other";
    public final /* synthetic */ String LJLJJL = "risk";

    public UI9(Context context, C68322mC c68322mC, UI8 ui8) {
        this.LJLIL = context;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = ui8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLIL, this.LJLILLLLZI.element);
        UI8 ui8 = this.LJLJI;
        C77541Ubx.LJIIJ(ui8.LJI, this.LJLJJI, this.LJLJJL, ui8.LJFF);
        dialog.dismiss();
    }
}
