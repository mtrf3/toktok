package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.api.GetPlaylistCollectionListQuery", f = "GetPlaylistCollectionListQuery.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.88C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88C extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C88B LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88C(C88B c88b, InterfaceC67352kd<? super C88C> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c88b;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
