package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.v2.CaptionTextManager$insertCaption$3$1", f = "CaptionTextManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UO3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ UO1 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UO3(UO1 uo1, InterfaceC67352kd<? super UO3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uo1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UO3(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        UO1 uo1 = this.LJLIL;
        UO9 uo9 = uo1.LJIIIZ;
        if (uo9 != null) {
            uo9.LIZIZ(uo1.LJIIL);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
