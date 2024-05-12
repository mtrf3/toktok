package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.RelationModelFilterHelper", f = "RelationModelFilterHelper.kt", l = {207, 211, 219}, m = "getSecUidListForUpdate")
/* renamed from: X.3FL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FL extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C3FK LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3FL(C3FK c3fk, InterfaceC67352kd<? super C3FL> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c3fk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LJ(null, null, false, null, false, this);
    }
}
