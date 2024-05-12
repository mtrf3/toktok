package X;

import X.JNN;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JNN<T extends JNN<T>> extends JN4<T> {
    public static final C62822Ol8 LJIILL = C221108m2.LIZIZ(JNO.INSTANCE);
    public static final ConcurrentHashMap<String, java.util.Set<String>> LJIILLIIL;

    static {
        ConcurrentHashMap<String, java.util.Set<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("searchTransferEnter", C77275UUl.LJ("enter_from", "from_group_id"));
        concurrentHashMap.put("search_music_notice", C77275UUl.LJ("search_id"));
        concurrentHashMap.put("search_result_click", C77275UUl.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a"));
        concurrentHashMap.put("search_result_show", C77275UUl.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a"));
        concurrentHashMap.put("music_play_time", C77275UUl.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a", "search_keyword_a"));
        concurrentHashMap.put("search_result_show_video", C77275UUl.LJ("impr_id_a", "search_id_a"));
        LJIILLIIL = concurrentHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNN(String eventName) {
        super(eventName);
        o.LJIIIZ(eventName, "eventName");
    }

    public final void LJIL(Integer num) {
        if (num != null) {
            LJIIZILJ("aweme_type", String.valueOf(num.intValue()));
        }
    }

    public final void LJJ(Integer num) {
        if (num != null) {
            LJIIZILJ("pic_cnt", String.valueOf(num.intValue()));
        }
    }

    public final void LJJI(Integer num) {
        LJIIZILJ("rank", String.valueOf(num));
    }

    public final void LJJIFFI(String str) {
        LJIIZILJ("search_id", str);
    }

    public final void LJJII(String str) {
        LJIJ("search_result_id", str);
    }
}
