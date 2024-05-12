package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {339}, m = "tryAwaitRelease")
/* renamed from: X.1xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49731xJ extends C3CS {
    public C42091kz LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C42091kz LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49731xJ(C42091kz c42091kz, InterfaceC67352kd<? super C49731xJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c42091kz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJJJLIIL(this);
    }
}
