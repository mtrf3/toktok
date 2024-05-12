package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatPushHelper", f = "RecommendedChatPushHelper.kt", l = {71}, m = "tryShowRecAppPush")
/* renamed from: X.2zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76802zs extends C3CS {
    public C76792zr LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C76792zr LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76802zs(C76792zr c76792zr, InterfaceC67352kd<? super C76802zs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c76792zr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
