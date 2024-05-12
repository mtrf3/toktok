package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {178}, m = "fetchContactAsyncInternal")
/* renamed from: X.3Z4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z4 extends C3CS {
    public C85913Yt LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C85913Yt LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z4(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(null, this);
    }
}
