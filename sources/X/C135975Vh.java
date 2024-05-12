package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$3$13", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135975Vh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C43544H7c LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C135975Vh(C43544H7c c43544H7c, InterfaceC67352kd<? super C135975Vh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c43544H7c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C135975Vh(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.dismissDialog();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
