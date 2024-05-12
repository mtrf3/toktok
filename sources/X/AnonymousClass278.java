package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {217}, m = "dispatchPostFling-RZ2iAVY")
/* renamed from: X.278, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass278 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C25730zh LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass278(C25730zh c25730zh, InterfaceC67352kd<? super AnonymousClass278> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c25730zh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(0L, 0L, this);
    }
}
