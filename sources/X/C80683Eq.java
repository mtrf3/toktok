package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.MAFLoader", f = "MAFLoader.kt", l = {39}, m = "loadInternal")
/* renamed from: X.3Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80683Eq extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C80673Ep LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80683Eq(C80673Ep c80673Ep, InterfaceC67352kd<? super C80683Eq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c80673Ep;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return LJI(this);
    }
}
