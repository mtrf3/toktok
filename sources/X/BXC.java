package X;

import android.app.Activity;
import com.bytedance.android.live.design.app.LiveDialog;

/* loaded from: classes6.dex */
public final class BXC implements C0K7 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<String, String, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJL;

    public BXC(String str, Activity activity, String str2, BXE bxe, BXF bxf) {
        this.LJLIL = str;
        this.LJLILLLLZI = activity;
        this.LJLJI = str2;
        this.LJLJJI = bxe;
        this.LJLJJL = bxf;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        String str = this.LJLIL;
        BZI LIZ = C28787BRn.LIZ("livesdk_add_birth_popup_window_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(str, "request_page");
        LIZ.LJIJJ("add", "click_type");
        LIZ.LJJIIJZLJL();
        C7N.LJIIJJI().goEditDoBAgeGatePage(this.LJLILLLLZI, this.LJLJI, new BXI(this.LJLJJL, this.LJLJJI));
    }
}
