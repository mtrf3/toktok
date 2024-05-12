package X;

/* loaded from: classes16.dex */
public final class YXA extends C1CG<C54859Lfz> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `AWEME_READ_RECORD` (`AWEME_ID`,`READ_TIME`,`PAGE_TYPE`,`REPORTED`,`USER_ID`,`SCENE`,`INSERT_TIME`) VALUES (?,?,?,?,?,?,?)";
    }

    public YXA(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C54859Lfz c54859Lfz) {
        C54859Lfz c54859Lfz2 = c54859Lfz;
        String str = c54859Lfz2.LJLIL;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, c54859Lfz2.LJLILLLLZI);
        interfaceC37591dj.LJIIIZ(3, c54859Lfz2.LJLJI);
        interfaceC37591dj.LJIIIZ(4, c54859Lfz2.LJLJJI ? 1L : 0L);
        String str2 = c54859Lfz2.LJLJJL;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(5);
        } else {
            interfaceC37591dj.LJJII(5, str2);
        }
        interfaceC37591dj.LJIIIZ(6, c54859Lfz2.LJLJJLL);
        interfaceC37591dj.LJIIIZ(7, c54859Lfz2.LJLJL);
    }
}
