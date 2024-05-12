package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;

/* loaded from: classes16.dex */
public final class XZR implements JJ4 {
    public final /* synthetic */ VerticalMusicView LIZ;
    public final /* synthetic */ XZC LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;

    public XZR(VerticalMusicView verticalMusicView, XZC xzc, MusicModel musicModel) {
        this.LIZ = verticalMusicView;
        this.LIZIZ = xzc;
        this.LIZJ = musicModel;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        this.LIZ.LJJII(this.LIZIZ, this.LIZJ);
    }
}
