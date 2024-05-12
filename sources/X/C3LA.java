package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2", f = "SessionListManagerV2.kt", l = {1257, 1267, 1276}, m = "updateSessionList")
/* renamed from: X.3LA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LA extends C3CS {
    public C82253Kr LJLIL;
    public InterfaceC81953Jn LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C82253Kr LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3LA(C82253Kr c82253Kr, InterfaceC67352kd<? super C3LA> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c82253Kr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(0, null, this);
    }
}
