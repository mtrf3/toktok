package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.pux.compose.dialog.PuxDialogKt$DialogContainer$2", f = "PuxDialog.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLl, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93121aLl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC91758Zzm LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93121aLl(InterfaceC91758Zzm interfaceC91758Zzm, InterfaceC67352kd<? super C93121aLl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC91758Zzm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93121aLl(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}