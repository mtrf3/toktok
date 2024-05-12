package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.GetSpotifyAccessTokenMutation", f = "GetSpotifyAccessTokenMutation.kt", l = {20}, m = "operate")
/* renamed from: X.al6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94692al6 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94485ahl LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94692al6(C94485ahl c94485ahl, InterfaceC67352kd<? super C94692al6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94485ahl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
