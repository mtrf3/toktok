package X;

import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public enum T7P {
    UNKNOWN(0),
    INVITATION(1),
    RECOMMEND(2),
    FAVORITE(3),
    MIXED(4);

    public static final C74126T7i Companion = new C74126T7i();
    public static final java.util.Map<Integer, T7P> types;
    public final int LJLIL;

    public static T7P valueOf(String str) {
        return (T7P) V0N.LJJJ(T7P.class, str);
    }

    static {
        T7P[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (T7P t7p : values) {
            linkedHashMap.put(Integer.valueOf(t7p.LJLIL), t7p);
        }
        types = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    T7P(int i) {
        this.LJLIL = i;
    }
}
