package X;

import android.os.CountDownTimer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;

/* loaded from: classes6.dex */
public final class BX6 implements C0K7 {
    public final /* synthetic */ TryModeGoLiveWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public BX6(TryModeGoLiveWidget tryModeGoLiveWidget, String str) {
        this.LJLIL = tryModeGoLiveWidget;
        this.LJLILLLLZI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        this.LJLIL.LJZ(this.LJLILLLLZI, "back");
        liveDialog.dismiss();
        ((CountDownTimer) this.LJLIL.LJLJJLL.getValue()).cancel();
    }
}
