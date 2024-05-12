package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.resource.StickerStoreResourceManager", f = "StickerStoreResourceManager.kt", l = {170, 182}, m = "suspendLoadData")
/* renamed from: X.2rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71822rq extends C3CS {
    public AbstractC71812rp LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71822rq(AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp, InterfaceC67352kd<? super C71822rq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = abstractC71812rp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIJI(null, this);
    }
}
