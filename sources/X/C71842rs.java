package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.resource.StickerStoreResourceManager", f = "StickerStoreResourceManager.kt", l = {210, 212}, m = "fetchFromNetwork")
/* renamed from: X.2rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71842rs extends C3CS {
    public AbstractC71812rp LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71842rs(AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp, InterfaceC67352kd<? super C71842rs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = abstractC71812rp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(null, this);
    }
}
