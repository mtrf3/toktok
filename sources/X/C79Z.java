package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager", f = "StoryInteractionListManager.kt", l = {123}, m = "mapMessageContent")
/* renamed from: X.79Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79Z extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C79Y LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79Z(C79Y c79y, InterfaceC67352kd<? super C79Z> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c79y;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJII(null, this);
    }
}
