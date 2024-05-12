package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.GetDspPlaylistsQuery", f = "GetDspPlaylistsQuery.kt", l = {20}, m = "operate")
/* renamed from: X.al5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94691al5 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94483ahj LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94691al5(C94483ahj c94483ahj, InterfaceC67352kd<? super C94691al5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94483ahj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
