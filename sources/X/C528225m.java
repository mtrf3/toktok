package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", l = {873}, m = "onPreFling-QWom1Mo")
/* renamed from: X.25m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528225m extends C3CS {
    public long LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1ZP LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528225m(C1ZP c1zp, InterfaceC67352kd<? super C528225m> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c1zp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(0L, this);
    }
}
