package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZ7 implements InterfaceC84885XTd {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ VerticalMusicView LIZIZ;

    @Override // X.InterfaceC84885XTd
    public final void LIZ(boolean z) {
        if (z) {
            this.LIZ.setCollectionType(MusicModel.CollectionType.COLLECTED);
            this.LIZIZ.LJJI(this.LIZ.getMusicId(), true);
            XZH xzh = this.LIZIZ.LJLJL;
            if (xzh != null) {
                C5S1 c5s1 = new C5S1(xzh.LIZLLL);
                c5s1.LIZJ(R.string.dgq);
                c5s1.LJ();
            } else {
                o.LJIJI("params");
                throw null;
            }
        } else {
            XZH xzh2 = this.LIZIZ.LJLJL;
            if (xzh2 != null) {
                C5S1 c5s12 = new C5S1(xzh2.LIZLLL);
                c5s12.LIZJ(R.string.dgl);
                c5s12.LJ();
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        this.LIZIZ.LJJIL();
    }

    @Override // X.InterfaceC84885XTd
    public final void LIZIZ(boolean z) {
        if (z) {
            this.LIZ.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
            this.LIZIZ.LJJI(this.LIZ.getMusicId(), false);
            XZH xzh = this.LIZIZ.LJLJL;
            if (xzh != null) {
                C5S1 c5s1 = new C5S1(xzh.LIZLLL);
                c5s1.LIZJ(R.string.cge);
                c5s1.LJ();
            } else {
                o.LJIJI("params");
                throw null;
            }
        } else {
            XZH xzh2 = this.LIZIZ.LJLJL;
            if (xzh2 != null) {
                C5S1 c5s12 = new C5S1(xzh2.LIZLLL);
                c5s12.LIZJ(R.string.cgd);
                c5s12.LJ();
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        this.LIZIZ.LJJIL();
    }

    public XZ7(MusicModel musicModel, VerticalMusicView verticalMusicView) {
        this.LIZ = musicModel;
        this.LIZIZ = verticalMusicView;
    }
}
