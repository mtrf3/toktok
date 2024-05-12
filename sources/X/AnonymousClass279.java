package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {202}, m = "dispatchPreFling-QWom1Mo")
/* renamed from: X.279, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass279 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C25730zh LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass279(C25730zh c25730zh, InterfaceC67352kd<? super AnonymousClass279> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c25730zh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZJ(0L, this);
    }
}
