package X;

import java.util.LinkedHashMap;

/* renamed from: X.JHs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48916JHs {
    OFF(0),
    ON(1);

    public static final JHK Companion = new JHK();
    public static final java.util.Map<Integer, EnumC48916JHs> stateValueMap;
    public final int LJLIL;

    public static EnumC48916JHs valueOf(String str) {
        return (EnumC48916JHs) V0N.LJJJ(EnumC48916JHs.class, str);
    }

    static {
        EnumC48916JHs[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC48916JHs enumC48916JHs : values) {
            linkedHashMap.put(Integer.valueOf(enumC48916JHs.LJLIL), enumC48916JHs);
        }
        stateValueMap = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC48916JHs(int i) {
        this.LJLIL = i;
    }
}
