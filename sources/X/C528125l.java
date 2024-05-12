package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", l = {882}, m = "onPostFling-RZ2iAVY")
/* renamed from: X.25l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528125l extends C3CS {
    public long LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1ZP LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528125l(C1ZP c1zp, InterfaceC67352kd<? super C528125l> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c1zp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(0L, 0L, this);
    }
}
