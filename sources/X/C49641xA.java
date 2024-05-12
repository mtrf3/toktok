package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {884}, m = "awaitDragOrCancellation-rnUCldI")
/* renamed from: X.1xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49641xA extends C3CS {
    public InterfaceC37471dX LJLIL;
    public C72242sW LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C49641xA(InterfaceC67352kd<? super C49641xA> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0US.LIZ(null, 0L, this);
    }
}
