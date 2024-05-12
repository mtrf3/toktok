package X;

import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XWs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84978XWs implements XT6 {
    public final /* synthetic */ BaseNewMusicTabFragment LIZ;

    @Override // X.XT6
    public final void LIZ() {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LIZ;
        MusicModel musicModel = baseNewMusicTabFragment.LJZ;
        if (musicModel != null) {
            baseNewMusicTabFragment.LJLJL.jv0(musicModel.getMusicId(), "play_error");
        }
    }

    @Override // X.XT6
    public final void LIZIZ() {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LIZ;
        MusicModel musicModel = baseNewMusicTabFragment.LJZ;
        if (musicModel != null) {
            baseNewMusicTabFragment.LJLJL.jv0(musicModel.getMusicId(), "play_compeleted");
        }
    }

    public C84978XWs(BaseNewMusicTabFragment baseNewMusicTabFragment) {
        this.LIZ = baseNewMusicTabFragment;
    }
}
