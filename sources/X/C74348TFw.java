package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
/* renamed from: X.TFw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74348TFw<T> extends C3CS {
    public InterfaceC64672gJ LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C74348TFw(InterfaceC67352kd<? super C74348TFw> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C74347TFv.LJIIIZ(null, null, this);
    }
}
