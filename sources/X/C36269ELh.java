package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi$tryFilterBeforeUpload$4$1", f = "ContactFilterByPsi.kt", l = {278}, m = "invokeSuspend")
/* renamed from: X.ELh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36269ELh extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super ContactUploadResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<List<ContactBookUploadItem>, InterfaceC67352kd<? super ContactUploadResponse>, Object> LJLILLLLZI;
    public final /* synthetic */ List<ContactBookUploadItem> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36269ELh(List list, InterfaceC67352kd interfaceC67352kd, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36269ELh(this.LJLJI, interfaceC67352kd, this.LJLILLLLZI);
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
            InterfaceC88471Ynr<List<ContactBookUploadItem>, InterfaceC67352kd<? super ContactUploadResponse>, Object> interfaceC88471Ynr = this.LJLILLLLZI;
            List<ContactBookUploadItem> list = this.LJLJI;
            this.LJLIL = 1;
            obj = interfaceC88471Ynr.invoke(list, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
