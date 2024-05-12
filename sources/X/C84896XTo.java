package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.XTo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84896XTo implements InterfaceC84870XSo {
    public final /* synthetic */ InterfaceC84897XTp LIZ;
    public final /* synthetic */ AVMusic LIZIZ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        this.LIZ.onStart();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "draft_page");
        c145995oB.LJI("music_id", this.LIZIZ.getMusicId());
        FMX.LJIIL("download_music", c145995oB.LIZ);
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        this.LIZ.LIZIZ(Integer.valueOf(error.getErrorCode()), error.getErrorMsg());
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        this.LIZ.onProgress(i);
    }

    public C84896XTo(InterfaceC84897XTp interfaceC84897XTp, AVMusic aVMusic) {
        this.LIZ = interfaceC84897XTp;
        this.LIZIZ = aVMusic;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZ.LIZ(musicFile, musicWaveBean);
    }
}
