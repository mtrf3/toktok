package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {97}, m = "fetchRemoteDataNew")
/* renamed from: X.28i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C535628i extends C3CS {
    public C39011g1 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C39011g1 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535628i(C39011g1 c39011g1, InterfaceC67352kd<? super C535628i> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c39011g1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJIILIIL(this);
    }
}
