package X;

/* loaded from: classes16.dex */
public enum XQA extends XQ9 {
    public XQA() {
        super("WEAK", 2);
    }

    @Override // X.XQ9
    public final XQK<Object> LIZJ() {
        return XQM.LJLIL;
    }

    @Override // X.XQ9
    public final XPL LIZLLL(int i, XQ2 xq2, InterfaceC84796XPs interfaceC84796XPs, Object obj) {
        if (i == 1) {
            return new XPM(xq2.LJLJLLL, obj, interfaceC84796XPs);
        }
        return new XPN(i, interfaceC84796XPs, obj, xq2.LJLJLLL);
    }
}
