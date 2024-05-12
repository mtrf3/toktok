package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.model.Aweme;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.explore.repo.ExploreFeedListRepository$operator$1", f = "ExploreFeedListRepository.kt", l = {34}, m = "fetchExploreFeed")
/* renamed from: X.8Az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207138Az extends C3CS {
    public C207128Ay LJLIL;
    public Aweme LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C207128Ay LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207138Az(C207128Ay c207128Ay, InterfaceC67352kd<? super C207138Az> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c207128Ay;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJLL(false, null, this);
    }
}
