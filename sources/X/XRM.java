package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class XRM {
    public static final XRL LJLIL;
    public static final /* synthetic */ XRM[] LJLILLLLZI;

    public XRM() {
        throw null;
    }

    static {
        XRL xrl = new XRL();
        LJLIL = xrl;
        LJLILLLLZI = new XRM[]{xrl, new XRM() { // from class: X.XRN
        }, new XRM() { // from class: X.XRO
        }};
    }

    public static XRM[] values() {
        return (XRM[]) LJLILLLLZI.clone();
    }

    public static XRM valueOf(String str) {
        return (XRM) V0N.LJJJ(XRM.class, str);
    }

    public XRM(String str, int i) {
    }
}
