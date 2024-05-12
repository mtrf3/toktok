package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.HRh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44069HRh implements InterfaceC84870XSo {
    public final /* synthetic */ C44065HRd LIZ;
    public final /* synthetic */ Music LIZIZ;

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        C44065HRd c44065HRd = this.LIZ;
        c44065HRd.LJFF = 99 - c44065HRd.LJIIJJI;
        if (!c44065HRd.LJIILLIIL) {
            C10K.LIZIZ(c44065HRd.LJIJJLI, C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        C44065HRd c44065HRd = this.LIZ;
        c44065HRd.LJFF = (99 - c44065HRd.LJIIJJI) + ((int) (i * c44065HRd.LJIILIIL));
        if (!c44065HRd.LJIILLIIL) {
            C10K.LIZIZ(c44065HRd.LJIJJLI, C10K.LJIIIIZZ, null);
        }
    }

    public C44069HRh(C44065HRd c44065HRd, Music music) {
        this.LIZ = c44065HRd;
        this.LIZIZ = music;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        C44065HRd c44065HRd = this.LIZ;
        new I9R();
        AVMusic LIZ = I9R.LIZ(this.LIZIZ.convertToMusicModel());
        LIZ.path = musicFile;
        c44065HRd.LJIIIIZZ = LIZ;
        this.LIZ.LIZLLL();
    }
}
