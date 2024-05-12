package X;

import Y.ACallableS118S0100000_15;
import Y.ACallableS84S0101000_15;
import Y.ACallableS92S0200000_15;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XTH implements InterfaceC84870XSo {
    public final InterfaceC84870XSo LIZ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        C10K.LIZIZ(new ACallableS118S0100000_15(this, 14), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        C10K.LIZIZ(new ACallableS118S0100000_15(this, 15), C10K.LJIIIIZZ, null);
    }

    public XTH(XTC xtc) {
        this.LIZ = xtc;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        C10K.LIZIZ(new ACallableS92S0200000_15(error, this, 5), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        C10K.LIZIZ(new ACallableS84S0101000_15(this, i, 1), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        C10K.LIZIZ(new XTG(this, musicFile, musicWaveBean, bool), C10K.LJIIIIZZ, null);
    }
}
