package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {54}, m = "joinAll")
/* loaded from: classes13.dex */
public final class T1X extends C3CS {
    public Object LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public T1X(InterfaceC67352kd<? super T1X> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return T1W.LIZJ(null, this);
    }
}
