package X;

import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.v2.assem.button.MusicPlayFullSongButtonAssem;

/* loaded from: classes13.dex */
public final class SUF implements InterfaceC63764P0u {
    public final /* synthetic */ MusicPlayFullSongButtonAssem LJLIL;
    public final /* synthetic */ ExternalMusicInfo LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        this.LJLIL.L3(this.LJLILLLLZI, this.LJLJI);
    }

    public SUF(MusicPlayFullSongButtonAssem musicPlayFullSongButtonAssem, ExternalMusicInfo externalMusicInfo, java.util.Map<String, String> map) {
        this.LJLIL = musicPlayFullSongButtonAssem;
        this.LJLILLLLZI = externalMusicInfo;
        this.LJLJI = map;
    }
}
