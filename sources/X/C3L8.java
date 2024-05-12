package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2", f = "SessionListManagerV2.kt", l = {738}, m = "getSessionListFromPaginationData$im_base_release")
/* renamed from: X.3L8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3L8 extends C3CS {
    public InterfaceC81953Jn LJLIL;
    public C3LM LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C82253Kr LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3L8(C82253Kr c82253Kr, InterfaceC67352kd<? super C3L8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c82253Kr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIILLIIL(null, null, this);
    }
}
