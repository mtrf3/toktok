package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.FollowLoader", f = "FollowLoader.kt", l = {42, 56}, m = "loadInternal")
/* renamed from: X.3Qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83763Qm extends C3CS {
    public C83753Ql LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C83753Ql LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83763Qm(C83753Ql c83753Ql, InterfaceC67352kd<? super C83763Qm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c83753Ql;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(this);
    }
}
