package X;

/* renamed from: X.YWb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87509YWb extends C1CF<FWF> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "DELETE FROM `showAd` WHERE `awemeId` = ?";
    }

    public C87509YWb(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CF
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, FWF fwf) {
        String str = fwf.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
    }
}
