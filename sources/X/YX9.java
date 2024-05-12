package X;

/* loaded from: classes16.dex */
public final class YX9 extends C1CF<YXH> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "UPDATE OR FAIL `localHashTag` SET `name` = ?,`time` = ? WHERE `name` = ?";
    }

    public YX9(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CF
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, YXH yxh) {
        YXH yxh2 = yxh;
        String str = yxh2.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        Long l = yxh2.LIZIZ;
        if (l == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJIIIZ(2, l.longValue());
        }
        String str2 = yxh2.LIZ;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(3);
        } else {
            interfaceC37591dj.LJJII(3, str2);
        }
    }
}
