package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.RefreshSpotifyAccessTokenMutation", f = "RefreshSpotifyAccessTokenMutation.kt", l = {21}, m = "operate")
/* renamed from: X.al9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94695al9 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94491ahr LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94695al9(C94491ahr c94491ahr, InterfaceC67352kd<? super C94695al9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94491ahr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
