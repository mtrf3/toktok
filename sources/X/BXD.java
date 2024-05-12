package X;

import com.bytedance.android.live.design.app.LiveDialog;

/* loaded from: classes6.dex */
public final class BXD implements C0K7 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    public BXD(String str, BXH bxh) {
        this.LJLIL = str;
        this.LJLILLLLZI = bxh;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        String str = this.LJLIL;
        BZI LIZ = C28787BRn.LIZ("livesdk_add_birth_popup_window_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(str, "request_page");
        LIZ.LJIJJ("cancel", "click_type");
        LIZ.LJJIIJZLJL();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
