package X;

import Y.IDfS20S0200000;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget$observeViewModel$1$invokeSuspend$$inlined$collect$1", f = "StickerShortCutWidget.kt", l = {141}, m = "emit")
/* renamed from: X.1x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49541x0 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS20S0200000 LJLJI;
    public IDfS20S0200000 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49541x0(IDfS20S0200000 iDfS20S0200000, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS20S0200000;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
