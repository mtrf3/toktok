package X;

import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.kids.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.music.model.Music;

/* loaded from: classes13.dex */
public final class TAX implements C10I<MusicPickResponse, MusicPickResponse> {
    public final /* synthetic */ Music LIZ;

    public TAX(Music music) {
        this.LIZ = music;
    }

    @Override // X.C10I
    public final MusicPickResponse then(C10K<MusicPickResponse> c10k) {
        Music music = this.LIZ;
        if (music != null) {
            try {
                String mid = music.getMid();
                ChooseMusicApi.API api = ChooseMusicApi.LIZ;
                if (mid != null) {
                    mid = mid.trim();
                }
                Music music2 = api.queryMusic(mid, 0).get().music;
                if (music2 != null) {
                    this.LIZ.setCollectStatus(music2.getCollectStatus());
                }
            } catch (Exception unused) {
            }
        }
        return c10k.LJIIJJI();
    }
}
