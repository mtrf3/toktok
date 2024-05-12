package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.FavStickerListManager$onLoadMore$4$1", f = "FavStickerListManager.kt", l = {64}, m = "invokeSuspend")
/* renamed from: X.2hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65682hw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ InterfaceC65692hx LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65682hw(Throwable th, InterfaceC65692hx interfaceC65692hx, InterfaceC67352kd<? super C65682hw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = th;
        this.LJLJI = interfaceC65692hx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65682hw(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C34B.LJ("FavStickerListManager", this.LJLILLLLZI);
            InterfaceC65692hx interfaceC65692hx = this.LJLJI;
            this.LJLIL = 1;
            if (interfaceC65692hx.onFailed() == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
