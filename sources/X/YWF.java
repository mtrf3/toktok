package X;

/* loaded from: classes16.dex */
public final class YWF extends C1CF<YNU> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "UPDATE OR ABORT `SHARE_PERMISSION` SET `UID` = ?,`COLUMN_USER_SHARE_STATUS` = ?,`TTN_SHARE_STATUS` = ?,`UPDATE_TIME` = ?,`EXTRA` = ? WHERE `UID` = ?";
    }

    public YWF(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CF
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, YNU ynu) {
        YNU ynu2 = ynu;
        interfaceC37591dj.LJIIIZ(1, ynu2.LIZ);
        if (ynu2.LIZIZ == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJIIIZ(2, r0.intValue());
        }
        if (ynu2.LIZJ == null) {
            interfaceC37591dj.LLLLLLJ(3);
        } else {
            interfaceC37591dj.LJIIIZ(3, r0.intValue());
        }
        interfaceC37591dj.LJIIIZ(4, ynu2.LIZLLL);
        String str = ynu2.LJ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(5);
        } else {
            interfaceC37591dj.LJJII(5, str);
        }
        interfaceC37591dj.LJIIIZ(6, ynu2.LIZ);
    }
}
