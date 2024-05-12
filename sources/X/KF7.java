package X;

import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public enum KF7 {
    GENERAL_SEARCH_PAGE(0),
    ECOM_SEARCH_PAGE(1);

    public static final KFF Companion = new KFF();
    public static final java.util.Map<Integer, KF7> MAP;
    public final int LJLIL;

    public static KF7 valueOf(String str) {
        return (KF7) V0N.LJJJ(KF7.class, str);
    }

    static {
        KF7[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (KF7 kf7 : values) {
            linkedHashMap.put(Integer.valueOf(kf7.LJLIL), kf7);
        }
        MAP = linkedHashMap;
    }

    public final int getPageType() {
        return this.LJLIL;
    }

    KF7(int i) {
        this.LJLIL = i;
    }
}
