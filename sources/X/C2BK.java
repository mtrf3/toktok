package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.page.LiveStickerDialogView$bindFavoriteView$1$change$1$1", f = "LiveStickerDialogView.kt", l = {329}, m = "invokeSuspend")
/* renamed from: X.2BK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ViewOnLayoutChangeListenerC30741Io LJLILLLLZI;
    public final /* synthetic */ LiveEffect LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2BK(ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io, LiveEffect liveEffect, boolean z, InterfaceC67352kd<? super C2BK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = viewOnLayoutChangeListenerC30741Io;
        this.LJLJI = liveEffect;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XK4 xk4 = this.LJLILLLLZI.LJLJLJ.LJLILLLLZI;
            C36971cj c36971cj = new C36971cj(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c36971cj, this) == enumC58928NAu) {
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
