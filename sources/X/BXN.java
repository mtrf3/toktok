package X;

import android.app.Activity;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;

/* loaded from: classes6.dex */
public final class BXN implements C0K7 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ InterfaceC05250In LJLJJI;

    public BXN(Activity activity, String str, String str2, C29239Bdj c29239Bdj) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = activity;
        this.LJLJJI = c29239Bdj;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        BXP.LIZIZ(this.LJLIL, this.LJLILLLLZI, "add");
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        Activity activity = this.LJLJI;
        String str = this.LJLILLLLZI;
        iHostAction.goEditDoBAgeGatePage(activity, str, new BXG(this.LJLJJI, this.LJLIL, str));
        BZI LIZ = C28787BRn.LIZ("livesdk_age_edit_page_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LJLIL, "user_type");
        C0JT.LIZJ(LIZ, this.LJLILLLLZI, "request_page", 1, "user_age_status");
    }
}
