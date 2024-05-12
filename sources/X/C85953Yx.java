package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {267}, m = "doRealNetworkRequest")
/* renamed from: X.3Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85953Yx extends C3CS {
    public C85913Yt LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C85913Yt LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85953Yx(C85913Yt c85913Yt, InterfaceC67352kd<? super C85953Yx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LIZLLL(null, null, 0, 0, this);
    }
}
