package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.UpdateDspPlatformMutation", f = "UpdateDspPlatformMutation.kt", l = {18}, m = "operate")
/* renamed from: X.alC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94698alC extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94497ahx LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94698alC(C94497ahx c94497ahx, InterfaceC67352kd<? super C94698alC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94497ahx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
