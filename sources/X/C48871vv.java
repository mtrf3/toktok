package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {115, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "getEffect")
/* renamed from: X.1vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48871vv extends C3CS {
    public C1KC LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C1KC LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48871vv(C1KC c1kc, InterfaceC67352kd<? super C48871vv> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c1kc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJII(null, null, null, this);
    }
}
