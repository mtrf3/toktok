package X;

/* loaded from: classes16.dex */
public final class YX6 extends C1CG<C62707OjH> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR ABORT INTO `Record` (`rid`,`time`,`channel`,`share_type`) VALUES (nullif(?, 0),?,?,?)";
    }

    public YX6(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C62707OjH c62707OjH) {
        C62707OjH c62707OjH2 = c62707OjH;
        interfaceC37591dj.LJIIIZ(1, c62707OjH2.LIZ);
        Long l = c62707OjH2.LIZIZ;
        if (l == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJIIIZ(2, l.longValue());
        }
        String str = c62707OjH2.LIZJ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(3);
        } else {
            interfaceC37591dj.LJJII(3, str);
        }
        if (c62707OjH2.LIZLLL == null) {
            interfaceC37591dj.LLLLLLJ(4);
        } else {
            interfaceC37591dj.LJIIIZ(4, r0.intValue());
        }
    }
}
