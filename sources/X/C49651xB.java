package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {816}, m = "awaitLongPressOrCancellation-rnUCldI")
/* renamed from: X.1xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49651xB extends C3CS {
    public C11P LJLIL;
    public C68322mC LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C49651xB(InterfaceC67352kd<? super C49651xB> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0US.LIZIZ(null, 0L, this);
    }
}
