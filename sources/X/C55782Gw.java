package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.bgbroadcast.game.LiveGameSmallGiftView$handleAutoDismiss$1", f = "LiveGameSmallGiftView.kt", l = {243}, m = "invokeSuspend")
/* renamed from: X.2Gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55782Gw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C37781e2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55782Gw(C37781e2 c37781e2, InterfaceC67352kd<? super C55782Gw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c37781e2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55782Gw(this.LJLILLLLZI, interfaceC67352kd);
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
            long j = this.LJLILLLLZI.LJLJL;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJJLJLI(true, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
