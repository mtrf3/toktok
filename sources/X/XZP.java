package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.AqS41S0301000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZP implements J9J {
    public final /* synthetic */ VerticalMusicView LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;
    public final /* synthetic */ XW2 LIZLLL;

    @Override // X.J9J
    public final void LIZ() {
    }

    @Override // X.J9J
    public final void LIZIZ() {
    }

    @Override // X.J9J
    public final void LJ() {
    }

    @Override // X.J9J
    public final void onStart() {
    }

    @Override // X.J9J
    public final void LIZLLL() {
        C43045Guv.LIZLLL(new AqS41S0301000_15(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LIZ, 2), 0L);
    }

    @Override // X.J9J
    public final void onError() {
        VerticalMusicView verticalMusicView = this.LIZ;
        XW2 xw2 = this.LIZLLL;
        C43045Guv.LIZLLL(new AqS41S0301000_15(this.LIZIZ, this.LIZJ, xw2, verticalMusicView, 1), 0L);
    }

    @Override // X.J9J
    public final void LIZJ(String str) {
        if (!o.LJ(this.LIZ.LLJL, str)) {
            this.LIZ.LLJL = str;
            C43045Guv.LIZLLL(new AqS41S0301000_15(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LIZ, 0), 0L);
        }
    }

    public XZP(int i, MusicModel musicModel, XW2 xw2, VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
        this.LIZIZ = i;
        this.LIZJ = musicModel;
        this.LIZLLL = xw2;
    }
}
