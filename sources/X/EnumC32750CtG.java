package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GIFT_WIDGET_LEAF' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.CtG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC32750CtG {
    public static final EnumC32750CtG GIFT_MATCH_TRAY_LEAF;
    public static final EnumC32750CtG GIFT_PANEL_LEAF;
    public static final EnumC32750CtG GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF;
    public static final EnumC32750CtG GIFT_PANEL_MULTI_GUEST_VIEW;
    public static final EnumC32750CtG GIFT_PANEL_SUB;
    public static final EnumC32750CtG GIFT_WIDGET_LEAF;
    public static final /* synthetic */ EnumC32750CtG[] LJLILLLLZI;
    public final int LJLIL;

    public static EnumC32750CtG valueOf(String str) {
        return (EnumC32750CtG) V0N.LJJJ(EnumC32750CtG.class, str);
    }

    public static EnumC32750CtG[] values() {
        return (EnumC32750CtG[]) LJLILLLLZI.clone();
    }

    static {
        int i = QCU.LJLIL;
        int i2 = i + 1;
        EnumC32750CtG enumC32750CtG = new EnumC32750CtG("GIFT_WIDGET_LEAF", 0, i);
        GIFT_WIDGET_LEAF = enumC32750CtG;
        int i3 = i2 + 1;
        EnumC32750CtG enumC32750CtG2 = new EnumC32750CtG("GIFT_PANEL_SUB", 1, i2);
        GIFT_PANEL_SUB = enumC32750CtG2;
        int i4 = i3 + 1;
        EnumC32750CtG enumC32750CtG3 = new EnumC32750CtG("GIFT_PANEL_LEAF", 2, i3);
        GIFT_PANEL_LEAF = enumC32750CtG3;
        int i5 = i4 + 1;
        EnumC32750CtG enumC32750CtG4 = new EnumC32750CtG("GIFT_PANEL_MULTI_GUEST_VIEW", 3, i4);
        GIFT_PANEL_MULTI_GUEST_VIEW = enumC32750CtG4;
        int i6 = i5 + 1;
        EnumC32750CtG enumC32750CtG5 = new EnumC32750CtG("GIFT_MATCH_TRAY_LEAF", 4, i5);
        GIFT_MATCH_TRAY_LEAF = enumC32750CtG5;
        QCU.LJLIL = i6 + 1;
        EnumC32750CtG enumC32750CtG6 = new EnumC32750CtG("GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF", 5, i6);
        GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF = enumC32750CtG6;
        LJLILLLLZI = new EnumC32750CtG[]{enumC32750CtG, enumC32750CtG2, enumC32750CtG3, enumC32750CtG4, enumC32750CtG5, enumC32750CtG6};
    }

    public final int getZIndex() {
        return this.LJLIL;
    }

    public EnumC32750CtG(String str, int i, int i2) {
        this.LJLIL = i2;
    }
}
