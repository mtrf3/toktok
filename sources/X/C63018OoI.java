package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {227}, m = "catchImpl")
/* renamed from: X.OoI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63018OoI<T> extends C3CS {
    public C68322mC LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C63018OoI(InterfaceC67352kd<? super C63018OoI> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return V1M.LJI(this, null, null);
    }
}
