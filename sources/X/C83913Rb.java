package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.CombinedLoader", f = "CombinedLoader.kt", l = {105}, m = "applyInterceptor")
/* renamed from: X.3Rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83913Rb extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C3RZ<R> LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83913Rb(C3RZ<R> c3rz, InterfaceC67352kd<? super C83913Rb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c3rz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, this);
    }
}
