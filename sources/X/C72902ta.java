package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.iescore.depend.NetworkDependImpl", f = "NetworkDependImpl.kt", l = {201}, m = "checkNetworkStatus")
/* renamed from: X.2ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72902ta extends C3CS {
    public C76482zM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C76482zM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72902ta(C76482zM c76482zM, InterfaceC67352kd<? super C72902ta> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c76482zM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
