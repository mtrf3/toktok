package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager", f = "BehaviourIconManager.kt", l = {31, 39}, m = "preBuildIcon")
/* renamed from: X.ajn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94611ajn extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ BehaviourIconManager LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94611ajn(BehaviourIconManager behaviourIconManager, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = behaviourIconManager;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.preBuildIcon(this);
    }
}
