package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.TikTokMusicCollectInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;

/* loaded from: classes13.dex */
public final class SVK<T> implements InterfaceC64592gB {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ MusicFavoriteButtonAssem LJLILLLLZI;
    public final /* synthetic */ TikTokMusicCollectInfo LJLJI;
    public final /* synthetic */ String LJLJJI;

    public SVK(Context context, TikTokMusicCollectInfo tikTokMusicCollectInfo, MusicFavoriteButtonAssem musicFavoriteButtonAssem, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = musicFavoriteButtonAssem;
        this.LJLJI = tikTokMusicCollectInfo;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (SVB.LIZ(this.LJLIL)) {
            this.LJLILLLLZI.O3(this.LJLIL, this.LJLJI, this.LJLJJI);
        }
    }
}
