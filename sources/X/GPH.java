package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EXCEPT_TTN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class GPH {
    public static final GPH ALL;
    public static final GPH EXCEPT_TTN;
    public static final /* synthetic */ GPH[] LJLILLLLZI;
    public static final GPH TTN_ONLY;
    public final int LJLIL;

    public static GPH valueOf(String str) {
        return (GPH) V0N.LJJJ(GPH.class, str);
    }

    public static GPH[] values() {
        return (GPH[]) LJLILLLLZI.clone();
    }

    static {
        GPH gph = new GPH("ALL", 0, 255);
        ALL = gph;
        GPI gpi = GPI.TTN;
        GPH gph2 = new GPH("EXCEPT_TTN", 1, 255 ^ gpi.getValue());
        EXCEPT_TTN = gph2;
        GPH gph3 = new GPH("TTN_ONLY", 2, gpi.getValue());
        TTN_ONLY = gph3;
        LJLILLLLZI = new GPH[]{gph, gph2, gph3};
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public GPH(String str, int i, int i2) {
        this.LJLIL = i2;
    }
}
