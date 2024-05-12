package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {421, 427, 429, 431, 437}, m = "onDragStopped-sF-c-tU")
/* renamed from: X.1x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49581x4 extends C3CS {
    public C0UL LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C0UL LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49581x4(C0UL c0ul, InterfaceC67352kd<? super C49581x4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c0ul;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZJ(0L, this);
    }
}
