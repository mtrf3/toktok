package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RECENT_VERTICAL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Fxk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC40672Fxk {
    public static final /* synthetic */ EnumC40672Fxk[] LJLJI;
    public static final EnumC40672Fxk RECENT_HORIZONTAL;
    public static final EnumC40672Fxk RECENT_VERTICAL;
    public static final EnumC40672Fxk RESULT;
    public static final EnumC40672Fxk SUGGESTED;
    public final EnumC40671Fxj LJLIL;
    public final EnumC40673Fxl LJLILLLLZI;

    public static EnumC40672Fxk valueOf(String str) {
        return (EnumC40672Fxk) V0N.LJJJ(EnumC40672Fxk.class, str);
    }

    public static EnumC40672Fxk[] values() {
        return (EnumC40672Fxk[]) LJLJI.clone();
    }

    static {
        EnumC40671Fxj enumC40671Fxj = EnumC40671Fxj.RECENT;
        EnumC40672Fxk enumC40672Fxk = new EnumC40672Fxk("RECENT_VERTICAL", 0, enumC40671Fxj);
        RECENT_VERTICAL = enumC40672Fxk;
        EnumC40672Fxk enumC40672Fxk2 = new EnumC40672Fxk("RECENT_HORIZONTAL", 1, enumC40671Fxj, EnumC40673Fxl.HORIZONTAL);
        RECENT_HORIZONTAL = enumC40672Fxk2;
        EnumC40672Fxk enumC40672Fxk3 = new EnumC40672Fxk("SUGGESTED", 2, EnumC40671Fxj.SUGGESTED);
        SUGGESTED = enumC40672Fxk3;
        EnumC40672Fxk enumC40672Fxk4 = new EnumC40672Fxk("RESULT", 3, EnumC40671Fxj.RESULT);
        RESULT = enumC40672Fxk4;
        LJLJI = new EnumC40672Fxk[]{enumC40672Fxk, enumC40672Fxk2, enumC40672Fxk3, enumC40672Fxk4};
    }

    public final EnumC40673Fxl getDisplayType() {
        return this.LJLILLLLZI;
    }

    public final EnumC40671Fxj getPosition() {
        return this.LJLIL;
    }

    public /* synthetic */ EnumC40672Fxk(String str, int i, EnumC40671Fxj enumC40671Fxj) {
        this(str, i, enumC40671Fxj, EnumC40673Fxl.VERTICAL);
    }

    public EnumC40672Fxk(String str, int i, EnumC40671Fxj enumC40671Fxj, EnumC40673Fxl enumC40673Fxl) {
        this.LJLIL = enumC40671Fxj;
        this.LJLILLLLZI = enumC40673Fxl;
    }
}
