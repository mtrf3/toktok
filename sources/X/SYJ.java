package X;

import com.ss.android.ugc.aweme.music.assem.MusicStatusAssem;

/* loaded from: classes13.dex */
public final class SYJ implements InterfaceC73307Spr {
    public final /* synthetic */ MusicStatusAssem LIZ;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        this.LIZ.M3().LIZJ();
        this.LIZ.M3().setVisibility(8);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        this.LIZ.M3().LIZIZ();
        this.LIZ.M3().setVisibility(0);
    }

    public SYJ(MusicStatusAssem musicStatusAssem) {
        this.LIZ = musicStatusAssem;
    }
}
