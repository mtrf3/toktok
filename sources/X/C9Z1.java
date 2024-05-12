package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", f = "BaAutoReplyEditActivity.kt", l = {234}, m = "keywordAlreadyExists")
/* renamed from: X.9Z1, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z1 extends C3CS {
    public BaAutoReplyEditActivity LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaAutoReplyEditActivity LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Z1(BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC67352kd<? super C9Z1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = baAutoReplyEditActivity;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LLFZ(this);
    }
}
