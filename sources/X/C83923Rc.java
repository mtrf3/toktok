package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.CombinedLoader", f = "CombinedLoader.kt", l = {115}, m = "applyFinishInterceptor")
/* renamed from: X.3Rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83923Rc extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3RZ<R> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83923Rc(C3RZ<R> c3rz, InterfaceC67352kd<? super C83923Rc> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c3rz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(null, this);
    }
}
