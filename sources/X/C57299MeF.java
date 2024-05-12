package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.api.ProfileFollowService$follow$$inlined$map$1$2", f = "ProfileFollowService.kt", l = {136}, m = "emit")
/* renamed from: X.MeF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57299MeF extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C57291Me7 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57299MeF(C57291Me7 c57291Me7, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c57291Me7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
