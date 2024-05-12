package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.profile.model.User;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.spi.OpenServiceImpl", f = "OpenServiceImpl.kt", l = {29, 29}, m = "assembleMafInfo")
/* renamed from: X.38u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C791638u<T extends User> extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C791538t LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C791638u(C791538t c791538t, InterfaceC67352kd<? super C791638u> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c791538t;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(null, null, this);
    }
}
