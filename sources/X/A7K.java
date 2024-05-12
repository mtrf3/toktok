package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerEventPanelComponent;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class A7K {
    public static final LinkedHashMap<Class<? extends KUK>, List<String>> LIZ;

    static {
        LinkedHashMap<Class<? extends KUK>, List<String>> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(PlayerEventPanelComponent.class, ORY.LJLIIIL(new String[]{"event_on_render_first_frame", "event_on_render_ready", "event_on_play_progress_change", "event_on_play_completed", "event_on_play_pause", "event_on_playing", "event_on_request_resume_play"}));
        linkedHashMap.put(RootPanelComponent.class, ORY.LJLIIIL(new String[]{"event_legacy_internal_video_event", "event_on_page_resume", "event_on_page_pause"}));
        linkedHashMap.put(VideoDiggAssem.class, ORY.LJLIIIL(new String[]{"event_digg_click"}));
        linkedHashMap.put(VideoFavoriteAssem.class, ORY.LJLIIIL(new String[]{"event_favorite_click"}));
        LIZ = linkedHashMap;
    }
}
