package X;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public enum KBE implements Serializable {
    PRODUCT_CARD("product_card"),
    TALENT_CARD("talent_card"),
    STORE_CARD("store_card");

    public static final KCP Companion = new KCP();
    public static final java.util.Map<String, KBE> MAP;
    public final String LJLIL;

    public static KBE valueOf(String str) {
        return (KBE) V0N.LJJJ(KBE.class, str);
    }

    static {
        KBE[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (KBE kbe : values) {
            linkedHashMap.put(kbe.LJLIL, kbe);
        }
        MAP = linkedHashMap;
    }

    public final String getCardName() {
        return this.LJLIL;
    }

    KBE(String str) {
        this.LJLIL = str;
    }
}
