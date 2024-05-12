package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SortWeightRelationModel", f = "SortWeightRelationModel.kt", l = {197}, m = "filterUserOnline")
/* renamed from: X.3RB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RB extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C3R2 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RB(C3R2 c3r2, InterfaceC67352kd<? super C3RB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c3r2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIIIZ(null, this);
    }
}
