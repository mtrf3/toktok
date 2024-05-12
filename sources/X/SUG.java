package X;

import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.v2.assem.button.MusicPlayFullSongButtonAssem;

/* loaded from: classes13.dex */
public final class SUG implements MGM {
    public final /* synthetic */ MusicPlayFullSongButtonAssem LIZ;
    public final /* synthetic */ ExternalMusicInfo LIZIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZJ;

    @Override // X.MGM
    public final void LIZ() {
        this.LIZ.L3(this.LIZIZ, this.LIZJ);
    }

    public SUG(MusicPlayFullSongButtonAssem musicPlayFullSongButtonAssem, ExternalMusicInfo externalMusicInfo, java.util.Map<String, String> map) {
        this.LIZ = musicPlayFullSongButtonAssem;
        this.LIZIZ = externalMusicInfo;
        this.LIZJ = map;
    }
}
