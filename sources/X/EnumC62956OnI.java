package X;

import java.util.LinkedHashMap;

/* renamed from: X.OnI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC62956OnI {
    PASS(0),
    US_FTC(1),
    EU_EEA(2);

    public static final C62955OnH Companion = new C62955OnH();
    public static final java.util.Map<Integer, EnumC62956OnI> MAP;
    public final int LJLIL;

    public static EnumC62956OnI valueOf(String str) {
        return (EnumC62956OnI) V0N.LJJJ(EnumC62956OnI.class, str);
    }

    static {
        EnumC62956OnI[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC62956OnI enumC62956OnI : values) {
            linkedHashMap.put(Integer.valueOf(enumC62956OnI.LJLIL), enumC62956OnI);
        }
        MAP = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC62956OnI(int i) {
        this.LJLIL = i;
    }
}
