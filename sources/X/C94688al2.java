package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.CreateDspPlaylistMutation", f = "CreateDspPlaylistMutation.kt", l = {19}, m = "operate")
/* renamed from: X.al2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94688al2 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94477ahd LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94688al2(C94477ahd c94477ahd, InterfaceC67352kd<? super C94688al2> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94477ahd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
