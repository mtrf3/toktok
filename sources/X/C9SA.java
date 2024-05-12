package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RESUME' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.9SA, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9SA {
    public static final C9SK Companion;
    public static final C9SA DOWNLOADED;
    public static final /* synthetic */ C9SA[] LJLJI;
    public static final C9SA PAUSE;
    public static final C9SA RESUME;
    public final int LJLIL;
    public final C2068389v LJLILLLLZI;

    public static C9SA valueOf(String str) {
        return (C9SA) V0N.LJJJ(C9SA.class, str);
    }

    public static C9SA[] values() {
        return (C9SA[]) LJLJI.clone();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.9SK] */
    static {
        C2068389v c2068389v = new C2068389v();
        Integer valueOf = Integer.valueOf(R.attr.dj);
        c2068389v.LJ = valueOf;
        c2068389v.LIZ = R.raw.icon_pause_fill1;
        C9SA c9sa = new C9SA("RESUME", 0, R.string.j8q, c2068389v);
        RESUME = c9sa;
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LJ = valueOf;
        c2068389v2.LIZ = R.raw.icon_tick_fill;
        C9SA c9sa2 = new C9SA("DOWNLOADED", 1, R.string.j8t, c2068389v2);
        DOWNLOADED = c9sa2;
        C2068389v c2068389v3 = new C2068389v();
        c2068389v3.LJ = valueOf;
        c2068389v3.LIZ = R.raw.icon_arrow_down_to_line_bold;
        C9SA c9sa3 = new C9SA("PAUSE", 2, R.string.j8s, c2068389v3);
        PAUSE = c9sa3;
        LJLJI = new C9SA[]{c9sa, c9sa2, c9sa3};
        Companion = new Object() { // from class: X.9SK
        };
    }

    public final C2068389v getIcon() {
        return this.LJLILLLLZI;
    }

    public final int getTitle() {
        return this.LJLIL;
    }

    public C9SA(String str, int i, int i2, C2068389v c2068389v) {
        this.LJLIL = i2;
        this.LJLILLLLZI = c2068389v;
    }
}
