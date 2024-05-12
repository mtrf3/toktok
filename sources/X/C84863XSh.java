package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.XSh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84863XSh implements InterfaceC84870XSo {
    public final /* synthetic */ InterfaceC84870XSo LIZ;
    public final /* synthetic */ C68322mC<InterfaceC84872XSq> LIZIZ;

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
        this.LIZ.LIZ(error);
        this.LIZIZ.element.LIZIZ();
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        this.LIZ.onProgress(i);
    }

    public C84863XSh(InterfaceC84870XSo interfaceC84870XSo, C68322mC<InterfaceC84872XSq> c68322mC) {
        this.LIZ = interfaceC84870XSo;
        this.LIZIZ = c68322mC;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZ.LIZIZ(musicFile, musicWaveBean, bool);
        this.LIZIZ.element.LIZ();
    }
}
