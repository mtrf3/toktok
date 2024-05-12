package X;

/* loaded from: classes16.dex */
public final class YX8 extends C1CG<YXH> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR FAIL INTO `localHashTag` (`name`,`time`) VALUES (?,?)";
    }

    public YX8(AbstractC03300Ba abstractC03300Ba) {
        super(abstractC03300Ba);
    }

    @Override // X.C1CG
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
    }
}
