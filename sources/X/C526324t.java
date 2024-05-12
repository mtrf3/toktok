package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", l = {335}, m = "emit")
/* renamed from: X.24t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C526324t extends C3CS {
    public C1ZG LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C1ZG LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526324t(C1ZG c1zg, InterfaceC67352kd<? super C526324t> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c1zg;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.emit(null, this);
    }
}
