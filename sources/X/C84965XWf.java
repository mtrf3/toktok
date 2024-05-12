package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.CollectMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XWf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84965XWf implements XY4 {
    public final /* synthetic */ CollectMusicFragment LJLIL;

    public C84965XWf(CollectMusicFragment collectMusicFragment) {
        this.LJLIL = collectMusicFragment;
    }

    @Override // X.XY4
    public final void k2(MusicModel musicModel) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLLL;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.k2(musicModel);
        }
    }

    @Override // X.XY4
    public final void y8(MusicModel musicModel) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLLL;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.y8(musicModel);
        }
    }

    @Override // X.XY4
    public final void za0(XUP xup) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLLL;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.LLI.LJLJJLL = xup;
        }
    }

    @Override // X.XY4
    public final void oj0(MusicModel musicModel, XVG xvg) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLLL;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.oj0(musicModel, xvg);
        }
        if (((Integer) this.LJLIL.LJLJJLL.get("music_position", -1)).intValue() == -2) {
            this.LJLIL.LJLJJLL.jv0(-1, "music_position");
            this.LJLIL.LJLJJLL.jv0(-1, "music_index");
        }
    }
}
