package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.GetDspPlatformListQuery", f = "GetDspPlatformListQuery.kt", l = {14}, m = "operate")
/* renamed from: X.al4, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94690al4 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94481ahh LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94690al4(C94481ahh c94481ahh, InterfaceC67352kd<? super C94690al4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94481ahh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
