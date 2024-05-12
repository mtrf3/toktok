package X;

import Y.IDfS125S0100000;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.effecthouse.EffectInfoActionsDialog;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.effecthouse.EffectInfoActionsDialog$observeViewModel$1", f = "EffectInfoActionsDialog.kt", l = {266}, m = "invokeSuspend")
/* renamed from: X.29O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29O extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectInfoActionsDialog LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29O(EffectInfoActionsDialog effectInfoActionsDialog, InterfaceC67352kd<? super C29O> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectInfoActionsDialog;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29O(this.LJLILLLLZI, interfaceC67352kd);
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
                XLL xll = stickerEffectViewModel.LJLJI;
                IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(effectInfoActionsDialog, 0);
                this.LJLIL = 1;
                if (xll.collect(iDfS125S0100000, this) == enumC58928NAu) {
                    return enumC58928NAu;
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
