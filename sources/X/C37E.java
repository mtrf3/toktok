package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$insertOrUpdatePaginationData$1", f = "SessionListManagerV2.kt", l = {918}, m = "invokeSuspend")
/* renamed from: X.37E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37E extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends IMUser>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C82253Kr LJLILLLLZI;
    public final /* synthetic */ List<C63120Opw> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C37E(C82253Kr c82253Kr, List<? extends C63120Opw> list, InterfaceC67352kd<? super C37E> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c82253Kr;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37E(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C82253Kr c82253Kr = this.LJLILLLLZI;
            List<C63120Opw> list = this.LJLJI;
            this.LJLIL = 1;
            c82253Kr.getClass();
            obj = C82253Kr.LJJIIJ(list, this, true);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
