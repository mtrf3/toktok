package X;

import fjb.a;
import java.util.HashSet;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi$tryFilterBeforeUpload$3", f = "ContactFilterByPsi.kt", l = {199}, m = "invokeSuspend")
/* renamed from: X.ELk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36272ELk extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super OSZ<? extends HashSet<String>, ? extends HashSet<String>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36284ELw LJLILLLLZI;
    public final /* synthetic */ EM2 LJLJI;
    public final /* synthetic */ java.util.Set<String> LJLJJI;
    public final /* synthetic */ java.util.Set<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36272ELk(C36284ELw c36284ELw, EM2 em2, java.util.Set<String> set, java.util.Set<String> set2, InterfaceC67352kd<? super C36272ELk> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c36284ELw;
        this.LJLJI = em2;
        this.LJLJJI = set;
        this.LJLJJL = set2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36272ELk(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super OSZ<? extends HashSet<String>, ? extends HashSet<String>>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C36283ELv c36283ELv = new C36283ELv(this.LJLILLLLZI, this.LJLJI);
            java.util.Set<String> set = this.LJLJJI;
            java.util.Set<String> set2 = this.LJLJJL;
            this.LJLIL = 1;
            obj = c36283ELv.LIZLLL(set, set2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
