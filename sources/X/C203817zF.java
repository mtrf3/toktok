package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.aweme.api.CollectAwemeReverseMutation", f = "CollectAwemeReverseMutation.kt", l = {18}, m = "operate")
/* renamed from: X.7zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203817zF extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C203797zD LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203817zF(C203797zD c203797zD, InterfaceC67352kd<? super C203817zF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c203797zD;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
