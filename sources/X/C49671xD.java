package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {79}, m = "awaitAllPointersUp")
/* renamed from: X.1xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49671xD extends C3CS {
    public InterfaceC37471dX LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C49671xD(InterfaceC67352kd<? super C49671xD> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0UR.LIZ(null, this);
    }
}
