package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatManager", f = "RecommendedChatManager.kt", l = {125}, m = "tryToDismissAllRecChats")
/* renamed from: X.2zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76712zj extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C76662ze LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76712zj(C76662ze c76662ze, InterfaceC67352kd<? super C76712zj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c76662ze;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJIIL(0, this);
    }
}
