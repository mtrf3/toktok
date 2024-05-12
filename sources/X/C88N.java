package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.api.ClickPlaylistMutation", f = "ClickPlaylistMutation.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.88N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88N extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C88M LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88N(C88M c88m, InterfaceC67352kd<? super C88N> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c88m;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
