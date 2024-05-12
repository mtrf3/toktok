package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.PinUtil", f = "PinUtil.kt", l = {96}, m = "getPublicKey")
/* renamed from: X.aJj, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92995aJj extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C92059a4d LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92995aJj(C92059a4d c92059a4d, InterfaceC67352kd<? super C92995aJj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c92059a4d;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}
