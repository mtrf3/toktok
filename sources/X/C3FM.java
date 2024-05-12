package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.RelationModelFilterHelper", f = "RelationModelFilterHelper.kt", l = {265, 267, 296}, m = "updateUserInfoInDb")
/* renamed from: X.3FM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FM extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C3FK LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3FM(C3FK c3fk, InterfaceC67352kd<? super C3FM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c3fk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJI(null, null, this);
    }
}
