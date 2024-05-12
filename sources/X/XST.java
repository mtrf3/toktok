package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XST implements InterfaceC84273X5p {
    public final /* synthetic */ InterfaceC84273X5p LIZ;
    public final /* synthetic */ C68322mC<XSU> LIZIZ;

    @Override // X.InterfaceC84273X5p
    public final void onCancel() {
        this.LIZ.onCancel();
    }

    @Override // X.InterfaceC84273X5p
    public final void onStart() {
        this.LIZ.onStart();
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZIZ(XAL error) {
        o.LJIIIZ(error, "error");
        this.LIZ.LIZIZ(error);
        this.LIZIZ.element.LIZIZ();
    }

    @Override // X.InterfaceC84273X5p
    public final void onProgress(int i) {
        this.LIZ.onProgress(i);
    }

    public XST(C84866XSk c84866XSk, C68322mC c68322mC) {
        this.LIZ = c84866XSk;
        this.LIZIZ = c68322mC;
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZ.LIZ(musicFile, musicWaveBean);
        this.LIZIZ.element.LIZ();
    }
}
