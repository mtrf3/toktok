package X;

/* loaded from: classes12.dex */
public enum QN7 {
    REGION_CN("cn"),
    REGION_SINGAPOER("sg"),
    REGION_USA_EAST("va"),
    REGION_INDIA("in"),
    REGION_BOE("boe"),
    REGION_OTHER("other");

    public final String LJLIL;

    public String getName() {
        return this.LJLIL;
    }

    public static QN7 valueOf(String str) {
        return (QN7) V0N.LJJJ(QN7.class, str);
    }

    QN7(String str) {
        this.LJLIL = str;
    }
}
