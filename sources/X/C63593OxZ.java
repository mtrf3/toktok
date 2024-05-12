package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.Request;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {99, 106, 111, 121, 123, 132, 145, 150}, m = "fetch")
/* renamed from: X.OxZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63593OxZ extends C3CS {
    public C63589OxV LJLIL;
    public Object LJLILLLLZI;
    public Request LJLJI;
    public C84657XKj LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C63589OxV LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63593OxZ(C63589OxV c63589OxV, InterfaceC67352kd<? super C63593OxZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c63589OxV;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZIZ(null, false, this);
    }
}
