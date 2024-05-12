package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: X.XSk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84866XSk implements InterfaceC84273X5p {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C84859XSd LIZJ;

    @Override // X.InterfaceC84273X5p
    public final void onCancel() {
    }

    @Override // X.InterfaceC84273X5p
    public final void onStart() {
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZIZ(XAL xal) {
        C84859XSd c84859XSd = this.LIZJ;
        XTR xtr = c84859XSd.LIZJ;
        if (xtr != null) {
            xtr.dismiss();
            c84859XSd.LIZJ = null;
        }
        InterfaceC84871XSp interfaceC84871XSp = this.LIZJ.LIZ;
        if (interfaceC84871XSp == null || !interfaceC84871XSp.LJJIIZI() || this.LIZJ.LIZ.LJJIZ() == null) {
            return;
        }
        this.LIZJ.LIZ.LJJJJIZL(this.LIZ, xal);
    }

    @Override // X.InterfaceC84273X5p
    public final void onProgress(int i) {
        XTR xtr;
        InterfaceC84871XSp interfaceC84871XSp = this.LIZJ.LIZ;
        if (interfaceC84871XSp == null || !interfaceC84871XSp.LJJIIZI() || this.LIZJ.LIZ.LJJIZ() == null || (xtr = this.LIZJ.LIZJ) == null) {
            return;
        }
        xtr.setProgress(i);
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZ(String str, MusicWaveBean musicWaveBean) {
        this.LIZ.setMusicWaveBean(musicWaveBean);
        this.LIZJ.LJ(this.LIZ, str, this.LIZIZ);
    }

    public C84866XSk(C84859XSd c84859XSd, MusicModel musicModel, String str) {
        this.LIZJ = c84859XSd;
        this.LIZ = musicModel;
        this.LIZIZ = str;
    }
}
