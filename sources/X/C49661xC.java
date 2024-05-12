package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {109}, m = "drag-jO51t88")
/* renamed from: X.1xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49661xC extends C3CS {
    public InterfaceC37471dX LJLIL;
    public InterfaceC88472Yns LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C49661xC(InterfaceC67352kd<? super C49661xC> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0US.LIZJ(null, 0L, null, this);
    }
}
