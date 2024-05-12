package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;

/* loaded from: classes8.dex */
public final class IBS implements InterfaceC83518WqA {
    public final /* synthetic */ C46193IAz LIZ;

    public IBS(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.InterfaceC83518WqA
    public final boolean LIZ(Effect effect) {
        return DiyPropParser.LIZ(effect);
    }

    @Override // X.InterfaceC83518WqA
    public final void LIZIZ(String str) {
        this.LIZ.W90(false, "");
    }
}
