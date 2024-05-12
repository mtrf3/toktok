package X;

import Y.IDfS13S0300000_9;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.user.UserStorySource$requestInner$$inlined$map$1$2", f = "UserStorySource.kt", l = {136}, m = "emit")
/* renamed from: X.MeE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57298MeE extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS13S0300000_9 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57298MeE(IDfS13S0300000_9 iDfS13S0300000_9, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS13S0300000_9;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
