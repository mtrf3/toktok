package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {157}, m = "awaitClose")
/* renamed from: X.3T1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3T1 extends C3CS {
    public C3CK LJLIL;
    public InterfaceC65784Pro LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C3T1(InterfaceC67352kd<? super C3T1> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C3T0.LIZ(null, null, this);
    }
}
