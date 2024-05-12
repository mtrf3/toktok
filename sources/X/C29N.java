package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.effecthouse.EffectInfoActionsDialog;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.effecthouse.EffectInfoActionsDialog$initFavoriteEffectGroup$1$1$1", f = "EffectInfoActionsDialog.kt", l = {95}, m = "invokeSuspend")
/* renamed from: X.29N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29N extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectInfoActionsDialog LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29N(EffectInfoActionsDialog effectInfoActionsDialog, InterfaceC67352kd<? super C29N> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectInfoActionsDialog;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29N(this.LJLILLLLZI, interfaceC67352kd);
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
            EffectInfoActionsDialog effectInfoActionsDialog = this.LJLILLLLZI;
            StickerEffectViewModel stickerEffectViewModel = effectInfoActionsDialog.LJLILLLLZI;
            if (stickerEffectViewModel != null) {
                XK4 xk4 = stickerEffectViewModel.LJLILLLLZI;
                LiveEffect liveEffect = effectInfoActionsDialog.LJLIL;
                if (liveEffect != null) {
                    C36971cj c36971cj = new C36971cj(liveEffect, !effectInfoActionsDialog.LJLJJI);
                    this.LJLIL = 1;
                    if (xk4.LJIIIZ(c36971cj, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    o.LJIJI("selectedEffect");
                    throw null;
                }
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
