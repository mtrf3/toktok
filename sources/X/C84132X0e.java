package X;

import Y.ARunnableS33S0200000_14;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.X0e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84132X0e implements TI3 {
    public final /* synthetic */ C46193IAz LIZ;

    public C84132X0e(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.TI3
    public final void LLJJLIIIJLLLLLLLZ(Effect effect) {
        if (effect != null) {
            effect.setDownloaded(false);
        }
        C46193IAz c46193IAz = this.LIZ;
        c46193IAz.LJLIL.runOnUiThread(new ARunnableS33S0200000_14(effect, c46193IAz, 50));
    }

    @Override // X.TI3
    public final void LLJL(Effect effect) {
        if (effect != null) {
            effect.setDownloaded(false);
        }
        C46193IAz c46193IAz = this.LIZ;
        c46193IAz.LJLIL.runOnUiThread(new ARunnableS33S0200000_14(effect, c46193IAz, 52));
    }

    @Override // X.TI3
    public final void LLJLIL(Effect effect) {
        if (effect != null) {
            effect.setDownloaded(true);
        }
        C46193IAz c46193IAz = this.LIZ;
        c46193IAz.LJLIL.runOnUiThread(new ARunnableS33S0200000_14(effect, c46193IAz, 51));
    }
}
