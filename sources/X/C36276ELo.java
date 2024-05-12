package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactHandler$handleInternal$uploadResponse$1", f = "ContactHandler.kt", l = {63}, m = "invokeSuspend")
/* renamed from: X.ELo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36276ELo extends AbstractC65782Prm implements InterfaceC88471Ynr<List<? extends ContactBookUploadItem>, InterfaceC67352kd<? super ContactUploadResponse>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EMK LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36276ELo(EMK emk, InterfaceC67352kd<? super C36276ELo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = emk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36276ELo c36276ELo = new C36276ELo(this.LJLJI, interfaceC67352kd);
        c36276ELo.LJLILLLLZI = obj;
        return c36276ELo;
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
            java.util.Map map = (java.util.Map) this.LJLJI.LIZJ.LJIIIZ(new AqS156S0100000_6((List) this.LJLILLLLZI, (List<EEY>) 106));
            EMK emk = this.LJLJI;
            this.LJLIL = 1;
            obj = emk.LIZJ.LJIIL(new C36274ELm(emk, map, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<? extends ContactBookUploadItem> list, InterfaceC67352kd<? super ContactUploadResponse> interfaceC67352kd) {
        return ((a) create(list, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
