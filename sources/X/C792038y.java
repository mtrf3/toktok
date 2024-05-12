package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.spi.InternalServiceImpl", f = "InternalServiceImpl.kt", l = {21, 21}, m = "saveUserList")
/* renamed from: X.38y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C792038y extends C3CS {
    public C38T LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C791938x LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C792038y(C791938x c791938x, InterfaceC67352kd<? super C792038y> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c791938x;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, null, this);
    }
}
