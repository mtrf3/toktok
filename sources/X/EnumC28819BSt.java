package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PORTAL_LEAF' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.BSt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC28819BSt {
    public static final /* synthetic */ EnumC28819BSt[] LJLILLLLZI;
    public static final EnumC28819BSt PORTAL_LEAF;
    public final int LJLIL;

    public static EnumC28819BSt valueOf(String str) {
        return (EnumC28819BSt) V0N.LJJJ(EnumC28819BSt.class, str);
    }

    public static EnumC28819BSt[] values() {
        return (EnumC28819BSt[]) LJLILLLLZI.clone();
    }

    static {
        int i = T2R.LJLIL;
        T2R.LJLIL = i + 1;
        EnumC28819BSt enumC28819BSt = new EnumC28819BSt(i);
        PORTAL_LEAF = enumC28819BSt;
        LJLILLLLZI = new EnumC28819BSt[]{enumC28819BSt};
    }

    public final int getZIndex() {
        return this.LJLIL;
    }

    public EnumC28819BSt(int i) {
        this.LJLIL = i;
    }
}
