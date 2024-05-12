package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {196}, m = "enableFetchFullList")
/* renamed from: X.3Z9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z9 extends C3CS {
    public C85913Yt LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C85913Yt LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z9(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJFF(this);
    }
}
