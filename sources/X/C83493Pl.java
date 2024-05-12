package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.UserSearchContentUpdateEngine", f = "UserSearchContentUpdateEngine.kt", l = {155, 157, 178}, m = "fullUpdate")
/* renamed from: X.3Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83493Pl extends C3CS {
    public C83483Pk LJLIL;
    public C3QC LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C83483Pk LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83493Pl(C83483Pk c83483Pk, InterfaceC67352kd<? super C83493Pl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c83483Pk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(false, this);
    }
}
