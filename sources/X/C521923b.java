package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.23b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C521923b extends AbstractC65781Prl implements InterfaceC88472Yns<C10370av, C76800UCe> {
    public final /* synthetic */ C18810oX LJLIL;
    public final /* synthetic */ C0ZJ LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C20140qg LJLJJI;
    public final /* synthetic */ InterfaceC14950iJ LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521923b(C18810oX c18810oX, C0ZJ c0zj, boolean z, C20140qg c20140qg, InterfaceC14950iJ interfaceC14950iJ) {
        super(1);
        this.LJLIL = c18810oX;
        this.LJLILLLLZI = c0zj;
        this.LJLJI = z;
        this.LJLJJI = c20140qg;
        this.LJLJJL = interfaceC14950iJ;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C10370av c10370av) {
        C14760i0 c14760i0;
        long j = c10370av.LIZ;
        C18810oX c18810oX = this.LJLIL;
        C0ZJ c0zj = this.LJLILLLLZI;
        boolean z = !this.LJLJI;
        if (!c18810oX.LIZIZ()) {
            c0zj.LIZIZ();
        } else if (z && (c14760i0 = c18810oX.LIZLLL) != null && o.LJ(c14760i0.LIZ.LIZIZ.get(), c14760i0)) {
            c14760i0.LIZIZ.LJ();
        }
        if (this.LJLIL.LIZIZ()) {
            if (this.LJLIL.LIZ() != EnumC18570o9.Selection) {
                C18830oZ LIZJ = this.LJLIL.LIZJ();
                if (LIZJ != null) {
                    C18810oX c18810oX2 = this.LJLIL;
                    InterfaceC14950iJ offsetMapping = this.LJLJJL;
                    C14780i2 editProcessor = c18810oX2.LIZJ;
                    IDqS416S0100000 onValueChange = c18810oX2.LJIIZILJ;
                    o.LJIIIZ(editProcessor, "editProcessor");
                    o.LJIIIZ(offsetMapping, "offsetMapping");
                    o.LJIIIZ(onValueChange, "onValueChange");
                    int LIZ = offsetMapping.LIZ(LIZJ.LIZIZ(j, true));
                    onValueChange.invoke(C15010iP.LIZ(editProcessor.LIZ, null, C17N.LIZLLL(LIZ, LIZ), 5));
                    if (c18810oX2.LIZ.LIZ.length() > 0) {
                        EnumC18570o9 enumC18570o9 = EnumC18570o9.Cursor;
                        o.LJIIIZ(enumC18570o9, "<set-?>");
                        c18810oX2.LJIIIZ.setValue(enumC18570o9);
                    }
                }
            } else {
                this.LJLJJI.LJI(new C10370av(j));
            }
        }
        return C76800UCe.LIZ;
    }
}
