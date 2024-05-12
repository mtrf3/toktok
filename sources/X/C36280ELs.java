package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask$findIntersect$2", f = "ContactFilterByPsi.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ELs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36280ELs extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C36283ELv LJLIL;
    public final /* synthetic */ C36281ELt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36280ELs(C36283ELv c36283ELv, C36281ELt c36281ELt, InterfaceC67352kd<? super C36280ELs> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c36283ELv;
        this.LJLILLLLZI = c36281ELt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36280ELs(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZIZ.LJIJJ = this.LJLILLLLZI.LIZ.size();
        this.LJLIL.LIZIZ.LJIILLIIL = this.LJLILLLLZI.LIZIZ.size();
        C36283ELv c36283ELv = this.LJLIL;
        C36281ELt c36281ELt = this.LJLILLLLZI;
        c36283ELv.getClass();
        C36283ELv.LIZ(c36283ELv, c36281ELt.LIZ, (byte[]) c36283ELv.LIZJ.getValue());
        C36283ELv.LIZ(c36283ELv, c36281ELt.LIZIZ, (byte[]) c36283ELv.LIZJ.getValue());
        return C76800UCe.LIZ;
    }
}
