package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolderKt", f = "PdpPolicyHolder.kt", l = {65}, m = "setPolicies")
/* renamed from: X.Av3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27765Av3 extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C27765Av3(InterfaceC67352kd<? super C27765Av3> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return OQN.LJIIJJI(null, null, this);
    }
}
