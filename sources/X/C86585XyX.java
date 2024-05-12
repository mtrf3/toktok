package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.legacy.source.MAFSource", f = "MAFSource.kt", l = {94}, m = "getMAFList")
/* renamed from: X.XyX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86585XyX extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C86581XyT LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86585XyX(C86581XyT c86581XyT, InterfaceC67352kd<? super C86585XyX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c86581XyT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(0, 0, this);
    }
}
