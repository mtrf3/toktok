package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment", f = "TabCommerceFragment.kt", l = {83, 86, 90}, m = "retryOrEnter")
/* renamed from: X.ORl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61909ORl<T> extends C3CS {
    public TabCommerceFragment LJLIL;
    public C73305Spp LJLILLLLZI;
    public InterfaceC88472Yns LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ TabCommerceFragment LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61909ORl(TabCommerceFragment tabCommerceFragment, InterfaceC67352kd<? super C61909ORl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = tabCommerceFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.Nl(null, null, this);
    }
}
