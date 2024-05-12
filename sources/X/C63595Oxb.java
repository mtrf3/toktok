package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {336}, m = "sendHttpBridge$core_release")
/* renamed from: X.Oxb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63595Oxb extends C3CS {
    public C63589OxV LJLIL;
    public C63588OxU LJLILLLLZI;
    public C63606Oxm LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C63589OxV LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63595Oxb(C63589OxV c63589OxV, InterfaceC67352kd<? super C63595Oxb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c63589OxV;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJII(null, null, this);
    }
}
