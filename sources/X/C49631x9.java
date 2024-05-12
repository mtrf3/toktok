package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {181}, m = "consumeUntilUp")
/* renamed from: X.1x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49631x9 extends C3CS {
    public InterfaceC37471dX LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C49631x9(InterfaceC67352kd<? super C49631x9> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0UM.LIZ(null, this);
    }
}
