package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel", f = "StoryArchListViewModel.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "fetchStoryList")
/* renamed from: X.7Ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185237Ot extends C3CS {
    public StoryArchListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StoryArchListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185237Ot(StoryArchListViewModel storyArchListViewModel, InterfaceC67352kd<? super C185237Ot> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = storyArchListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(0L, this);
    }
}
