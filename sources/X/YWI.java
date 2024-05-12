package X;

/* loaded from: classes16.dex */
public final class YWI extends C1CG<Y83> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `translation` (`key`,`value`) VALUES (?,?)";
    }

    public YWI(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, Y83 y83) {
        Y83 y832 = y83;
        String str = y832.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        String str2 = y832.LIZIZ;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, str2);
        }
    }
}
