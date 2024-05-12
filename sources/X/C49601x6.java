package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {274, 289}, m = "waitForUpOrCancellation")
/* renamed from: X.1x6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49601x6 extends C3CS {
    public InterfaceC37471dX LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C49601x6(InterfaceC67352kd<? super C49601x6> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0UM.LIZLLL(null, this);
    }
}
