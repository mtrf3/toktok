package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoRepository", f = "FriendNewVideoSharedVM.kt", l = {235}, m = "load")
/* renamed from: X.Ml1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57719Ml1 extends C3CS {
    public C57716Mky LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C57715Mkx LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57719Ml1(C57715Mkx c57715Mkx, InterfaceC67352kd<? super C57719Ml1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c57715Mkx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}
