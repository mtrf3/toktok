package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactLegacyHandler$upload$2", f = "ContactLegacyHandler.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.ELl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36273ELl extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super ContactUploadResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ EML LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36273ELl(EML eml, java.util.Map<String, String> map, InterfaceC67352kd<? super C36273ELl> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = eml;
        this.LJLJI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36273ELl(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C36284ELw c36284ELw = this.LJLILLLLZI.LJFF;
            java.util.Map<String, String> map = this.LJLJI;
            this.LJLIL = 1;
            obj = c36284ELw.LIZ(map, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
