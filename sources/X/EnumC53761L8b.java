package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TAB_2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.L8b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC53761L8b {
    public static final /* synthetic */ EnumC53761L8b[] LJLJI;
    public static final EnumC53761L8b TAB_1;
    public static final EnumC53761L8b TAB_2;
    public static final EnumC53761L8b TAB_3;
    public static final EnumC53761L8b TAB_4;
    public static final EnumC53761L8b TAB_5;
    public final int LJLIL;
    public final List<String> LJLILLLLZI;

    public static EnumC53761L8b valueOf(String str) {
        return (EnumC53761L8b) V0N.LJJJ(EnumC53761L8b.class, str);
    }

    public static EnumC53761L8b[] values() {
        return (EnumC53761L8b[]) LJLJI.clone();
    }

    static {
        EnumC53761L8b enumC53761L8b = new EnumC53761L8b("TAB_1", 0, 0);
        TAB_1 = enumC53761L8b;
        InterfaceC53762L8c.LIZ.getClass();
        List<String> list = C53802L9q.LJ;
        o.LJIIIIZZ(list, "TabName.BOTTOM_2_TAB_PRIORITY");
        EnumC53761L8b enumC53761L8b2 = new EnumC53761L8b("TAB_2", 1, 1, list);
        TAB_2 = enumC53761L8b2;
        EnumC53761L8b enumC53761L8b3 = new EnumC53761L8b("TAB_3", 2, 2);
        TAB_3 = enumC53761L8b3;
        EnumC53761L8b enumC53761L8b4 = new EnumC53761L8b("TAB_4", 3, 3);
        TAB_4 = enumC53761L8b4;
        EnumC53761L8b enumC53761L8b5 = new EnumC53761L8b("TAB_5", 4, 4);
        TAB_5 = enumC53761L8b5;
        LJLJI = new EnumC53761L8b[]{enumC53761L8b, enumC53761L8b2, enumC53761L8b3, enumC53761L8b4, enumC53761L8b5};
    }

    public final int getIndex() {
        return this.LJLIL;
    }

    public final List<String> getPriorityList() {
        return this.LJLILLLLZI;
    }

    public EnumC53761L8b(String str, int i, int i2) {
        this(str, i, i2, C61878OQg.INSTANCE);
    }

    public EnumC53761L8b(String str, int i, int i2, List list) {
        this.LJLIL = i2;
        this.LJLILLLLZI = list;
    }
}
