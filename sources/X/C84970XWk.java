package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.ForYouMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XWk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84970XWk implements XY4 {
    public final /* synthetic */ ForYouMusicFragment LJLIL;

    public C84970XWk(ForYouMusicFragment forYouMusicFragment) {
        this.LJLIL = forYouMusicFragment;
    }

    @Override // X.XY4
    public final void k2(MusicModel musicModel) {
        XY4 xy4 = this.LJLIL.LJLLL;
        if (xy4 != null) {
            xy4.k2(musicModel);
        }
    }

    @Override // X.XY4
    public final void y8(MusicModel musicModel) {
        XY4 xy4 = this.LJLIL.LJLLL;
        if (xy4 != null) {
            xy4.y8(musicModel);
        }
    }

    @Override // X.XY4
    public final void za0(XUP xup) {
        XY4 xy4 = this.LJLIL.LJLLL;
        if (xy4 != null) {
            xy4.za0(xup);
        }
    }

    @Override // X.XY4
    public final void oj0(MusicModel musicModel, XVG xvg) {
        XY4 xy4 = this.LJLIL.LJLLL;
        if (xy4 != null) {
            xy4.oj0(musicModel, xvg);
        }
        Integer num = (Integer) this.LJLIL.LJLJJLL.get("music_position", -1);
        if (num == null || num.intValue() != -2) {
            return;
        }
        this.LJLIL.LJLJJLL.jv0(-1, "music_position");
        this.LJLIL.LJLJJLL.jv0(-1, "music_index");
    }
}
