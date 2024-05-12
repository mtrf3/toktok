package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.api.CollectPlaylistMutation", f = "CollectPlaylistMutation.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.XHt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84589XHt extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C84587XHr LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84589XHt(C84587XHr c84587XHr, InterfaceC67352kd<? super C84589XHt> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c84587XHr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
