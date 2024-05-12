package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.api.UnCollectPlaylistMutation", f = "UnCollectPlaylistMutation.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.XHu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84590XHu extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C84588XHs LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84590XHu(C84588XHs c84588XHs, InterfaceC67352kd<? super C84590XHu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c84588XHs;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
