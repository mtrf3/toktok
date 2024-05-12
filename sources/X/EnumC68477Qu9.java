package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CURRENT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Qu9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC68477Qu9 {
    public static final EnumC68477Qu9 CURRENT;
    public static final EnumC68477Qu9 EIGHT2TWENTYONE;
    public static final /* synthetic */ EnumC68477Qu9[] LJLJJI;
    public static final EnumC68477Qu9 SEVEN2EIGHT_PM;
    public static final EnumC68477Qu9 TWO2THREE_PM;
    public final int LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;

    public static EnumC68477Qu9 valueOf(String str) {
        return (EnumC68477Qu9) V0N.LJJJ(EnumC68477Qu9.class, str);
    }

    public static EnumC68477Qu9[] values() {
        return (EnumC68477Qu9[]) LJLJJI.clone();
    }

    static {
        int i = 0;
        EnumC68477Qu9 enumC68477Qu9 = new EnumC68477Qu9("CURRENT", i, i, 0.0f);
        CURRENT = enumC68477Qu9;
        int i2 = 1;
        EnumC68477Qu9 enumC68477Qu92 = new EnumC68477Qu9("TWO2THREE_PM", i2, i2, 14.0f);
        TWO2THREE_PM = enumC68477Qu92;
        int i3 = 2;
        EnumC68477Qu9 enumC68477Qu93 = new EnumC68477Qu9("SEVEN2EIGHT_PM", i3, i3, 19.0f);
        SEVEN2EIGHT_PM = enumC68477Qu93;
        EnumC68477Qu9 enumC68477Qu94 = new EnumC68477Qu9("EIGHT2TWENTYONE", 3, 3, 8.0f, 780);
        EIGHT2TWENTYONE = enumC68477Qu94;
        LJLJJI = new EnumC68477Qu9[]{enumC68477Qu9, enumC68477Qu92, enumC68477Qu93, enumC68477Qu94};
    }

    public final int getDuration() {
        return this.LJLJI;
    }

    public final int getIndex() {
        return this.LJLIL;
    }

    public final float getStartHour() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ EnumC68477Qu9(String str, int i, int i2, float f) {
        this(str, i, i2, f, 60);
    }

    public EnumC68477Qu9(String str, int i, int i2, float f, int i3) {
        this.LJLIL = i2;
        this.LJLILLLLZI = f;
        this.LJLJI = i3;
    }
}
