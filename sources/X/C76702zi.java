package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatManager", f = "RecommendedChatManager.kt", l = {273}, m = "handleResponse")
/* renamed from: X.2zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76702zi extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C76662ze LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76702zi(C76662ze c76662ze, InterfaceC67352kd<? super C76702zi> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c76662ze;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, this);
    }
}
