package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchRewardEffects$1", f = "StickerEffectViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55872Hf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ StickerEffectViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55872Hf(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C55872Hf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55872Hf c55872Hf = new C55872Hf(this.LJLILLLLZI, interfaceC67352kd);
        c55872Hf.LJLIL = obj;
        return c55872Hf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        StickerEffectViewModel stickerEffectViewModel = this.LJLILLLLZI;
        stickerEffectViewModel.LJLJLJ = XKX.LIZIZ(interfaceC70422pa, null, null, new C55862He(stickerEffectViewModel, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
