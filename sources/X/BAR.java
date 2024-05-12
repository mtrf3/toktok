package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes6.dex */
public final class BAR implements C0K7 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Runnable LJLJI;

    public BAR(Runnable runnable, String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = runnable;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        BZI LIZ = C28787BRn.LIZ("livesdk_mature_theme_popup_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LJLIL, "enter_from");
        LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "action_type");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(this.LJLILLLLZI, "source");
        LIZ.LJJIIJZLJL();
        Runnable runnable = this.LJLJI;
        if (runnable != null) {
            runnable.run();
        }
    }
}
