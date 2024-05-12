package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import kotlin.jvm.internal.o;

/* renamed from: X.UHz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC76951UHz implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ android.net.Uri LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ UI8 LJLJJI;

    public DialogInterfaceOnClickListenerC76951UHz(Context context, android.net.Uri uri, int i, UI8 ui8) {
        this.LJLIL = context;
        this.LJLILLLLZI = uri;
        this.LJLJI = i;
        this.LJLJJI = ui8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLIL, this.LJLILLLLZI);
        C77541Ubx.LJIILL(this.LJLJI, this.LJLJJI, true, false);
        UI3 ui3 = this.LJLJJI.LJIIJ;
        if (ui3 != null) {
            ui3.LIZ();
        }
        dialog.dismiss();
    }
}
