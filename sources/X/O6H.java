package X;

import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O6H extends O6R {
    public final /* synthetic */ MusicCollectionFragment LJLJJI;

    @Override // X.O6R
    public final void LJJIII() {
    }

    public O6H(MusicCollectionFragment musicCollectionFragment) {
        this.LJLJJI = musicCollectionFragment;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        MusicCollectionFragment musicCollectionFragment = this.LJLJJI;
        musicCollectionFragment.LJLILLLLZI = null;
        MusicDownloadPlayHelper musicDownloadPlayHelper = musicCollectionFragment.LJLIL;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.pause();
        } else {
            o.LJIJI("musicDownloadPlayHelper");
            throw null;
        }
    }
}
