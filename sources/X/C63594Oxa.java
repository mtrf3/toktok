package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {249, 254}, m = "fetchByHttp$core_release")
/* renamed from: X.Oxa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63594Oxa extends C3CS {
    public C63589OxV LJLIL;
    public C63588OxU LJLILLLLZI;
    public C63606Oxm LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C63589OxV LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63594Oxa(C63589OxV c63589OxV, InterfaceC67352kd<? super C63594Oxa> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c63589OxV;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJ(null, this);
    }
}
