package X;

import Y.IDfS126S0100000_1;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.manager.core.TvCasting$initialize$1$invokeSuspend$$inlined$collect$1", f = "TvCastingFeature.kt", l = {135}, m = "emit")
/* renamed from: X.2qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71102qg extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS126S0100000_1 LJLJI;
    public IDfS126S0100000_1 LJLJJI;
    public boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71102qg(IDfS126S0100000_1 iDfS126S0100000_1, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS126S0100000_1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
