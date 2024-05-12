package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {256}, m = "awaitFirstDownOnPass")
/* renamed from: X.1x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49591x5 extends C3CS {
    public InterfaceC37471dX LJLIL;
    public C11I LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C49591x5(InterfaceC67352kd<? super C49591x5> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0UM.LIZIZ(null, null, false, this);
    }
}
