package X;

/* renamed from: X.YWa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87508YWa extends C1CG<FWF> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR ABORT INTO `showAd` (`awemeId`,`cid`) VALUES (?,?)";
    }

    public C87508YWa(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, FWF fwf) {
        FWF fwf2 = fwf;
        String str = fwf2.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        String str2 = fwf2.LIZIZ;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, str2);
        }
    }
}
