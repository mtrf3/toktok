package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.XSj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84865XSj implements InterfaceC84870XSo {
    public final /* synthetic */ InterfaceC84870XSo LIZ;
    public final /* synthetic */ C84860XSe LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;
    public final /* synthetic */ boolean LIZLLL = true;
    public final /* synthetic */ boolean LJ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        this.LIZ.onCancel();
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        this.LIZ.onStart();
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        H7B.LIZ("SimPlayerMusicFetcher: download failed, use backupMusicFetcher");
        this.LIZIZ.LJ.LIZJ(this.LIZJ, this.LIZ, this.LIZLLL, this.LJ);
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        this.LIZ.onProgress(i);
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZ.LIZIZ(musicFile, musicWaveBean, bool);
    }

    public C84865XSj(XU9 xu9, C84860XSe c84860XSe, MusicModel musicModel, boolean z) {
        this.LIZ = xu9;
        this.LIZIZ = c84860XSe;
        this.LIZJ = musicModel;
        this.LJ = z;
    }
}
