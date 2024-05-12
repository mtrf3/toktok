package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi", f = "TwoStepAuthApi.kt", l = {217}, m = "getNonce")
/* renamed from: X.LUp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54347LUp extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ TwoStepAuthApi LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54347LUp(TwoStepAuthApi twoStepAuthApi, InterfaceC67352kd<? super C54347LUp> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = twoStepAuthApi;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, this);
    }
}
