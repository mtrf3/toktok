package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", l = {436}, m = "waitForFirstLayout")
/* renamed from: X.1zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51341zu extends C3CS {
    public InterfaceC67352kd LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C51361zw LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51341zu(C51361zw c51361zw, InterfaceC67352kd<? super C51341zu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c51361zw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
