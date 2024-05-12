package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class XQ9 {
    public static final XQD LJLIL;
    public static final XQA LJLILLLLZI;
    public static final /* synthetic */ XQ9[] LJLJI;

    public XQ9() {
        throw null;
    }

    public abstract XQK<Object> LIZJ();

    public abstract XPL LIZLLL(int i, XQ2 xq2, InterfaceC84796XPs interfaceC84796XPs, Object obj);

    static {
        XQD xqd = new XQD();
        LJLIL = xqd;
        XQ9 xq9 = new XQ9() { // from class: X.XQB
            @Override // X.XQ9
            public final XQK<Object> LIZJ() {
                return XQM.LJLIL;
            }

            @Override // X.XQ9
            public final XPL LIZLLL(int i, XQ2 xq2, InterfaceC84796XPs interfaceC84796XPs, Object obj) {
                if (i == 1) {
                    return new XPH(xq2.LJLJLLL, obj, interfaceC84796XPs);
                }
                return new XPK(i, interfaceC84796XPs, obj, xq2.LJLJLLL);
            }
        };
        XQA xqa = new XQA();
        LJLILLLLZI = xqa;
        LJLJI = new XQ9[]{xqd, xq9, xqa};
    }

    public static XQ9[] values() {
        return (XQ9[]) LJLJI.clone();
    }

    public static XQ9 valueOf(String str) {
        return (XQ9) V0N.LJJJ(XQ9.class, str);
    }

    public XQ9(String str, int i) {
    }
}
