package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {446}, m = "doFlingAnimation-QWom1Mo")
/* renamed from: X.1x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49571x3 extends C3CS {
    public C72242sW LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C0UL LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49571x3(C0UL c0ul, InterfaceC67352kd<? super C49571x3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c0ul;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(0L, this);
    }
}
