package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.storage.model.RelationUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.spi.InternalServiceImpl", f = "InternalServiceImpl.kt", l = {28, 28}, m = "removeMafInfo")
/* renamed from: X.38z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C792138z extends C3CS {
    public RelationUser LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C791938x LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C792138z(C791938x c791938x, InterfaceC67352kd<? super C792138z> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c791938x;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, this);
    }
}
