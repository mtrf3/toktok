package X;

import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.CollectMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XWg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84966XWg implements XY6 {
    public final /* synthetic */ CollectMusicFragment LJLIL;

    public C84966XWg(CollectMusicFragment collectMusicFragment) {
        this.LJLIL = collectMusicFragment;
    }

    @Override // X.XY6
    public final void C7(XT7 xt7) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLI;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.LLD.LJFF = xt7;
        }
    }

    @Override // X.XY6
    public final void k2(MusicModel musicModel) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLI;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.k2(null);
        }
    }

    @Override // X.XY6
    public final void y8(MusicModel musicModel) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLI;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.y8(musicModel);
        }
    }

    @Override // X.XY6
    public final void t2(XTE xte, MusicModel musicModel) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLIL.LJLLI;
        if (baseNewMusicTabFragment != null) {
            baseNewMusicTabFragment.t2(xte, musicModel);
        }
        if (((Integer) this.LJLIL.LJLJJL.get("music_position", -1)).intValue() == -2) {
            this.LJLIL.LJLJJL.jv0(-1, "music_position");
            this.LJLIL.LJLJJL.jv0(-1, "music_index");
        }
    }
}
