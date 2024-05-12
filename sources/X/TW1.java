package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;

/* loaded from: classes14.dex */
public final class TW1 implements C0K7 {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ GameLinkWidget LJLILLLLZI;

    public TW1(int i, GameLinkWidget gameLinkWidget) {
        this.LJLIL = i;
        this.LJLILLLLZI = gameLinkWidget;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        C78983UzD.LJJJJLL(this.LJLIL, "appeal");
        this.LJLILLLLZI.gotoAppealPage();
    }
}
