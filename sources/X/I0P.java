package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class I0P implements InterfaceC83524WqG {
    public final /* synthetic */ I0N LIZ;
    public final /* synthetic */ C46193IAz LIZIZ;

    @Override // X.InterfaceC83524WqG
    public final void LIZ() {
    }

    @Override // X.InterfaceC83524WqG
    public final void LIZIZ() {
        Effect effect;
        TEZ LLLLL;
        I0N i0n = this.LIZ;
        if (i0n != null && (LLLLL = i0n.LLLLL()) != null) {
            effect = LLLLL.LLJJIJIIJIL();
        } else {
            effect = null;
        }
        if (V3N.LJJI(effect)) {
            I0N i0n2 = this.LIZ;
            if (i0n2 != null && i0n2.Q30()) {
                I0N i0n3 = this.LIZ;
                if (i0n3 != null) {
                    i0n3.cp();
                    return;
                }
                return;
            }
            this.LIZIZ.getCameraApiComponent().e8().LLZ();
            return;
        }
        I8E LLLLLLIL = this.LIZIZ.LLLLLLIL();
        if (LLLLLLIL == null) {
            return;
        }
        LLLLLLIL.Ps0(null);
    }

    public I0P(I0N i0n, C46193IAz c46193IAz) {
        this.LIZ = i0n;
        this.LIZIZ = c46193IAz;
    }
}
