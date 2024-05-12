package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {183, 185, 189}, m = "fetchRewardCategoryList")
/* renamed from: X.1tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47621tu extends C3CS {
    public StickerEffectViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StickerEffectViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47621tu(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C47621tu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.rv0(this);
    }
}
