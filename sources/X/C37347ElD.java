package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {101}, m = "withTimeoutOrNull")
/* renamed from: X.ElD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37347ElD<T> extends C3CS {
    public InterfaceC88471Ynr LJLIL;
    public C68322mC LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C37347ElD(InterfaceC67352kd<? super C37347ElD> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C74209TAn.LIZJ(0L, null, this);
    }
}
