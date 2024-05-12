package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl", f = "ModelSelectImpl.kt", l = {127, 286}, m = "fetchFaceModel$suspendImpl")
/* renamed from: X.aie, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94540aie extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ ModelSelectImpl LJLJI;
    public Object LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94540aie(ModelSelectImpl modelSelectImpl, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = modelSelectImpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return ModelSelectImpl.fetchFaceModel$suspendImpl(this.LJLJI, this);
    }
}
