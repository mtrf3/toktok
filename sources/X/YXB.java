package X;

/* loaded from: classes16.dex */
public final class YXB extends C1CF<C54859Lfz> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "DELETE FROM `AWEME_READ_RECORD` WHERE `AWEME_ID` = ? AND `SCENE` = ?";
    }

    public YXB(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CF
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C54859Lfz c54859Lfz) {
        String str = c54859Lfz.LJLIL;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, r5.LJLJJLL);
    }
}
