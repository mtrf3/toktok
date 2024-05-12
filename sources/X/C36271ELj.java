package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactFilterByPsi$Companion$uploadAfterTryPsiFilter$resp$1", f = "ContactFilterByPsi.kt", l = {82}, m = "invokeSuspend")
/* renamed from: X.ELj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36271ELj extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super ContactUploadResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36284ELw LJLILLLLZI;
    public final /* synthetic */ EM2 LJLJI;
    public final /* synthetic */ List<ContactBookUploadItem> LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<List<ContactBookUploadItem>, InterfaceC67352kd<? super ContactUploadResponse>, Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36271ELj(C36284ELw c36284ELw, EM2 em2, List<ContactBookUploadItem> list, InterfaceC88471Ynr<? super List<ContactBookUploadItem>, ? super InterfaceC67352kd<? super ContactUploadResponse>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C36271ELj> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c36284ELw;
        this.LJLJI = em2;
        this.LJLJJI = list;
        this.LJLJJL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36271ELj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super ContactUploadResponse> interfaceC67352kd) {
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
            EM1 em1 = new EM1();
            C36284ELw c36284ELw = this.LJLILLLLZI;
            EM2 em2 = this.LJLJI;
            List<ContactBookUploadItem> list = this.LJLJJI;
            InterfaceC88471Ynr<List<ContactBookUploadItem>, InterfaceC67352kd<? super ContactUploadResponse>, Object> interfaceC88471Ynr = this.LJLJJL;
            this.LJLIL = 1;
            obj = em1.LIZ(c36284ELw, em2, list, interfaceC88471Ynr, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
