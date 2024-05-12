package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.legacy.source.MAFSource", f = "MAFSource.kt", l = {59}, m = "refresh")
/* renamed from: X.XyU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86582XyU extends C3CS {
    public C86581XyT LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C86581XyT LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86582XyU(C86581XyT c86581XyT, InterfaceC67352kd<? super C86582XyU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c86581XyT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LLLZI(0, 0, 0, this);
    }
}
