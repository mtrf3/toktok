package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.Wf6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82832Wf6 implements InterfaceC84897XTp {
    public final /* synthetic */ C82823Wex LIZ;

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        c82823Wex.LJII = true;
        I27 i27 = c82823Wex.LJ;
        if (i27 != null) {
            i27.setUiLoadingMusic(true);
        }
    }

    public C82832Wf6(C82823Wex c82823Wex) {
        this.LIZ = c82823Wex;
    }

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        c82823Wex.LJII = true;
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        I19 i19 = c82823Wex.LJIIJ;
        i19.LIZJ = musicFile;
        AVMusic aVMusic = i19.LIZIZ;
        if (aVMusic != null) {
            c82823Wex.LIZ(aVMusic, musicFile);
        }
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        c82823Wex.LJII = false;
    }
}
