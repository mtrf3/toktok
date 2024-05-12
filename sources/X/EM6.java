package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactFilterByPsi$Companion", f = "ContactFilterByPsi.kt", l = {70, SubscriptionExpireRemindHourSetting.DEFAULT, 80, 108}, m = "uploadAfterTryPsiFilter")
/* loaded from: classes7.dex */
public final class EM6 extends C3CS {
    public Object LJLIL;
    public InterfaceC88471Ynr LJLILLLLZI;
    public EM2 LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ EM3 LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EM6(EM3 em3, InterfaceC67352kd<? super EM6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = em3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZIZ(null, null, null, null, this);
    }
}
