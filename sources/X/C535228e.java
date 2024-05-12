package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {153, 158, 166}, m = "fetchCategoryListDataNew")
/* renamed from: X.28e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C535228e extends C3CS {
    public C39011g1 LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C39011g1 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535228e(C39011g1 c39011g1, InterfaceC67352kd<? super C535228e> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c39011g1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(this);
    }
}
