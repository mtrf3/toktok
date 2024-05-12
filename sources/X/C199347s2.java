package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.vcloud.abrmodule.ABRConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.api.GetMovieDetailQuery", f = "GetMovieDetailQuery.kt", l = {ABRConfig.ABR_STARTUP_MAX_BITRATE}, m = "operate")
/* renamed from: X.7s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199347s2 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199317rz LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199347s2(C199317rz c199317rz, InterfaceC67352kd<? super C199347s2> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199317rz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
