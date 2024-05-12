package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SECOND_RIGHT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.L8d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC53763L8d {
    public static final /* synthetic */ EnumC53763L8d[] LJLJI;
    public static final EnumC53763L8d RIGHT;
    public static final EnumC53763L8d SECOND_RIGHT;
    public static final EnumC53763L8d X_TAB;
    public final int LJLIL;
    public final List<String> LJLILLLLZI;

    public static EnumC53763L8d valueOf(String str) {
        return (EnumC53763L8d) V0N.LJJJ(EnumC53763L8d.class, str);
    }

    public static EnumC53763L8d[] values() {
        return (EnumC53763L8d[]) LJLJI.clone();
    }

    static {
        C53802L9q c53802L9q = InterfaceC53762L8c.LIZ;
        c53802L9q.getClass();
        EnumC53763L8d enumC53763L8d = new EnumC53763L8d("X_TAB", 0, 0, C53802L9q.LIZLLL);
        X_TAB = enumC53763L8d;
        c53802L9q.getClass();
        List<String> list = C53802L9q.LIZJ;
        o.LJIIIIZZ(list, "TabName.SECOND_RIGHT_TAB_PRIORITY");
        EnumC53763L8d enumC53763L8d2 = new EnumC53763L8d("SECOND_RIGHT", 1, 1, list);
        SECOND_RIGHT = enumC53763L8d2;
        c53802L9q.getClass();
        List<String> list2 = C53802L9q.LIZIZ;
        o.LJIIIIZZ(list2, "TabName.RIGHT_TAB_PRIORITY");
        EnumC53763L8d enumC53763L8d3 = new EnumC53763L8d("RIGHT", 2, 2, list2);
        RIGHT = enumC53763L8d3;
        LJLJI = new EnumC53763L8d[]{enumC53763L8d, enumC53763L8d2, enumC53763L8d3};
    }

    public final int getIndex() {
        return this.LJLIL;
    }

    public final List<String> getPriorityList() {
        return this.LJLILLLLZI;
    }

    public EnumC53763L8d(String str, int i, int i2, List list) {
        this.LJLIL = i2;
        this.LJLILLLLZI = list;
    }
}
