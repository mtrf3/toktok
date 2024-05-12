package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM", f = "FriendNewVideoSharedVM.kt", l = {119}, m = "onRefresh")
/* renamed from: X.Mkz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57717Mkz extends C3CS {
    public FriendNewVideoSharedVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ FriendNewVideoSharedVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57717Mkz(FriendNewVideoSharedVM friendNewVideoSharedVM, InterfaceC67352kd<? super C57717Mkz> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = friendNewVideoSharedVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
