package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.fb.FacebookRepositoryImpl", f = "FacebookRepositoryImpl.kt", l = {63}, m = "upload")
/* loaded from: classes14.dex */
public final class UTZ extends C3CS {
    public UTX LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UTX LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTZ(UTX utx, InterfaceC67352kd<? super UTZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = utx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, this);
    }
}
