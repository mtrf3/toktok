package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I1B implements InterfaceC84897XTp {
    public final /* synthetic */ I1C LIZ;
    public final /* synthetic */ I15 LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
        this.LIZIZ.LJIILLIIL(i, "music");
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZ.LJFF(this.LIZJ, musicFile);
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        this.LIZ.LJII();
    }

    public I1B(I1C i1c, I15 i15, AVMusic aVMusic) {
        this.LIZ = i1c;
        this.LIZIZ = i15;
        this.LIZJ = aVMusic;
    }
}
