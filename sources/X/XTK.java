package X;

import Y.ACallableS118S0100000_15;
import Y.ACallableS40S1200000_15;
import Y.ACallableS84S0101000_15;
import Y.ACallableS92S0200000_15;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XTK implements InterfaceC84273X5p {
    public final InterfaceC84273X5p LIZ;

    @Override // X.InterfaceC84273X5p
    public final void onCancel() {
        C10K.LIZIZ(new ACallableS118S0100000_15(this, 12), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC84273X5p
    public final void onStart() {
        C10K.LIZIZ(new ACallableS118S0100000_15(this, 13), C10K.LJIIIIZZ, null);
    }

    public XTK(XST xst) {
        this.LIZ = xst;
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZIZ(XAL error) {
        o.LJIIIZ(error, "error");
        C10K.LIZIZ(new ACallableS92S0200000_15(error, this, 2), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC84273X5p
    public final void onProgress(int i) {
        C10K.LIZIZ(new ACallableS84S0101000_15(this, i, 0), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        C10K.LIZIZ(new ACallableS40S1200000_15(this, musicFile, musicWaveBean, 1), C10K.LJIIIIZZ, null);
    }
}
