package X;

import java.util.HashMap;

/* renamed from: X.Prp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC65785Prp {
    Cp437(new String[0], 0, 2),
    ISO8859_1(new String[]{"ISO-8859-1"}, 1, 3),
    ISO8859_2("ISO8859_2", "ISO-8859-2"),
    ISO8859_3("ISO8859_3", "ISO-8859-3"),
    ISO8859_4("ISO8859_4", "ISO-8859-4"),
    ISO8859_5("ISO8859_5", "ISO-8859-5"),
    ISO8859_6("ISO8859_6", "ISO-8859-6"),
    ISO8859_7("ISO8859_7", "ISO-8859-7"),
    ISO8859_8("ISO8859_8", "ISO-8859-8"),
    ISO8859_9("ISO8859_9", "ISO-8859-9"),
    ISO8859_10("ISO8859_10", "ISO-8859-10"),
    ISO8859_11("ISO8859_11", "ISO-8859-11"),
    ISO8859_13("ISO8859_13", "ISO-8859-13"),
    ISO8859_14("ISO8859_14", "ISO-8859-14"),
    ISO8859_15("ISO8859_15", "ISO-8859-15"),
    ISO8859_16("ISO8859_16", "ISO-8859-16"),
    SJIS("SJIS", "Shift_JIS"),
    Cp1250("Cp1250", "windows-1250"),
    Cp1251("Cp1251", "windows-1251"),
    Cp1252("Cp1252", "windows-1252"),
    Cp1256("Cp1256", "windows-1256"),
    UnicodeBigUnmarked("UnicodeBigUnmarked", "UTF-16BE", "UnicodeBig"),
    UTF8("UTF8", "UTF-8"),
    ASCII(new String[]{"US-ASCII"}, 27, 170),
    Big5(new String[0], 28),
    GB18030("GB18030", "GB2312", "EUC_CN", "GBK"),
    EUC_KR("EUC_KR", "EUC-KR");

    public static final java.util.Map<Integer, EnumC65785Prp> LJLJI = new HashMap();
    public static final java.util.Map<String, EnumC65785Prp> LJLJJI = new HashMap();
    public final int[] LJLIL;
    public final String[] LJLILLLLZI;

    EnumC65785Prp() {
        throw null;
    }

    static {
        for (EnumC65785Prp enumC65785Prp : values()) {
            for (int i : enumC65785Prp.LJLIL) {
                LJLJI.put(Integer.valueOf(i), enumC65785Prp);
            }
            LJLJJI.put(enumC65785Prp.name(), enumC65785Prp);
            for (String str : enumC65785Prp.LJLILLLLZI) {
                LJLJJI.put(str, enumC65785Prp);
            }
        }
    }

    public int getValue() {
        return this.LJLIL[0];
    }

    public static EnumC65785Prp getCharacterSetECIByName(String str) {
        return (EnumC65785Prp) ((HashMap) LJLJJI).get(str);
    }

    public static EnumC65785Prp getCharacterSetECIByValue(int i) {
        if (i >= 0 && i < 900) {
            return (EnumC65785Prp) ((HashMap) LJLJI).get(Integer.valueOf(i));
        }
        throw C86001Xp7.getFormatInstance();
    }

    public static EnumC65785Prp valueOf(String str) {
        return (EnumC65785Prp) V0N.LJJJ(EnumC65785Prp.class, str);
    }

    EnumC65785Prp(String str, String... strArr) {
        this.LJLIL = new int[]{r4};
        this.LJLILLLLZI = strArr;
    }

    EnumC65785Prp(String[] strArr, int... iArr) {
        this.LJLIL = iArr;
        this.LJLILLLLZI = strArr;
    }
}
