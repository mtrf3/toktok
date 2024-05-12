package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl", f = "EffectCreatorServiceImpl.kt", l = {135}, m = "getProjectTrackingInfo")
/* renamed from: X.air, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94553air extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EffectCreatorServiceImpl LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94553air(EffectCreatorServiceImpl effectCreatorServiceImpl, InterfaceC67352kd<? super C94553air> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = effectCreatorServiceImpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, null, this);
    }
}
