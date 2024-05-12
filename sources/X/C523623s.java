package X;

/* renamed from: X.23s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523623s extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, Integer, Boolean, Boolean> {
    public final /* synthetic */ InterfaceC14950iJ LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C15010iP LJLJI;
    public final /* synthetic */ C20140qg LJLJJI;
    public final /* synthetic */ C18810oX LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C523623s(InterfaceC14950iJ interfaceC14950iJ, boolean z, C15010iP c15010iP, C20140qg c20140qg, C18810oX c18810oX) {
        super(3);
        this.LJLIL = interfaceC14950iJ;
        this.LJLILLLLZI = z;
        this.LJLJI = c15010iP;
        this.LJLJJI = c20140qg;
        this.LJLJJL = c18810oX;
    }

    @Override // X.InterfaceC88473Ynt
    public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
        int i;
        int i2;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        boolean booleanValue = bool.booleanValue();
        if (!booleanValue) {
            intValue = this.LJLIL.LIZ(intValue);
            intValue2 = this.LJLIL.LIZ(intValue2);
        }
        boolean z = false;
        if (this.LJLILLLLZI) {
            long j = this.LJLJI.LIZIZ;
            if (intValue != ((int) (j >> 32)) || intValue2 != C08350Ul.LIZJ(j)) {
                if (intValue > intValue2) {
                    i = intValue2;
                } else {
                    i = intValue;
                }
                if (i >= 0) {
                    if (intValue < intValue2) {
                        i2 = intValue2;
                    } else {
                        i2 = intValue;
                    }
                    if (i2 <= this.LJLJI.LIZ.length()) {
                        if (booleanValue || intValue == intValue2) {
                            C20140qg c20140qg = this.LJLJJI;
                            C18810oX c18810oX = c20140qg.LIZLLL;
                            if (c18810oX != null) {
                                c18810oX.LJIIJ = false;
                            }
                            c20140qg.LJIIL(EnumC18570o9.None);
                        } else {
                            this.LJLJJI.LJII();
                        }
                        this.LJLJJL.LJIIZILJ.invoke(new C15010iP(this.LJLJI.LIZ, C17N.LIZLLL(intValue, intValue2), (C08350Ul) null));
                        z = true;
                    }
                }
                C20140qg c20140qg2 = this.LJLJJI;
                C18810oX c18810oX2 = c20140qg2.LIZLLL;
                if (c18810oX2 != null) {
                    c18810oX2.LJIIJ = false;
                }
                c20140qg2.LJIIL(EnumC18570o9.None);
            }
        }
        return Boolean.valueOf(z);
    }
}
