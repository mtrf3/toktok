package X;

/* renamed from: X.Zdx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90405Zdx {
    public final AbstractC90761Zjh LIZ;

    public C90405Zdx(C90898Zlu c90898Zlu) {
        this.LIZ = c90898Zlu;
        c90898Zlu.LIZ = this;
    }

    public final void LIZ(int i, InterfaceC90399Zdr interfaceC90399Zdr, Object obj) {
        AbstractC90761Zjh abstractC90761Zjh = this.LIZ;
        abstractC90761Zjh.LJIIL(i, 3);
        interfaceC90399Zdr.LJI(obj, abstractC90761Zjh.LIZ);
        abstractC90761Zjh.LJIIL(i, 4);
    }

    public final void LIZIZ(int i, InterfaceC90399Zdr interfaceC90399Zdr, Object obj) {
        AbstractC90761Zjh abstractC90761Zjh = this.LIZ;
        InterfaceC90712Ziu interfaceC90712Ziu = (InterfaceC90712Ziu) obj;
        abstractC90761Zjh.LJIILJJIL((i << 3) | 2);
        AbstractC90893Zlp abstractC90893Zlp = (AbstractC90893Zlp) interfaceC90712Ziu;
        int LIZ = abstractC90893Zlp.LIZ();
        if (LIZ == -1) {
            LIZ = interfaceC90399Zdr.LIZJ(abstractC90893Zlp);
            abstractC90893Zlp.LIZIZ(LIZ);
        }
        abstractC90761Zjh.LJIILJJIL(LIZ);
        interfaceC90399Zdr.LJI(interfaceC90712Ziu, abstractC90761Zjh.LIZ);
    }
}
