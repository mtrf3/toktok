package X;

import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask$findIntersect$psiUploadEncryptContactResp$1", f = "ContactFilterByPsi.kt", l = {464}, m = "invokeSuspend")
/* renamed from: X.ELp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36277ELp extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super PsiUploadEncryptContactResponseV2>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36283ELv LJLILLLLZI;
    public final /* synthetic */ C36281ELt LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36277ELp(C36283ELv c36283ELv, C36281ELt c36281ELt, InterfaceC67352kd<? super C36277ELp> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c36283ELv;
        this.LJLJI = c36281ELt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36277ELp(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super PsiUploadEncryptContactResponseV2> interfaceC67352kd) {
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
            C36283ELv c36283ELv = this.LJLILLLLZI;
            C36281ELt c36281ELt = this.LJLJI;
            this.LJLIL = 1;
            obj = c36283ELv.LJ(c36281ELt, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
