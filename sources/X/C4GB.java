package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.repository.SuggestedReplyRepository", f = "SuggestedReplyRepository.kt", l = {63}, m = "fetchSuggestedReply")
/* renamed from: X.4GB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GB extends C3CS {
    public C4GA LJLIL;
    public C109544Rq LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C4GA LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GB(C4GA c4ga, InterfaceC67352kd<? super C4GB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c4ga;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(null, this);
    }
}
