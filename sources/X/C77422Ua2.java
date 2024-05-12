package X;

import Y.IDeS152S0200000_13;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "collect")
/* renamed from: X.Ua2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77422Ua2 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDeS152S0200000_13 LJLJI;
    public IDeS152S0200000_13 LJLJJI;
    public InterfaceC64672gJ LJLJJL;
    public C77427Ua7 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77422Ua2(IDeS152S0200000_13 iDeS152S0200000_13, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDeS152S0200000_13;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.collect(null, this);
    }
}
