package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.user.UserStorySource$UserStoryQuery", f = "UserStorySource.kt", l = {119}, m = "operate")
/* renamed from: X.MeD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57297MeD extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57296MeC LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57297MeD(C57296MeC c57296MeC, InterfaceC67352kd<? super C57297MeD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57296MeC;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
