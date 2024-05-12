package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ShareAwemeReceiveAutoPlayViewHolder$fetchPlayerData$1$1", f = "ShareAwemeReceiveAutoPlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3IL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC69952op LJLIL;
    public final /* synthetic */ AnonymousClass476 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3IL(AbstractC69952op abstractC69952op, AnonymousClass476 anonymousClass476, boolean z, InterfaceC67352kd<? super C3IL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC69952op;
        this.LJLILLLLZI = anonymousClass476;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3IL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "query failed ");
        LIZIZ.append(this.LJLIL.LIZ);
        LIZIZ.append("  Exception ");
        C34B.LIZJ("ShareAwemeReceiveAuto", X1D.LIZIZ(LIZIZ));
        AnonymousClass476 anonymousClass476 = this.LJLILLLLZI;
        if (!this.LJLJI) {
            anonymousClass476.LLIIZ.setVisibility(8);
        } else {
            anonymousClass476.getClass();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
