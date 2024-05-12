package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.RelationModelFilterHelper", f = "RelationModelFilterHelper.kt", l = {313}, m = "findAndUpdateIndividualUserWith")
/* renamed from: X.3FO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FO extends C3CS {
    public ShareStateResponse.ShareUserStruct LJLIL;
    public IMUser LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C3FK LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3FO(C3FK c3fk, InterfaceC67352kd<? super C3FO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c3fk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(null, null, null, this);
    }
}
