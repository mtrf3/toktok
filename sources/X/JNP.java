package X;

import X.JNP;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class JNP<T extends JNP<T>> extends JNS<T> {
    static {
        C221108m2.LIZIZ(JNQ.INSTANCE);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("searchTransferEnter", C77275UUl.LJ("enter_from", "from_group_id"));
        concurrentHashMap.put("search_music_notice", C77275UUl.LJ("search_id"));
        concurrentHashMap.put("search_result_click", C77275UUl.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a"));
        concurrentHashMap.put("search_result_show", C77275UUl.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a"));
        concurrentHashMap.put("music_play_time", C77275UUl.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a", "search_keyword_a"));
        concurrentHashMap.put("search_result_show_video", C77275UUl.LJ("impr_id_a", "search_id_a"));
    }

    public JNP(String str) {
        super(str);
    }
}
