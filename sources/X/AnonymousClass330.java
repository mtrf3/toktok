package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.SuggestedContactDataSource", f = "SuggestedContactDataSource.kt", l = {60, 71}, m = "getLatestSuggestedContact")
/* renamed from: X.330, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass330 extends C3CS {
    public C776532z LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C776532z LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass330(C776532z c776532z, InterfaceC67352kd<? super AnonymousClass330> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c776532z;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(this);
    }
}
