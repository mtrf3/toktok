package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.FamiliarsRelationDaoPerformance", f = "FamiliarsRelationDaoPerformance.kt", l = {51}, m = "findAllUidWithSort")
/* renamed from: X.3aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86493aP extends C3CS {
    public C86463aM LJLIL;
    public Object LJLILLLLZI;
    public C15150id LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C86463aM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86493aP(C86463aM c86463aM, InterfaceC67352kd<? super C86493aP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c86463aM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJFF(this);
    }
}
