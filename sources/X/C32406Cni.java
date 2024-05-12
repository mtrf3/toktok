package X;

/* renamed from: X.Cni, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32406Cni extends AbstractC32415Cnr {
    public C32406Cni(AbstractC32415Cnr abstractC32415Cnr) {
        super(abstractC32415Cnr);
    }

    @Override // X.AbstractC32415Cnr
    public final void LIZ(C32399Cnb c32399Cnb) {
        InterfaceC32416Cns interfaceC32416Cns;
        if (c32399Cnb != null && (interfaceC32416Cns = c32399Cnb.LJ) != null) {
            if (c32399Cnb.LJII) {
                interfaceC32416Cns.LIZLLL(c32399Cnb.LJIIJJI, c32399Cnb.LJIIJ);
            } else {
                EnumC32408Cnk enumC32408Cnk = c32399Cnb.LJIIIZ;
                if (enumC32408Cnk == EnumC32408Cnk.ERROR) {
                    interfaceC32416Cns.onFailed(c32399Cnb.LJIIL);
                } else if (c32399Cnb.LJIIIIZZ) {
                    interfaceC32416Cns.onFailed(new Throwable("The request was timeout"));
                } else if (enumC32408Cnk == EnumC32408Cnk.CANCEL) {
                    interfaceC32416Cns.LIZ(c32399Cnb.LJIIJJI);
                }
            }
        }
        AbstractC32415Cnr abstractC32415Cnr = this.LIZ;
        if (abstractC32415Cnr != null) {
            abstractC32415Cnr.LIZ(c32399Cnb);
        }
    }
}
