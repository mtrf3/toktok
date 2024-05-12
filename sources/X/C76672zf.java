package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatManager", f = "RecommendedChatManager.kt", l = {174, 189}, m = "insertRecommendedConversations")
/* renamed from: X.2zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76672zf extends C3CS {
    public C76662ze LJLIL;
    public Object LJLILLLLZI;
    public C68322mC LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C76662ze LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76672zf(C76662ze c76662ze, InterfaceC67352kd<? super C76672zf> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c76662ze;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIIJ(null, this);
    }
}
