package X;

/* loaded from: classes11.dex */
public enum NRB {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    public final String LJLIL;

    NRB(String str) {
        this.LJLIL = str;
    }

    public static NRB valueOf(String str) {
        return (NRB) V0N.LJJJ(NRB.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }
}
