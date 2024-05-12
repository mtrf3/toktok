package X;

import java.util.LinkedHashMap;

/* renamed from: X.Oo2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63002Oo2 {
    PASS(0),
    US_FTC(1),
    EU_EEA(2);

    public static final C63005Oo5 Companion = new C63005Oo5();
    public static final java.util.Map<Integer, EnumC63002Oo2> MAP;
    public final int LJLIL;

    public static EnumC63002Oo2 valueOf(String str) {
        return (EnumC63002Oo2) V0N.LJJJ(EnumC63002Oo2.class, str);
    }

    static {
        EnumC63002Oo2[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC63002Oo2 enumC63002Oo2 : values) {
            linkedHashMap.put(Integer.valueOf(enumC63002Oo2.getValue()), enumC63002Oo2);
        }
        MAP = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC63002Oo2(int i) {
        this.LJLIL = i;
    }
}
