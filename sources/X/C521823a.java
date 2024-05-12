package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.23a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C521823a extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC09480Yu, C76800UCe> {
    public final /* synthetic */ C18810oX LJLIL;
    public final /* synthetic */ C15020iQ LJLILLLLZI;
    public final /* synthetic */ C15010iP LJLJI;
    public final /* synthetic */ C14870iB LJLJJI;
    public final /* synthetic */ C20140qg LJLJJL;
    public final /* synthetic */ InterfaceC70422pa LJLJJLL;
    public final /* synthetic */ InterfaceC14660hq LJLJL;
    public final /* synthetic */ InterfaceC14950iJ LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521823a(C18810oX c18810oX, C15020iQ c15020iQ, C15010iP c15010iP, C14870iB c14870iB, C20140qg c20140qg, InterfaceC70422pa interfaceC70422pa, InterfaceC14660hq interfaceC14660hq, InterfaceC14950iJ interfaceC14950iJ) {
        super(1);
        this.LJLIL = c18810oX;
        this.LJLILLLLZI = c15020iQ;
        this.LJLJI = c15010iP;
        this.LJLJJI = c14870iB;
        this.LJLJJL = c20140qg;
        this.LJLJJLL = interfaceC70422pa;
        this.LJLJL = interfaceC14660hq;
        this.LJLJLJ = interfaceC14950iJ;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC09480Yu interfaceC09480Yu) {
        C18830oZ LIZJ;
        InterfaceC09480Yu it = interfaceC09480Yu;
        o.LJIIIZ(it, "it");
        if (this.LJLIL.LIZIZ() != it.isFocused()) {
            this.LJLIL.LJ.setValue(Boolean.valueOf(it.isFocused()));
            C15020iQ c15020iQ = this.LJLILLLLZI;
            if (c15020iQ != null) {
                C18810oX c18810oX = this.LJLIL;
                C15010iP value = this.LJLJI;
                C14870iB imeOptions = this.LJLJJI;
                if (c18810oX.LIZIZ()) {
                    C14780i2 editProcessor = c18810oX.LIZJ;
                    IDqS416S0100000 onValueChange = c18810oX.LJIIZILJ;
                    IDqS416S0100000 onImeActionPerformed = c18810oX.LJIJ;
                    o.LJIIIZ(value, "value");
                    o.LJIIIZ(editProcessor, "editProcessor");
                    o.LJIIIZ(imeOptions, "imeOptions");
                    o.LJIIIZ(onValueChange, "onValueChange");
                    o.LJIIIZ(onImeActionPerformed, "onImeActionPerformed");
                    c18810oX.LIZLLL = C18780oU.LIZ(c15020iQ, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
                } else {
                    C18750oR.LJ(c18810oX);
                }
                if (it.isFocused() && (LIZJ = this.LJLIL.LIZJ()) != null) {
                    XKX.LIZLLL(this.LJLJJLL, null, null, new C2FU(this.LJLJL, this.LJLJI, this.LJLIL, LIZJ, this.LJLJLJ, null), 3);
                }
            }
            if (!it.isFocused()) {
                this.LJLJJL.LJI(null);
            }
        }
        return C76800UCe.LIZ;
    }
}
