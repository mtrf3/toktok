package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UI7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ android.net.Uri LJLILLLLZI;
    public final /* synthetic */ UI8 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public UI7(Context context, android.net.Uri uri, UI8 ui8, int i, String str, String str2) {
        this.LJLIL = context;
        this.LJLILLLLZI = uri;
        this.LJLJI = ui8;
        this.LJLJJI = i;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLIL, this.LJLILLLLZI);
        UI8 ui8 = this.LJLJI;
        if (ui8.LJII) {
            C77541Ubx.LJIIIZ(ui8.LJIIIIZZ, ui8.LJFF, this.LJLJJI, "contact_us");
        } else {
            C77541Ubx.LJIIJ(ui8.LJI, this.LJLJJL, this.LJLJJLL, ui8.LJFF);
        }
        if (this.LJLJJI == 4005209) {
            CLG.LIZJ("contact_us", "recharge", "room_recharge");
        }
        dialog.dismiss();
    }
}
