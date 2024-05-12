package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.page.LiveStickerDialogView$updateUiAfterEffectRemovedOrRestored$1", f = "LiveStickerDialogView.kt", l = {298, 299}, m = "invokeSuspend")
/* renamed from: X.2BM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ViewOnLayoutChangeListenerC30741Io LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2BM(ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io, String str, InterfaceC67352kd<? super C2BM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = viewOnLayoutChangeListenerC30741Io;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BM(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            XK4 xk4 = this.LJLILLLLZI.LJLJLJ.LJLILLLLZI;
            C36881ca c36881ca = new C36881ca(this.LJLJI);
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c36881ca, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XK4 xk42 = this.LJLILLLLZI.LJLJLJ.LJLILLLLZI;
        C36911cd c36911cd = C36911cd.LIZ;
        this.LJLIL = 2;
        if (xk42.LJIIIZ(c36911cd, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
