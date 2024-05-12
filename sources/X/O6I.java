package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionFragment;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O6I extends O6R {
    public final /* synthetic */ MusicCollectionFragment LJLJJI;

    @Override // X.O6R
    public final void LJJIII() {
    }

    public O6I(MusicCollectionFragment musicCollectionFragment) {
        this.LJLJJI = musicCollectionFragment;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        Music music = (Music) GsonProtectorUtils.fromJson(new Gson(), GsonProtectorUtils.parse(new com.google.gson.o(), JSONObjectProtectorUtils.getString(new JSONObject(str), "music")), Music.class);
        MusicCollectionFragment musicCollectionFragment = this.LJLJJI;
        musicCollectionFragment.LJLILLLLZI = null;
        MusicDownloadPlayHelper musicDownloadPlayHelper = musicCollectionFragment.LJLIL;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.pause();
            this.LJLJJI.LJLILLLLZI = music.convertToMusicModel();
            MusicCollectionFragment musicCollectionFragment2 = this.LJLJJI;
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = musicCollectionFragment2.LJLIL;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.LJIIJ(musicCollectionFragment2.LJLILLLLZI, false, 1);
                return;
            } else {
                o.LJIJI("musicDownloadPlayHelper");
                throw null;
            }
        }
        o.LJIJI("musicDownloadPlayHelper");
        throw null;
    }
}
