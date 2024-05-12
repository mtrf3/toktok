package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.legacy.source.MAFSource", f = "MAFSource.kt", l = {80, 87}, m = "fetch")
/* renamed from: X.XyW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86584XyW extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C86581XyT LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86584XyW(C86581XyT c86581XyT, InterfaceC67352kd<? super C86584XyW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c86581XyT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(0, 0, null, this);
    }
}
