package X;

import java.util.LinkedHashMap;

/* renamed from: X.L3v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53651L3v extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Integer>> {
    public static final C53651L3v LJLIL = new C53651L3v();

    public C53651L3v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Integer> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("left_right", 0);
        linkedHashMap.put("start_end", 1);
        linkedHashMap.put("right_left", 2);
        linkedHashMap.put("end_start", 3);
        linkedHashMap.put("top_bottom", 4);
        linkedHashMap.put("bottom_top", 5);
        linkedHashMap.put("top_left_bottom_right", 6);
        linkedHashMap.put("top_start_bottom_end", 7);
        linkedHashMap.put("bottom_left_top_right", 8);
        linkedHashMap.put("bottom_start_top_end", 9);
        linkedHashMap.put("top_right_bottom_left", 10);
        linkedHashMap.put("top_end_bottom_start", 11);
        linkedHashMap.put("bottom_right_top_left", 12);
        linkedHashMap.put("bottom_end_top_start", 13);
        return linkedHashMap;
    }
}
