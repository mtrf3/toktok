package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;

/* loaded from: classes14.dex */
public final class TZH implements C0K7 {
    public final /* synthetic */ TZI LJLIL;
    public final /* synthetic */ User LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public TZH(TZI tzi, User user, String str) {
        this.LJLIL = tzi;
        this.LJLILLLLZI = user;
        this.LJLJI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC30442Bx8.d2.LIZ(Boolean.FALSE);
        this.LJLIL.LIZ(2, this.LJLILLLLZI);
        C74824TYe.LIZ.LJIILLIIL(0, 1, this.LJLJI, C74824TYe.LJIILL, "click", false, this.LJLILLLLZI.getId());
    }
}
