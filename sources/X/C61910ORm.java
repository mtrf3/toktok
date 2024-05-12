package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment", f = "TabStoreFragment.kt", l = {230}, m = "productsAsync")
/* renamed from: X.ORm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61910ORm extends C3CS {
    public TabStoreFragment LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public InterfaceC68342mE LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ TabStoreFragment LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61910ORm(TabStoreFragment tabStoreFragment, InterfaceC67352kd<? super C61910ORm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = tabStoreFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.Rl(null, null, null, this);
    }
}
