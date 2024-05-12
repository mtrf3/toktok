package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.ibe.IBEGeckoPreloadUtil", f = "IBEGeckoPreloadUtil.kt", l = {76}, m = "fetchGeckoResource")
/* loaded from: classes11.dex */
public final class NEZ extends C3CS {
    public C59005NDt LJLIL;
    public C58628Mzg LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C59005NDt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEZ(C59005NDt c59005NDt, InterfaceC67352kd<? super NEZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c59005NDt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, null, null, this);
    }
}
