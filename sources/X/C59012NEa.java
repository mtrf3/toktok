package X;

import Y.IDfS25S0200000_10;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$subscribe$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "SearchAdStateBridge.kt", l = {136}, m = "emit")
/* renamed from: X.NEa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59012NEa extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS25S0200000_10 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59012NEa(IDfS25S0200000_10 iDfS25S0200000_10, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS25S0200000_10;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
