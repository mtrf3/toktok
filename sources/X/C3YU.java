package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.FamiliarsRelationFetchManager", f = "FamiliarsRelationFetchManager.kt", l = {130}, m = "doRealDBUpdate")
/* renamed from: X.3YU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YU extends C3CS {
    public C85873Yp LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C3YT LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YU(C3YT c3yt, InterfaceC67352kd<? super C3YU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c3yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(null, this);
    }
}
