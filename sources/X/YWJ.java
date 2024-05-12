package X;

/* loaded from: classes16.dex */
public final class YWJ extends C1CG<Y84> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `information` (`key`,`value`) VALUES (?,?)";
    }

    public YWJ(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, Y84 y84) {
        Y84 y842 = y84;
        String str = y842.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        String str2 = y842.LIZIZ;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, str2);
        }
    }
}
