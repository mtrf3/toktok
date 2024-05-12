package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {311}, m = "awaitScrollEvent")
/* renamed from: X.1xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49831xT extends C3CS {
    public InterfaceC37471dX LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C49831xT(InterfaceC67352kd<? super C49831xT> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C08250Ub.LIZ(null, this);
    }
}
