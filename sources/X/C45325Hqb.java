package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.Hqb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45325Hqb implements InterfaceC84870XSo {
    public final /* synthetic */ InterfaceC67352kd<C3C5<? extends MusicModel>> LIZ;
    public final /* synthetic */ MusicModel LIZIZ;

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        InterfaceC67352kd<C3C5<? extends MusicModel>> interfaceC67352kd = this.LIZ;
        MusicModel musicModel = this.LIZIZ;
        C3C5.m7constructorimpl(musicModel);
        C3C5 m6boximpl = C3C5.m6boximpl(musicModel);
        C3C5.m7constructorimpl(m6boximpl);
        interfaceC67352kd.resumeWith(m6boximpl);
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        InterfaceC67352kd<C3C5<? extends MusicModel>> interfaceC67352kd = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(error);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    public C45325Hqb(C84654XKg c84654XKg, MusicModel musicModel) {
        this.LIZ = c84654XKg;
        this.LIZIZ = musicModel;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        InterfaceC67352kd<C3C5<? extends MusicModel>> interfaceC67352kd = this.LIZ;
        MusicModel musicModel = this.LIZIZ;
        musicModel.setLocalPath(musicFile);
        C3C5.m7constructorimpl(musicModel);
        C3C5 m6boximpl = C3C5.m6boximpl(musicModel);
        C3C5.m7constructorimpl(m6boximpl);
        interfaceC67352kd.resumeWith(m6boximpl);
    }
}
