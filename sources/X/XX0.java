package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes16.dex */
public final class XX0 implements XUL {
    public final /* synthetic */ BaseMusicListFragment LIZ;

    @Override // X.XUL
    public final void LIZ() {
        BaseMusicListFragment baseMusicListFragment = this.LIZ;
        MusicModel musicModel = baseMusicListFragment.LJLJI;
        if (musicModel != null) {
            baseMusicListFragment.LJLJJLL.jv0(musicModel.getMusicId(), "play_error");
        }
    }

    @Override // X.XUL
    public final void LIZIZ() {
        BaseMusicListFragment baseMusicListFragment = this.LIZ;
        MusicModel musicModel = baseMusicListFragment.LJLJI;
        if (musicModel != null) {
            baseMusicListFragment.LJLJJLL.jv0(musicModel.getMusicId(), "play_compeleted");
        }
    }

    public XX0(BaseMusicListFragment baseMusicListFragment) {
        this.LIZ = baseMusicListFragment;
    }
}
