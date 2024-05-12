package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IB0 implements InterfaceC79068V1k {
    public final /* synthetic */ C46193IAz LIZ;

    @Override // X.InterfaceC79068V1k
    public final boolean LIZIZ() {
        return this.LIZ.LLLFFI();
    }

    @Override // X.InterfaceC79068V1k
    public final boolean LIZJ() {
        return this.LIZ.LLIIJLIL.LJJIJIL();
    }

    @Override // X.InterfaceC79068V1k
    public final boolean LIZLLL() {
        if (this.LIZ.LLIIJLIL.LJIIIIZZ() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79068V1k
    public final void LJ() {
        if (this.LIZ.LLIIJLIL.LJJIJIL()) {
            C46193IAz c46193IAz = this.LIZ;
            c46193IAz.LJLJJL.J9(this.LIZ.LLIIJLIL.cameraComponentModel.LJI(), this.LIZ.LLIIJLIL.LJIIIIZZ(), c46193IAz.LLIIJLIL.getMusicPath(), false);
        }
    }

    @Override // X.InterfaceC79068V1k
    public final boolean LJFF() {
        ShortVideoContext shortVideoContext = this.LIZ.LLIIJLIL;
        if (shortVideoContext.creativeModel.micDataModel.recordOriginalSoundWithBGM || V16.LJJIJIL(shortVideoContext)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79068V1k
    public final void LJI() {
        this.LIZ.n(C82636Wbw.LJFF, C82636Wbw.LJ);
    }

    @Override // X.InterfaceC79068V1k
    public final void LJII() {
        this.LIZ.LJLJJL.getAudioController().LJ();
        if (this.LIZ.LJLJJL.getAudioController().isInited()) {
            this.LIZ.getCameraApiComponent().Bc().LIZLLL(C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_RELEASE_MIC, EnumC158826Le.USER_OPERATION));
            this.LIZ.getCameraApiComponent().Bc().LIZJ();
        }
    }

    @Override // X.InterfaceC79068V1k
    public final boolean LJIIIZ() {
        this.LIZ.LJLJJL.getAudioController().LJ();
        return false;
    }

    @Override // X.InterfaceC79068V1k
    public final void LJIIJ() {
        this.LIZ.LJLJJL.J9(0L, 0L, "", false);
    }

    @Override // X.InterfaceC79068V1k
    public final void LLZ() {
        this.LIZ.LJLJJL.LLZ();
        AudioGraphStickerHandler.LJLJLJ.getClass();
        AudioGraphStickerHandler.LJLJL = false;
    }

    @Override // X.InterfaceC79068V1k
    public final void LLZIL() {
        this.LIZ.LJLJJL.LLZIL();
        AudioGraphStickerHandler.LJLJLJ.getClass();
        AudioGraphStickerHandler.LJLJL = true;
    }

    @Override // X.InterfaceC79068V1k
    public final void init() {
        this.LIZ.LJLJJL.setUseAudioGraph(true);
        this.LIZ.LLLFZ.LJII(Boolean.TRUE);
    }

    @Override // X.InterfaceC79068V1k
    public final void release() {
        this.LIZ.LJLJJL.setUseAudioGraph(false);
        LJII();
        this.LIZ.LLLFZ.LJII(Boolean.FALSE);
    }

    public IB0(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.InterfaceC79068V1k
    public final void LJIIIIZZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ.LLFII.LJII(effect);
    }

    @Override // X.InterfaceC79068V1k
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("audiograph useAudioGraphOutput ");
        LIZ.append(z);
        LIZ.append(' ');
        LIZ.append(z2);
        LIZ.append(' ');
        LIZ.append(z3);
        LIZ.append(' ');
        LIZ.append(z4);
        H78.LJI(X1D.LIZIZ(LIZ));
        this.LIZ.LJLJJL.getAudioController().LIZ(z, z2, z3, z4);
    }
}
