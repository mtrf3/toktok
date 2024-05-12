package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SortWeightRelationModel", f = "SortWeightRelationModel.kt", l = {242}, m = "intercept")
/* renamed from: X.3R8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R8 extends C3CS {
    public C3R2 LJLIL;
    public C3RY LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public IMUser LJLJJL;
    public Object LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C3R2 LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3R8(C3R2 c3r2, InterfaceC67352kd<? super C3R8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c3r2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LJIILIIL(null, this);
    }
}
