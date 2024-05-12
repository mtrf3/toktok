package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.inbox.StoryInboxService", f = "StoryInboxService.kt", l = {58}, m = "fetchStoryItemsByCont")
/* renamed from: X.Lfa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54834Lfa extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C54833LfZ LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54834Lfa(C54833LfZ c54833LfZ, InterfaceC67352kd<? super C54834Lfa> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c54833LfZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.fetchStoryItemsByCont(0L, 0L, null, null, this);
    }
}
