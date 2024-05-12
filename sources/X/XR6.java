package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class XR6 {
    public static final XR6 COLLECTED;
    public static final XR6 EXPIRED;
    public static final XR6 EXPLICIT;
    public static final /* synthetic */ XR6[] LJLIL;
    public static final XR6 REPLACED;
    public static final XR6 SIZE;

    public XR6() {
        throw null;
    }

    public abstract boolean LIZJ();

    static {
        XR6 xr6 = new XR6() { // from class: X.XRG
            @Override // X.XR6
            public final boolean LIZJ() {
                return false;
            }
        };
        EXPLICIT = xr6;
        XR6 xr62 = new XR6() { // from class: X.XRH
            @Override // X.XR6
            public final boolean LIZJ() {
                return false;
            }
        };
        REPLACED = xr62;
        XR6 xr63 = new XR6() { // from class: X.XRI
            @Override // X.XR6
            public final boolean LIZJ() {
                return true;
            }
        };
        COLLECTED = xr63;
        XR6 xr64 = new XR6() { // from class: X.XRJ
            @Override // X.XR6
            public final boolean LIZJ() {
                return true;
            }
        };
        EXPIRED = xr64;
        XR6 xr65 = new XR6() { // from class: X.XRK
            @Override // X.XR6
            public final boolean LIZJ() {
                return true;
            }
        };
        SIZE = xr65;
        LJLIL = new XR6[]{xr6, xr62, xr63, xr64, xr65};
    }

    public static XR6[] values() {
        return (XR6[]) LJLIL.clone();
    }

    public static XR6 valueOf(String str) {
        return (XR6) V0N.LJJJ(XR6.class, str);
    }

    public XR6(String str, int i) {
    }
}
