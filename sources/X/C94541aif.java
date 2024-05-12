package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.AssetsFragment", f = "AssetsFragment.kt", l = {256}, m = "getTabPageProducer")
/* renamed from: X.aif, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94541aif extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AssetsFragment LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94541aif(AssetsFragment assetsFragment, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = assetsFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.Il(this);
    }
}
