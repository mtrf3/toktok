package X;

import com.bytedance.android.live.design.app.LiveDialog;

/* loaded from: classes6.dex */
public final class BXO implements C0K7 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC05250In LJLJI;

    public BXO(C29239Bdj c29239Bdj, String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = c29239Bdj;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        BXP.LIZIZ(this.LJLIL, this.LJLILLLLZI, "cancel");
        this.LJLJI.LJI();
    }
}
