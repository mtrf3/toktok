package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel", f = "MDAudioQueueViewModel.kt", l = {227}, m = "startShufflePlay")
/* renamed from: X.Zws, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91578Zws extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ MDAudioQueueViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91578Zws(MDAudioQueueViewModel mDAudioQueueViewModel, InterfaceC67352kd<? super C91578Zws> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = mDAudioQueueViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.jv0(null, null, null, this);
    }
}
