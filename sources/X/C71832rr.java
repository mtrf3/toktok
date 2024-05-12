package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.resource.StickerStoreResourceManager", f = "StickerStoreResourceManager.kt", l = {230}, m = "fetchFromFile")
/* renamed from: X.2rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71832rr extends C3CS {
    public AbstractC71812rp LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71832rr(AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp, InterfaceC67352kd<? super C71832rr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = abstractC71812rp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZJ(null, this);
    }
}
