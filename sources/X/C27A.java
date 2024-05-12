package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {94, 96}, m = "onPostFling-RZ2iAVY")
/* renamed from: X.27A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27A extends C3CS {
    public C27C LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C27C LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27A(C27C c27c, InterfaceC67352kd<? super C27A> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c27c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(0L, 0L, this);
    }
}
