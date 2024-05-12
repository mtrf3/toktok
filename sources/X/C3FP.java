package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.RelationModelFilterHelper", f = "RelationModelFilterHelper.kt", l = {233}, m = "fillUpSecUidListWithCondition")
/* renamed from: X.3FP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FP extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3FK LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3FP(C3FK c3fk, InterfaceC67352kd<? super C3FP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c3fk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, null, null, this);
    }
}
