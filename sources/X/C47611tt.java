package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {200, 205, 211, 212, 213, 222, 224, 227, 233, 235}, m = "fetchNormalCategoryList")
/* renamed from: X.1tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47611tt extends C3CS {
    public StickerEffectViewModel LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ StickerEffectViewModel LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47611tt(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C47611tt> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.qv0(null, this);
    }
}
