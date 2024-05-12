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
/* renamed from: X.4YM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YM {
    public static final C4YM DEFAULT;
    public static final /* synthetic */ C4YM[] LJLILLLLZI;
    public static final C4YM NOTSENT;
    public static final C4YM SEEN;
    public static final C4YM SENDING;
    public static final C4YM SENT;
    public final List<Integer> LJLIL;

    public static C4YM valueOf(String str) {
        return (C4YM) V0N.LJJJ(C4YM.class, str);
    }

    public static C4YM[] values() {
        return (C4YM[]) LJLILLLLZI.clone();
    }

    static {
        C4YM c4ym = new C4YM("SENDING", 0, C47261Igj.LJJIJIIJI(0, 1));
        SENDING = c4ym;
        C4YM c4ym2 = new C4YM("SENT", 1, C47261Igj.LJJIJIIJI(2, 5));
        SENT = c4ym2;
        C4YM c4ym3 = new C4YM("NOTSENT", 2, C47261Igj.LJJIJ(3));
        NOTSENT = c4ym3;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        C4YM c4ym4 = new C4YM("SEEN", 3, c61878OQg);
        SEEN = c4ym4;
        C4YM c4ym5 = new C4YM("DEFAULT", 4, c61878OQg);
        DEFAULT = c4ym5;
        LJLILLLLZI = new C4YM[]{c4ym, c4ym2, c4ym3, c4ym4, c4ym5};
    }

    public final List<Integer> getValue() {
        return this.LJLIL;
    }

    public C4YM(String str, int i, List list) {
        this.LJLIL = list;
    }
}
