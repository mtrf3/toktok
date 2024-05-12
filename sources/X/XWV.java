package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.CollectMusicFragment;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

/* loaded from: classes16.dex */
public final /* synthetic */ class XWV implements InterfaceC51004K0a, InterfaceC85026XYo, PH8, N9A, InterfaceC40960G5s {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC85026XYo
    public void LIZ() {
        ((CollectMusicFragment) this.LJLIL).LJIIJJI();
    }

    public /* synthetic */ XWV(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.N9A
    public void LIZIZ(MusicCollectionItem musicCollectionItem) {
        MusicClassWidget musicClassWidget = (MusicClassWidget) this.LJLIL;
        musicClassWidget.getClass();
        Intent intent = new Intent(musicClassWidget.LJLIL, (Class<?>) MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", musicCollectionItem.mcId);
        intent.putExtra("music_class_name", musicCollectionItem.mcName);
        intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.LJLLI);
        intent.putExtra("music_class_enter_method", "click_category_list");
        intent.putExtra("music_class_level", musicCollectionItem.level);
        intent.putExtra("sound_page_scene", musicClassWidget.LJLLILLLL);
        intent.putExtra("max_video_duration", musicClassWidget.LJLLJ);
        intent.putExtra("shoot_video_length", musicClassWidget.LJLLL);
        intent.putExtra("playlist_order_in_csp", musicCollectionItem.playlistOrder);
        intent.putExtra("music_discovery_type", 3);
        musicClassWidget.LJIILIIL(intent, musicClassWidget.LJLL);
        XVF.LJIIIZ(musicCollectionItem.mcName, "click_category_list", 1, null, "", "change_music_page", musicCollectionItem.mcId);
    }
}
