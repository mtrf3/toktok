package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.spi.OpenServiceImpl", f = "OpenServiceImpl.kt", l = {22, 22}, m = "getUserList")
/* renamed from: X.38v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C791738v extends C3CS {
    public C38T LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C791538t LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C791738v(C791538t c791538t, InterfaceC67352kd<? super C791738v> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c791538t;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}
