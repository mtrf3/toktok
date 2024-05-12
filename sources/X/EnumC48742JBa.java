package X;

import java.util.LinkedHashMap;

/* renamed from: X.JBa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48742JBa {
    CLOSED(0),
    SHOW(1);

    public static final C48743JBb Companion = new C48743JBb();
    public static final java.util.Map<Integer, EnumC48742JBa> stateValueMap;
    public final int LJLIL;

    public static EnumC48742JBa valueOf(String str) {
        return (EnumC48742JBa) V0N.LJJJ(EnumC48742JBa.class, str);
    }

    static {
        EnumC48742JBa[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC48742JBa enumC48742JBa : values) {
            linkedHashMap.put(Integer.valueOf(enumC48742JBa.LJLIL), enumC48742JBa);
        }
        stateValueMap = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC48742JBa(int i) {
        this.LJLIL = i;
    }
}
