package X;

import com.bytedance.android.live.design.app.LiveDialog;

/* loaded from: classes6.dex */
public final class CHC implements C0K7 {
    public final /* synthetic */ String LJLIL;

    public CHC(String str) {
        this.LJLIL = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        CHD.LIZ(this.LJLIL, "dismiss");
        CLG.LIZJ("dismiss", "gifting", null);
    }
}
