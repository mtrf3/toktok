package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {355}, m = "collectTo")
/* renamed from: X.3Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79803Bg extends C3CS {
    public C3CK LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C79793Bf<T> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79803Bg(C79793Bf<T> c79793Bf, InterfaceC67352kd<? super C79803Bg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c79793Bf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.collectTo(null, this);
    }
}
