package X;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.L9r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53803L9r {
    public static final java.util.Map<Integer, java.util.Set<EnumC53808L9w>> LIZ;
    public static final List<String> LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, C77275UUl.LJ(EnumC53808L9w.HOME));
        linkedHashMap.put(1, C77275UUl.LJ(EnumC53808L9w.FASHION_MALL, EnumC53808L9w.MALL, EnumC53808L9w.FOLLOWING, EnumC53808L9w.NEARBY, EnumC53808L9w.EXPLORE, EnumC53808L9w.FRIENDS, EnumC53808L9w.DISCOVER));
        linkedHashMap.put(2, C77275UUl.LJ(EnumC53808L9w.SHOOT));
        linkedHashMap.put(3, C77275UUl.LJ(EnumC53808L9w.INBOX));
        linkedHashMap.put(4, C77275UUl.LJ(EnumC53808L9w.PROFILE));
        LIZ = linkedHashMap;
        LIZIZ = Arrays.asList("FASHION_MALL", "SHOP_MALL", "Following", "Nearby", "homepage_explore", "FRIENDS_TAB", "MUSIC_DSP", "DISCOVER");
    }
}
