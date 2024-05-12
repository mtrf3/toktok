package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {409}, m = "fetchEffectListFromRemoteNew")
/* renamed from: X.28g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C535428g extends C3CS {
    public C39011g1 LJLIL;
    public Object LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C39011g1 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535428g(C39011g1 c39011g1, InterfaceC67352kd<? super C535428g> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c39011g1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIIIZZ(null, this);
    }
}
