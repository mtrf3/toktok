package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.v2.CaptionTextManager$insertCaption$2", f = "CaptionTextManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UO5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ UO1 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UO5(UO1 uo1, InterfaceC67352kd<? super UO5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uo1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UO5(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LJFF;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
