package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase$callbackResult$2", f = "CreateConversationUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87373bp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C87383bq LJLIL;
    public final /* synthetic */ InterfaceC86963bA<C63120Opw> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87373bp(C87383bq c87383bq, InterfaceC86963bA<C63120Opw> interfaceC86963bA, InterfaceC67352kd<? super C87373bp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c87383bq;
        this.LJLILLLLZI = interfaceC86963bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C87373bp(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C87383bq c87383bq = this.LJLIL;
        C63120Opw c63120Opw = c87383bq.LIZ;
        if (c63120Opw != null) {
            InterfaceC86963bA<C63120Opw> interfaceC86963bA = this.LJLILLLLZI;
            if (interfaceC86963bA instanceof AnonymousClass379) {
                ((AnonymousClass379) interfaceC86963bA).LIZ(c63120Opw, c87383bq.LIZIZ);
            } else {
                interfaceC86963bA.onSuccess(c63120Opw);
            }
        } else {
            this.LJLILLLLZI.LIZIZ(c87383bq.LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
