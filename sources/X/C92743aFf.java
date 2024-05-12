package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.vcloud.abrmodule.ABRConfig;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.internal.utils.RetryKt", f = "Retry.kt", l = {9, ABRConfig.ABR_STARTUP_MAX_BITRATE}, m = "retry")
/* renamed from: X.aFf, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92743aFf extends C3CS {
    public int LJLIL;
    public int LJLILLLLZI;
    public InterfaceC88472Yns LJLJI;
    public C72242sW LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public int LJLJJLL;

    public C92743aFf(InterfaceC67352kd<? super C92743aFf> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C91890a1u.LIZ(0, 0L, null, this);
    }
}
