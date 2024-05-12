package X;

import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public enum KAK {
    TOP("general"),
    USER("user"),
    VIDEO("video"),
    SOUND("music"),
    LIVE("live"),
    SHOP("shop"),
    HASHTAG("hashtag"),
    PLACE("place"),
    STORE("store"),
    ECOM_LIVE("ecom_live"),
    ORDER("order");

    public static final C51298KBi Companion = new C51298KBi();
    public static final java.util.Map<String, KAK> MAP;
    public final String LJLIL;

    public static KAK valueOf(String str) {
        return (KAK) V0N.LJJJ(KAK.class, str);
    }

    static {
        KAK[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (KAK kak : values) {
            linkedHashMap.put(kak.LJLIL, kak);
        }
        MAP = linkedHashMap;
    }

    public final String getTabName() {
        return this.LJLIL;
    }

    KAK(String str) {
        this.LJLIL = str;
    }
}
