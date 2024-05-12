package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserWithBufferUseCase$onPullMessagesEnd$2", f = "GetMsgByUserWithBufferUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Otw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63368Otw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63368Otw(int i, int i2, boolean z, InterfaceC67352kd<? super C63368Otw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63368Otw(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL == 0) {
            C63309Osz.LIZLLL().LIZIZ(this.LJLILLLLZI);
        }
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        boolean z = this.LJLJI;
        LIZLLL.getClass();
        C63309Osz.LJI(z);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
