package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.HandleShareProcessModel$hideProgressBar$1", f = "HandleShareProcessModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72622t8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C43703HDf LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72622t8(C43703HDf c43703HDf, InterfaceC67352kd<? super C72622t8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c43703HDf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72622t8(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        DialogC25756A8y dialogC25756A8y = this.LJLIL.LIZ;
        if (dialogC25756A8y != null) {
            V1B.LJLILLLLZI(dialogC25756A8y);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
