package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService", f = "ECommerceShowcaseService.kt", l = {150}, m = "queryShop")
/* renamed from: X.ORr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61915ORr extends C3CS {
    public long LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ECommerceShowcaseService LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61915ORr(ECommerceShowcaseService eCommerceShowcaseService, InterfaceC67352kd<? super C61915ORr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = eCommerceShowcaseService;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJFF(null, null, this);
    }
}
