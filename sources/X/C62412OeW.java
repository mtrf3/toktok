package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.business.GuideShare$go$2", f = "GuideShare.kt", l = {122, 137}, m = "onChannelClickedPreShare")
/* renamed from: X.OeW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62412OeW extends C3CS {
    public C62392OeC LJLIL;
    public InterfaceC62225ObV LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C62392OeC LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62412OeW(C62392OeC c62392OeC, InterfaceC67352kd<? super C62412OeW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c62392OeC;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, null, this);
    }
}
