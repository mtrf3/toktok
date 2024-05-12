package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.ConversationContentHandler$updateContent$1", f = "ConversationContentHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2y6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75702y6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC86963bA<C63120Opw> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75702y6(Object obj, String str, int i, InterfaceC86963bA<C63120Opw> interfaceC86963bA, InterfaceC67352kd<? super C75702y6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = obj;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = interfaceC86963bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75702y6(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String LIZJ = C75792yF.LIZJ(this.LJLIL);
        C75732y9.LIZJ(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, LIZJ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
