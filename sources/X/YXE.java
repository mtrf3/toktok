package X;

/* loaded from: classes16.dex */
public final class YXE extends C1CF<YXF> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "UPDATE OR ABORT `RECENT_SHARE` SET `ID` = ?,`SHARE_TIME` = ?,`SEND_TIME` = ?,`CURR_UID` = ?,`SHARE_TYPE` = ? WHERE `ID` = ? AND `CURR_UID` = ?";
    }

    public YXE(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CF
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, YXF yxf) {
        YXF yxf2 = yxf;
        String str = yxf2.LJLIL;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, yxf2.LJLILLLLZI);
        interfaceC37591dj.LJIIIZ(3, yxf2.LJLJI);
        String str2 = yxf2.LJLJJI;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(4);
        } else {
            interfaceC37591dj.LJJII(4, str2);
        }
        String str3 = yxf2.LJLJJL;
        if (str3 == null) {
            interfaceC37591dj.LLLLLLJ(5);
        } else {
            interfaceC37591dj.LJJII(5, str3);
        }
        String str4 = yxf2.LJLIL;
        if (str4 == null) {
            interfaceC37591dj.LLLLLLJ(6);
        } else {
            interfaceC37591dj.LJJII(6, str4);
        }
        String str5 = yxf2.LJLJJI;
        if (str5 == null) {
            interfaceC37591dj.LLLLLLJ(7);
        } else {
            interfaceC37591dj.LJJII(7, str5);
        }
    }
}
