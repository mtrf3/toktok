package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class YPN {
    public static final YPN[] LJLILLLLZI;
    public static final /* synthetic */ YPN[] LJLJI;
    public static final YPN zzfxr;
    public static final YPN zzfye;
    public final int LJLIL;

    /* JADX INFO: Fake field, exist only in values array */
    YPN EF3;

    static {
        YPT ypt = YPT.SCALAR;
        YPO ypo = YPO.DOUBLE;
        YPN ypn = new YPN("DOUBLE", 0, 0, ypt, ypo);
        YPO ypo2 = YPO.FLOAT;
        YPN ypn2 = new YPN("FLOAT", 1, 1, ypt, ypo2);
        YPO ypo3 = YPO.LONG;
        YPN ypn3 = new YPN("INT64", 2, 2, ypt, ypo3);
        YPN ypn4 = new YPN("UINT64", 3, 3, ypt, ypo3);
        YPO ypo4 = YPO.INT;
        YPN ypn5 = new YPN("INT32", 4, 4, ypt, ypo4);
        YPN ypn6 = new YPN("FIXED64", 5, 5, ypt, ypo3);
        YPN ypn7 = new YPN("FIXED32", 6, 6, ypt, ypo4);
        YPO ypo5 = YPO.BOOLEAN;
        YPN ypn8 = new YPN("BOOL", 7, 7, ypt, ypo5);
        YPO ypo6 = YPO.STRING;
        YPN ypn9 = new YPN("STRING", 8, 8, ypt, ypo6);
        YPO ypo7 = YPO.MESSAGE;
        YPN ypn10 = new YPN("MESSAGE", 9, 9, ypt, ypo7);
        YPO ypo8 = YPO.BYTE_STRING;
        YPN ypn11 = new YPN("BYTES", 10, 10, ypt, ypo8);
        YPN ypn12 = new YPN("UINT32", 11, 11, ypt, ypo4);
        YPO ypo9 = YPO.ENUM;
        YPN ypn13 = new YPN("ENUM", 12, 12, ypt, ypo9);
        YPN ypn14 = new YPN("SFIXED32", 13, 13, ypt, ypo4);
        YPN ypn15 = new YPN("SFIXED64", 14, 14, ypt, ypo3);
        YPN ypn16 = new YPN("SINT32", 15, 15, ypt, ypo4);
        YPN ypn17 = new YPN("SINT64", 16, 16, ypt, ypo3);
        YPN ypn18 = new YPN("GROUP", 17, 17, ypt, ypo7);
        YPT ypt2 = YPT.VECTOR;
        YPN ypn19 = new YPN("DOUBLE_LIST", 18, 18, ypt2, ypo);
        YPN ypn20 = new YPN("FLOAT_LIST", 19, 19, ypt2, ypo2);
        YPN ypn21 = new YPN("INT64_LIST", 20, 20, ypt2, ypo3);
        YPN ypn22 = new YPN("UINT64_LIST", 21, 21, ypt2, ypo3);
        YPN ypn23 = new YPN("INT32_LIST", 22, 22, ypt2, ypo4);
        YPN ypn24 = new YPN("FIXED64_LIST", 23, 23, ypt2, ypo3);
        YPN ypn25 = new YPN("FIXED32_LIST", 24, 24, ypt2, ypo4);
        YPN ypn26 = new YPN("BOOL_LIST", 25, 25, ypt2, ypo5);
        YPN ypn27 = new YPN("STRING_LIST", 26, 26, ypt2, ypo6);
        YPN ypn28 = new YPN("MESSAGE_LIST", 27, 27, ypt2, ypo7);
        YPN ypn29 = new YPN("BYTES_LIST", 28, 28, ypt2, ypo8);
        YPN ypn30 = new YPN("UINT32_LIST", 29, 29, ypt2, ypo4);
        YPN ypn31 = new YPN("ENUM_LIST", 30, 30, ypt2, ypo9);
        YPN ypn32 = new YPN("SFIXED32_LIST", 31, 31, ypt2, ypo4);
        YPN ypn33 = new YPN("SFIXED64_LIST", 32, 32, ypt2, ypo3);
        YPN ypn34 = new YPN("SINT32_LIST", 33, 33, ypt2, ypo4);
        YPN ypn35 = new YPN("SINT64_LIST", 34, 34, ypt2, ypo3);
        YPT ypt3 = YPT.PACKED_VECTOR;
        YPN ypn36 = new YPN("DOUBLE_LIST_PACKED", 35, 35, ypt3, ypo);
        zzfxr = ypn36;
        YPN ypn37 = new YPN("FLOAT_LIST_PACKED", 36, 36, ypt3, ypo2);
        YPN ypn38 = new YPN("INT64_LIST_PACKED", 37, 37, ypt3, ypo3);
        YPN ypn39 = new YPN("UINT64_LIST_PACKED", 38, 38, ypt3, ypo3);
        YPN ypn40 = new YPN("INT32_LIST_PACKED", 39, 39, ypt3, ypo4);
        YPN ypn41 = new YPN("FIXED64_LIST_PACKED", 40, 40, ypt3, ypo3);
        YPN ypn42 = new YPN("FIXED32_LIST_PACKED", 41, 41, ypt3, ypo4);
        YPN ypn43 = new YPN("BOOL_LIST_PACKED", 42, 42, ypt3, ypo5);
        YPN ypn44 = new YPN("UINT32_LIST_PACKED", 43, 43, ypt3, ypo4);
        YPN ypn45 = new YPN("ENUM_LIST_PACKED", 44, 44, ypt3, ypo9);
        YPN ypn46 = new YPN("SFIXED32_LIST_PACKED", 45, 45, ypt3, ypo4);
        YPN ypn47 = new YPN("SFIXED64_LIST_PACKED", 46, 46, ypt3, ypo3);
        YPN ypn48 = new YPN("SINT32_LIST_PACKED", 47, 47, ypt3, ypo4);
        YPN ypn49 = new YPN("SINT64_LIST_PACKED", 48, 48, ypt3, ypo3);
        zzfye = ypn49;
        LJLJI = new YPN[]{ypn, ypn2, ypn3, ypn4, ypn5, ypn6, ypn7, ypn8, ypn9, ypn10, ypn11, ypn12, ypn13, ypn14, ypn15, ypn16, ypn17, ypn18, ypn19, ypn20, ypn21, ypn22, ypn23, ypn24, ypn25, ypn26, ypn27, ypn28, ypn29, ypn30, ypn31, ypn32, ypn33, ypn34, ypn35, ypn36, ypn37, ypn38, ypn39, ypn40, ypn41, ypn42, ypn43, ypn44, ypn45, ypn46, ypn47, ypn48, ypn49, new YPN("GROUP_LIST", 49, 49, ypt2, ypo7), new YPN("MAP", 50, 50, YPT.MAP, YPO.VOID)};
        YPN[] values = values();
        LJLILLLLZI = new YPN[values.length];
        for (YPN ypn50 : values) {
            LJLILLLLZI[ypn50.LJLIL] = ypn50;
        }
    }

    public static YPN[] values() {
        return (YPN[]) LJLJI.clone();
    }

    public final int id() {
        return this.LJLIL;
    }

    public YPN(String str, int i, int i2, YPT ypt, YPO ypo) {
        this.LJLIL = i2;
        int i3 = YPS.LIZ[ypt.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                ypo.zzauc();
            }
        } else {
            ypo.zzauc();
        }
        if (ypt == YPT.SCALAR) {
            ypo.ordinal();
        }
    }
}
