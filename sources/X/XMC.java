package X;

import Y.IDfS27S0200000_15;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {136, 137}, m = "emit")
/* loaded from: classes16.dex */
public final class XMC extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS27S0200000_15 LJLJI;
    public Object LJLJJI;
    public InterfaceC64672gJ LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XMC(IDfS27S0200000_15 iDfS27S0200000_15, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS27S0200000_15;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
