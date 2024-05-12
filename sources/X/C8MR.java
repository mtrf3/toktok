package X;

import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8MR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MR {
    public static final LinkedHashMap<Class<? extends KUK>, List<String>> LIZ;

    static {
        LinkedHashMap<Class<? extends KUK>, List<String>> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(RootCellComponent.class, ORY.LJLIIIL(new String[]{"event_enter_dislike_mode", "event_downgrade_view_opt", "event_enter_clear_mode", "event_component_clickable"}));
        linkedHashMap.put(InteractAreaComponent.class, ORY.LJLIIIL(new String[]{"event_commodity_card", "event_component_hint_text"}));
        LIZ = linkedHashMap;
    }
}
