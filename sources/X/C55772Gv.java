package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.bgbroadcast.game.LiveGameSmallCommentView$handleAutoDismiss$1", f = "LiveGameSmallCommentView.kt", l = {155}, m = "invokeSuspend")
/* renamed from: X.2Gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55772Gv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C30011Ft LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55772Gv(C30011Ft c30011Ft, InterfaceC67352kd<? super C55772Gv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c30011Ft;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55772Gv(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        C12D smallMoreView;
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
            long j = this.LJLILLLLZI.LJLLI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C12D smallMoreView2 = this.LJLILLLLZI.getSmallMoreView();
        if (smallMoreView2 != null) {
            bool = Boolean.valueOf(smallMoreView2.LJJL());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool) && (smallMoreView = this.LJLILLLLZI.getSmallMoreView()) != null) {
            smallMoreView.LJIJ(false);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
