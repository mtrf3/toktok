package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$createGroupConversation$1", f = "IMUseCaseClient.kt", l = {299}, m = "invokeSuspend")
/* renamed from: X.2xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75632xz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ List<Long> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ java.util.Map<String, String> LJLJJLL;
    public final /* synthetic */ InterfaceC86963bA<C63120Opw> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75632xz(C63383OuB c63383OuB, int i, List<Long> list, String str, java.util.Map<String, String> map, InterfaceC86963bA<C63120Opw> interfaceC86963bA, InterfaceC67352kd<? super C75632xz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63383OuB;
        this.LJLJI = i;
        this.LJLJJI = list;
        this.LJLJJL = str;
        this.LJLJJLL = map;
        this.LJLJL = interfaceC86963bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75632xz(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            C63560Ox2 c63560Ox2 = this.LJLILLLLZI.LJIIIZ;
            int i2 = this.LJLJI;
            List<Long> list = this.LJLJJI;
            String str = this.LJLJJL;
            java.util.Map<String, String> map = this.LJLJJLL;
            InterfaceC86963bA<C63120Opw> interfaceC86963bA = this.LJLJL;
            this.LJLIL = 1;
            if (c63560Ox2.LIZIZ(i2, list, str, map, interfaceC86963bA, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
