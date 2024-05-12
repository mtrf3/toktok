package X;

import java.util.LinkedHashMap;

/* renamed from: X.JzJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC50961JzJ {
    MIDDLE_PAGE("middle_page"),
    SUG_PAGE("sug_page"),
    RESULT_PAGE("result_page");

    public static final C50960JzI Companion = new C50960JzI();
    public static final java.util.Map<String, EnumC50961JzJ> MAP;
    public final String LJLIL;

    public static EnumC50961JzJ valueOf(String str) {
        return (EnumC50961JzJ) V0N.LJJJ(EnumC50961JzJ.class, str);
    }

    static {
        EnumC50961JzJ[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC50961JzJ enumC50961JzJ : values) {
            linkedHashMap.put(enumC50961JzJ.LJLIL, enumC50961JzJ);
        }
        MAP = linkedHashMap;
    }

    public final String getPageName() {
        return this.LJLIL;
    }

    EnumC50961JzJ(String str) {
        this.LJLIL = str;
    }
}
