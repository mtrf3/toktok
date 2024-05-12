package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.vcloud.abrmodule.ABRConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.api.GetBookDetailQuery", f = "GetBookDetailQuery.kt", l = {ABRConfig.ABR_STARTUP_MAX_BITRATE}, m = "operate")
/* renamed from: X.7s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199327s0 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199287rw LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199327s0(C199287rw c199287rw, InterfaceC67352kd<? super C199327s0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199287rw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
