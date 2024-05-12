package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {325}, m = "fetchRewardEffectsNew")
/* renamed from: X.28j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C535728j extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C39011g1 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535728j(C39011g1 c39011g1, InterfaceC67352kd<? super C535728j> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c39011g1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIILJJIL(this);
    }
}
