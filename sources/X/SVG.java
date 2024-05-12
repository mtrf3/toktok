package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CLICK' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes13.dex */
public final class SVG {
    public static final SVG CLICK;
    public static final /* synthetic */ SVG[] LJLJI;
    public static final SVG SHOW;
    public final SVI LJLIL;
    public final SVH LJLILLLLZI;

    public static SVG valueOf(String str) {
        return (SVG) V0N.LJJJ(SVG.class, str);
    }

    public static SVG[] values() {
        return (SVG[]) LJLJI.clone();
    }

    static {
        SVI svi = SVI.EVENT_TRACK;
        SVG svg = new SVG("CLICK", 0, svi, SVH.DSP_ACTION_CLICK);
        CLICK = svg;
        SVG svg2 = new SVG("SHOW", 1, svi, SVH.DSP_ACTION_SHOW);
        SHOW = svg2;
        LJLJI = new SVG[]{svg, svg2};
    }

    public final SVH getActionType() {
        return this.LJLILLLLZI;
    }

    public final SVI getScene() {
        return this.LJLIL;
    }

    public SVG(String str, int i, SVI svi, SVH svh) {
        this.LJLIL = svi;
        this.LJLILLLLZI = svh;
    }
}
