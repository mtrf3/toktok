package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.util.RequestKt", f = "Request.kt", l = {52, 100}, m = "retry")
/* renamed from: X.3gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90403gi<T> extends C3CS {
    public C73305Spp LJLIL;
    public InterfaceC88472Yns LJLILLLLZI;
    public InterfaceC88473Ynt LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C90403gi(InterfaceC67352kd<? super C90403gi> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C90393gh.LIZIZ(null, null, null, this);
    }
}
