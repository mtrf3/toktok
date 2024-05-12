package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
/* renamed from: X.Ua4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77424Ua4<T> extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C77424Ua4(InterfaceC67352kd<? super C77424Ua4> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C78540Us4.LJIIL(null, null, null, this);
    }
}
