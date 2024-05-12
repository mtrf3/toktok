package X;

import Y.IDfS130S0100000_9;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$init$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "UserCardListViewModel.kt", l = {138}, m = "emit")
/* renamed from: X.MpF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57981MpF extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS130S0100000_9 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57981MpF(IDfS130S0100000_9 iDfS130S0100000_9, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS130S0100000_9;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
