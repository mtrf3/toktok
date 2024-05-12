package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.helper.PostedDraftHelper", f = "PostedDraftHelper.kt", l = {70, SubscriptionExpireRemindHourSetting.DEFAULT}, m = "convertToNormalDraft")
/* loaded from: classes8.dex */
public final class GO4 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ GO2 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GO4(GO2 go2, InterfaceC67352kd<? super GO4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = go2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(this);
    }
}
