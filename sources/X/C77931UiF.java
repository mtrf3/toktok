package X;

import fjb.a;

@InterfaceC65848Psq(c = "tiktok.compose.paging.PagingLazyExtensionKt$collectAsPagingLazyState$1$1", f = "PagingLazyExtension.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.UiF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77931UiF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C225138sX<Object> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77931UiF(C225138sX<Object> c225138sX, InterfaceC67352kd<? super C77931UiF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c225138sX;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77931UiF(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJFF();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
