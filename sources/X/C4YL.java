package X;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SEEN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.4YL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YL {
    public static final C4YL DEFAULT;
    public static final /* synthetic */ C4YL[] LJLILLLLZI;
    public static final C4YL NOTSENT;
    public static final C4YL SEEN;
    public static final C4YL SENDING;
    public static final C4YL SENT;
    public final List<Integer> LJLIL;

    public static C4YL valueOf(String str) {
        return (C4YL) V0N.LJJJ(C4YL.class, str);
    }

    public static C4YL[] values() {
        return (C4YL[]) LJLILLLLZI.clone();
    }

    static {
        C4YL c4yl = new C4YL("SENDING", 0, C47261Igj.LJJIJIIJI(0, 1));
        SENDING = c4yl;
        C4YL c4yl2 = new C4YL("SENT", 1, C47261Igj.LJJIJIIJI(2, 5));
        SENT = c4yl2;
        C4YL c4yl3 = new C4YL("NOTSENT", 2, C47261Igj.LJJIJ(3));
        NOTSENT = c4yl3;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        C4YL c4yl4 = new C4YL("SEEN", 3, c61878OQg);
        SEEN = c4yl4;
        C4YL c4yl5 = new C4YL("DEFAULT", 4, c61878OQg);
        DEFAULT = c4yl5;
        LJLILLLLZI = new C4YL[]{c4yl, c4yl2, c4yl3, c4yl4, c4yl5};
    }

    public final List<Integer> getValue() {
        return this.LJLIL;
    }

    public C4YL(String str, int i, List list) {
        this.LJLIL = list;
    }
}
