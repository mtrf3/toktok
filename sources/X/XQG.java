package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class XQG {
    public static final XQG COLLECTED;
    public static final XQG EXPIRED;
    public static final XQG EXPLICIT;
    public static final /* synthetic */ XQG[] LJLIL;
    public static final XQG REPLACED;
    public static final XQG SIZE;

    public XQG() {
        throw null;
    }

    public abstract boolean LIZJ();

    static {
        XQG xqg = new XQG() { // from class: X.XQS
            @Override // X.XQG
            public final boolean LIZJ() {
                return false;
            }
        };
        EXPLICIT = xqg;
        XQG xqg2 = new XQG() { // from class: X.XQT
            @Override // X.XQG
            public final boolean LIZJ() {
                return false;
            }
        };
        REPLACED = xqg2;
        XQG xqg3 = new XQG() { // from class: X.XQU
            @Override // X.XQG
            public final boolean LIZJ() {
                return true;
            }
        };
        COLLECTED = xqg3;
        XQG xqg4 = new XQG() { // from class: X.XQV
            @Override // X.XQG
            public final boolean LIZJ() {
                return true;
            }
        };
        EXPIRED = xqg4;
        XQG xqg5 = new XQG() { // from class: X.XQW
            @Override // X.XQG
            public final boolean LIZJ() {
                return true;
            }
        };
        SIZE = xqg5;
        LJLIL = new XQG[]{xqg, xqg2, xqg3, xqg4, xqg5};
    }

    public static XQG[] values() {
        return (XQG[]) LJLIL.clone();
    }

    public static XQG valueOf(String str) {
        return (XQG) V0N.LJJJ(XQG.class, str);
    }

    public XQG(String str, int i) {
    }
}
