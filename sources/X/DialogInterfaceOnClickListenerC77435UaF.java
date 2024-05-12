package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* renamed from: X.UaF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC77435UaF implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Intent LJLJI;

    public DialogInterfaceOnClickListenerC77435UaF(Activity activity, Intent intent, String str) {
        this.LJLIL = activity;
        this.LJLILLLLZI = str;
        this.LJLJI = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.LJLIL.finish();
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "//launcher/shortcut_proxy");
        buildRoute.withParam("type", this.LJLILLLLZI);
        buildRoute.withParam("open_url", C16880lQ.LLJJIJIIJIL(this.LJLJI, "open_url"));
        buildRoute.withParam("from_live_block_dialog", true);
        buildRoute.open();
    }
}
