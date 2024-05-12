package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$fetchStoryBulletList$1$pageValue$1", f = "StoryInteractionListManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7C0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7C0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C79Y LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7C0(C79Y c79y, InterfaceC67352kd<? super C7C0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c79y;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7C0(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLIL.LJLZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
