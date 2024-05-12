package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;

/* loaded from: classes6.dex */
public final class BX8 implements C0K7 {
    public final /* synthetic */ TryModeGoLiveWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public BX8(TryModeGoLiveWidget tryModeGoLiveWidget, String str) {
        this.LJLIL = tryModeGoLiveWidget;
        this.LJLILLLLZI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        this.LJLIL.LJZ(this.LJLILLLLZI, "go_live");
        liveDialog.dismiss();
        this.LJLIL.LJZL();
    }
}
