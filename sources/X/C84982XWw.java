package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XWw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84982XWw implements XUL {
    public final /* synthetic */ BaseNewMusicTabFragment LIZ;

    @Override // X.XUL
    public final void LIZ() {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LIZ;
        MusicModel musicModel = baseNewMusicTabFragment.LL;
        if (musicModel != null) {
            baseNewMusicTabFragment.LJLJL.jv0(musicModel.getMusicId(), "play_error");
        }
    }

    @Override // X.XUL
    public final void LIZIZ() {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LIZ;
        MusicModel musicModel = baseNewMusicTabFragment.LL;
        if (musicModel != null) {
            baseNewMusicTabFragment.LJLJL.jv0(musicModel.getMusicId(), "play_compeleted");
        }
    }

    public C84982XWw(BaseNewMusicTabFragment baseNewMusicTabFragment) {
        this.LIZ = baseNewMusicTabFragment;
    }
}
